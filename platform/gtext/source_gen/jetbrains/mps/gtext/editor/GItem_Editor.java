package jetbrains.mps.gtext.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class GItem_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError1166907509191(context, node);
  }

  public EditorCell createError1166907509191(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "gItem");
    setupBasic_Error_11669075091911166907509191(editorCell, node, context);
    setupLabel_Error_1166907509191_1166907509191(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Error_11669075091911166907509191(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Error_1166907509191");
  }

  private static void setupLabel_Error_1166907509191_1166907509191(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
