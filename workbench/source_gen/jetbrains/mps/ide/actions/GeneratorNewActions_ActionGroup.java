package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.ide.actions.model.NewModelAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class GeneratorNewActions_ActionGroup extends BaseActionGroup {

  public GeneratorNewActions_ActionGroup() {
    super("New", "jetbrains.mps.ide.actions.GeneratorNewActions");
    this.setInternal(false);
    this.add(new NewModelAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.GeneratorActions");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.ide.actions.GeneratorNewActions");
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat, owner, "jetbrains.mps.ide.actions.generatorNew_ExtentionPoint");
    }
  }

}
