package jetbrains.mps.build.generictasks.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class Attribute_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createComponent_mc4j88_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createComponent_mc4j88_a_0(editorContext, node);
  }

  private EditorCell createComponent_mc4j88_a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new Attribute_EditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_mc4j88_a_0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new Attribute_EditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }
}
