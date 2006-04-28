package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS Apr 28, 2006 5:15:59 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Basic;

public class Node_GetModelOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstantCell(context, node, "model");
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1143234307769");
    editorCell.setLayoutConstraint("");
    editorCell.putUserObject(EditorCell.ATTRACTS_FOCUS_POLICY, EditorCell.ATTRACTS_FOCUS);
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
}
