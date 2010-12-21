package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class ShowDiffWithCurrRev_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ShowDiffWithCurrRev_ActionGroup.class);
  public static final String ID = "jetbrains.mps.vcs.plugin.ShowDiffWithCurrRev_ActionGroup";

  public ShowDiffWithCurrRev_ActionGroup() {
    super("ShowDiffWithCurrRev", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new ShowDiffererenesWithCurrentRevision_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.vcs@transient53"));
          oldAction = newAction;
        }
        ShowDiffWithCurrRev_ActionGroup.this.addAction(oldAction);

      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
