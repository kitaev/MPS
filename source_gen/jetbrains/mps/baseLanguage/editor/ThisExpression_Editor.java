package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/

public class ThisExpression_Editor extends jetbrains.mps.nodeEditor.SemanticNodeEditor {

  public void setSemanticNode(jetbrains.mps.semanticModel.SemanticNode node) {
    super.setSemanticNode(node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createEditorCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    return this.createConstantCell(editorContext, node, "this");
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(true);
    jetbrains.mps.baseLanguage.editor.ThisExpression_Actions.setCellActions_NodeBoxActions(editorCell, node);
    return editorCell;
  }
}
