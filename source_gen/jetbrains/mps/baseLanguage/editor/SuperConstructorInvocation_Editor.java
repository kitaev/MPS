package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class SuperConstructorInvocation_Editor extends SemanticNodeEditor {
  public static String MATCHING_TEXT = "super";
  public static String PRESENTATION_NAME = "super constructor call";

  private EditorCellListHandler myActualArgumentListHandler;

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
    myActualArgumentListHandler = new SuperConstructorInvocation_Editor_ActualArgumentListHandler(node, "actualArgument", "aggregation");
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createRowCell(editorContext, node);
  }
  public EditorCell createRowCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "super("));
    editorCell.addEditorCell(this.createActualArgumentList(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, ")"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createActualArgumentList(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection cellCollection = myActualArgumentListHandler.createCells_Horizontal(editorContext);
    cellCollection.setGridLayout(false);
    return cellCollection;
  }
  public EditorCell createConstantCell2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
}
