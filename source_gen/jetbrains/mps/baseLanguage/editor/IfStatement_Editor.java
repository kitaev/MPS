package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/

public class IfStatement_Editor extends jetbrains.mps.nodeEditor.SemanticNodeEditor {

  public void setSemanticNode(jetbrains.mps.semanticModel.SemanticNode node) {
    super.setSemanticNode(node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createEditorCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    return this.createStatementBox(editorContext, node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createStatementBox(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setGridLayout(false);
    IfStatement_NodeBoxActions.setCellActions(editorCell, node);
    editorCell.addEditorCell(this.createHeaderRow(editorContext, node));
    editorCell.addEditorCell(this.createIfTrueBox(editorContext, node));
    if(jetbrains.mps.baseLanguage.editor.IfStatement_Actions.isTrue_IfFalseDefined(node)) {
      editorCell.addEditorCell(this.createIfFalseBranch(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstantCell3(editorContext, node, "}"));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createHeaderRow(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "if ("));
    editorCell.addEditorCell(this.createConditionCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ") {"));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConditionCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode condition = node.getReferent("condition", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(condition != null) {
      editorCell = this.nodeCell(editorContext, condition);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    IfStatement_ConditionCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell1(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIfTrueBox(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndentCell(editorContext, node, "  "));
    editorCell.addEditorCell(this.createIfTrueCell(editorContext, node));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIndentCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIfTrueCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode ifTrue = node.getReferent("ifTrue", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(ifTrue != null) {
      editorCell = this.nodeCell(editorContext, ifTrue);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIfFalseBranch(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, "} else {"));
    editorCell.addEditorCell(this.createIfFalseBox(editorContext, node));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell2(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIfFalseBox(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndentCell1(editorContext, node, "  "));
    editorCell.addEditorCell(this.createIfFalseCell(editorContext, node));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIndentCell1(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createIfFalseCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode ifFalse = node.getReferent("ifFalse", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(ifFalse != null) {
      editorCell = this.nodeCell(editorContext, ifFalse);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell3(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
}
