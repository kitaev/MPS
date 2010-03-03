package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SModel;

public class MatchingLabelStyleClassItem_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_uvxm5p_a(editorContext, node);
  }

  private EditorCell createCollection_uvxm5p_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_uvxm5p_a");
    editorCell.addEditorCell(this.createConceptProperty_uvxm5p_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_uvxm5p_b0(editorContext, node));
    if (renderingCondition_uvxm5p_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_uvxm5p_c0(editorContext, node));
    }
    if (renderingCondition_uvxm5p_a3a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_uvxm5p_d0(editorContext, node));
    }
    if (renderingCondition_uvxm5p_a4a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefNode_uvxm5p_e0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createConstant_uvxm5p_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_uvxm5p_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_uvxm5p_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "null");
    editorCell.setCellId("Constant_uvxm5p_d0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new MatchingLabelStyleClassItem_Editor.MatchingLabelStyleClassItem_generic_cellMenu_a0d0()}));
    return editorCell;
  }

  private EditorCell createProperty_uvxm5p_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("labelName");
    provider.setNoTargetText("<no labelName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_labelName");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new MatchingLabelStyleClassItem_Editor.MatchingLabelStyleClassItem_generic_cellMenu_a0c0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_uvxm5p_e0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("query");
    provider.setNoTargetText("<no query>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_RECURSIVELY);
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

  private EditorCell createConceptProperty_uvxm5p_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, editorContext);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("conceptProperty_alias");
    Styles_StyleSheet.getItem(editorCell).apply(editorCell);
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

  private static boolean renderingCondition_uvxm5p_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "query", true) == null && !(SPropertyOperations.getBoolean(node, "hasNoLabel"));
  }

  private static boolean renderingCondition_uvxm5p_a3a(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "query", true) == null) && SPropertyOperations.getBoolean(node, "hasNoLabel");
  }

  private static boolean renderingCondition_uvxm5p_a4a(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "query", true) != null;
  }

  public static class MatchingLabelStyleClassItem_generic_cellMenu_a0c0 extends AbstractCellMenuPart_Generic_Item {
    public MatchingLabelStyleClassItem_generic_cellMenu_a0c0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "hasNoLabel", "" + true);
    }

    public String getMatchingText() {
      return "null";
    }
  }

  public static class MatchingLabelStyleClassItem_generic_cellMenu_a0d0 extends AbstractCellMenuPart_Generic_Item {
    public MatchingLabelStyleClassItem_generic_cellMenu_a0d0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "hasNoLabel", "" + false);
    }

    public String getMatchingText() {
      return "label name";
    }
  }
}
