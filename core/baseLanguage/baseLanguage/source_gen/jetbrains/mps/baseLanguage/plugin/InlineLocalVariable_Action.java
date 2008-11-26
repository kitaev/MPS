package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.MPSDataKeys;

public class InlineLocalVariable_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(InlineLocalVariable_Action.class);
  private static final Icon ICON = null;

  public EditorContext editorContext;
  private SNode node;
  public Frame frame;

  public InlineLocalVariable_Action() {
    super("Inline Local Variable", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt N";
  }

  public boolean isApplicable(AnActionEvent event) {
    final Wrappers._boolean result = new Wrappers._boolean();
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        result.value = InlineVariableRefactoring.isApplicable(InlineLocalVariable_Action.this.node);
      }

    });
    return result.value;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "InlineLocalVariable", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.SNODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.editorContext = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.editorContext == null) {
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
      final Wrappers._T<InlineVariableRefactoring> ref = new Wrappers._T<InlineVariableRefactoring>();
      boolean isAvailable;
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          ref.value = InlineVariableRefactoring.createRefactoring(InlineLocalVariable_Action.this.node);
        }

      });
      isAvailable = ref.value.checkRefactoring(InlineLocalVariable_Action.this.frame);
      if (isAvailable) {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {

          public void run() {
            SNode result = ref.value.doRefactoring();
            InlineLocalVariable_Action.this.editorContext.select(result);
          }

        });
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "InlineLocalVariable", t);
    }
  }

}
