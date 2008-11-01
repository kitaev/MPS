package jetbrains.mpslite.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class IndentLinePart_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1182512719605(context, node);
  }

  public EditorCell createCollection1182512719605(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11825127196051182512719605(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1182512721419(context, node, "--->"));
    return editorCell;
  }

  public EditorCell createConstant1182512721419(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11825127214191182512721419(editorCell, node, context);
    setupLabel_Constant_1182512721419_1182512721419(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_11825127196051182512719605(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1182512719605");
  }

  private static void setupBasic_Constant_11825127214191182512721419(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1182512721419");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
        }

      };
      inlineStyle.apply(editorCell);
    }
    _LinePart_RT.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_Constant_1182512721419_1182512721419(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
