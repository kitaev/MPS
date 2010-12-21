package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class Folding_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Folding_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Folding_ActionGroup";

  public Folding_ActionGroup() {
    super("Folding", ID);
    this.setIsInternal(false);
    this.setMnemonic("g".charAt(0));
    this.setPopup(true);
    try {
      {
        GeneratedAction newAction = new Expand_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        Folding_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new Collapse_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        Folding_ActionGroup.this.addAction(oldAction);

      }
      Folding_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ExpandAll_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        Folding_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CollapseAll_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        Folding_ActionGroup.this.addAction(oldAction);

      }
      Folding_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new FoldSelection_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        Folding_ActionGroup.this.addAction(oldAction);

      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
