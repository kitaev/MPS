package jetbrains.mps.lang.refactoring.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class CustomParameterChooser_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_sd95wk_a(editorContext, node);
  }

  private EditorCell createCollection_sd95wk_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_sd95wk_a");
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_sd95wk_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_sd95wk_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_sd95wk_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_sd95wk_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_sd95wk_e0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_sd95wk_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_sd95wk_a0");
    editorCell.addEditorCell(this.createConstant_sd95wk_a0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_sd95wk_b0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_sd95wk_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_sd95wk_b0");
    editorCell.addEditorCell(this.createConstant_sd95wk_a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_sd95wk_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_sd95wk_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_sd95wk_c0");
    editorCell.addEditorCell(this.createConstant_sd95wk_a2a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_sd95wk_b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_sd95wk_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_sd95wk_d0");
    editorCell.addEditorCell(this.createConstant_sd95wk_a3a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_sd95wk_b3a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_sd95wk_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "type:");
    editorCell.setCellId("Constant_sd95wk_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_sd95wk_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "component:");
    editorCell.setCellId("Constant_sd95wk_a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_sd95wk_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "focused component:");
    editorCell.setCellId("Constant_sd95wk_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_sd95wk_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "stretch:");
    editorCell.setCellId("Constant_sd95wk_a3a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_sd95wk_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("entityType");
    provider.setNoTargetText("<no entityType>");
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

  private EditorCell createRefNode_sd95wk_b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("mainComponent");
    provider.setNoTargetText("<no mainComponent>");
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

  private EditorCell createRefNode_sd95wk_b2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("focusedComponent");
    provider.setNoTargetText("<main component>");
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

  private EditorCell createRefNode_sd95wk_e0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("commitBlock");
    provider.setNoTargetText("<no commitBlock>");
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

  private EditorCell createProperty_sd95wk_b3a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("stretch");
    provider.setNoTargetText("<no stretch>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_stretch");
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
}
