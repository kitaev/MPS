package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import javax.swing.JOptionPane;

public class IntroduceVariable_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(IntroduceVariable_Action.class);

  private SNode node;
  private EditorContext context;
  private EditorComponent component;
  private Frame frame;

  public IntroduceVariable_Action() {
    super("Introduce Variable...", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt V";
  }

  public boolean isApplicable(AnActionEvent event) {
    return IntroduceLocalVariableRefactoring.isApplicable(IntroduceVariable_Action.this.node);
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "IntroduceVariable", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.component = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.component == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Wrappers._T<IntroduceLocalVariableRefactoring> refactoring = new Wrappers._T<IntroduceLocalVariableRefactoring>();
      final Wrappers._T<String> error = new Wrappers._T<String>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          refactoring.value = new IntroduceLocalVariableRefactoring();
          error.value = refactoring.value.init(SNodeOperations.cast(IntroduceVariable_Action.this.node, "jetbrains.mps.baseLanguage.structure.Expression"), IntroduceVariable_Action.this.component);
        }
      });
      if (error.value == null) {
        IntroduceLocalVariableDialog dialog = new IntroduceLocalVariableDialog(IntroduceVariable_Action.this.frame, refactoring.value, IntroduceVariable_Action.this.context);
        dialog.showDialog();
      } else
      {
        JOptionPane.showMessageDialog(IntroduceVariable_Action.this.component, error.value, "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "IntroduceVariable", t);
    }
  }

}
