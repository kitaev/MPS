package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Nov 15, 2006 9:19:53 PM */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class ArrayType_Brackets_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new ArrayType_Brackets_Actions_DELETE(node));
  }
}
