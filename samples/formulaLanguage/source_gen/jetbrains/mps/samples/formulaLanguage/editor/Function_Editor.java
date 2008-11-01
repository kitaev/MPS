package jetbrains.mps.samples.formulaLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class Function_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError1111785438825(context, node);
  }

  public EditorCell createError1111785438825(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "?function?");
    setupBasic_Error_11117854388251111785438825(editorCell, node, context);
    setupLabel_Error_1111785438825_1111785438825(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Error_11117854388251111785438825(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Error_1111785438825");
  }

  private static void setupLabel_Error_1111785438825_1111785438825(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
