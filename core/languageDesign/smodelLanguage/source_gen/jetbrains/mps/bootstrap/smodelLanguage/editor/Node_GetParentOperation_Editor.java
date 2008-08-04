package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Node_GetParentOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAliasAndParms_Comp8;

  private static void setupBasic_Collection_11545547231481154554723148(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1154554723148");
  }

  private static void setupBasic_Constant_11545547526651154554752665(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154554752665");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return Node_GetParentOperation_Editor.calculateColor11(cell);
            }

          });
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return Node_GetParentOperation_Editor.calculateColor58(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11545548517451154554851745(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154554851745");
  }

  private static void setupBasic_Constant_11545549234341154554923434(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154554923434");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11545549887641154554988764(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154554988764");
  }

  private static void setupBasic_Constant_11545549919701154554991970(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154554991970");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11545550183471154555018347(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1154555018347");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11545550496771154555049677(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1154555049677");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11545550682401154555068240(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555068240");
  }

  private static void setupBasic_Constant_11545550896811154555089681(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555089681");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11545551756411154555175641(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1154555175641");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11545551756421154555175642(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555175642");
  }

  private static void setupBasic_Constant_11545551756431154555175643(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555175643");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11545552306651154555230665(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1154555230665");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11545552306661154555230666(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555230666");
  }

  private static void setupBasic_Constant_11545552306671154555230667(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555230667");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11545553225151154555322515(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1154555322515");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11545553225161154555322516(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555322516");
  }

  private static void setupBasic_Constant_11545553225171154555322517(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1154555322517");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component_ReplaceableAliasAndParms_Comp1207269848529(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component_ReplaceableAliasAndParms_Comp");
  }

  private static void setupLabel_Constant_1154554752665_1154554752665(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154554851745_1154554851745(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154554923434_1154554923434(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154554988764_1154554988764(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154554991970_1154554991970(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555068240_1154555068240(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555089681_1154555089681(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555175642_1154555175642(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555175643_1154555175643(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555230666_1154555230666(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555230667_1154555230667(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555322516_1154555322516(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1154555322517_1154555322517(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor11(EditorCell cell) {
    Color result;
    result = Color.blue;
    return result;
  }

  private static Color calculateColor58(EditorCell cell) {
    Color result;
    result = Color.lightGray;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createComponent1207269848529(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1154554723148(context, node);
  }

  public EditorCell createCollection1154554723148(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11545547231481154554723148(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1154554752665(context, node, "The 'parent' operation"));
    editorCell.addEditorCell(this.createConstant1154554851745(context, node, ""));
    editorCell.addEditorCell(this.createConstant1154554923434(context, node, "Returns parent node"));
    editorCell.addEditorCell(this.createConstant1154554988764(context, node, ""));
    editorCell.addEditorCell(this.createConstant1154554991970(context, node, "Optional parameters - deprecated. Use the 'ancestor' operation"));
    editorCell.addEditorCell(this.createCollection1154555018347(context, node));
    return editorCell;
  }

  public EditorCell createCollection1154555018347(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11545550183471154555018347(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1154555049677(context, node));
    editorCell.addEditorCell(this.createCollection1154555230665(context, node));
    editorCell.addEditorCell(this.createCollection1154555322515(context, node));
    editorCell.addEditorCell(this.createCollection1154555175641(context, node));
    return editorCell;
  }

  public EditorCell createCollection1154555049677(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11545550496771154555049677(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1154555068240(context, node, "root"));
    editorCell.addEditorCell(this.createConstant1154555089681(context, node, "get top ancestor"));
    return editorCell;
  }

  public EditorCell createCollection1154555175641(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11545551756411154555175641(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1154555175642(context, node, "+"));
    editorCell.addEditorCell(this.createConstant1154555175643(context, node, "return current node if it meets the requirements"));
    return editorCell;
  }

  public EditorCell createCollection1154555230665(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11545552306651154555230665(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1154555230666(context, node, "concept"));
    editorCell.addEditorCell(this.createConstant1154555230667(context, node, "get ancestor which is instance of concept"));
    return editorCell;
  }

  public EditorCell createCollection1154555322515(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11545553225151154555322515(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1154555322516(context, node, "concept in"));
    editorCell.addEditorCell(this.createConstant1154555322517(context, node, "get ancestor which is instance of one of concepts"));
    return editorCell;
  }

  public EditorCell createComponent1207269848529(EditorContext context, SNode node) {
    if (this.myReplaceableAliasAndParms_Comp8 == null) {
      this.myReplaceableAliasAndParms_Comp8 = new ReplaceableAliasAndParms_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAliasAndParms_Comp8.createEditorCell(context);
    setupBasic_component_ReplaceableAliasAndParms_Comp1207269848529(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1154554752665(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545547526651154554752665(editorCell, node, context);
    setupLabel_Constant_1154554752665_1154554752665(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154554851745(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545548517451154554851745(editorCell, node, context);
    setupLabel_Constant_1154554851745_1154554851745(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154554923434(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545549234341154554923434(editorCell, node, context);
    setupLabel_Constant_1154554923434_1154554923434(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154554988764(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545549887641154554988764(editorCell, node, context);
    setupLabel_Constant_1154554988764_1154554988764(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154554991970(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545549919701154554991970(editorCell, node, context);
    setupLabel_Constant_1154554991970_1154554991970(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555068240(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545550682401154555068240(editorCell, node, context);
    setupLabel_Constant_1154555068240_1154555068240(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555089681(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545550896811154555089681(editorCell, node, context);
    setupLabel_Constant_1154555089681_1154555089681(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555175642(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545551756421154555175642(editorCell, node, context);
    setupLabel_Constant_1154555175642_1154555175642(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555175643(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545551756431154555175643(editorCell, node, context);
    setupLabel_Constant_1154555175643_1154555175643(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555230666(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545552306661154555230666(editorCell, node, context);
    setupLabel_Constant_1154555230666_1154555230666(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555230667(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545552306671154555230667(editorCell, node, context);
    setupLabel_Constant_1154555230667_1154555230667(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555322516(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545553225161154555322516(editorCell, node, context);
    setupLabel_Constant_1154555322516_1154555322516(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1154555322517(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11545553225171154555322517(editorCell, node, context);
    setupLabel_Constant_1154555322517_1154555322517(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

}
