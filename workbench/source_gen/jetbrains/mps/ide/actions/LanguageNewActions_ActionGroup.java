package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.language.NewGeneratorAction;
import jetbrains.mps.ide.actions.language.NewAccessoryModelAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class LanguageNewActions_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.LanguageNewActions";

  public  LanguageNewActions_ActionGroup(MPSProject project) {
    super("New", LanguageNewActions_ActionGroup.ID);
    this.setInternal(false);
    this.add(new NewGeneratorAction(), this);
    this.addSeparator();
    this.add(new NewAccessoryModelAction(), this);
    this.addSeparator();
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(LanguageActions_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(LanguageNewActions_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = LanguageActions_ActionGroup.LABEL_ID_newGroup;
        gTo.add(gWhat, owner, labelName);
      }
    }
  }

}
