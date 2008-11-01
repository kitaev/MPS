package jetbrains.mps.lang.dataFlow.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class EmitRetStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant1206462913500(context, node, "ret");
  }

  public EditorCell createConstant1206462913500(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064629135001206462913500(editorCell, node, context);
    setupLabel_Constant_1206462913500_1206462913500(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Constant_12064629135001206462913500(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1206462913500");
    DataFlow_StyleSheet.getInstruction(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1206462913500_1206462913500(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
