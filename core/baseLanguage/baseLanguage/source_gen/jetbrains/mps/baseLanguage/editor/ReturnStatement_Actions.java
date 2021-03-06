package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class ReturnStatement_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.RIGHT_TRANSFORM, new ReturnStatement_Actions.ReturnStatement_Actions_RIGHT_TRANSFORM(node));
    editorCell.setAction(CellActionType.DELETE, new ReturnStatement_Actions.ReturnStatement_Actions_DELETE(node));
  }

  public static class ReturnStatement_Actions_RIGHT_TRANSFORM extends EditorCellAction {
    /*package*/ SNode myNode;

    public ReturnStatement_Actions_RIGHT_TRANSFORM(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "add return expression";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SLinkOperations.getTarget(node, "expression", true) == null) {
        SNodeFactoryOperations.setNewChild(node, "expression", "jetbrains.mps.baseLanguage.structure.Expression");
      }
    }
  }

  public static class ReturnStatement_Actions_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public ReturnStatement_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode expressionStatement = SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.ExpressionStatement");
      SLinkOperations.setTarget(expressionStatement, "expression", SLinkOperations.getTarget(node, "expression", true), true);
    }
  }
}
