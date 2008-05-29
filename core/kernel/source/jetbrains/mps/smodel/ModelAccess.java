package jetbrains.mps.smodel;

import jetbrains.mps.baseLanguage.ext.collections.internal.CursorWithContinuation;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

import com.intellij.openapi.util.Computable;
import com.intellij.openapi.application.ApplicationManager;

public class ModelAccess {
  private static final ModelAccess ourInstance = new ModelAccess();

  private ReentrantReadWriteLock myReadWriteLock = new ReentrantReadWriteLock();
  private EDTReadExecutor myEDTExecutor = new EDTReadExecutor();

  public static ModelAccess instance() {
    return ourInstance;
  }

  private ModelAccess() {
  }

  private boolean allowSharedRead() {
    return false;
  }

  private Lock getReadLock() {
    if (allowSharedRead()) {
      return myReadWriteLock.readLock();
    } else {
      return myReadWriteLock.writeLock();
    }
  }

  private Lock getWriteLock() {
    return myReadWriteLock.writeLock();
  }

  public void runReadAction(final Runnable r) {
    runReadAction(new Computable<Object>() {
      public Object compute() {
        r.run();
        return null;
      }
    });
  }

  public <T> T runReadAction(final Computable<T> c) {
    getReadLock().lock();
    try {
      return c.compute();
    } finally {
      getReadLock().unlock();
    }
  }

  public boolean tryRead(Runnable r) {
    if (getReadLock().tryLock()) {
      try {
        r.run();
      } finally {
        getReadLock().unlock();
      }
      return true;
    } else {
      return false;
    }
  }

  public void runReadInEDT(Runnable r) {
    myEDTExecutor.invokeInEDT(r);
  }

  public<T> T tryRead(Computable<T> c) {
    if (getReadLock().tryLock()) {
      try {
        return c.compute();
      } finally {
        getReadLock().unlock();
      }
    } else {
      return null;
    }
  }

  public void runWriteAction(final Runnable r) {
    runWriteAction(new Computable<Object>() {
      public Object compute() {
        r.run();
        return null;
      }
    });
  }

  public <T> T runWriteAction(final Computable<T> c) {
    getWriteLock().lock();
    try {
      return c.compute();
    } finally {
      getWriteLock().unlock();
    }
  }

  public boolean canWrite() {
    return myReadWriteLock.isWriteLockedByCurrentThread();
  }

  public boolean canRead() {
    if (allowSharedRead()) {
      return true; //todo find a way to check read access
    } else {
      return canWrite();
    }
  }

  public void checkWriteAccess() {
    if (!canWrite()) {
      throw new IllegalStateException();
    }
  }

  public void checkReadAccess() {
    if (!canRead()) {
      throw new IllegalStateException();
    }
  }

  static void assertLegalRead(SNode node) {
    if (!ModelAccess.instance().canRead()) {
      if (Thread.currentThread() instanceof CursorWithContinuation) {
        return;
      }

      throw new IllegalModelAccessError("You can read model only inside command. Use lightweight command to read model");
    }
  }
}
