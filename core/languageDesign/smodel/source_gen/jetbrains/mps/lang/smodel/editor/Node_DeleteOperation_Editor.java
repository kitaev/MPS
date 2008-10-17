package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class Node_DeleteOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant1140133705634(context, node, "delete");
  }

  public EditorCell createConstant1140133705634(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11401337056341140133705634(editorCell, node, context);
    setupLabel_Constant_1140133705634_1140133705634(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Constant_11401337056341140133705634(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1140133705634");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1140133705634_1140133705634(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
