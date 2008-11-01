package jetbrains.mps.lang.typesystem.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class InfoStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1224760278270(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1224760339813(context, node);
  }

  public EditorCell createCollection1224760278270(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12247602782701224760278270(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1224760278271(context, node, "info"));
    editorCell.addEditorCell(this.createRefNode1224760278272(context, node));
    editorCell.addEditorCell(this.createConstant1224760278273(context, node, "->"));
    editorCell.addEditorCell(this.createRefNode1224760278274(context, node));
    editorCell.addEditorCell(this.createConstant1224760278275(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection1224760339813(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12247603398131224760339813(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1224760339814(context, node, "intention linked with info message(optional)"));
    editorCell.addEditorCell(this.createRefNode1224760339815(context, node));
    return editorCell;
  }

  public EditorCell createConstant1224760278271(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12247602782711224760278271(editorCell, node, context);
    setupLabel_Constant_1224760278271_1224760278271(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1224760278273(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12247602782731224760278273(editorCell, node, context);
    setupLabel_Constant_1224760278273_1224760278273(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1224760278275(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12247602782751224760278275(editorCell, node, context);
    setupLabel_Constant_1224760278275_1224760278275(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1224760339814(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12247603398141224760339814(editorCell, node, context);
    setupLabel_Constant_1224760339814_1224760339814(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1224760278272_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_infoText1224760278272(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_infoText_1224760278272((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1224760278272(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("infoText");
    provider.setNoTargetText("<error string>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1224760278272_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1224760278274_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_nodeToReport1224760278274(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_nodeToReport_1224760278274((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1224760278274(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeToReport");
    provider.setNoTargetText("<node to highlight>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1224760278274_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1224760339815_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_helginsIntention1224760339815(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_helginsIntention_1224760339815((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1224760339815(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("helginsIntention");
    provider.setNoTargetText("<no intention>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1224760339815_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12247602782701224760278270(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1224760278270");
  }

  private static void setupBasic_Constant_12247602782711224760278271(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224760278271");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_infoText1224760278272(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12247602782731224760278273(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224760278273");
  }

  private static void setupBasic_refNode_nodeToReport1224760278274(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12247602782751224760278275(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224760278275");
  }

  private static void setupBasic_Collection_12247603398131224760339813(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1224760339813");
  }

  private static void setupBasic_Constant_12247603398141224760339814(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224760339814");
  }

  private static void setupBasic_refNode_helginsIntention1224760339815(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1224760278271_1224760278271(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_infoText_1224760278272(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1224760278273_1224760278273(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_nodeToReport_1224760278274(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1224760278275_1224760278275(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1224760339814_1224760339814(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_helginsIntention_1224760339815(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
