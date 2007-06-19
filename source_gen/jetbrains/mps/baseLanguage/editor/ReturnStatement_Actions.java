package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class ReturnStatement_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("RIGHT_TRANSFORM", new ReturnStatement_Actions_RIGHT_TRANSFORM(node));
    editorCell.setAction("DELETE", new ReturnStatement_Actions_DELETE(node));
  }
}
