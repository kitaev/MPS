package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ElsifSwapWithMain_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ElsifClause";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Swap Elsif Clause with Main Clause";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode ifStatement = SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.IfStatement");
    SNode condition = SLinkOperations.getTarget(ifStatement, "condition", true);
    SNode statementList = SLinkOperations.getTarget(ifStatement, "ifTrue", true);
    SLinkOperations.setTarget(ifStatement, "condition", SLinkOperations.getTarget(node, "condition", true), true);
    SLinkOperations.setTarget(ifStatement, "ifTrue", SLinkOperations.getTarget(node, "statementList", true), true);
    SLinkOperations.setTarget(node, "condition", condition, true);
    SLinkOperations.setTarget(node, "statementList", statementList, true);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
