package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;

public class LinkList_AddChildOperation_Editor extends DefaultNodeEditor {

  /* package */ AbstractCellProvider myReplaceableAlias_Comp8105_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1139870427663(context, node);
  }

  public EditorCell createCollection1139870427663(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11398704276631139870427663(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1206487753718(context, node));
    editorCell.addEditorCell(this.createConstant1206487753719(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1139870441857(context, node));
    editorCell.addEditorCell(this.createConstant1206487744639(context, node, ")"));
    return editorCell;
  }

  public EditorCell createComponent1206487753718(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp8105_0 == null) {
      this.myReplaceableAlias_Comp8105_0 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp8105_0.createEditorCell(context);
    setupBasic_component_ReplaceableAlias_Comp1206487753718(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1206487744639(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064877446391206487744639(editorCell, node, context);
    setupLabel_Constant_1206487744639_1206487744639(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206487753719(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064877537191206487753719(editorCell, node, context);
    setupLabel_Constant_1206487753719_1206487753719(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1139870441857_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_parameter1139870441857(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_parameter_1139870441857((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1139870441857(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("parameter");
    provider.setNoTargetText("<no parameter>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1139870441857_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }


  private static void setupBasic_Collection_11398704276631139870427663(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1139870427663");
  }

  private static void setupBasic_refNode_parameter1139870441857(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12064877446391206487744639(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206487744639");
    BaseLanguageStyle_StyleSheet.RIGHT_PAREN.apply(editorCell);
  }

  private static void setupBasic_component_ReplaceableAlias_Comp1206487753718(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component_ReplaceableAlias_Comp");
  }

  private static void setupBasic_Constant_12064877537191206487753719(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206487753719");
    BaseLanguageStyle_StyleSheet.LEFT_PAREN.apply(editorCell);
  }

  private static void setupLabel_refNode_parameter_1139870441857(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206487744639_1206487744639(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206487753719_1206487753719(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
