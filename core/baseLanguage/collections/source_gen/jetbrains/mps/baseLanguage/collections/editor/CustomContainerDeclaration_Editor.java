package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.editor._Component_Visibility;
import jetbrains.mps.baseLanguage.editor._GenericDeclaration_TypeVariables_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CustomContainerDeclaration_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ddrapt_a(editorContext, node);
  }

  private EditorCell createCollection_ddrapt_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_ddrapt_a");
    editorCell.addEditorCell(this.createCollection_ddrapt_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_ddrapt_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_ddrapt_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ddrapt_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_ddrapt_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ddrapt_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createComponent_ddrapt_a0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ddrapt_b0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_ddrapt_c0a(editorContext, node));
    if (renderingCondition_ddrapt_a3a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_ddrapt_d0a(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_ddrapt_e0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ddrapt_f0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ddrapt_g0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_ddrapt_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ddrapt_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell_ddrapt_a1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_ddrapt_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_ddrapt_b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ddrapt_b1a");
    editorCell.addEditorCell(this.createConstant_ddrapt_a1b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ddrapt_b1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_ddrapt_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ddrapt_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell_ddrapt_a2a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_ddrapt_b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_ddrapt_b2a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_ddrapt_b2a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_ddrapt_a1c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_ddrapt_b1c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_ddrapt_a0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _Component_Visibility(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_ddrapt_d0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _GenericDeclaration_TypeVariables_Component(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_ddrapt_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "container");
    editorCell.setCellId("Constant_ddrapt_b0a");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_ddrapt_e0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "specifies");
    editorCell.setCellId("Constant_ddrapt_e0a");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_ddrapt_g0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_ddrapt_g0a");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_ddrapt_a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "runtime type:");
    editorCell.setCellId("Constant_ddrapt_a1b0");
    BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_ddrapt_a1c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "factory:");
    editorCell.setCellId("Constant_ddrapt_a1c0");
    BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_ddrapt_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_ddrapt_d0");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createIndentCell_ddrapt_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell_ddrapt_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createRefNode_ddrapt_f0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("containerType");
    provider.setNoTargetText("<no containerType>");
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

  private EditorCell createRefNode_ddrapt_b1b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("runtimeType");
    provider.setNoTargetText("<no runtimeType>");
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

  private EditorCell createRefNode_ddrapt_b1c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("factory");
    provider.setNoTargetText("<no factory>");
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

  private EditorCell createProperty_ddrapt_c0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
    }
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

  private static boolean renderingCondition_ddrapt_a3a0(SNode node, EditorContext editorContext, IScope scope) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "typeVariableDeclaration", true)).count() > 0;
  }
}
