package jetbrains.mps.ide.uiLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
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

public class DialogDimensions_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1226850428417(context, node);
  }

  public EditorCell createCollection1226850428417(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12268504284171226850428417(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1226850430997(context, node, "left:"));
    editorCell.addEditorCell(this.createProperty1226850440718(context, node));
    editorCell.addEditorCell(this.createConstant1226850449751(context, node, "top:"));
    editorCell.addEditorCell(this.createProperty1226850449752(context, node));
    editorCell.addEditorCell(this.createConstant1226850454129(context, node, "width:"));
    editorCell.addEditorCell(this.createProperty1226850454130(context, node));
    editorCell.addEditorCell(this.createConstant1226850457429(context, node, "height:"));
    editorCell.addEditorCell(this.createProperty1226850457430(context, node));
    return editorCell;
  }

  public EditorCell createConstant1226850430997(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12268504309971226850430997(editorCell, node, context);
    setupLabel_Constant_1226850430997_1226850430997(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226850449751(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12268504497511226850449751(editorCell, node, context);
    setupLabel_Constant_1226850449751_1226850449751(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226850454129(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12268504541291226850454129(editorCell, node, context);
    setupLabel_Constant_1226850454129_1226850454129(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226850457429(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12268504574291226850457429(editorCell, node, context);
    setupLabel_Constant_1226850457429_1226850457429(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1226850440718_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_left1226850440718(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_left_1226850440718((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1226850440718(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("left");
    provider.setNoTargetText("<no left>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1226850440718_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createProperty1226850449752_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_top1226850449752(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_top_1226850449752((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1226850449752(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("top");
    provider.setNoTargetText("<no top>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1226850449752_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createProperty1226850454130_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_width1226850454130(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_width_1226850454130((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1226850454130(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("width");
    provider.setNoTargetText("<no width>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1226850454130_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createProperty1226850457430_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_height1226850457430(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_height_1226850457430((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1226850457430(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("height");
    provider.setNoTargetText("<no height>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1226850457430_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }


  private static void setupBasic_Collection_12268504284171226850428417(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226850428417");
  }

  private static void setupBasic_Constant_12268504309971226850430997(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226850430997");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_left1226850440718(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_left");
  }

  private static void setupBasic_Constant_12268504497511226850449751(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226850449751");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_top1226850449752(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_top");
  }

  private static void setupBasic_Constant_12268504541291226850454129(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226850454129");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_width1226850454130(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_width");
  }

  private static void setupBasic_Constant_12268504574291226850457429(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226850457429");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_height1226850457430(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_height");
  }

  private static void setupLabel_Constant_1226850430997_1226850430997(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_left_1226850440718(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226850449751_1226850449751(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_top_1226850449752(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226850454129_1226850454129(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_width_1226850454130(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226850457429_1226850457429(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_height_1226850457430(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
