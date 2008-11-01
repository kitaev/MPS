package jetbrains.mps.sampleXML.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Element_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1225239646575;
  /* package */AbstractCellListHandler myListHandler_1225239646583;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1225239646568(context, node);
  }

  public EditorCell createCollection1225239646568(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12252396465681225239646568(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1225239646569(context, node));
    editorCell.addEditorCell(this.createCollection1225239646581(context, node));
    editorCell.addEditorCell(this.createCollection1225239646587(context, node));
    return editorCell;
  }

  public EditorCell createCollection1225239646569(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12252396465691225239646569(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1225239646570(context, node, "<"));
    editorCell.addEditorCell(this.createProperty1225239646572(context, node));
    editorCell.addEditorCell(this.createRefNodeList1225239646575(context, node));
    editorCell.addEditorCell(this.createConstant1225239646578(context, node, ">"));
    return editorCell;
  }

  public EditorCell createCollection1225239646581(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12252396465811225239646581(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell3264_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList1225239646583(context, node));
    return editorCell;
  }

  public EditorCell createCollection1225239646587(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12252396465871225239646587(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1225239646588(context, node, "</"));
    editorCell.addEditorCell(this.createProperty1225239646590(context, node));
    editorCell.addEditorCell(this.createConstant1225239646593(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant1225239646570(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12252396465701225239646570(editorCell, node, context);
    setupLabel_Constant_1225239646570_1225239646570(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225239646578(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12252396465781225239646578(editorCell, node, context);
    setupLabel_Constant_1225239646578_1225239646578(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225239646588(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12252396465881225239646588(editorCell, node, context);
    setupLabel_Constant_1225239646588_1225239646588(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225239646593(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12252396465931225239646593(editorCell, node, context);
    setupLabel_Constant_1225239646593_1225239646593(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1225239646575(EditorContext context, SNode node) {
    if (this.myListHandler_1225239646575 == null) {
      this.myListHandler_1225239646575 = new Element_Editor.attributeListHandler_3264_0(node, "attribute", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1225239646575.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_attribute1225239646575(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1225239646575.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1225239646583(EditorContext context, SNode node) {
    if (this.myListHandler_1225239646583 == null) {
      this.myListHandler_1225239646583 = new Element_Editor.contentListHandler_3264_0(node, "content", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1225239646583.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_content1225239646583(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1225239646583.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell3264_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1225239646572_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1225239646572(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1225239646572((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1225239646572(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1225239646572_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1225239646590_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1225239646590(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1225239646590((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1225239646590(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1225239646590_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12252396465681225239646568(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225239646568");
  }

  private static void setupBasic_Collection_12252396465691225239646569(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225239646569");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12252396465701225239646570(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225239646570");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1225239646572(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupBasic_refNodeList_attribute1225239646575(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_attribute");
  }

  private static void setupBasic_Constant_12252396465781225239646578(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225239646578");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12252396465811225239646581(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225239646581");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12252396465821225239646582(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1225239646582");
  }

  private static void setupBasic_refNodeList_content1225239646583(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_content");
  }

  private static void setupBasic_Collection_12252396465871225239646587(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225239646587");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12252396465881225239646588(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225239646588");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1225239646590(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12252396465931225239646593(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225239646593");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1225239646570_1225239646570(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1225239646572(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_attribute_1225239646575(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225239646578_1225239646578(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_content_1225239646583(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225239646588_1225239646588(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1225239646590(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225239646593_1225239646593(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class attributeListHandler_3264_0 extends RefNodeListHandler {

    public attributeListHandler_3264_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1225239646576(context, node, "");
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

    public EditorCell createConstant1225239646576(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12252396465761225239646576(editorCell, node, context);
      setupLabel_Constant_1225239646576_1225239646576(editorCell, node, context);
      editorCell.setDefaultText("...");
      return editorCell;
    }


    private static void setupBasic_Constant_12252396465761225239646576(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1225239646576");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1225239646576_1225239646576(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class contentListHandler_3264_0 extends RefNodeListHandler {

    public contentListHandler_3264_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1225239646584(context, node, "");
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

    public EditorCell createConstant1225239646584(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12252396465841225239646584(editorCell, node, context);
      setupLabel_Constant_1225239646584_1225239646584(editorCell, node, context);
      editorCell.setDefaultText("...");
      return editorCell;
    }


    private static void setupBasic_Constant_12252396465841225239646584(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1225239646584");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1225239646584_1225239646584(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
