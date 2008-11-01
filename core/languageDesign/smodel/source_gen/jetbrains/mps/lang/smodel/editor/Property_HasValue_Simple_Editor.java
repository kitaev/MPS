package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class Property_HasValue_Simple_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAlias_Comp5612_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1146253646906(context, node);
  }

  public EditorCell createCollection1146253646906(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11462536469061146253646906(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1206487983630(context, node));
    editorCell.addEditorCell(this.createConstant1206487983631(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1146253646908(context, node));
    editorCell.addEditorCell(this.createConstant1206487972988(context, node, ")"));
    return editorCell;
  }

  public EditorCell createComponent1206487983630(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp5612_0 == null) {
      this.myReplaceableAlias_Comp5612_0 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp5612_0.createEditorCell(context);
    setupBasic_component_ReplaceableAlias_Comp1206487983630(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1206487972988(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064879729881206487972988(editorCell, node, context);
    setupLabel_Constant_1206487972988_1206487972988(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206487983631(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064879836311206487983631(editorCell, node, context);
    setupLabel_Constant_1206487983631_1206487983631(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1146253646908_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_value1146253646908(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_value_1146253646908((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1146253646908(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("value");
    provider.setNoTargetText("<no value>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1146253646908_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11462536469061146253646906(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1146253646906");
  }

  private static void setupBasic_refNode_value1146253646908(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12064879729881206487972988(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1206487972988");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_component_ReplaceableAlias_Comp1206487983630(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ReplaceableAlias_Comp");
  }

  private static void setupBasic_Constant_12064879836311206487983631(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1206487983631");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_refNode_value_1146253646908(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206487972988_1206487972988(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206487983631_1206487983631(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
