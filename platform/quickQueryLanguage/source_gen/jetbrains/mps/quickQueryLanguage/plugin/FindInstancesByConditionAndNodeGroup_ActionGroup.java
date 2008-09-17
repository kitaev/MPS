package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.ProjectPaneNodeActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class FindInstancesByConditionAndNodeGroup_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(FindInstancesByConditionAndNodeGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionAndNodeGroup";

  public FindInstancesByConditionAndNodeGroup_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new FindInstancesByConditionAndNode_Action());
      this.add(new ReplacementQueryActionWithNode_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectPaneNodeActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(FindInstancesByConditionAndNodeGroup_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(FindInstancesByConditionAndNodeGroup_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
