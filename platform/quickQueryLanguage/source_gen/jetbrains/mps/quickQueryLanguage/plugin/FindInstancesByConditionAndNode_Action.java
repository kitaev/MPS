package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Language;

public class FindInstancesByConditionAndNode_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(FindInstancesByConditionAndNode_Action.class);
  private static final Icon ICON = null;

  public IOperationContext context;
  public IModule langModule;
  private SNode node;

  public FindInstancesByConditionAndNode_Action() {
    super("Find Instances By Condition", "", ICON);
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
      LOG.error("User's action doUpdate method failed. Action:" + "FindInstancesByConditionAndNode", t);
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
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
          node = null;
        }
      }
      this.node = node;
    }
    if (this.node == null) {
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
      FindInstancesDialog testDialog = new FindInstancesDialog(new FindInstancesContext(FindInstancesByConditionAndNode_Action.this.context), (Language)FindInstancesByConditionAndNode_Action.this.langModule);
      testDialog.setConceptDeclaration(FindInstancesByConditionAndNode_Action.this.node);
      testDialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindInstancesByConditionAndNode", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(FindInstancesByConditionAndNode_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
