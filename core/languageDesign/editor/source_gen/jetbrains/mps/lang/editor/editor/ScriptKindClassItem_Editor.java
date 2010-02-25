package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class ScriptKindClassItem_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_2848_1qpwi56afapxp(editorContext, node);
  }

  private EditorCell createCollection_2848_1qpwi56afapxp(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_2848_1qpwi56afapxp");
    editorCell.addEditorCell(this.createConstant_2848_1qpwi56afapxq(editorContext, node));
    editorCell.addEditorCell(this.createConstant_2848_1qpwi56afapxt(editorContext, node));
    editorCell.addEditorCell(this.createProperty_2848_1qpwi56afauwh(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_2848_1qpwi56afapxq(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "script-kind");
    editorCell.setCellId("Constant_2848_1qpwi56afapxq");
    Styles_StyleSheet.getItem(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ScriptKindClassItem_Editor.ScriptKindClassItem_Editor_replaceWith_StyleClassItem_cellMenu1qpwi56afapxs()}));
    return editorCell;
  }

  private EditorCell createConstant_2848_1qpwi56afapxt(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_2848_1qpwi56afapxt");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_2848_1qpwi56afauwh(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("script");
    provider.setNoTargetText("<no script>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_script");
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

  public static class ScriptKindClassItem_Editor_replaceWith_StyleClassItem_cellMenu1qpwi56afapxs extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ScriptKindClassItem_Editor_replaceWith_StyleClassItem_cellMenu1qpwi56afapxs() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.editor.structure.StyleClassItem";
    }
  }
}
