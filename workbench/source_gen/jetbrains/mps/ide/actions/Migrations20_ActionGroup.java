package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class Migrations20_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Migrations20_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Migrations20_ActionGroup";

  public Migrations20_ActionGroup() {
    super("Migrations 2.0", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
