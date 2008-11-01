package jetbrains.mps.transformation.test.outputLang.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class OutputRoot_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1195169783103;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1195166247165(context, node);
  }

  public EditorCell createCollection1195166247165(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11951662471651195166247165(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1195166557184(context, node));
    editorCell.addEditorCell(this.createConstant1195166613129(context, node, ""));
    editorCell.addEditorCell(this.createProperty1195166603939(context, node));
    editorCell.addEditorCell(this.createConstant1195166286764(context, node, ""));
    editorCell.addEditorCell(this.createCollection1218735735934(context, node));
    editorCell.addEditorCell(this.createConstant1218735997590(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1195169783103(context, node));
    return editorCell;
  }

  public EditorCell createCollection1195166557184(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11951665571841195166557184(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1195166566219(context, node, "output root:"));
    editorCell.addEditorCell(this.createProperty1195166557185(context, node));
    return editorCell;
  }

  public EditorCell createCollection1218735735934(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12187357359341218735735934(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1218735944676(context, node, "special child:"));
    editorCell.addEditorCell(this.createRefNode1218735984791(context, node));
    return editorCell;
  }

  public EditorCell createConstant1195166286764(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11951662867641195166286764(editorCell, node, context);
    setupLabel_Constant_1195166286764_1195166286764(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1195166566219(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11951665662191195166566219(editorCell, node, context);
    setupLabel_Constant_1195166566219_1195166566219(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1195166613129(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11951666131291195166613129(editorCell, node, context);
    setupLabel_Constant_1195166613129_1195166613129(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1218735944676(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12187359446761218735944676(editorCell, node, context);
    setupLabel_Constant_1218735944676_1218735944676(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1218735997590(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12187359975901218735997590(editorCell, node, context);
    setupLabel_Constant_1218735997590_1218735997590(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1195169783103(EditorContext context, SNode node) {
    if (this.myListHandler_1195169783103 == null) {
      this.myListHandler_1195169783103 = new OutputRoot_Editor.outputChildListHandler_4617_0(node, "outputChild", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1195169783103.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_outputChild1195169783103(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1195169783103.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty1195166557185_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1195166557185(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1195166557185((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1195166557185(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1195166557185_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1195166603939_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_text1195166603939(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_text_1195166603939((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1195166603939(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1195166603939_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1218735984791_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_specialChild1218735984791(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_specialChild_1218735984791((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1218735984791(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("specialChild");
    provider.setNoTargetText("<no specialChild>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1218735984791_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11951662471651195166247165(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1195166247165");
  }

  private static void setupBasic_Constant_11951662867641195166286764(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1195166286764");
  }

  private static void setupBasic_Collection_11951665571841195166557184(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1195166557184");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1195166557185(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Constant_11951665662191195166566219(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1195166566219");
  }

  private static void setupBasic_property_text1195166603939(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_text");
  }

  private static void setupBasic_Constant_11951666131291195166613129(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1195166613129");
  }

  private static void setupBasic_refNodeList_outputChild1195169783103(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_outputChild");
  }

  private static void setupBasic_Collection_12187357359341218735735934(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1218735735934");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12187359446761218735944676(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1218735944676");
  }

  private static void setupBasic_refNode_specialChild1218735984791(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12187359975901218735997590(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1218735997590");
  }

  private static void setupLabel_Constant_1195166286764_1195166286764(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1195166557185(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1195166566219_1195166566219(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_text_1195166603939(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1195166613129_1195166613129(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_outputChild_1195169783103(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1218735944676_1218735944676(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_specialChild_1218735984791(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1218735997590_1218735997590(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class outputChildListHandler_4617_0 extends RefNodeListHandler {

    public outputChildListHandler_4617_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

}

}
