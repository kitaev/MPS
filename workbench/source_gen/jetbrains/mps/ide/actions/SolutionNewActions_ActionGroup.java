package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.ide.actions.model.NewModelAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class SolutionNewActions_ActionGroup extends BaseActionGroup {

  public SolutionNewActions_ActionGroup() {
    super("New", "jetbrains.mps.ide.actions.SolutionNewActions");
    this.setInternal(false);
    this.add(new NewModelAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.SolutionActions");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.ide.actions.SolutionNewActions");
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat, owner, "jetbrains.mps.ide.actions.solutionNew_ExtentionPoint");
    }
  }

}
