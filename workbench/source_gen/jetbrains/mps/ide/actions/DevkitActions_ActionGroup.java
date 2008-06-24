package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.actions.module.SetModuleFolderAction;
import jetbrains.mps.ide.actions.project.AddModuleToProjectAction;
import jetbrains.mps.ide.actions.project.RemoveModuleFromProjectAction;
import jetbrains.mps.ide.classpath.AnalyzeClassPathAction;
import jetbrains.mps.ide.actions.devkit.DevKitPropertiesAction;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class DevkitActions_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(DevkitActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.DevkitActions";
  public static final String LABEL_ID_VCS = ID + "VCS";

  public DevkitActions_ActionGroup(Project project) {
    super("", ID, true, false, null, project);
    this.setPopup(false);
    try {
      this.add(new SetModuleFolderAction());
      this.addSeparator();
      this.add(new AddModuleToProjectAction());
      this.add(new RemoveModuleFromProjectAction());
      this.add(new AnalyzeClassPathAction());
      this.addSeparator();
      this.add(new DevKitPropertiesAction());
      this.add(new LabelledAnchor(DevkitActions_ActionGroup.LABEL_ID_VCS));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
