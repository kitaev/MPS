package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;

public class ParenthesizedExpression_Editor extends SemanticNodeEditor {
  public static String MATCHING_TEXT = "(expr)";
  public static String PRESENTATION_NAME = "parenthesis";

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createNodeBox(editorContext, node);
  }
  public EditorCell createNodeBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.setKeyMap(new _Expression_KeyMap());
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "("));
    editorCell.addEditorCell(this.createExpressionCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ")"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createExpressionCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode expression = node.getReferent("expression", (SemanticNode)null);
    EditorCell editorCell = null;
    if(expression != null) {
      editorCell = editorContext.createNodeCell(expression);
      ParenthesizedExpression_ExpressionActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      ParenthesizedExpression_ExpressionActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setEditable(false);
    __ExpressionClosingParethesis_ActionSet.setCellActions(editorCell, node);
    return editorCell;
  }
}
