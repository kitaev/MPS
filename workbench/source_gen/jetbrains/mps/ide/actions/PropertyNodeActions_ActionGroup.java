package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class PropertyNodeActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(PropertyNodeActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.PropertyNodeActions";

  public PropertyNodeActions_ActionGroup() {
    super("PropertyNodeActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.ide.actions.DeletePropertyAction_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
