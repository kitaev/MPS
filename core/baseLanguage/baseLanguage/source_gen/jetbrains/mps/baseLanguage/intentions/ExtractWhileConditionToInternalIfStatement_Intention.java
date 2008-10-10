package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ExtractWhileConditionToInternalIfStatement_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.WhileStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Extract while condition to internal if statement";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    // produce break statement
    SNode breakStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.BreakStatement", null);
    // produce if statement
    SNode ifStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
    SNode conditionExpr = SLinkOperations.setNewChild(ifStatement, "condition", "jetbrains.mps.baseLanguage.structure.NotExpression");
    SLinkOperations.setTarget(conditionExpr, "expression", SLinkOperations.getTarget(node, "condition", true), true);
    SLinkOperations.setNewChild(ifStatement, "ifTrue", "jetbrains.mps.baseLanguage.structure.StatementList");
    SLinkOperations.insertChildFirst(SLinkOperations.getTarget(ifStatement, "ifTrue", true), "statement", breakStatement);
    // insert if statement and replace condition with true
    SLinkOperations.insertChildFirst(SLinkOperations.getTarget(node, "body", true), "statement", ifStatement);
    SNode condition = SLinkOperations.setNewChild(node, "condition", "jetbrains.mps.baseLanguage.structure.BooleanConstant");
    SPropertyOperations.set(condition, "value", "" + (true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
