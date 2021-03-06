package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ProjectPaneModelAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectPaneModelAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.build.packaging.plugin.ProjectPaneModelAddition_ActionGroup";

  public ProjectPaneModelAddition_ActionGroup() {
    super("ProjectPaneModelAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ProjectPaneModelAddition_ActionGroup.this.addAction("jetbrains.mps.build.packaging.plugin.GenerateBuildAction_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
