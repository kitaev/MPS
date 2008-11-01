package jetbrains.mps.baseLanguage.closures.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class InvokeExpression_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1199711357946;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1199711357941(context, node);
  }

  public EditorCell createCollection1199711357941(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11997113579411199711357941(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199711357944(context, node, "invoke"));
    editorCell.addEditorCell(this.createConstant1199711357945(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList1199711357946(context, node));
    editorCell.addEditorCell(this.createConstant1199711357948(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1199711357944(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11997113579441199711357944(editorCell, node, context);
    setupLabel_Constant_1199711357944_1199711357944(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199711357945(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11997113579451199711357945(editorCell, node, context);
    setupLabel_Constant_1199711357945_1199711357945(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199711357948(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11997113579481199711357948(editorCell, node, context);
    setupLabel_Constant_1199711357948_1199711357948(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1199711357946(EditorContext context, SNode node) {
    if (this.myListHandler_1199711357946 == null) {
      this.myListHandler_1199711357946 = new InvokeExpression_Editor.parameterListHandler_3972_0(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1199711357946.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_parameter1199711357946(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1199711357946.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_11997113579411199711357941(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199711357941");
  }

  private static void setupBasic_Constant_11997113579441199711357944(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199711357944");
  }

  private static void setupBasic_Constant_11997113579451199711357945(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199711357945");
  }

  private static void setupBasic_refNodeList_parameter1199711357946(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_parameter");
  }

  private static void setupBasic_Constant_11997113579481199711357948(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199711357948");
  }

  private static void setupLabel_Constant_1199711357944_1199711357944(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199711357945_1199711357945(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_parameter_1199711357946(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199711357948_1199711357948(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class parameterListHandler_3972_0 extends RefNodeListHandler {

    public parameterListHandler_3972_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1199711357947(context, node, "");
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

    public EditorCell createConstant1199711357947(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11997113579471199711357947(editorCell, node, context);
      setupLabel_Constant_1199711357947_1199711357947(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_11997113579471199711357947(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1199711357947");
    }

    private static void setupLabel_Constant_1199711357947_1199711357947(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
