package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Sep 21, 2006 2:12:28 PM */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class LocalVariableDeclaration_Initializer_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new LocalVariableDeclaration_Initializer_Actions_DELETE(node));
  }
}
