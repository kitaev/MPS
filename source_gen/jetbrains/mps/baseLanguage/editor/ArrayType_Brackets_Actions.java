package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Apr 4, 2006 10:25:29 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class ArrayType_Brackets_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new ArrayType_Brackets_Actions_DELETE(node));
  }
}
