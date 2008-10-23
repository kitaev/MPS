package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.ProjectPaneModelActions_ActionGroup;

public class ProjectPaneModelAddition_ActionGroup extends GeneratedActionGroup {
private    static Logger LOG = Logger.getLogger(ProjectPaneModelAddition_ActionGroup.class);
public    static final String ID = "jetbrains.mps.build.packaging.plugin.ProjectPaneModelAddition";

  public ProjectPaneModelAddition_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new GenerateMPSBuildAction_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectPaneModelActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ProjectPaneModelAddition_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
