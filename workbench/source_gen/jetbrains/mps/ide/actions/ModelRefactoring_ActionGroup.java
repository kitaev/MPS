package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ModelRefactoring_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelRefactoring_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ModelRefactoring";

  public ModelRefactoring_ActionGroup() {
    super("Refactoring", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      this.addAction("jetbrains.mps.ide.actions.RenameModel_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(ModelActions_ActionGroup.ID, ModelActions_ActionGroup.LABEL_ID_refactoring);
  }

}
