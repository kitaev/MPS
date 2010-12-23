package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class DebugRunMenu_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DebugRunMenu_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.DebugRunMenu_ActionGroup";

  public DebugRunMenu_ActionGroup() {
    super("DebugRunMenu", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      DebugRunMenu_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new StepOver_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new StepInto_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new StepOut_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new Resume_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new Pause_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new EvaluateExpression_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ExportThreads_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      DebugRunMenu_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ToggleBreakpoint_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ViewBreakpoints_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        DebugRunMenu_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
