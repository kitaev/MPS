package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.model.NewModelAction;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class SolutionNewActions_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(SolutionNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionNewActions";

  public SolutionNewActions_ActionGroup(MPSProject project) {
    super("New", SolutionNewActions_ActionGroup.ID, project);
    this.setInternal(false);
    try {
      this.add(new NewModelAction(), this);
    } catch (Throwable t) {
      SolutionNewActions_ActionGroup.LOG.error("User group error", t);
    }
  }

  public void adjust(IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = this.getGroup(SolutionActions_ActionGroup.ID);
      ActionGroup gWhat = this.getGroup(SolutionNewActions_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = SolutionActions_ActionGroup.LABEL_ID_solutionNew;
        gTo.add(gWhat, owner, labelName);
      }
    }
  }

}
