package jetbrains.mps.generator.impl;

import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.generator.GenerationCanceledException;
import jetbrains.mps.generator.GenerationFailureException;
import jetbrains.mps.ide.progress.ITaskProgressHelper;
import jetbrains.mps.smodel.ModelAccess;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Evgeny Gryaznov, Feb 23, 2010
 */
public class GenerationTaskPool implements IGenerationTaskPool {

  private static class ModelReadThreadFactory implements ThreadFactory {
    final ThreadGroup group;
    final AtomicInteger threadNumber = new AtomicInteger(1);
    final String namePrefix;

    ModelReadThreadFactory() {
      SecurityManager s = System.getSecurityManager();
      group = (s != null) ? s.getThreadGroup() :
        Thread.currentThread().getThreadGroup();
      namePrefix = "generation-thread-";
    }

    public Thread newThread(final Runnable original) {
//      Runnable r = new Runnable() {
//        @Override
//        public void run() {
//          ModelAccess.instance().runReadAction(original);
//        }
//      };

      Thread t = new Thread(group, original, namePrefix + threadNumber.getAndIncrement());
      if (t.isDaemon())
        t.setDaemon(false);
      if (t.getPriority() != Thread.NORM_PRIORITY)
        t.setPriority(Thread.NORM_PRIORITY);
      return t;
    }
  }

  final static AtomicLong seq = new AtomicLong();

  private class GenerationTaskAdapter implements Runnable, Comparable<GenerationTaskAdapter> {
    private GenerationTask myTask;
    final long seqNum;

    private GenerationTaskAdapter(GenerationTask task) {
      myTask = task;
      seqNum = seq.getAndIncrement();
    }

    private void runInternal() {
      try {
        myTask.run();
      } catch (GenerationCanceledException e) {
        reportException(e);
      } catch (GenerationFailureException e) {
        reportException(e);
      } catch (Throwable th) {
        reportException(th);
      }
    }

    @Override
    public void run() {
      if (myTask.requiresReadAccess()) {
        ModelAccess.instance().runReadAction(new Runnable() {
          @Override
          public void run() {
            runInternal();
          }
        });
      } else {
        runInternal();
      }
    }

    @Override
    public int compareTo(GenerationTaskAdapter oth) {
      return (seqNum < oth.seqNum ? -1 : 1);
    }
  }

  private ProgressIndicator progressMonitor;

  public GenerationTaskPool(ProgressIndicator progressMonitor) {
    this.progressMonitor = progressMonitor;
  }

  final BlockingQueue<Runnable> queue = new PriorityBlockingQueue<Runnable>(256);
  ThreadPoolExecutor myExecutor = new ThreadPoolExecutor(4, 4, 10, TimeUnit.SECONDS, queue, new ModelReadThreadFactory()) {
    @Override
    protected void afterExecute(Runnable r, Throwable t) {
      long tasksLeft = tasksInQueue.decrementAndGet();
      if (tasksLeft == 0) {
        synchronized (objectLock) {
          objectLock.notifyAll();
        }
      }
    }
  };

  final AtomicLong tasksInQueue = new AtomicLong();
  final Object objectLock = new Object();

  @Override
  public void addTask(GenerationTask r) {
    tasksInQueue.incrementAndGet();
    myExecutor.execute(new GenerationTaskAdapter(r));
  }

  @Override
  public void waitForCompletion() throws GenerationCanceledException, GenerationFailureException {
    Throwable th = null;
    synchronized (objectLock) {
      while (exceptions.size() == 0 && tasksInQueue.get() != 0 && !progressMonitor.isCanceled()) {
        try {
          objectLock.wait(1000);
        } catch (InterruptedException e) {
          /* ignore */
        }
      }
      if (exceptions.size() != 0) {
        th = exceptions.get(0);
      } else if (progressMonitor.isCanceled()) {
        th = new GenerationCanceledException();
      }
    }
    myExecutor.shutdownNow();

    // rethrow
    if (th != null) {
      if (th instanceof GenerationCanceledException) {
        throw (GenerationCanceledException) th;
      } else if (th instanceof GenerationFailureException) {
        throw (GenerationFailureException) th;
      } else if (th instanceof RuntimeException) {
        throw (RuntimeException) th;
      }
    }
  }

  private List<Throwable> exceptions = new LinkedList<Throwable>();

  private void reportException(Throwable thr) {
    synchronized (objectLock) {
      exceptions.add(thr);
      objectLock.notifyAll();
    }
  }
}
