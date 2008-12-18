package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class EditorCellModel_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError_1982_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1982_0(context, node);
  }

  public EditorCell createCollection_1982_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1982_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1982_0(context, node, "< abstract cell >"));
    return editorCell;
  }

  public EditorCell createConstant_1982_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1982_0(editorCell, node, context);
    setupLabel_Constant_1982_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createError_1982_0(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "<choose cell model>");
    setupBasic_Error_1982_0(editorCell, node, context);
    setupLabel_Error_1982_0(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Collection_1982_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1080925357596");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1982_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1080925357597");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Error_1982_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Error_1080925357598");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1982_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Error_1982_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
