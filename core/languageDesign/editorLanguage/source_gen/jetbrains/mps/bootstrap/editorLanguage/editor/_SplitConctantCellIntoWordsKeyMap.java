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
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class _SplitConctantCellIntoWordsKeyMap extends EditorCellKeyMap {

  public _SplitConctantCellIntoWordsKeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new _SplitConctantCellIntoWordsKeyMap._SplitConctantCellIntoWordsKeyMap_Action0();
    this.putAction("ctrl+alt+shift", "VK_W", action);
  }
  public static class _SplitConctantCellIntoWordsKeyMap_Action0 extends EditorCellKeyMapAction {

    public _SplitConctantCellIntoWordsKeyMap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "split constant cell into words";
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SNodeOperations.getParent(node, null, false, false) != null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode collection = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection", null);
      SLinkOperations.setNewChild(collection, "cellLayout", "jetbrains.mps.bootstrap.editorLanguage.structure.CellLayout_Flow");
      SNodeOperations.replaceWithAnother(node, collection);
      String text = SPropertyOperations.getString(node, "text");
      String[] strings = text.split(" ");
      for(String word : strings) {
        SNode constantCell = SNodeOperations.copyNode(node);
        SPropertyOperations.set(constantCell, "text", word);
        SLinkOperations.addChild(collection, "childCellModel", constantCell);
      }
    }

    public String getKeyStroke() {
      return "ctrl alt shift W";
    }

}

}
