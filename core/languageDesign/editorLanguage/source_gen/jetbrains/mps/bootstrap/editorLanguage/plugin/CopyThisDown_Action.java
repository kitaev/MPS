package jetbrains.mps.bootstrap.editorLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.bootstrap.structureLanguage.behavior.LinkDeclaration_Behavior;

public class CopyThisDown_Action extends CurrentProjectAction {
  public static final Logger LOG = Logger.getLogger(CopyThisDown_Action.class);
  public static final Icon ICON = null;

  private SNode inputNode;

  public CopyThisDown_Action(Project project) {
    super(project, "Duplicate Node", "", ICON, false, false, false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl D";
  }

  public void dodoUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CopyThisDown", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean fillFieldsIfNecessary(AnActionEvent event) {
    try {
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
        }
        this.inputNode = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.inputNode == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SNode nodeToCopy = this.inputNode;
      while (SNodeOperations.getParent(nodeToCopy, null, false, false) != null) {
        SNode parent = SNodeOperations.getParent(nodeToCopy, null, false, false);
        String role = nodeToCopy.getRole_();
        SNode link = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
        if (link == null) {
          return;
        }
        if (!(LinkDeclaration_Behavior.call_isSingular_1213877254557(link))) {
          SNode copy = SNodeOperations.copyNode(nodeToCopy);
          parent.insertChild(nodeToCopy, role, copy);
          return;
        }
        nodeToCopy = parent;
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CopyThisDown", t);
    }
  }

}
