package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.project.ProjectOperationContext;

public class ShowConceptStructure_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowConceptStructure_Action.class);

  private SNode node;
  private MPSProject project;

  public ShowConceptStructure_Action() {
    super("Show Concept Structure", "", ICON);
    this.setIsAlwaysVisible(false);
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
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
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
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      StructureView_Tool tool = ShowConceptStructure_Action.this.project.getPluginManager().getTool(StructureView_Tool.class);
      tool.getStructureView().inspect(((ConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.cast(ShowConceptStructure_Action.this.node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))), new ProjectOperationContext(ShowConceptStructure_Action.this.project));
      tool.openToolLater(true);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowConceptStructure", t);
    }
  }

}
