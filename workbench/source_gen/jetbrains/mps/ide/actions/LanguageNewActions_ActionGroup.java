package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class LanguageNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(LanguageNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.LanguageNewActions_ActionGroup";
  public static final String LABEL_ID_newAspect = ID + "newAspect";

  public LanguageNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      {
        GeneratedAction newAction = new NewGenerator_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        LanguageNewActions_ActionGroup.this.addAction(oldAction);
      }
      LanguageNewActions_ActionGroup.this.addSeparator();
      LanguageNewActions_ActionGroup.this.addAnchor(LanguageNewActions_ActionGroup.LABEL_ID_newAspect);
      LanguageNewActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new NewModel_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        LanguageNewActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new NewModelFromSource_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        LanguageNewActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new NewAccessoryModel_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient23"));
          oldAction = newAction;
        }
        LanguageNewActions_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
