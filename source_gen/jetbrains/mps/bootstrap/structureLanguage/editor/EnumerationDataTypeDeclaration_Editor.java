package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
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
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class EnumerationDataTypeDeclaration_Editor extends SemanticNodeEditor {

  private EditorCellListHandler myMemberListHandler;

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
    myMemberListHandler = new EnumerationDataTypeDeclaration_Editor_MemberListHandler(node, "member", "aggregation");
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createNodeBox(editorContext, node);
  }
  public EditorCell createNodeBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createHeaderRow(editorContext, node));
    editorCell.addEditorCell(this.createColumnCell(editorContext, node));
    editorCell.addEditorCell(this.createRowCell3(editorContext, node));
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "Enumeration Data Type Declaration"));
    editorCell.addEditorCell(this.createNameCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = new PropertyAccessor(node, "name", true, false);
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setDefaultText("<no name>");
    editorCell.getTextLine().setTextBackgroundColor(Color.yellow);
    editorCell.getTextLine().setSelectedTextBackgroundColor(Color.cyan);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    return editorCell;
  }
  public EditorCell createColumnCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createRowCell(editorContext, node));
    editorCell.addEditorCell(this.createRowCell1(editorContext, node));
    editorCell.addEditorCell(this.createRowCell2(editorContext, node));
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndent(editorContext, node, "    "));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, "member type:"));
    editorCell.addEditorCell(this.createEnumDataType_MemberDataTypeNameCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createIndent(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createEnumDataType_MemberDataTypeNameCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = Aspects.createModelAccessor_EnumDataType_MemberDataTypeName(node);
    EditorCell editorCell = null;
    if(modelAccessor != null) {
      editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
      ((EditorCell_Label)editorCell).setDefaultText("<no data type>");
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, "<no data type>");
    }
    EnumerationDataTypeDeclaration_MemberDataTypeActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndent1(editorContext, node, "    "));
    return editorCell;
  }
  public EditorCell createIndent1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndent2(editorContext, node, "    "));
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, "members:"));
    return editorCell;
  }
  public EditorCell createIndent2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndent3(editorContext, node, "        "));
    editorCell.addEditorCell(this.createMemberList(editorContext, node));
    return editorCell;
  }
  public EditorCell createIndent3(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    return editorCell;
  }
  public EditorCell createMemberList(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection cellCollection = myMemberListHandler.createCells_Vertical(editorContext);
    cellCollection.setGridLayout(true);
    return cellCollection;
  }
}
