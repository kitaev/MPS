package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class _TryCatchStatement_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.RIGHT_TRANSFORM, new _TryCatchStatement_Actions._TryCatchStatement_Actions_RIGHT_TRANSFORM(node));
  }

  public static class _TryCatchStatement_Actions_RIGHT_TRANSFORM extends EditorCellAction {
    /*package*/ SNode myNode;

    public _TryCatchStatement_Actions_RIGHT_TRANSFORM(SNode node) {
      this.myNode = node;
    }


    public String getDescriptionText() {
      return "catch";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SLinkOperations.addNewChild(node, "catchClause", "jetbrains.mps.baseLanguage.structure.CatchClause");
    }
  }
}
