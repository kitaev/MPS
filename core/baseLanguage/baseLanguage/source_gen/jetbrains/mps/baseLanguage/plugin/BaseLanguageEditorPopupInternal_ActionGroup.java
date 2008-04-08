package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.baseLanguage.plugin.uiActions.TestReferenceResolvingPerformance;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class BaseLanguageEditorPopupInternal_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(BaseLanguageEditorPopupInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopupInternal";

  public  BaseLanguageEditorPopupInternal_ActionGroup(MPSProject project) {
    super("", BaseLanguageEditorPopupInternal_ActionGroup.ID);
    this.setInternal(false);
    try {
      this.add(new TestReferenceResolvingPerformance(TestReferenceResolvingPerformance.EDITOR), this);
      this.add(new ShowInternalExtractMethodStuff_Action(project), this);
    } catch (Throwable t) {
      BaseLanguageEditorPopupInternal_ActionGroup.LOG.error("User group error", t);
    }
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(EditorInternal_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(BaseLanguageEditorPopupInternal_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.addEveryFrom(gWhat, owner);
    }
  }

}
