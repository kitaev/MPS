package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.nodeEditor.MPSFonts;
import java.awt.Color;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class CellMenuDescriptor_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_19413_0;

  private static void setupBasic_CollectionCell19413_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19413_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19413_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19413_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_cellMenuPartRefNodeListCell19413_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_cellMenuPartRefNodeListCell19413_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupLabel_ConstantCell19413_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_cellMenuPartRefNodeListCell19413_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell19413_0(context, node);
  }

  public EditorCell create_CollectionCell19413_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell19413_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell19413_0(context, node, "menu parts:"));
    editorCell.addEditorCell(this.create_cellMenuPartRefNodeListCell19413_0(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell19413_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19413_0(editorCell, node, context);
    setupLabel_ConstantCell19413_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_cellMenuPartRefNodeListCell19413_0(EditorContext context, SNode node) {
    if (this.myListHandler_19413_0 == null) {
      this.myListHandler_19413_0 = new CellMenuDescriptor_Editor.cellMenuPartListHandler_19413_0(node, "cellMenuPart", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_19413_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_cellMenuPartRefNodeListCell19413_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_19413_0.getElementRole());
    return editorCell;
  }

  public static class cellMenuPartListHandler_19413_0 extends RefNodeListHandler {

    public cellMenuPartListHandler_19413_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell19413_01(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19413_01");
      editorCell.setDrawBorder(false);
      editorCell.setFontType(MPSFonts.ITALIC);
    }

    private static void setupLabel_ConstantCell19413_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
      editorCell.setEditable(true);
      editorCell.getTextLine().setTextColor(Color.darkGray);
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
      return this.create_ConstantCell19413_01(context, node, "<choose menu part>");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell create_ConstantCell19413_01(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_ConstantCell19413_01(editorCell, node, context);
      setupLabel_ConstantCell19413_01(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }

}

}
