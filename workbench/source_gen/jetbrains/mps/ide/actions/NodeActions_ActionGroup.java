package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.actions.nodes.SetNodePackageAction;
import jetbrains.mps.workbench.actions.nodes.GoToConceptEditorDeclarationAction;
import jetbrains.mps.workbench.actions.nodes.CopyNodeAction;
import jetbrains.mps.workbench.actions.nodes.CopyNodeReferenceAction;
import jetbrains.mps.workbench.actions.nodes.PasteNodeAction;
import jetbrains.mps.workbench.actions.nodes.CutNodeAction;
import jetbrains.mps.workbench.actions.nodes.DeleteNodeAction;
import jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationAction;
import jetbrains.mps.workbench.actions.nodes.GoToRulesAction;
import jetbrains.mps.lang.generator.plugin.debug.actions.ShowGenerationTraceAction;
import jetbrains.mps.workbench.actions.nodes.FindSpecificNodeUsagesAction;
import jetbrains.mps.workbench.actions.nodes.FastFindUsagesNodeAction;

public class NodeActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NodeActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.NodeActions";
  public static final String LABEL_ID_structure = ID + "structure";

  public NodeActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.EditNode_Action"), module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(SetNodePackageAction.class, module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.ExpandNode_Action"), module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(GoToConceptEditorDeclarationAction.class, module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(CopyNodeAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(CopyNodeReferenceAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(PasteNodeAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(CutNodeAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.CloneRoot_Action"), module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(DeleteNodeAction.class, module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.GoToConceptDeclaration_Action"), module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(GoToEditorDeclarationAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(GoToRulesAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.ShowNodeInExplorer_Action"), module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(ShowGenerationTraceAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.ShowGenerationTraceback_Action"), module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(FindSpecificNodeUsagesAction.class, module.getModuleFqName()));
      }
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(FastFindUsagesNodeAction.class, module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.ShowConceptInHierarchy_Action"), module.getModuleFqName()));
      }
      this.addAnchor(NodeActions_ActionGroup.LABEL_ID_structure);
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.ShowClassInHierarchy_Action"), module.getModuleFqName()));
      }
      this.addSeparator();
      {
        IModule module = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(module.getClass("jetbrains.mps.ide.actions.ShowErrorMessage_Action"), module.getModuleFqName()));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
