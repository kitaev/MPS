package jetbrains.mps.lang.script.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.ProjectPaneModelActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.GeneratorActions_ActionGroup;
import jetbrains.mps.ide.actions.SolutionActions_ActionGroup;

public class ScriptsForSelection_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ScriptsForSelection_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.script.plugin.ScriptsForSelection";

  public ScriptsForSelection_ActionGroup() {
    super("Scripts", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void doUpdate(AnActionEvent event) {
    try {
      ScriptsForSelection_ActionGroup.this.removeAll();
      event.getPresentation().setVisible(true);
      IOperationContext context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
      if (context == null || context.getProject() == null) {
        event.getPresentation().setEnabled(false);
        return;
      }
      event.getPresentation().setEnabled(true);
      // 
      ScriptsMenuBuilder menuBuilder = new ScriptsMenuBuilder(true);
      this.add(menuBuilder.create_ByCategoryPopup());
      this.add(menuBuilder.create_ByBuildPopup());
      this.add(menuBuilder.create_ByLanguagePopup());
      // 
      this.add(menuBuilder.create_MoreAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectPaneModelActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ScriptsForSelection_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(LanguageActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ScriptsForSelection_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(GeneratorActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ScriptsForSelection_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(SolutionActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ScriptsForSelection_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
