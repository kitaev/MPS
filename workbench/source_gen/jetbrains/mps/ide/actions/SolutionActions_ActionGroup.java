package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.project.AddModuleToProjectAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.actions.module.DeleteModuleAction;
import jetbrains.mps.workbench.actions.module.GenerateAllModelsInModuleAction;
import jetbrains.mps.workbench.actions.solution.GenerateTextFromAllModelsInSolutionAction;
import jetbrains.mps.workbench.actions.solution.OptimizeSolutionImportsAction;
import jetbrains.mps.workbench.actions.module.ShowModuleDependenciesAction;

public class SolutionActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(SolutionActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionActions";
  public static final String LABEL_ID_solutionNew = ID + "solutionNew";
  public static final String LABEL_ID_refactoring = ID + "refactoring";

  public SolutionActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_solutionNew);
      this.addSeparator();
      if (BaseGroup.class.isAssignableFrom(AddModuleToProjectAction.class)) {
        this.add(new AddModuleToProjectAction());
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(AddModuleToProjectAction.class, module.getModuleFqName(), null));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.RemoveModuleFromProject_Action"), module.getModuleFqName(), null));
      }
      if (BaseGroup.class.isAssignableFrom(DeleteModuleAction.class)) {
        this.add(new DeleteModuleAction());
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(DeleteModuleAction.class, module.getModuleFqName(), null));
      }
      this.addSeparator();
      if (BaseGroup.class.isAssignableFrom(GenerateAllModelsInModuleAction.class)) {
        this.add(new GenerateAllModelsInModuleAction(true));
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(GenerateAllModelsInModuleAction.class, module.getModuleFqName(), null, true));
      }
      if (BaseGroup.class.isAssignableFrom(GenerateAllModelsInModuleAction.class)) {
        this.add(new GenerateAllModelsInModuleAction(false));
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(GenerateAllModelsInModuleAction.class, module.getModuleFqName(), null, false));
      }
      if (BaseGroup.class.isAssignableFrom(GenerateTextFromAllModelsInSolutionAction.class)) {
        this.add(new GenerateTextFromAllModelsInSolutionAction());
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(GenerateTextFromAllModelsInSolutionAction.class, module.getModuleFqName(), null));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.CheckSolution_Action"), module.getModuleFqName(), null));
      }
      if (BaseGroup.class.isAssignableFrom(OptimizeSolutionImportsAction.class)) {
        this.add(new OptimizeSolutionImportsAction());
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(OptimizeSolutionImportsAction.class, module.getModuleFqName(), null));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.AnalyzeClasspath_Action"), module.getModuleFqName(), null));
      }
      if (BaseGroup.class.isAssignableFrom(ShowModuleDependenciesAction.class)) {
        this.add(new ShowModuleDependenciesAction());
      } else
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(ShowModuleDependenciesAction.class, module.getModuleFqName(), null));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.MakeModule_Action"), module.getModuleFqName(), null));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.RebuildModule_Action"), module.getModuleFqName(), null));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.CleanModule_Action"), module.getModuleFqName(), null));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.SetModuleFolder_Action"), module.getModuleFqName(), null));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.SolutionProperties_Action"), module.getModuleFqName(), null));
      }
      this.addSeparator();
      this.addAnchor(SolutionActions_ActionGroup.LABEL_ID_refactoring);
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
