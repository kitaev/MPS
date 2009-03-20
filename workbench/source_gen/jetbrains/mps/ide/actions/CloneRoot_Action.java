package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.MPSProject;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class CloneRoot_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(CloneRoot_Action.class);

  public MPSProject project;
  private List<SNode> nodes;

  public CloneRoot_Action() {
    super("Clone Root", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "shift F5";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "CloneRoot", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      List<SNode> nodes = event.getData(MPSDataKeys.SNODES);
      boolean error = false;
      if (nodes != null) {
      }
      if (error || nodes == null) {
        this.nodes = null;
      } else
      {
        this.nodes = new ArrayList<SNode>(nodes);
      }
    }
    if (this.nodes == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      for(SNode node : ListSequence.fromList(CloneRoot_Action.this.nodes)) {
        SNode root = SNodeOperations.getContainingRoot(node);
        SNode copy = SNodeOperations.copyNode(root);
        SModelOperations.addRootNode(SNodeOperations.getModel(root), copy);
        CloneRoot_Action.this.project.getComponentSafe(MPSEditorOpener.class).openNode(copy);
        CloneRoot_Action.this.project.getComponentSafe(ProjectPane.class).selectNode(copy);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "CloneRoot", t);
      }
    }
  }

}
