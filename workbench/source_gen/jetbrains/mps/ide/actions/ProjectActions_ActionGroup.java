package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.actions.make.CleanProjectAction;
import jetbrains.mps.ide.actions.make.MakeProjectAction;
import jetbrains.mps.ide.actions.make.RebuildProjectAction;
import jetbrains.mps.ide.actions.project.OptimizeProjectImportsAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class ProjectActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(ProjectActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ProjectActions";
  public static final String LABEL_ID_projectNew = ID + "projectNew";

  public ProjectActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new LabelledAnchor(ProjectActions_ActionGroup.LABEL_ID_projectNew));
      this.addSeparator();
      this.add(new MakeProjectAction());
      this.add(new RebuildProjectAction());
      this.add(new CleanProjectAction());
      this.addSeparator();
      this.add(new OptimizeProjectImportsAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
