package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.workbench.action.ActionEventData;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import javax.swing.tree.TreePath;

public class ExpandNode_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ExpandNode_Action.class);
  public static final Icon ICON = null;

  public ExpandNode_Action() {
    super("Expand All", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ExpandNode", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ActionEventData data = new ActionEventData(event);
      ProjectPane pane = data.get(ProjectPane.class);
      MPSTree tree = pane.getTree();
      TreePath path = tree.getSelectionPath();
      if (path == null) {
        return;
      }
      tree.expandAll((MPSTreeNode) path.getLastPathComponent());
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ExpandNode", t);
    }
  }

}
