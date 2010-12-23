package jetbrains.mps.lang.editor.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class EditorActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.editor.plugin.EditorActions_ActionGroup";

  public EditorActions_ActionGroup() {
    super("EditorActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new CopyThisDown_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.lang.editor@transient28"));
          oldAction = newAction;
        }
        EditorActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new DeleteLine_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.lang.editor@transient28"));
          oldAction = newAction;
        }
        EditorActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ExtractComponent_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.lang.editor@transient28"));
          oldAction = newAction;
        }
        EditorActions_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
