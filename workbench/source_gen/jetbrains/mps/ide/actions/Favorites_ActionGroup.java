package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class Favorites_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Favorites_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Favorites_ActionGroup";
  public static final String LABEL_ID_generate = ID + "generate";
  public static final String LABEL_ID_popup = ID + "popup";

  public Favorites_ActionGroup() {
    super("Favorites", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      Favorites_ActionGroup.this.addAnchor(Favorites_ActionGroup.LABEL_ID_generate);
      Favorites_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new RenameFavoritesList_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Favorites_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new RemoveFromFavorites_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Favorites_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new DeleteFavoritesList_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        Favorites_ActionGroup.this.addAction(oldAction);
      }
      Favorites_ActionGroup.this.addAnchor(Favorites_ActionGroup.LABEL_ID_popup);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
