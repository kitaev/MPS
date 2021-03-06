package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class UncommentSingleLineComment {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new UncommentSingleLineComment.UncommentSingleLineComment_DELETE(node));
  }

  public static class UncommentSingleLineComment_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public UncommentSingleLineComment_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      for (SNode commentPart : SLinkOperations.getTargets(node, "commentPart", true)) {
        if (SNodeOperations.isInstanceOf(commentPart, "jetbrains.mps.baseLanguage.structure.StatementCommentPart")) {
          SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(SNodeOperations.cast(commentPart, "jetbrains.mps.baseLanguage.structure.StatementCommentPart"), "commentedStatement", true));
          return;
        }
      }
      SNodeOperations.deleteNode(node);
    }
  }
}
