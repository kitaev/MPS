package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/

public class ConstructorDeclaration_Editor extends jetbrains.mps.nodeEditor.SemanticNodeEditor {

  jetbrains.mps.nodeEditor.EditorCellListHandler myParameterListHandler;

  public void setSemanticNode(jetbrains.mps.semanticModel.SemanticNode node) {
    super.setSemanticNode(node);
    myParameterListHandler = new ConstructorDeclaration_Editor_ParameterListHandler(node, "parameter", "aggregation");
  }
  public jetbrains.mps.nodeEditor.EditorCell createEditorCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    return this.createMethodBox(editorContext, node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createMethodBox(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setSelectable(true);
    editorCell.setGridLayout(false);
    jetbrains.mps.baseLanguage.editor.ConstructorDeclaration_Actions.setCellActions_NodeBoxActions(editorCell, node);
    editorCell.addEditorCell(this.createHeaderRow(editorContext, node));
    editorCell.addEditorCell(this.createBodyArea(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, "}"));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createHeaderRow(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstructorName(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "("));
    editorCell.addEditorCell(this.createParametersList(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ")"));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstructorName(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.ModelAccessor modelAccessor = jetbrains.mps.baseLanguage.editor.ConstructorDeclaration_Actions.createModelAccessor_ClassNameAccessor(node);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(modelAccessor != null) {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Property.create(editorContext, modelAccessor, node, false);
      editorCell.setSelectable(true);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createParametersList(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection cellCollection = myParameterListHandler.createCells_Horizontal(editorContext);
    cellCollection.setGridLayout(false);
    return cellCollection;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell1(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createBodyArea(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndentCell(editorContext, node, "  "));
    editorCell.addEditorCell(this.createBodyCell(editorContext, node));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIndentCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createBodyCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode body = node.getReferent("body", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(body != null) {
      editorCell = this.nodeCell(editorContext, body);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell2(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
}
