package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class StaticFieldReference_Editor extends SemanticNodeEditor {
  public static String MATCHING_TEXT = ". <static field>";
  public static String PRESENTATION_NAME = "static field reference";

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createRowCell(editorContext, node);
  }
  public EditorCell createRowCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.setKeyMap(new _Expression_KeyMap());
    editorCell.addEditorCell(this.createJavaClassTypeCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "."));
    editorCell.addEditorCell(this.createVariableDeclarationReferenceCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createJavaClassTypeCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode javaClassType = node.getReferent("javaClassType", (SemanticNode)null);
    EditorCell editorCell = null;
    if(javaClassType != null) {
      editorCell = editorContext.createNodeCell(javaClassType);
      StaticFieldReference_TypeActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      StaticFieldReference_TypeActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createVariableDeclarationReferenceCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode effectiveNode = node.getReferent("variableDeclaration", (SemanticNode)null);
    if(effectiveNode == null) {
      EditorCell_Error errorCell = EditorCell_Error.create(editorContext, node, "<no field>");
      errorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      StaticFieldReference_FieldNameActions.setCellActions(errorCell, node);
      return errorCell;
    }
    AbstractCellProvider variableDeclaration_InlineComponent = new StaticFieldReference_Editor_variableDeclaration_InlineComponent(effectiveNode);
    EditorCell editorCell = variableDeclaration_InlineComponent.createEditorCell(editorContext);
    StaticFieldReference_FieldNameActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
