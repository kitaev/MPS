package jetbrains.mps.build.generictasks.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class ProjectPaneLanguageAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectPaneLanguageAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.build.generictasks.plugin.ProjectPaneLanguageAddition_ActionGroup";

  public ProjectPaneLanguageAddition_ActionGroup() {
    super("ProjectPaneLanguageAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new ImportAntStuff_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.build.generictasks@transient7"));
          oldAction = newAction;
        }
        ProjectPaneLanguageAddition_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
