package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TypeVariableDeclaration_addAuxBound {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.RIGHT_TRANSFORM, new TypeVariableDeclaration_addAuxBound.TypeVariableDeclaration_addAuxBound_RIGHT_TRANSFORM(node));
  }

  public static class TypeVariableDeclaration_addAuxBound_RIGHT_TRANSFORM extends EditorCellAction {

    /* package */SNode myNode;

    public TypeVariableDeclaration_addAuxBound_RIGHT_TRANSFORM(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SLinkOperations.addNewChild(node, "auxBounds", "jetbrains.mps.baseLanguage.structure.ClassifierType");
    }

}

}
