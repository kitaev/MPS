package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.debug.evaluation.EvaluationProvider;
import javax.swing.JPanel;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debug.evaluation.model.AbstractEvaluationModel;
import java.awt.Dimension;
import jetbrains.mps.debug.runtime.DebugSession;
import java.awt.BorderLayout;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.debug.integration.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.debug.api.SessionChangeAdapter;
import jetbrains.mps.debug.api.AbstractDebugSession;
import com.intellij.openapi.application.ApplicationManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;

public class EvaluationDialog extends BaseDialog {
  private final EvaluationProvider myProvider;
  private final EvaluationPanel myEvaluationPanel;
  private final JPanel myMainPanel;

  public EvaluationDialog(final IOperationContext context, @NotNull EvaluationProvider provider, AbstractEvaluationModel evalModel) {
    super(context.getMainFrame(), "Evaluate");
    setSize(new Dimension(500, 500));
    setModal(false);

    myProvider = provider;
    final DebugSession debugSession = provider.getDebugSession();
    myEvaluationPanel = new EvaluationPanel(context.getProject(), debugSession, evalModel);
    myEvaluationPanel.setErrorTextListener(new EvaluationPanel.IErrorTextListener() {
      public void updateErrorText(String text) {
        setErrorText(text);
      }
    });
    myMainPanel = new JPanel(new BorderLayout());
    myMainPanel.add(myEvaluationPanel, BorderLayout.CENTER);
    DefaultActionGroup group = new DefaultActionGroup();
    group.add(new AnAction("Watch Expression", "Add Expression To Watches Tool", Icons.WATCH) {
      public void actionPerformed(AnActionEvent p0) {
        myProvider.watch(myEvaluationPanel.getEvaluationModel());
      }
    });
    myMainPanel.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, true).getComponent(), BorderLayout.NORTH);

    debugSession.addChangeListener(new SessionChangeAdapter() {
      public void resumed(final AbstractDebugSession session) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            if (debugSession == session && session.isStopped()) {
              dispose();
            }
          }
        });
      }
    });

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosed(WindowEvent event) {
        myEvaluationPanel.dispose();
      }
    });
  }

  public JComponent getMainComponent() {
    return myMainPanel;
  }

  @BaseDialog.Button(position = 0, name = "Evaluate", mnemonic = 'E', defaultButton = true)
  public void buttonEvaluate() {
    myEvaluationPanel.evaluate();
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C', defaultButton = false)
  public void buttonCancel() {
    this.dispose();
  }
}
