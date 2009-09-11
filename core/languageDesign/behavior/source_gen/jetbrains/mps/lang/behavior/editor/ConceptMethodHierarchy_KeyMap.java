package jetbrains.mps.lang.behavior.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import javax.swing.SwingUtilities;
import jetbrains.mps.baseLanguage.plugin.uiActions.StratergyAddMethodDialog;
import jetbrains.mps.baseLanguage.plugin.uiActions.strategies.AddConceptMethodStrategy;
import jetbrains.mps.ide.actions.MethodsToOverrideStrategy;
import jetbrains.mps.ide.actions.OverrideMethodStrategy;
import jetbrains.mps.ide.actions.MethodsToImplementStrategy;
import jetbrains.mps.ide.actions.ImplementMethodStrategy;

public class ConceptMethodHierarchy_KeyMap extends EditorCellKeyMap {
  public ConceptMethodHierarchy_KeyMap() {
    this.setApplicableToEveryModel(true);
    EditorCellKeyMapAction action;
    action = new ConceptMethodHierarchy_KeyMap.ConceptMethodHierarchy_KeyMap_Action0();
    this.putAction("ctrl", "VK_O", action);
    action = new ConceptMethodHierarchy_KeyMap.ConceptMethodHierarchy_KeyMap_Action1();
    this.putAction("ctrl", "VK_I", action);
  }

  public static class ConceptMethodHierarchy_KeyMap_Action0 extends EditorCellKeyMapAction {
    public ConceptMethodHierarchy_KeyMap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Override Behavior Method...";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SNodeOperations.getAncestor(node, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false) != null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new StratergyAddMethodDialog(editorContext, editorContext.getOperationContext().getMainFrame(), new AddConceptMethodStrategy(node), new MethodsToOverrideStrategy(), new OverrideMethodStrategy()).showDialog();
        }
      });
    }

    public String getKeyStroke() {
      return "ctrl O";
    }
  }

  public static class ConceptMethodHierarchy_KeyMap_Action1 extends EditorCellKeyMapAction {
    public ConceptMethodHierarchy_KeyMap_Action1() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Implement Behavior Method...";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SNodeOperations.getAncestor(node, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false) != null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new StratergyAddMethodDialog(editorContext, editorContext.getOperationContext().getMainFrame(), new AddConceptMethodStrategy(node), new MethodsToImplementStrategy(), new ImplementMethodStrategy()).showDialog();
        }
      });
    }

    public String getKeyStroke() {
      return "ctrl I";
    }
  }
}
