package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class NodeActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NodeActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.NodeActions_ActionGroup";
  public static final String LABEL_ID_find_instances = ID + "find_instances";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_diff = ID + "diff";
  public static final String LABEL_ID_favorites = ID + "favorites";

  public NodeActions_ActionGroup() {
    super("NodeActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new EditNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new EditNodeExplicit_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new SetNodePackage_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ExpandNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new CopyNodeReference_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CopyNodeName_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CopyNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new PasteNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CutNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new CloneRoot_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new DeleteNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new GoToConceptDeclaration_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new GoToEditorDeclaration_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new GoToRules_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new ShowNodeInExplorer_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowGenerationTrace_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new ShowGenerationTraceback_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new FindSpecificNodeUsages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      {
        GeneratedAction newAction = new FastFindNodeUsages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addAnchor(NodeActions_ActionGroup.LABEL_ID_find_instances);
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowConceptInHierarchy_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addAnchor(NodeActions_ActionGroup.LABEL_ID_structure);
      {
        GeneratedAction newAction = new ShowClassInHierarchy_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addAnchor(NodeActions_ActionGroup.LABEL_ID_diff);
      NodeActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowErrorMessage_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide@transient5"));
          oldAction = newAction;
        }
        NodeActions_ActionGroup.this.addAction(oldAction);

      }
      NodeActions_ActionGroup.this.addSeparator();
      NodeActions_ActionGroup.this.addAnchor(NodeActions_ActionGroup.LABEL_ID_favorites);
      NodeActions_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
