package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class FlipBinaryOperation_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BinaryOperation";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Flip binary operation";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode leftExpression = SLinkOperations.getTarget(node, "leftExpression", true);
    SNode rightExpression = SLinkOperations.getTarget(node, "rightExpression", true);
    SLinkOperations.setTarget(node, "leftExpression", SNodeOperations.copyNode(rightExpression), true);
    SLinkOperations.setTarget(node, "rightExpression", SNodeOperations.copyNode(leftExpression), true);
  }

}
