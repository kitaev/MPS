package jetbrains.mps.baseLanguage.datesInternal.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class DateTimePropertyFormatType_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1173953998958(context, node);
  }

  public EditorCell createCollection1173953998958(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11739539989581173953998958(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createProperty1173954000429(context, node));
    editorCell.addEditorCell(this.createConstant1173954006947(context, node, "["));
    editorCell.addEditorCell(this.createRefCell1173954028497(context, node));
    editorCell.addEditorCell(this.createConstant1173954072896(context, node, "]"));
    editorCell.addEditorCell(this.createConstant1173954085258(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1173954095197(context, node));
    editorCell.addEditorCell(this.createConstant1173954102887(context, node, "(e.g."));
    editorCell.addEditorCell(this.createProperty1173954112812(context, node));
    editorCell.addEditorCell(this.createConstant1173954119658(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1173954006947(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739540069471173954006947(editorCell, node, context);
    setupLabel_Constant_1173954006947_1173954006947(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954072896(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739540728961173954072896(editorCell, node, context);
    setupLabel_Constant_1173954072896_1173954072896(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954085258(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739540852581173954085258(editorCell, node, context);
    setupLabel_Constant_1173954085258_1173954085258(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954102887(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739541028871173954102887(editorCell, node, context);
    setupLabel_Constant_1173954102887_1173954102887(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954119658(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739541196581173954119658(editorCell, node, context);
    setupLabel_Constant_1173954119658_1173954119658(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1173954000429_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_letter1173954000429(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_letter_1173954000429((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1173954000429(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("letter");
    provider.setNoTargetText("<no letter>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1173954000429_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1173954028497_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new DateTimePropertyFormatType_Editor._Inline7531_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_dateTimePropertyCardinality1173954028497(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_dateTimePropertyCardinality_1173954028497((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1173954028497(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("dateTimePropertyCardinality");
    provider.setNoTargetText("<no dateTimePropertyCardinality>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1173954028497_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1173954095197_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_meaning1173954095197(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_meaning_1173954095197((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1173954095197(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("meaning");
    provider.setNoTargetText("<no meaning>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1173954095197_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1173954112812_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_examples1173954112812(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_examples_1173954112812((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1173954112812(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("examples");
    provider.setNoTargetText("<no examples>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1173954112812_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11739539989581173953998958(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1173953998958");
  }

  private static void setupBasic_property_letter1173954000429(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_letter");
  }

  private static void setupBasic_Constant_11739540069471173954006947(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954006947");
  }

  private static void setupBasic_refCell_dateTimePropertyCardinality1173954028497(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_dateTimePropertyCardinality");
  }

  private static void setupBasic_Constant_11739540728961173954072896(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954072896");
  }

  private static void setupBasic_Constant_11739540852581173954085258(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954085258");
  }

  private static void setupBasic_property_meaning1173954095197(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_meaning");
  }

  private static void setupBasic_Constant_11739541028871173954102887(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954102887");
  }

  private static void setupBasic_property_examples1173954112812(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_examples");
  }

  private static void setupBasic_Constant_11739541196581173954119658(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954119658");
  }

  private static void setupLabel_property_letter_1173954000429(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954006947_1173954006947(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_dateTimePropertyCardinality_1173954028497(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954072896_1173954072896(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954085258_1173954085258(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_meaning_1173954095197(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954102887_1173954102887(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_examples_1173954112812(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954119658_1173954119658(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline7531_0 extends AbstractCellProvider {

    public _Inline7531_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1173954037844(context, node);
    }

    public EditorCell createProperty1173954037844_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_meaning1173954037844(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_meaning_1173954037844((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1173954037844(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("meaning");
      provider.setNoTargetText("<no meaning>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1173954037844_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_meaning1173954037844(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_meaning");
    }

    private static void setupLabel_property_meaning_1173954037844(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
