package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.project.NewSolutionAction;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.actions.project.NewLanguageAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleReference;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class ProjectNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ProjectNewActions";

  public ProjectNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      if (BaseGroup.class.isAssignableFrom(NewSolutionAction.class)) {
        this.add(new NewSolutionAction(""));
      } else {
        this.add(ActionFactory.getInstance().acquireRegisteredAction(NewSolutionAction.class, null, null, ""));
      }
      if (BaseGroup.class.isAssignableFrom(NewLanguageAction.class)) {
        this.add(new NewLanguageAction(""));
      } else {
        this.add(ActionFactory.getInstance().acquireRegisteredAction(NewLanguageAction.class, null, null, ""));
      }
      {
        IModule language = MPSModuleRepository.getInstance().getModule(new ModuleReference("jetbrains.mps.ide"));
        this.add(ActionFactory.getInstance().acquireRegisteredAction(language.getClass("jetbrains.mps.ide.actions.NewDevKit_Action"), language.getModuleFqName(), null));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ProjectActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(ProjectNewActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = ProjectActions_ActionGroup.LABEL_ID_projectNew;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
