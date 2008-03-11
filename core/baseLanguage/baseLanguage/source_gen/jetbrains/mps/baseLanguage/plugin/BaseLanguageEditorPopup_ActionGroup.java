package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.baseLanguage.plugin.uiActions.CommentStatementsAction;
import jetbrains.mps.baseLanguage.plugin.uiActions.UncommentStatementsAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class BaseLanguageEditorPopup_ActionGroup extends BaseActionGroup {

  public BaseLanguageEditorPopup_ActionGroup() {
    super("", "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopup");
    this.setInternal(false);
    this.add(new CommentStatementsAction());
    this.add(new UncommentStatementsAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.EditorPopup");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopup");
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.addEveryFrom(gWhat, owner);
    }
  }

}
