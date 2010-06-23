package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class VCS_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(VCS_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.VCS";

  public VCS_ActionGroup() {
    super("VCS", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      VCS_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AddToVcs_Action", "jetbrains.mps.ide");
      VCS_ActionGroup.this.addAction("jetbrains.mps.ide.actions.IgnoreInVcs_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_vcs);
    this.insertGroupIntoAnother(SolutionActions_ActionGroup.ID, SolutionActions_ActionGroup.LABEL_ID_vcs);
  }
}
