package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class TreeNodeKindProperty_default_DELETE {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new TreeNodeKindProperty_default_DELETE.TreeNodeKindProperty_default_DELETE_DELETE(node));
  }

  public static class TreeNodeKindProperty_default_DELETE_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public TreeNodeKindProperty_default_DELETE_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SPropertyOperations.set(node, "default", "" + (false));
    }

}

}
