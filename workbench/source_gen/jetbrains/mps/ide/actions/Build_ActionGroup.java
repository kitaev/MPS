package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;

public class Build_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Build_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Build";

  public Build_ActionGroup() {
    super("Build", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.ide.actions.MakeAllModules_Action"), language.getModuleFqName(), null));
      }
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.ide.actions.CleanAllModules_Action"), language.getModuleFqName(), null));
      }
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.ide.actions.RebuildAllModules_Action"), language.getModuleFqName(), null));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      DefaultActionGroup gToDef = ActionUtils.getDefaultGroup("BuildMenu");
      BaseGroup gWhat = ActionUtils.getGroup(Build_ActionGroup.ID);
      if (gToDef == null || gWhat == null) {
        return;
      }
      gToDef.add(gWhat);
    }
  }

}
