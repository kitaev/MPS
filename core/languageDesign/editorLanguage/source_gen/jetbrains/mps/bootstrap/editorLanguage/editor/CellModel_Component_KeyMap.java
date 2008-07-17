package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class CellModel_Component_KeyMap extends EditorCellKeyMap {

  public CellModel_Component_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new CellModel_Component_KeyMap.CellModel_Component_KeyMap_Action0();
    this.putAction("ctrl+alt", "VK_N", action);
  }
  public static class CellModel_Component_KeyMap_Action0 extends EditorCellKeyMapAction {

    public CellModel_Component_KeyMap_Action0() {
      this.setShownInPopupMenu(false);
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Component")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNodeOperations.replaceWithAnother(node, SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "editorComponent", false), "cellModel", true)));
    }

    public String getKeyStroke() {
      return "ctrl alt N";
    }

}

}
