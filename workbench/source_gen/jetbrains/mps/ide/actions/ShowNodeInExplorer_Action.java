package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;

public class ShowNodeInExplorer_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ShowNodeInExplorer_Action.class);
  private static final Icon ICON = null;

  public SNode node;
  public MPSProject project;
  public IOperationContext context;

  public ShowNodeInExplorer_Action() {
    super("Show Node In Explorer", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return " F12";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeInExplorer", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.SNODE);
    if (this.node == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      NodeExplorer_Tool tool = ShowNodeInExplorer_Action.this.project.getPluginManager().getTool(NodeExplorer_Tool.class);
      tool.getNodeExplorer().showNode(ShowNodeInExplorer_Action.this.node, ShowNodeInExplorer_Action.this.project);
      tool.openToolLater(true);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowNodeInExplorer", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(ShowNodeInExplorer_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
