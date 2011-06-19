package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ConceptFunction_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createComponent_qilpva_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCustom_qilpva_a(editorContext, node);
  }

  private EditorCell createComponent_qilpva_a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ConceptFunction_Component(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createCustom_qilpva_a(final EditorContext editorContext, final SNode node) {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<AbstractCellProvider>() {
      public AbstractCellProvider invoke() {
        return new AbstractCellProvider() {
          public EditorCell createEditorCell(EditorContext editorContext) {
            EditorCell_Collection collection = EditorCell_Collection.createVertical(editorContext, node);
            collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Concept function help:"));
            if (SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription") != null) {
              collection.addEditorCell(new EditorCell_Constant(editorContext, node, SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription")));
            }
            collection.addEditorCell(new EditorCell_Constant(editorContext, node, ""));
            collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Parameter help:"));
            for (SNode cfp : ConceptFunction_Behavior.call_getParameters_1213877374450(node)) {
              String alias = SPropertyOperations.getString(cfp, "alias");
              String description = SPropertyOperations.getString(cfp, "shortDescription");
              if (description == null) {
                description = "<no help. use short_description concept function property to create one>";
              }
              EditorCell_Constant message = new EditorCell_Constant(editorContext, node, alias + " : " + description);
              collection.addEditorCell(message);
            }
            return collection;
          }
        };
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("Custom_qilpva_a");
    return editorCell;
  }
}
