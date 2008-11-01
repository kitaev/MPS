package jetbrains.mps.baseLanguage.datesInternal.editor;

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
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class DateTimeIntPropertyFormatConfiguration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1173954251564;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1173954200900(context, node);
  }

  public EditorCell createCollection1173954200900(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11739542009001173954200900(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1173954216514(context, node));
    editorCell.addEditorCell(this.createCollection1173954240653(context, node));
    editorCell.addEditorCell(this.createConstant1173954237619(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection1173954216514(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11739542165141173954216514(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1173954216515(context, node, "format configuration for"));
    editorCell.addEditorCell(this.createRefCell1173954220548(context, node));
    editorCell.addEditorCell(this.createConstant1173954233163(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection1173954240653(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11739542406531173954240653(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1173954243249(context, node, "  "));
    editorCell.addEditorCell(this.createRefNodeList1173954251564(context, node));
    return editorCell;
  }

  public EditorCell createConstant1173954216515(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739542165151173954216515(editorCell, node, context);
    setupLabel_Constant_1173954216515_1173954216515(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954233163(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739542331631173954233163(editorCell, node, context);
    setupLabel_Constant_1173954233163_1173954233163(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954237619(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739542376191173954237619(editorCell, node, context);
    setupLabel_Constant_1173954237619_1173954237619(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173954243249(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739542432491173954243249(editorCell, node, context);
    setupLabel_Constant_1173954243249_1173954243249(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1173954251564(EditorContext context, SNode node) {
    if (this.myListHandler_1173954251564 == null) {
      this.myListHandler_1173954251564 = new DateTimeIntPropertyFormatConfiguration_Editor.dateTimePropertyFormatTypeListHandler_9190_0(node, "dateTimePropertyFormatType", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1173954251564.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_dateTimePropertyFormatType1173954251564(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1173954251564.getElementRole());
    return editorCell;
  }

  public EditorCell createRefCell1173954220548_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new DateTimeIntPropertyFormatConfiguration_Editor._Inline9190_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_dateTimeProperty1173954220548(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_dateTimeProperty_1173954220548((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1173954220548(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("dateTimeProperty");
    provider.setNoTargetText("<no dateTimeProperty>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1173954220548_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11739542009001173954200900(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1173954200900");
  }

  private static void setupBasic_Collection_11739542165141173954216514(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1173954216514");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11739542165151173954216515(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954216515");
  }

  private static void setupBasic_refCell_dateTimeProperty1173954220548(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_dateTimeProperty");
  }

  private static void setupBasic_Constant_11739542331631173954233163(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954233163");
  }

  private static void setupBasic_Constant_11739542376191173954237619(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954237619");
  }

  private static void setupBasic_Collection_11739542406531173954240653(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1173954240653");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11739542432491173954243249(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1173954243249");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_dateTimePropertyFormatType1173954251564(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_dateTimePropertyFormatType");
  }

  private static void setupLabel_Constant_1173954216515_1173954216515(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_dateTimeProperty_1173954220548(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954233163_1173954233163(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954237619_1173954237619(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173954243249_1173954243249(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_dateTimePropertyFormatType_1173954251564(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline9190_0 extends AbstractCellProvider {

    public _Inline9190_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1173954227348(context, node);
    }

    public EditorCell createProperty1173954227348_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1173954227348(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1173954227348((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1173954227348(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1173954227348_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1173954227348(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
    }

    private static void setupLabel_property_name_1173954227348(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class dateTimePropertyFormatTypeListHandler_9190_0 extends RefNodeListHandler {

    public dateTimePropertyFormatTypeListHandler_9190_0(SNode ownerNode, String childRole, EditorContext context) {
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
