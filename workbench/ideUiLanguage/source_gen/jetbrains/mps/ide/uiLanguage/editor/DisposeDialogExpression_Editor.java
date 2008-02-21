package jetbrains.mps.ide.uiLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class DisposeDialogExpression_Editor extends DefaultNodeEditor {

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1203606609555");
    BaseLanguageStyle_StyleSheet.KEY_WORD.apply(editorCell);
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstantCell(context, node, "disposeDialog");
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    DisposeDialogExpression_Editor.setupBasic_ConstantCell(editorCell, node, context);
    DisposeDialogExpression_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

}
