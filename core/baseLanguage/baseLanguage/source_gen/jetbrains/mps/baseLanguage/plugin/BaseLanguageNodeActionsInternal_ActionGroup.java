package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.ProjectPaneNodeActionsInternal_ActionGroup;

public class BaseLanguageNodeActionsInternal_ActionGroup extends GeneratedActionGroup {
private    static Logger LOG = Logger.getLogger(BaseLanguageNodeActionsInternal_ActionGroup.class);
public    static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageNodeActionsInternal";

  public BaseLanguageNodeActionsInternal_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectPaneNodeActionsInternal_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(BaseLanguageNodeActionsInternal_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
