package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class keymap_SequenceFeature extends EditorCellKeyMap {
  public keymap_SequenceFeature() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new keymap_SequenceFeature.keymap_SequenceFeature_Action0();
    this.putAction("alt", "VK_D", action);
  }

  public static class keymap_SequenceFeature_Action0 extends EditorCellKeyMapAction {
    public keymap_SequenceFeature_Action0() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "make this feature the dafault";
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.ypath.structure.SequenceFeature")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode tp = SNodeOperations.getAncestor(node, "jetbrains.mps.ypath.structure.TreePath", false, false);
      boolean isDefault = SPropertyOperations.getBoolean(SNodeOperations.cast(node, "jetbrains.mps.ypath.structure.IFeature"), "default");
      for (SNode fe : SLinkOperations.getTargets(tp, "features", true)) {
        SPropertyOperations.set(fe, "default", "" + (!(isDefault) && fe == node));
      }
    }

    public String getKeyStroke() {
      return "alt D";
    }
  }
}
