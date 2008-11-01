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

public class Concept_FindInstances_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAlias_Comp9854_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1221164365410(context, node);
  }

  public EditorCell createCollection1221164365410(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12211643654101221164365410(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1221164365411(context, node));
    editorCell.addEditorCell(this.createConstant1221164365412(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1221164365413(context, node));
    editorCell.addEditorCell(this.createConstant1221164365414(context, node, ")"));
    return editorCell;
  }

  public EditorCell createComponent1221164365411(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp9854_0 == null) {
      this.myReplaceableAlias_Comp9854_0 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp9854_0.createEditorCell(context);
    setupBasic_component_ReplaceableAlias_Comp1221164365411(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1221164365412(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12211643654121221164365412(editorCell, node, context);
    setupLabel_Constant_1221164365412_1221164365412(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1221164365414(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12211643654141221164365414(editorCell, node, context);
    setupLabel_Constant_1221164365414_1221164365414(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1221164365413_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_scope1221164365413(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_scope_1221164365413((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1221164365413(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("scope");
    provider.setNoTargetText("<global scope>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1221164365413_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12211643654101221164365410(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1221164365410");
  }

  private static void setupBasic_component_ReplaceableAlias_Comp1221164365411(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ReplaceableAlias_Comp");
  }

  private static void setupBasic_Constant_12211643654121221164365412(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1221164365412");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_scope1221164365413(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12211643654141221164365414(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1221164365414");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1221164365412_1221164365412(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_scope_1221164365413(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1221164365414_1221164365414(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
