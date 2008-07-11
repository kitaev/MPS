package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;

public class BaseLanguageEditorPopup_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(BaseLanguageEditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopup";

  public BaseLanguageEditorPopup_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new CommentStatements_Action());
      this.add(new UncommentStatements_Action());
      this.add(new RunClassConcept_Action());
      this.addSeparator();
      this.add(new ExtractMethod_Action());
      this.add(new InlineMethod_Action());
      this.add(new ChangeMethodSignature_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(BaseLanguageEditorPopup_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
