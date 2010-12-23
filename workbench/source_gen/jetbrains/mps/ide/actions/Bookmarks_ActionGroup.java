package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class Bookmarks_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Bookmarks_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Bookmarks_ActionGroup";

  public Bookmarks_ActionGroup() {
    super("Bookmarks", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      {
        GeneratedAction newAction = new ShowBookmarks_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      Bookmarks_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowBookmarksDialog_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      Bookmarks_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new RemoveAllBookmarks_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      Bookmarks_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new GoToBookmark0_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark1_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark2_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark3_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark4_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark5_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark6_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark7_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark8_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToBookmark9_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark0_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark1_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark2_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark3_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark4_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark5_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark6_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark7_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark8_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmark9_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new SetBookmarkNoNumber_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Bookmarks_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
