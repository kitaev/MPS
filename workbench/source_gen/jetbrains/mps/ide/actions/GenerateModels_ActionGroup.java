package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.workbench.actions.generate.GenerateFilesFromModelsAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.workbench.actions.generate.GenerateTextFromModelsAction;

public class GenerateModels_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GenerateModels_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GenerateModels_ActionGroup";

  public GenerateModels_ActionGroup() {
    super("GenerateModels", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new GenerateFilesFromModel_Action(new GenerateFilesFromModelsAction(false));
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        GenerateModels_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new RegenerateFilesFromModel_Action(new GenerateFilesFromModelsAction(true));
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        GenerateModels_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new GenerateTextFromModel_Action(new GenerateTextFromModelsAction());
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        GenerateModels_ActionGroup.this.addAction(oldAction);

      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
