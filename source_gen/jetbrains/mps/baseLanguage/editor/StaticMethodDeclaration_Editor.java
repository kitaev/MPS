package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.CellAction_Empty;

public class StaticMethodDeclaration_Editor extends DefaultNodeEditor {

  AbstractCellProvider my_BaseMethodParmListEditor;

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createMethodBox(context, node);
  }
  public EditorCell createMethodBox(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createBodyArea(context, node));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "}"));
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "static"));
    editorCell.addEditorCell(this.createReturnType(context, node));
    editorCell.addEditorCell(this.createMethodName(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "("));
    editorCell.addEditorCell(this.create_BaseMethodParmListEditorCell(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ") {"));
    return editorCell;
  }
  public EditorCell createBodyArea(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndentCell(context, node, "  "));
    editorCell.addEditorCell(this.createBodyCell(context, node));
    return editorCell;
  }
  public EditorCell create_BaseMethodParmListEditorCell(EditorContext context, SemanticNode node) {
    if(this.my_BaseMethodParmListEditor == null) {
      this.my_BaseMethodParmListEditor = new _BaseMethodParmListEditor(node);
    }
    EditorCell editorCell = this.my_BaseMethodParmListEditor.createEditorCell(context);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createIndentCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createMethodName(EditorContext context, SemanticNode node) {
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, "name", false, false);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(true);
    editorCell.setDefaultText("<no name>");
    editorCell.getTextLine().setTextColor(Color.darkGray);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    return editorCell;
  }
  public EditorCell createReturnType(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("returnType");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "returnType");
        noRefCell.setEditable(true);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        MethodDeclaration_ReturnTypeCellActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    MethodDeclaration_ReturnTypeCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createBodyCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("body");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "body");
        noRefCell.setEditable(true);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    return editorCell;
  }
}
