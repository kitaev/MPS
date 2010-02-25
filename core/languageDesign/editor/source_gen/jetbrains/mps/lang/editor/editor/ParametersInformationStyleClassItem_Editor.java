package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class ParametersInformationStyleClassItem_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_3696_1m932l2fmh2j3(editorContext, node);
  }

  private EditorCell createCollection_3696_1m932l2fmh2j3(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_3696_1m932l2fmh2j3");
    editorCell.addEditorCell(this.createConceptProperty_3696_1m932l2fmh2j2(editorContext, node));
    editorCell.addEditorCell(this.createConstant_3696_1m932l2fmh2j9(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_3696_1vc958sihck35(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_3696_1m932l2fmh2j9(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_3696_1m932l2fmh2j9");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConceptProperty_3696_1m932l2fmh2j2(EditorContext editorContext, SNode node) {
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

  private EditorCell createRefCell_3696_1vc958sihck35(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("parametersInformation");
    provider.setNoTargetText("<no parametersInformation>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new ParametersInformationStyleClassItem_Editor._Inline3696_1vc958sihck36());
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

  public static class _Inline3696_1vc958sihck36 extends InlineCellProvider {
    public _Inline3696_1vc958sihck36() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_3696_1vc958sihck38(editorContext, node);
    }

    private EditorCell createProperty_3696_1vc958sihck38(EditorContext editorContext, SNode node) {
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
