package jetbrains.mps.bootstrap.structureLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.project.ProjectOperationContext;

public class ShowConceptStructure_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowConceptStructure_Action.class);
  public static final Icon ICON = null;

  private SNode node;
  private MPSProject project;

  public ShowConceptStructure_Action() {
    super("Show Concept Structure", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowConceptStructure", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
          if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration"))) {
            node = null;
          }
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
      this.project = new ActionEventData(event).getMPSProject();
      if (this.project == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      StructureView_Tool tool = this.project.getPluginManager().getTool(StructureView_Tool.class);
      tool.getStructureView().inspect((AbstractConceptDeclaration)((INodeAdapter)SNodeOperations.getAdapter(this.node)), new ProjectOperationContext(this.project));
      tool.openToolLater(true);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowConceptStructure", t);
    }
  }

}
