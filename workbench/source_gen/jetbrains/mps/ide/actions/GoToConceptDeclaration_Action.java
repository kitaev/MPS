package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class GoToConceptDeclaration_Action extends BaseAction {
  public static final Logger LOG = Logger.getLogger(GoToConceptDeclaration_Action.class);
  public static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}\\core\\languageDesign\\structureLanguage\\source\\jetbrains\\mps\\bootstrap\\structureLanguage\\icons\\structure.png", "jetbrains.mps.ide"), true);

  private IOperationContext context;
  private SNode node;

  public GoToConceptDeclaration_Action() {
    super("Go To Concept Declaration", "", ICON, false, false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift S";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToConceptDeclaration", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean fillFieldsIfNecessary(AnActionEvent event) {
    try {
      this.context = new ActionEventData(event).getOperationContext();
      if (this.context == null) {
        return false;
      }
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
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
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      AbstractConceptDeclaration conceptDeclaration = SModelUtil_new.findConceptDeclaration(INamedConcept_Behavior.call_getFqName_1213877404258(SNodeOperations.getConceptDeclaration(this.node)), this.context.getScope());
      this.context.getComponent(MPSEditorOpener.class).openNode(conceptDeclaration.getNode());
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToConceptDeclaration", t);
    }
  }

}
