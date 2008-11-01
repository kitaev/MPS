package jetbrains.mps.samples.formulaLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;

public class IfFunction_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1111785647271(context, node);
  }

  public EditorCell createCollection1111785647271(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11117856472711111785647271(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1111785715835(context, node, "IF("));
    editorCell.addEditorCell(this.createRefNode1111785715836(context, node));
    editorCell.addEditorCell(this.createConstant1111785715837(context, node, ","));
    editorCell.addEditorCell(this.createRefNode1111785715838(context, node));
    editorCell.addEditorCell(this.createConstant1111785715839(context, node, ","));
    editorCell.addEditorCell(this.createRefNode1111785715840(context, node));
    editorCell.addEditorCell(this.createConstant1111785715841(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1111785715835(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11117857158351111785715835(editorCell, node, context);
    setupLabel_Constant_1111785715835_1111785715835(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1111785715837(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11117857158371111785715837(editorCell, node, context);
    setupLabel_Constant_1111785715837_1111785715837(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1111785715839(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11117857158391111785715839(editorCell, node, context);
    setupLabel_Constant_1111785715839_1111785715839(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1111785715841(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11117857158411111785715841(editorCell, node, context);
    setupLabel_Constant_1111785715841_1111785715841(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1111785715836_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_logicalTest1111785715836(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_logicalTest_1111785715836((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1111785715836(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("logicalTest");
    provider.setNoTargetText("<no logicalTest>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1111785715836_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1111785715838_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_valueIfTrue1111785715838(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_valueIfTrue_1111785715838((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1111785715838(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("valueIfTrue");
    provider.setNoTargetText("<no valueIfTrue>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1111785715838_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1111785715840_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_valueIfFalse1111785715840(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_valueIfFalse_1111785715840((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1111785715840(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("valueIfFalse");
    provider.setNoTargetText("<no valueIfFalse>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1111785715840_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11117856472711111785647271(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1111785647271");
  }

  private static void setupBasic_Constant_11117857158351111785715835(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1111785715835");
  }

  private static void setupBasic_refNode_logicalTest1111785715836(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11117857158371111785715837(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1111785715837");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_valueIfTrue1111785715838(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11117857158391111785715839(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1111785715839");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_valueIfFalse1111785715840(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11117857158411111785715841(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1111785715841");
  }

  private static void setupLabel_Constant_1111785715835_1111785715835(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_logicalTest_1111785715836(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1111785715837_1111785715837(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_valueIfTrue_1111785715838(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1111785715839_1111785715839(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_valueIfFalse_1111785715840(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1111785715841_1111785715841(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
