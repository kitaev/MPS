package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;

public class CellMenuDescriptor_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1164826358683;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1164826331320(context, node);
  }

  public EditorCell createCollection1164826331320(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11648263313201164826331320(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1164826341494(context, node, "menu parts:"));
    editorCell.addEditorCell(this.createRefNodeList1164826358683(context, node));
    return editorCell;
  }

  public EditorCell createConstant1164826341494(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11648263414941164826341494(editorCell, node, context);
    setupLabel_Constant_1164826341494_1164826341494(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1164826358683(EditorContext context, SNode node) {
    if (this.myListHandler_1164826358683 == null) {
      this.myListHandler_1164826358683 = new CellMenuDescriptor_Editor.cellMenuPartListHandler_0(node, "cellMenuPart", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1164826358683.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_cellMenuPart1164826358683(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1164826358683.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_11648263313201164826331320(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1164826331320");
  }

  private static void setupBasic_Constant_11648263414941164826341494(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1164826341494");
  }

  private static void setupBasic_refNodeList_cellMenuPart1164826358683(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_cellMenuPart");
  }

  private static void setupLabel_Constant_1164826341494_1164826341494(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_cellMenuPart_1164826358683(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor1820_0(EditorCell cell) {
    Color result;
    result = Color.darkGray;
    return result;
  }

  public static class cellMenuPartListHandler_0 extends RefNodeListHandler {

    public cellMenuPartListHandler_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1164826376028(context, node, "<choose menu part>");
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

    public EditorCell createConstant1164826376028(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11648263760281164826376028(editorCell, node, context);
      setupLabel_Constant_1164826376028_1164826376028(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_11648263760281164826376028(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1164826376028");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
            this.set(StyleAttributes.EDITABLE, true);
            this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

              public Color calculate(EditorCell cell) {
                return CellMenuDescriptor_Editor.calculateColor1820_0(cell);
              }

            });
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1164826376028_1164826376028(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
