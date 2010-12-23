package jetbrains.mps.lang.behavior.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class BehaviorCodeOverrideImplementMenuGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BehaviorCodeOverrideImplementMenuGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.behavior.plugin.BehaviorCodeOverrideImplementMenuGroup_ActionGroup";

  public BehaviorCodeOverrideImplementMenuGroup_ActionGroup() {
    super("BehaviorCodeOverrideImplementMenuGroup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new OverrideBehaviorMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.lang.behavior@transient24"));
          oldAction = newAction;
        }
        BehaviorCodeOverrideImplementMenuGroup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ImplementBehaviorMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.lang.behavior@transient24"));
          oldAction = newAction;
        }
        BehaviorCodeOverrideImplementMenuGroup_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
