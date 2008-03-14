package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.baseLanguage.plugin.uiActions.TestReferenceResolvingPerformance_Editor;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class BaseLanguageEditorPopupInternal_ActionGroup extends BaseActionGroup {

  public BaseLanguageEditorPopupInternal_ActionGroup(MPSProject project) {
    super("", "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopupInternal");
    this.setInternal(false);
    this.add(new TestReferenceResolvingPerformance_Editor(), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.EditorInternal");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopupInternal");
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.addEveryFrom(gWhat, owner);
    }
  }

}
