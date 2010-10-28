package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.util.Pair;

public class GoToTypeErrorRule_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GoToTypeErrorRule_Action.class);

  private IOperationContext operationContext;
  private SNode node;
  private EditorComponent editorComponent;

  public GoToTypeErrorRule_Action() {
    super("Go to Rule Which Caused Error", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl alt R";
  }

  public boolean isApplicable(AnActionEvent event) {
    IErrorReporter error = GoToTypeErrorRule_Action.this.editorComponent.getErrorReporterFor(GoToTypeErrorRule_Action.this.editorComponent.getSelectedCell());
    return !(error == null || error.getRuleId() == null || error.getRuleModel() == null || !(error.getAdditionalRulesIds().isEmpty()));
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToTypeErrorRule", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.NODE);
    if (this.node == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.operationContext = null;
    this.node = null;
    this.editorComponent = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      IErrorReporter error = GoToTypeErrorRule_Action.this.editorComponent.getTypeCheckingContext().getTypeMessageDontCheck(GoToTypeErrorRule_Action.this.node);
      GoToTypeErrorRuleUtil.goToRuleById(GoToTypeErrorRule_Action.this.operationContext, new Pair<String, String>(error.getRuleModel(), error.getRuleId()));
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToTypeErrorRule", t);
    }
  }
}
