package jetbrains.mps.ide.uiLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class DisposeDialogExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant1203606609555(context, node, "disposeDialog");
  }

  public EditorCell createConstant1203606609555(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12036066095551203606609555(editorCell, node, context);
    setupLabel_Constant_1203606609555_1203606609555(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Constant_12036066095551203606609555(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1203606609555");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1203606609555_1203606609555(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
