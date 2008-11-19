package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class ToolsInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ToolsInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Internal";

  public ToolsInternal_ActionGroup() {
    super("Internal", ID);
    this.setIsInternal(true);
    this.setPopup(false);
    try {
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.ide.actions.RemoveTransientModels_Action"), language.getModuleFqName(), null));
      }
      this.addSeparator();
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.ide.actions.DumpKeyStrokes_Action"), language.getModuleFqName(), null));
      }
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    ActionUtils.getGroup(Tools_ActionGroup.ID).add(this, new Constraints(Anchor.AFTER, Tools_ActionGroup.INTERNAL_LABEL_ID_Internal));
  }

}
