package jetbrains.mps.execution.settings.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.editor.VariableDeclaration_NameCellComponent;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class EditorPropertyDeclaration_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ey0oay_a(editorContext, node);
  }

  private EditorCell createCollection_ey0oay_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_ey0oay_a");
    editorCell.addEditorCell(this.createRefNode_ey0oay_a0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_ey0oay_b0(editorContext, node));
    if (renderingCondition_ey0oay_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_ey0oay_c0(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_ey0oay_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_ey0oay_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_ey0oay_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_ey0oay_a2a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ey0oay_b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_ey0oay_b0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new VariableDeclaration_NameCellComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
    return editorCell;
  }

  private EditorCell createConstant_ey0oay_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_ey0oay_a2a");
    BaseLanguageStyle_StyleSheet.getOperator(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_ey0oay_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_ey0oay_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_ey0oay_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_ey0oay_b2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("initializer");
    provider.setNoTargetText("<no initializer>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_ey0oay_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "initializer", true) != null;
  }
}
