package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class EnumerationMemberDeclaration_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createRowCell(editorContext, node);
  }
  public EditorCell createRowCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "name:"));
    editorCell.addEditorCell(this.createNameCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, "constant:"));
    editorCell.addEditorCell(this.createIdentifierCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, "("));
    editorCell.addEditorCell(this.createValueCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell3(editorContext, node, ")"));
    editorCell.addEditorCell(this.createConstantCell4(editorContext, node, "default:"));
    editorCell.addEditorCell(this.createEnumMember_IsDefaultCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(true);
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = new PropertyAccessor(node, "name", true, false);
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setDefaultText("<no name>");
    editorCell.getTextLine().setTextBackgroundColor(Color.cyan);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createIdentifierCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = new PropertyAccessor(node, "identifier", true, false);
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setDefaultText("<no identifier>");
    editorCell.getTextLine().setTextBackgroundColor(Color.yellow);
    editorCell.getTextLine().setSelectedTextBackgroundColor(Color.cyan);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "identifier"));
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createValueCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = new PropertyAccessor(node, "value", true, false);
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setDefaultText("NULL");
    editorCell.getTextLine().setTextBackgroundColor(Color.yellow);
    editorCell.getTextLine().setSelectedTextBackgroundColor(Color.cyan);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "value"));
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createEnumMember_IsDefaultCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = Aspects.createModelAccessor_EnumMember_IsDefault(node);
    EditorCell editorCell = null;
    if(modelAccessor != null) {
      editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
    }
    EnumerationMemberDeclaration_IsDefaultActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
