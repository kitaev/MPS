package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class SolutionRefactoring_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(SolutionRefactoring_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionRefactoring";

  public SolutionRefactoring_ActionGroup() {
    super("Refactoring", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      SolutionRefactoring_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RenameSolution_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(SolutionActions_ActionGroup.ID, SolutionActions_ActionGroup.LABEL_ID_refactoring);
  }

}
