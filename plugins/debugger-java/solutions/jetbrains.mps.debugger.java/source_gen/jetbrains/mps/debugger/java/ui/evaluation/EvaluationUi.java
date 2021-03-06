package jetbrains.mps.debugger.java.ui.evaluation;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.DataKey;
import jetbrains.mps.debugger.java.evaluation.model.AbstractEvaluationModel;
import jetbrains.mps.debug.runtime.DebugSession;
import org.jetbrains.annotations.NotNull;
import java.awt.BorderLayout;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.actionSystem.ActionGroup;
import jetbrains.mps.debug.evaluation.Evaluator;
import jetbrains.mps.debug.runtime.DebugVMEventsProcessor;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.debug.runtime.SuspendContext;
import jetbrains.mps.debug.evaluation.proxies.IValueProxy;
import jetbrains.mps.debug.evaluation.EvaluationException;
import jetbrains.mps.debug.evaluation.InvalidEvaluatedExpressionException;
import jetbrains.mps.debug.evaluation.InvocationTargetEvaluationException;
import com.intellij.openapi.application.ModalityState;
import jetbrains.mps.debug.api.SessionChangeAdapter;
import jetbrains.mps.debug.api.AbstractDebugSession;

public abstract class EvaluationUi extends JPanel {
  private static final Logger LOG = Logger.getLogger(EvaluationUi.class);
  public static final DataKey<AbstractEvaluationModel> EVALUATION_MODEL = DataKey.create("Evaluation Model");

  protected final DebugSession myDebugSession;
  protected final EvaluationTree myTree;
  private EvaluationUi.IErrorTextListener myErrorListener;
  private final boolean myAutoUpdate;
  private final EvaluationUi.MySessionChangeAdapter mySessionChangeAdapter = new EvaluationUi.MySessionChangeAdapter();

  public EvaluationUi(@NotNull DebugSession session, boolean autoUpdate) {
    super(new BorderLayout());
    myDebugSession = session;
    myAutoUpdate = autoUpdate;
    myDebugSession.addChangeListener(mySessionChangeAdapter);
    myTree = new EvaluationTree() {
      @Nullable
      @Override
      protected ActionGroup getTreeActionGroup() {
        return getActionGroup();
      }
    };
  }

  protected abstract void update();

  public abstract void evaluate();

  @Nullable
  public ActionGroup getActionGroup() {
    return null;
  }

  public void dispose() {
    myDebugSession.removeChangeListener(mySessionChangeAdapter);
    myTree.dispose();
  }

  protected void evaluate(final AbstractEvaluationModel model) {
    if (!(myDebugSession.getEvaluationProvider().canEvaluate())) {
      setErrorText("Program should be paused on breakpoint to evaluate");
      return;
    }
    try {
      final Evaluator evaluator = model.evaluate();
      setEvaluating(model);
      final DebugVMEventsProcessor eventsProcessor = myDebugSession.getEventsProcessor();
      ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
        public void run() {
          SuspendContext suspendContext = eventsProcessor.getSuspendManager().getPausedContext();
          assert suspendContext != null;
          try {
            suspendContext.setIsEvaluating(true);
            IValueProxy evaluatedValue = evaluator.evaluate();
            if (evaluatedValue != null) {
              setSuccess(evaluatedValue, model);
            } else {
              setFailure(null, "Evaluation returned null.", model);
            }
          } catch (EvaluationException e) {
            setFailure(e, null, model);
          } catch (Throwable t) {
            setFailure(t, null, model);
            EvaluationUi.LOG.error(t);
          } finally {
            suspendContext.setIsEvaluating(false);
          }
        }
      });
    } catch (InvalidEvaluatedExpressionException e) {
      setFailure(e.getCause(), null, model);
    } catch (InvocationTargetEvaluationException e) {
      setFailure(e.getCause(), null, model);
      LOG.error(e.getCause());
    } catch (EvaluationException e) {
      setFailure(e, null, model);
    } catch (Throwable t) {
      setFailure(t, null, model);
      LOG.error(t);
    }
  }

  private void setSuccess(@NotNull final IValueProxy evaluatedValue, final AbstractEvaluationModel model) {
    invokeLaterIfNeeded(new Runnable() {
      public void run() {
        myTree.setResultProxy(evaluatedValue, model);
        myTree.rebuildEvaluationTreeNowIfNotDisposed();
      }
    });
  }

  private void setEvaluating(final AbstractEvaluationModel model) {
    invokeLaterIfNeeded(new Runnable() {
      public void run() {
        myTree.setEvaluating(model);
        myTree.rebuildEvaluationTreeNowIfNotDisposed();
      }
    });
  }

  private void setFailure(@Nullable final Throwable error, @Nullable final String message, final AbstractEvaluationModel model) {
    invokeLaterIfNeeded(new Runnable() {
      public void run() {
        if (error != null) {
          myTree.setError(error, model);
        } else {
          myTree.setError(message, model);
        }
        myTree.rebuildEvaluationTreeNowIfNotDisposed();
      }
    });
  }

  protected void setErrorText(String text) {
    if (myErrorListener != null) {
      myErrorListener.updateErrorText(text);
    }
  }

  private void invokeLaterIfNeeded(Runnable runnable) {
    if (ApplicationManager.getApplication().isDispatchThread()) {
      runnable.run();
    } else {
      ApplicationManager.getApplication().invokeLater(runnable, ModalityState.NON_MODAL);
    }
  }

  public void setErrorTextListener(EvaluationUi.IErrorTextListener listener) {
    myErrorListener = listener;
  }

  public static interface IErrorTextListener {
    public void updateErrorText(String text);
  }

  private class MySessionChangeAdapter extends SessionChangeAdapter {
    public MySessionChangeAdapter() {
    }

    @Override
    public void paused(AbstractDebugSession session) {
      if (myDebugSession == session) {
        myTree.updateLocation(myDebugSession.getUiState().getStackFrame().getLocation().getUnitName(), myDebugSession.getUiState().getThread().getThread());
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            setErrorText("");
            update();
            if (myAutoUpdate) {
              evaluate();
            }
          }
        });
      }
    }

    @Override
    public void stateChanged(AbstractDebugSession session) {
      if (myDebugSession == session) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            update();
          }
        });
      }
    }

    @Override
    public void resumed(AbstractDebugSession session) {
      if (myDebugSession == session) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            myTree.rebuildEvaluationTreeNowIfNotDisposed();
          }
        });
      }
    }
  }
}
