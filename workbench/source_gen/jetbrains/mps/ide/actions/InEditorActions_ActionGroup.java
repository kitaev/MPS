package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class InEditorActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(InEditorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.InEditorActions_ActionGroup";

  public InEditorActions_ActionGroup() {
    super("InEditorActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new LocalHome_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new LocalEnd_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new SelectLocalHome_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new SelectLocalEnd_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new RootHome_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new RootEnd_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new Home_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new End_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new SelectUp_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new SelectDown_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        InEditorActions_ActionGroup.this.addAction(oldAction);

      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
