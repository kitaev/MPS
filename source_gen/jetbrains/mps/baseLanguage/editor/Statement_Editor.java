package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class Statement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createNodeBox(editorContext, node);
  }
  public EditorCell createNodeBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(editorContext, node, "<statement>");
    return editorCell;
  }
}
