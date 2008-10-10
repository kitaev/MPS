package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class StaticMethodCall_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new StaticMethodCall_Actions.StaticMethodCall_Actions_DELETE(node));
  }

  public static class StaticMethodCall_Actions_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public StaticMethodCall_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode classConcept1 = SLinkOperations.getTarget(node, "classConcept", false);
      SNode classConcept2 = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      if (classConcept1 == classConcept2) {
        SNode localStaticMethodCall = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall");
        SLinkOperations.setTarget(localStaticMethodCall, "baseMethodDeclaration", SLinkOperations.getTarget(node, "baseMethodDeclaration", false), false);
        for(SNode actualArgument : SLinkOperations.getTargets(node, "actualArgument", true)) {
          SLinkOperations.addChild(localStaticMethodCall, "actualArgument", actualArgument);
        }
      }
    }

}

}
