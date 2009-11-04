package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import java.awt.Frame;
import javax.swing.tree.TreeNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.projectPane.NamespaceTextNode;
import jetbrains.mps.workbench.MPSDataKeys;
import javax.swing.JOptionPane;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class RenameNamespace_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RenameNamespace_Action.class);

  private Project ideaProject;
  private MPSProject project;
  private Frame frame;
  private TreeNode treeNode;

  public RenameNamespace_Action() {
    super("Rename", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return RenameNamespace_Action.this.treeNode instanceof NamespaceTextNode && RenameNamespace_Action.this.getProjectPane() != null && !(((NamespaceTextNode)RenameNamespace_Action.this.treeNode).isFinalName());
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RenameNamespace", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.ideaProject = event.getData(MPSDataKeys.PROJECT);
    if (this.ideaProject == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.treeNode = event.getData(MPSDataKeys.LOGICAL_VIEW_NODE);
    if (this.treeNode == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      NamespaceTextNode node = ((NamespaceTextNode)RenameNamespace_Action.this.treeNode);
      String newFolder = JOptionPane.showInputDialog(RenameNamespace_Action.this.frame, "Enter New Folder", node.getName());
      if (newFolder == null) {
        return;
      }
      if (newFolder.equals("")) {
        newFolder = null;
      }
      for (IModule module : ListSequence.fromList(node.getModulesUnder())) {
        RenameNamespace_Action.this.project.setFolderFor(module, newFolder);
      }
      RenameNamespace_Action.this.getProjectPane().rebuild();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RenameNamespace", t);
      }
    }
  }

  private ProjectPane getProjectPane() {
    return ProjectPane.getInstance(RenameNamespace_Action.this.ideaProject);
  }
}
