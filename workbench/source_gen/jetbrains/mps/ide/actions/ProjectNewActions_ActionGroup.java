package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;

public class ProjectNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup";
  public static final String LABEL_ID_end = ID + "end";

  public ProjectNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      ProjectNewActions_ActionGroup.this.addParameterizedAction(new NewSolution_Action(""), PluginId.getId("jetbrains.mps.ide"), "");
      ProjectNewActions_ActionGroup.this.addParameterizedAction(new NewLibrary_Action(""), PluginId.getId("jetbrains.mps.ide"), "");
      {
        LabelledAnchor action = new LabelledAnchor(ProjectNewActions_ActionGroup.LABEL_ID_end);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        ProjectNewActions_ActionGroup.this.addAction(action);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
