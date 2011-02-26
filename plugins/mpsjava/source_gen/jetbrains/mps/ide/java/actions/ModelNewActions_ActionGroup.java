package jetbrains.mps.ide.java.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ModelNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.java.actions.ModelNewActions_ActionGroup";

  public ModelNewActions_ActionGroup() {
    super("ModelNewActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ModelNewActions_ActionGroup.this.addAction("jetbrains.mps.ide.java.actions.NewModelFromSource_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
