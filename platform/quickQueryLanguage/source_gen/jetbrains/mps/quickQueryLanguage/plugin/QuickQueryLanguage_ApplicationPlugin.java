package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.openapi.actionSystem.ActionManager;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class QuickQueryLanguage_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.quickQueryLanguage");

  public QuickQueryLanguage_ApplicationPlugin() {
  }

  public void createGroups() {
    ActionManager manager = ActionManager.getInstance();
    // actions w/o parameters 
    {
      FindInstancesByConditionAndNode_Action action = new FindInstancesByConditionAndNode_Action();
      manager.registerAction(action.getActionId(), action, myId);
    }
    {
      FindInstancesByCondition_Action action = new FindInstancesByCondition_Action();
      manager.registerAction(action.getActionId(), action, myId);
    }
    {
      ReplacementQueryActionWithNode_Action action = new ReplacementQueryActionWithNode_Action();
      manager.registerAction(action.getActionId(), action, myId);
    }
    {
      ReplacementQueryAction_Action action = new ReplacementQueryAction_Action();
      manager.registerAction(action.getActionId(), action, myId);
    }
    // parameterized actions 

    // groups 
    manager.registerAction(FindInstancesByConditionAndNodeGroup_ActionGroup.ID, new FindInstancesByConditionAndNodeGroup_ActionGroup(), myId);
    manager.registerAction(FindInstancesByConditionGroup_ActionGroup.ID, new FindInstancesByConditionGroup_ActionGroup(), myId);
  }

  public void adjustRegularGroups() {
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionGroup_ActionGroup", LanguageActions_ActionGroup.LABEL_ID_find_instances);
    this.insertGroupIntoAnother(NodeActions_ActionGroup.ID, "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionAndNodeGroup_ActionGroup", NodeActions_ActionGroup.LABEL_ID_find_instances);
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionAndNodeGroup_ActionGroup", EditorPopup_ActionGroup.LABEL_ID_find_instances);
  }
}
