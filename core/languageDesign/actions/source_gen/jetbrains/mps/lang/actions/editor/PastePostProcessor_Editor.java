package jetbrains.mps.lang.actions.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class PastePostProcessor_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_3165_19sdq431d0t4u(editorContext, node);
  }

  private EditorCell createCollection_3165_tj6bsysy2q1c(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_3165_tj6bsysy2q1c");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell3165_tj6bsysy2q1h(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_3165_tj6bsysy2q1i(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_3165_19sdq431d0t4u(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_3165_19sdq431d0t4u");
    editorCell.addEditorCell(this.createCollection_3165_19sdq431d0t4z(editorContext, node));
    editorCell.addEditorCell(this.createCollection_3165_tj6bsysy2q1c(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_3165_19sdq431d0t4z(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_3165_19sdq431d0t4z");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_3165_19sdq431d0t55(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_3165_19sdq431d0t56(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_3165_19sdq431d0t55(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "paste post processor");
    editorCell.setCellId("Constant_3165_19sdq431d0t55");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createIndentCell3165_tj6bsysy2q1h(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createRefNode_3165_tj6bsysy2q1i(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("postProcessFunction");
    provider.setNoTargetText("<no postProcessFunction>");
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

  private EditorCell createRefCell_3165_19sdq431d0t56(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("concept");
    provider.setNoTargetText("<no concept>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new PastePostProcessor_Editor._Inline3165_19sdq431d0t57());
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

  public static class _Inline3165_19sdq431d0t57 extends InlineCellProvider {
    public _Inline3165_19sdq431d0t57() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_3165_19sdq431d0t59(editorContext, node);
    }

    private EditorCell createProperty_3165_19sdq431d0t59(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
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
}
