package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.ide.actions.project.NewSolutionAction;
import jetbrains.mps.ide.actions.project.NewLanguageAction;
import jetbrains.mps.ide.actions.project.NewDevKitAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class ProjectNewActions_ActionGroup extends BaseActionGroup {

  public ProjectNewActions_ActionGroup() {
    super("New", "jetbrains.mps.ide.actions.ProjectNewActions");
    this.setInternal(false);
    this.add(new NewSolutionAction());
    this.add(new NewLanguageAction());
    this.add(new NewDevKitAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.ProjectActions");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.ide.actions.ProjectNewActions");
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat, owner, "jetbrains.mps.ide.actions.projectNew_ExtentionPoint");
    }
  }

}
