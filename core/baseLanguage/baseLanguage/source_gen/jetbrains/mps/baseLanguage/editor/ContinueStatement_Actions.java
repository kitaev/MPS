package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ContinueStatement_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new ContinueStatement_Actions.ContinueStatement_Actions_DELETE(node));
  }

  public static class ContinueStatement_Actions_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public ContinueStatement_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SPropertyOperations.set(node, "label", null);
    }
  }
}
