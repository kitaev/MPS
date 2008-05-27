package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class Node_GetPrevSiblingsOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAliasAndParms_Comp7;

  private static void setupBasic_ReplaceableAliasAndParms_CompComponentCell8158_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ReplaceableAliasAndParms_CompComponentCell8158_0");
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_ReplaceableAliasAndParms_CompComponentCell8158_0(context, node);
  }

  public EditorCell create_ReplaceableAliasAndParms_CompComponentCell8158_0(EditorContext context, SNode node) {
    if (this.myReplaceableAliasAndParms_Comp7 == null) {
      this.myReplaceableAliasAndParms_Comp7 = new ReplaceableAliasAndParms_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAliasAndParms_Comp7.createEditorCell(context);
    setupBasic_ReplaceableAliasAndParms_CompComponentCell8158_0(editorCell, node, context);
    return editorCell;
  }

}
