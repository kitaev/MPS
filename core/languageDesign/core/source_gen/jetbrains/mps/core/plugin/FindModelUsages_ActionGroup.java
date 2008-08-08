package jetbrains.mps.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.ProjectPaneModelActions_ActionGroup;

public class FindModelUsages_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(FindModelUsages_ActionGroup.class);
  public static final String ID = "jetbrains.mps.core.plugin.FindModelUsages";

  public FindModelUsages_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new FindModelUsages_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectPaneModelActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(FindModelUsages_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
