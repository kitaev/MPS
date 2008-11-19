package jetbrains.mps.baseLanguage.dates.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.ModelActionsInternal_ActionGroup;

public class DateLangGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DateLangGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.dates.plugin.DateLangGroup";

  public DateLangGroup_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.baseLanguage.dates"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.baseLanguage.dates.plugin.ConvertDateTimeOperations_Action"), language.getModuleFqName(), null));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ModelActionsInternal_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(DateLangGroup_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
