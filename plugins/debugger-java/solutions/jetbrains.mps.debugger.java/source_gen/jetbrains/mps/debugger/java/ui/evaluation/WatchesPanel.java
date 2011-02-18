package jetbrains.mps.debugger.java.ui.evaluation;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.SessionStopDisposer;
import jetbrains.mps.debugger.java.evaluation.EvaluationProvider;
import jetbrains.mps.debugger.java.evaluation.model.AbstractEvaluationModel;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import java.awt.BorderLayout;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.openapi.actionSystem.ActionGroup;

public class WatchesPanel extends EvaluationUi {
  private final SessionStopDisposer mySessionStopDisposer;
  private final EvaluationProvider myProvider;

  public WatchesPanel(final EvaluationProvider provider) {
    super(provider.getDebugSession(), true);
    myProvider = provider;
    myProvider.addWatchListener(new EvaluationProvider.WatchAdapter() {
      @Override
      public void watchAdded(final AbstractEvaluationModel model) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          @Override
          public void run() {
            myTree.addModel(model);
            evaluate(model);
            myTree.rebuildLater();
          }
        });
      }

      @Override
      public void watchUpdated(final AbstractEvaluationModel model) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          @Override
          public void run() {
            evaluate(model);
          }
        });
      }

      @Override
      public void watchRemoved(final AbstractEvaluationModel model) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          @Override
          public void run() {
            myTree.removeModel(model);
            myTree.rebuildLater();
          }
        });
      }
    });
    mySessionStopDisposer = new SessionStopDisposer(myDebugSession) {
      @Override
      public void doDispose() {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          @Override
          public void run() {
            WatchesPanel.this.dispose();
          }
        });
      }
    };
    add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, new DefaultActionGroup(new EvaluationTreeActions.AddWatchAction(), new EvaluationTreeActions.RemoveWatchAction()), false).getComponent(), BorderLayout.WEST);
    add(new JBScrollPane(myTree), BorderLayout.CENTER);
  }

  @Override
  protected void update() {
    for (AbstractEvaluationModel model : myProvider.getWatches()) {
      model.updateState();
    }
  }

  @Override
  public void evaluate() {
    for (AbstractEvaluationModel model : myProvider.getWatches()) {
      evaluate(model);
    }
  }

  @Override
  public ActionGroup getActionGroup() {
    return new DefaultActionGroup(new EvaluationTreeActions.AddWatchAction(), new EvaluationTreeActions.EditWatchAction(), new EvaluationTreeActions.RemoveWatchAction());
  }
}
