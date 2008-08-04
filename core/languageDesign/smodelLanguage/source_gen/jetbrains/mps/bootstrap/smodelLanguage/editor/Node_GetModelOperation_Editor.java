package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Node_GetModelOperation_Editor extends DefaultNodeEditor {

  private static void setupBasic_Constant_11432343077691143234307769(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1143234307769");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupLabel_Constant_1143234307769_1143234307769(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant1143234307769(context, node, "model");
  }

  public EditorCell createConstant1143234307769(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11432343077691143234307769(editorCell, node, context);
    setupLabel_Constant_1143234307769_1143234307769(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

}
