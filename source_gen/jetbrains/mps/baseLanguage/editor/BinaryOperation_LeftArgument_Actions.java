package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Apr 7, 2006 3:55:07 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class BinaryOperation_LeftArgument_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new BinaryOperation_LeftArgument_Actions_DELETE(node));
  }
}
