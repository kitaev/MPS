package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.actions.tools.RemoveTransientModulesAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;

public class TransientModulesActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(TransientModulesActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.TransientModulesActions";

  public TransientModulesActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new RemoveTransientModulesAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
