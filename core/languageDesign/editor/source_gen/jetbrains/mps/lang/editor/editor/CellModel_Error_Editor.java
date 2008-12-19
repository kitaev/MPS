package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_Error_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_OpenTag6148_0;
  /* package */AbstractCellProvider my_CloseTag6148_0;
  /* package */AbstractCellProvider my_CellModel_Common6148_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6148_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_6148_1(context, node);
  }

  public EditorCell createCollection_6148_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6148_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_6148_0(context, node));
    editorCell.addEditorCell(this.createProperty_6148_1(context, node));
    editorCell.addEditorCell(this.createComponent_6148_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6148_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_6148_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_6148_2(context, node));
    editorCell.addEditorCell(this.createConstant_6148_2(context, node, ""));
    editorCell.addEditorCell(this.createConstant_6148_0(context, node, "Error cell:"));
    editorCell.addEditorCell(this.createCollection_6148_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6148_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_6148_2(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection_6148_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6148_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6148_3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_6148_1(context, node, "text"));
    editorCell.addEditorCell(this.createProperty_6148_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6148_0(EditorContext context, SNode node) {
    if (this.my_OpenTag6148_0 == null) {
      this.my_OpenTag6148_0 = new _OpenTag(node);
    }
    EditorCell editorCell = this.my_OpenTag6148_0.createEditorCell(context);
    setupBasic_Component_6148_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_6148_1(EditorContext context, SNode node) {
    if (this.my_CloseTag6148_0 == null) {
      this.my_CloseTag6148_0 = new _CloseTag(node);
    }
    EditorCell editorCell = this.my_CloseTag6148_0.createEditorCell(context);
    setupBasic_Component_6148_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_6148_2(EditorContext context, SNode node) {
    if (this.my_CellModel_Common6148_0 == null) {
      this.my_CellModel_Common6148_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common6148_0.createEditorCell(context);
    setupBasic_Component_6148_2(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_6148_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6148_0(editorCell, node, context);
    setupLabel_Constant_6148_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6148_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6148_1(editorCell, node, context);
    setupLabel_Constant_6148_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6148_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6148_2(editorCell, node, context);
    setupLabel_Constant_6148_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_6148_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_6148_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_6148_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_6148_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty_6148_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_6148_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_6148_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_6148_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_6148_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty_6148_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_6148_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6148_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Property_6148_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_text");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Error_Editor._StyleParameter_QueryFunction_1214396913642((cell == null ?
                null :
                cell.getSNode()
              ), (cell == null ?
                null :
                cell.getEditorContext()
              ));
            }

          });
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.pink);
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.magenta);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_6148_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6148_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_6148_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6148_0");
    Styles_StyleSheet.getHeader(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_6148_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6148_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_6148_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6148_3");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_6148_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6148_1");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_6148_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_text");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.pink);
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.magenta);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Component_6148_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__OpenTag");
  }

  private static void setupBasic_Component_6148_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__CloseTag");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_6148_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6148_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Component_6148_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__CellModel_Common");
  }

  private static void setupLabel_Property_6148_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6148_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6148_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Property_6148_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6148_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _StyleParameter_QueryFunction_1214396913642(SNode node, EditorContext editorContext) {
    return _EditorUtil.grayIfNotSelectable(node);
  }

}
