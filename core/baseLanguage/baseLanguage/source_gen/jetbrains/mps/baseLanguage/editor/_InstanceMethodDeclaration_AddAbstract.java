package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class _InstanceMethodDeclaration_AddAbstract {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.RIGHT_TRANSFORM, new _InstanceMethodDeclaration_AddAbstract._InstanceMethodDeclaration_AddAbstract_RIGHT_TRANSFORM(node));
  }

  public static class _InstanceMethodDeclaration_AddAbstract_RIGHT_TRANSFORM extends EditorCellAction {

    /* package */SNode myNode;

    public _InstanceMethodDeclaration_AddAbstract_RIGHT_TRANSFORM(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "add abstract attribute";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SPropertyOperations.set(node, "isAbstract", "" + (true));
    }

}

}
