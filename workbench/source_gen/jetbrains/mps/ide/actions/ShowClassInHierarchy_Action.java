package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.hierarchy.BaseLanguageHierarchyViewTool;
import jetbrains.mps.baseLanguage.structure.Classifier;

public class ShowClassInHierarchy_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ShowClassInHierarchy_Action.class);

  public IOperationContext context;
  private SNode node;

  public ShowClassInHierarchy_Action() {
    super("Show Class In Hierarchy", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl H";
  }

  public boolean isApplicable(AnActionEvent event) {
    return SNodeOperations.getAncestorWhereConceptInList(ShowClassInHierarchy_Action.this.node, new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept","jetbrains.mps.baseLanguage.structure.Interface"}, true, false) != null;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowClassInHierarchy", t);
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
      SNode node = event.getData(MPSDataKeys.SNODE);
      if (node != null) {
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
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SNode classNode = SNodeOperations.cast(SNodeOperations.getAncestorWhereConceptInList(ShowClassInHierarchy_Action.this.node, new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept","jetbrains.mps.baseLanguage.structure.Interface"}, true, false), "jetbrains.mps.baseLanguage.structure.Classifier");
      BaseLanguageHierarchyViewTool tool = ShowClassInHierarchy_Action.this.context.getComponent(BaseLanguageHierarchyViewTool.class);
      tool.showConceptInHierarchy(((Classifier)SNodeOperations.getAdapter(classNode)), ShowClassInHierarchy_Action.this.context);
      tool.openToolLater(true);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowClassInHierarchy", t);
      }
    }
  }

}
