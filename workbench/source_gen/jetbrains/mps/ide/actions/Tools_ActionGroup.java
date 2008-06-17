package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.actions.tools.InstallIDEAPluginAction;
import jetbrains.mps.ide.actions.tools.MakeAllModulesAction;
import jetbrains.mps.ide.actions.tools.RebuildAllModulesAction;
import jetbrains.mps.ide.actions.tools.CleanAllModulesAction;
import jetbrains.mps.workbench.action.LabelledAnchor;
import jetbrains.mps.svn.ui.SVNCheckOutAction;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class Tools_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(Tools_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Tools";
  public static final String INTERNAL_LABEL_ID_Internal = "Internal";
  public static final String INTERNAL_LABEL_ID_VersionControl = "VersionControl";

  public Tools_ActionGroup(Project project) {
    super("Tools", ID, false, "T".charAt(0), project);
    this.setPopup(true);
    try {
      this.add(new InstallIDEAPluginAction());
      this.addSeparator();
      this.add(new MakeAllModulesAction());
      this.add(new RebuildAllModulesAction());
      this.add(new CleanAllModulesAction());
      this.add(new LabelledAnchor(Tools_ActionGroup.INTERNAL_LABEL_ID_Internal));
      this.addSeparator();
      this.add(new LabelledAnchor(Tools_ActionGroup.INTERNAL_LABEL_ID_VersionControl));
      this.add(new SVNCheckOutAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      DefaultActionGroup gTo = ActionUtils.getGroup(MainMenu_ActionGroup.ID);
      DefaultActionGroup gWhat = ActionUtils.getGroup(Tools_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = MainMenu_ActionGroup.LABEL_ID_tools;
        gTo.add(gWhat, new Constraints(Anchor.AFTER, labelName));
      }
    }
  }

}
