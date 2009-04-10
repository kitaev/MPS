package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.quickQueryLanguage.plugin.ReplaceDialog;
import jetbrains.mps.quickQueryLanguage.plugin.FindInstancesContext;
import jetbrains.mps.smodel.Language;

public class ReplacementQueryAction_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ReplacementQueryAction_Action.class);

  public IOperationContext context;
  public IModule langModule;

  public ReplacementQueryAction_Action() {
    super("Modify Instances By Condition", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ReplacementQueryAction", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.langModule = event.getData(MPSDataKeys.MODULE);
    if (this.langModule == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ReplaceDialog dialog = new ReplaceDialog(new FindInstancesContext(ReplacementQueryAction_Action.this.context), (Language)ReplacementQueryAction_Action.this.langModule);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ReplacementQueryAction", t);
    }
  }

}
