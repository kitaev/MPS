package jetbrains.mps.build.packaging.mps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class InternalChecks_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(InternalChecks_ActionGroup.class);
  public static final String ID = "jetbrains.mps.build.packaging.mps.plugin.InternalChecks_ActionGroup";

  public InternalChecks_ActionGroup() {
    super("Checks", ID);
    this.setIsInternal(true);
    this.setPopup(true);
    try {
      {
        GeneratedAction newAction = new CheckSamples_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.build.packaging.mps@transient10"));
          oldAction = newAction;
        }
        InternalChecks_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CheckCoreRuntimeDeps_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.build.packaging.mps@transient10"));
          oldAction = newAction;
        }
        InternalChecks_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CheckIncludedLanguages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.build.packaging.mps@transient10"));
          oldAction = newAction;
        }
        InternalChecks_ActionGroup.this.addAction(oldAction);

      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
