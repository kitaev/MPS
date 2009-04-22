package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class MPSLayoutConfigurationReferencePropertyValueExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRefCell_2583_1(context, node);
  }

  public EditorCell createRefCell_2583_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new MPSLayoutConfigurationReferencePropertyValueExpression_Editor._Inline2583_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_2583_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_2583_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_2583_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("configuration");
    provider.setNoTargetText("<no configuration>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_2583_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_RefCell_2583_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefCell_2583_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline2583_0 extends AbstractCellProvider {

    public _Inline2583_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_2583_1(context, node);
    }

    public EditorCell createProperty_2583_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_2583_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_Property_2583_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_2583_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("fullName");
      provider.setNoTargetText("<no fullName>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty_2583_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_2583_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_fullName");
      PackagingStyles_StyleSheet.getConfiguration(editorCell).apply(editorCell);
    }

    private static void setupLabel_Property_2583_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
