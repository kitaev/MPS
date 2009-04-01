package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.lang.smodel.editor.ReplaceableAliasAndParms_Comp;

public class Concept_GetAllSuperConcepts_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAliasAndParms_Comp6584_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6584_0(context, node);
  }

  public EditorCell createCollection_6584_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_6584_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_6584_0(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6584_0(EditorContext context, SNode node) {
    if (this.myReplaceableAliasAndParms_Comp6584_0 == null) {
      this.myReplaceableAliasAndParms_Comp6584_0 = new ReplaceableAliasAndParms_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAliasAndParms_Comp6584_0.createEditorCell(context);
    setupBasic_Component_6584_0(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Collection_6584_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6584_0");
  }

  private static void setupBasic_Component_6584_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

}
