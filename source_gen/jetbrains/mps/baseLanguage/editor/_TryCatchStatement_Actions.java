package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Dec 1, 2006 7:20:32 PM */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class _TryCatchStatement_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("RIGHT_TRANSFORM", new _TryCatchStatement_Actions_RIGHT_TRANSFORM(node));
    editorCell.setAction("RIGHT_TRANSFORM", new _TryCatchStatement_Actions_RIGHT_TRANSFORM(node));
  }
}
