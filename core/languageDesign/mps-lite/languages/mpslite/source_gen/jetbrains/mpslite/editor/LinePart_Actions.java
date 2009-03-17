package jetbrains.mpslite.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class LinePart_Actions extends EditorCellKeyMap {

  public LinePart_Actions() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new LinePart_Actions.LinePart_Actions_Action0();
    this.putAction("none", "VK_SPACE", action);
    action = new LinePart_Actions.LinePart_Actions_Action1();
    this.putAction("none", "VK_SPACE", action);
    action = new LinePart_Actions.LinePart_Actions_Action2();
    this.putAction("none", "VK_SPACE", action);
  }
  public static class LinePart_Actions_Action0 extends EditorCellKeyMapAction {

    public LinePart_Actions_Action0() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_INTERMEDIATE_POSITION);
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
      if (contextNode.isInstanceOfConcept("jetbrains.mpslite.structure.LinePart")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode selectedNode = editorContext.getSelectedNode();
      if (SNodeOperations.isInstanceOf(selectedNode, "jetbrains.mpslite.structure.ConstantLinePart")) {
        EditorCell editorCell = editorContext.getNodeEditorComponent().getDeepestSelectedCell();
        if (editorCell instanceof EditorCell_Label) {
          EditorCell_Label label = (EditorCell_Label)editorCell;
          String textBC = label.getTextBeforeCaret();
          String textAC = label.getTextAfterCaret();
          SNode nextLinePart = SNodeOperations.insertNewNextSiblingChild(selectedNode, "jetbrains.mpslite.structure.ConstantLinePart");
          SPropertyOperations.set(selectedNode, "text", textBC);
          SPropertyOperations.set(nextLinePart, "text", textAC);
        }
      }
    }

    public String getKeyStroke() {
      return "none SPACE";
    }

}
  public static class LinePart_Actions_Action1 extends EditorCellKeyMapAction {

    public LinePart_Actions_Action1() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_LAST_POSITION);
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
      if (contextNode.isInstanceOfConcept("jetbrains.mpslite.structure.LinePart")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode selectedNode = editorContext.getSelectedNode();
      SNodeOperations.insertNewNextSiblingChild(selectedNode, "jetbrains.mpslite.structure.LinePart");
    }

    public String getKeyStroke() {
      return "none SPACE";
    }

}
  public static class LinePart_Actions_Action2 extends EditorCellKeyMapAction {

    public LinePart_Actions_Action2() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_FIRST_POSITION);
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
      if (contextNode.isInstanceOfConcept("jetbrains.mpslite.structure.LinePart")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode selectedNode = editorContext.getSelectedNode();
      SNodeOperations.insertNewPrevSiblingChild(selectedNode, "jetbrains.mpslite.structure.LinePart");
    }

    public String getKeyStroke() {
      return "none SPACE";
    }

}

}
