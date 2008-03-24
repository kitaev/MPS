package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.model.NewModelAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class GeneratorNewActions_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorNewActions";

  public  GeneratorNewActions_ActionGroup(MPSProject project) {
    super("New", GeneratorNewActions_ActionGroup.ID);
    this.setInternal(false);
    this.add(new NewModelAction(), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(GeneratorActions_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(GeneratorNewActions_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = GeneratorActions_ActionGroup.LABEL_ID_generatorNew;
        gTo.add(gWhat, owner, labelName);
      }
    }
  }

}
