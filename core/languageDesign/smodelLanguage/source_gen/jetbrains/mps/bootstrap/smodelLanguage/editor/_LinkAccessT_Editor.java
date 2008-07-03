package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class _LinkAccessT_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell3859_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3859_0");
  }

  private static void setupBasic_ConstantCell3859_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3859_0");
  }

  private static void setupBasic_ConstantCell3859_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3859_01");
  }

  private static void setupBasic_targetConceptRefCell3859_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_targetConceptRefCell3859_0");
  }

  private static void setupBasic_ConstantCell3859_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3859_02");
  }

  private static void setupBasic_singularCradinalityPropertyCell3859_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_singularCradinalityPropertyCell3859_0");
  }

  private static void setupBasic_ConstantCell3859_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3859_03");
  }

  private static void setupBasic_aggregationPropertyCell3859_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_aggregationPropertyCell3859_0");
  }

  private static void setupLabel_ConstantCell3859_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3859_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_targetConceptRefCell3859_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3859_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_singularCradinalityPropertyCell3859_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3859_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_aggregationPropertyCell3859_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell3859_0(context, node);
  }

  public EditorCell create_CollectionCell3859_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3859_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell3859_0(context, node, "link acc<"));
    editorCell.addEditorCell(this.create_targetConceptRefCell3859_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell3859_02(context, node, ",singular:"));
    editorCell.addEditorCell(this.create_singularCradinalityPropertyCell3859_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell3859_03(context, node, ",aggregation:"));
    editorCell.addEditorCell(this.create_aggregationPropertyCell3859_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell3859_01(context, node, ">"));
    return editorCell;
  }

  public EditorCell create_ConstantCell3859_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3859_0(editorCell, node, context);
    setupLabel_ConstantCell3859_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell3859_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3859_01(editorCell, node, context);
    setupLabel_ConstantCell3859_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell3859_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3859_02(editorCell, node, context);
    setupLabel_ConstantCell3859_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell3859_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3859_03(editorCell, node, context);
    setupLabel_ConstantCell3859_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_targetConceptRefCell3859_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new _LinkAccessT_Editor._Inline35());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_targetConceptRefCell3859_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_targetConceptRefCell3859_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_targetConceptRefCell3859_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("targetConcept");
    provider.setNoTargetText("<no targetConcept>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_targetConceptRefCell3859_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_singularCradinalityPropertyCell3859_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_singularCradinalityPropertyCell3859_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_singularCradinalityPropertyCell3859_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_singularCradinalityPropertyCell3859_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("singularCradinality");
    provider.setNoTargetText("<no singularCradinality>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_singularCradinalityPropertyCell3859_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_aggregationPropertyCell3859_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_aggregationPropertyCell3859_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_aggregationPropertyCell3859_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_aggregationPropertyCell3859_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("aggregation");
    provider.setNoTargetText("<no aggregation>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_aggregationPropertyCell3859_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline35 extends AbstractCellProvider {

    public _Inline35() {
      super();
    }

    private static void setupBasic_namePropertyCell3859_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell3859_0");
    }

    private static void setupLabel_namePropertyCell3859_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell3859_0(context, node);
    }

    public EditorCell create_namePropertyCell3859_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell3859_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell3859_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell3859_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell3859_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}

}
