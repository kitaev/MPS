package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.bootstrap.sharedConcepts.editor.SharedStyles_StyleSheet;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class ConceptEditorDeclaration_Editor extends DefaultNodeEditor {

  private static void setupBasic_NodeBox(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_HeaderRow(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_01");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_02");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_NodeCellArea(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_03");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IndentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_04");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_NodeCellPanel(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_05");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_06");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_CellsLayoutPanel(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_07");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IndentCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_08");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_InspectedCellArea(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_09");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IndentCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_010");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_InspectedCellPanel(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_011");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_HeaderIndentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_012");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_013");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_CellsLayoutPanel1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_014");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IndentCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_015");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_InspectedCellModelCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_016");
    editorCell.setDrawBorder(false);
    editorCell.addKeyMap(new EditorCellModel_KeyMap());
  }

  private static void setupBasic_ConceptDeclarationReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_0234");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_CellModelCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_0242");
    editorCell.setDrawBorder(false);
    editorCell.addKeyMap(new EditorCellModel_KeyMap());
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IndentCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IndentCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IndentCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_HeaderIndentCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IndentCell3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_InspectedCellModelCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConceptDeclarationReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_CellModelCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createNodeBox(context, node);
  }

  public EditorCell createNodeBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_NodeBox(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createNodeCellArea(context, node));
    editorCell.addEditorCell(this.createInspectedCellArea(context, node));
    return editorCell;
  }

  public EditorCell createHeaderRow(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_HeaderRow(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "editor for concept"));
    editorCell.addEditorCell(this.createConceptDeclarationReferenceCell(context, node));
    return editorCell;
  }

  public EditorCell createNodeCellArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_NodeCellArea(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell(context, node, "    "));
    editorCell.addEditorCell(this.createNodeCellPanel(context, node));
    return editorCell;
  }

  public EditorCell createNodeCellPanel(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_NodeCellPanel(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "node cell layout:"));
    editorCell.addEditorCell(this.createCellsLayoutPanel(context, node));
    return editorCell;
  }

  public EditorCell createCellsLayoutPanel(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CellsLayoutPanel(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell1(context, node, "    "));
    editorCell.addEditorCell(this.createCellModelCell(context, node));
    return editorCell;
  }

  public EditorCell createInspectedCellArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_InspectedCellArea(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell2(context, node, "    "));
    editorCell.addEditorCell(this.createInspectedCellPanel(context, node));
    return editorCell;
  }

  public EditorCell createInspectedCellPanel(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_InspectedCellPanel(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createHeaderIndentCell(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell2(context, node, "inspected cell layout:"));
    editorCell.addEditorCell(this.createCellsLayoutPanel1(context, node));
    return editorCell;
  }

  public EditorCell createCellsLayoutPanel1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CellsLayoutPanel1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell3(context, node, "    "));
    editorCell.addEditorCell(this.createInspectedCellModelCell(context, node));
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell(editorCell, node, context);
    setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_IndentCell(editorCell, node, context);
    setupLabel_IndentCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell1(editorCell, node, context);
    setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_IndentCell1(editorCell, node, context);
    setupLabel_IndentCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_IndentCell2(editorCell, node, context);
    setupLabel_IndentCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createHeaderIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_HeaderIndentCell(editorCell, node, context);
    setupLabel_HeaderIndentCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell2(editorCell, node, context);
    setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_IndentCell3(editorCell, node, context);
    setupLabel_IndentCell3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_inspectedCellModelRefNodeCell15502_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_InspectedCellModelCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_InspectedCellModelCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createInspectedCellModelCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("inspectedCellModel");
    provider.setNoTargetText("<choose cell model>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_inspectedCellModelRefNodeCell15502_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_conceptDeclarationRefCell15502_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ConceptEditorDeclaration_Editor._Inline1());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptDeclarationReferenceCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptDeclarationReferenceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptDeclarationReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptDeclaration");
    provider.setNoTargetText("<no concept>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_conceptDeclarationRefCell15502_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_cellModelRefNodeCell15502_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_CellModelCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_CellModelCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createCellModelCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("cellModel");
    provider.setNoTargetText("<choose cell model>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_cellModelRefNodeCell15502_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline1 extends AbstractCellProvider {

    public _Inline1() {
      super();
    }

    private static void setupBasic_NameCell(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_0235");
      SharedStyles_StyleSheet.REFERENCE_ON_CONCEPT.apply(editorCell);
      editorCell.setDrawBorder(true);
    }

    private static void setupLabel_NameCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createNameCell(context, node);
    }

    public EditorCell create_namePropertyCell_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_NameCell(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_NameCell((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createNameCell(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell_01_internal(context, node, provider);
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
