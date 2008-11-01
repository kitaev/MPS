package jetbrains.mps.xmlSchema.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class ContentItem_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError1167794592694(context, node);
  }

  public EditorCell createError1167794592694(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "contentItem");
    setupBasic_Error_11677945926941167794592694(editorCell, node, context);
    setupLabel_Error_1167794592694_1167794592694(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Error_11677945926941167794592694(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Error_1167794592694");
  }

  private static void setupLabel_Error_1167794592694_1167794592694(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
