package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ReplaceAssertWithIf_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.AssertStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace assert with if";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    // produce throw statement
    SNode throwStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThrowStatement", null);
    SNode newExpr = SLinkOperations.setNewChild(throwStatement, "throwable", "jetbrains.mps.baseLanguage.structure.NewExpression");
    SLinkOperations.setTarget(newExpr, "baseMethodDeclaration", SLinkOperations.getTarget(SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "creator", true), "baseMethodDeclaration", false), false);
    // produce if statement
    SNode ifStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
    SNode notExpr = SLinkOperations.setNewChild(ifStatement, "condition", "jetbrains.mps.baseLanguage.structure.NotExpression");
    SLinkOperations.setTarget(notExpr, "expression", SLinkOperations.getTarget(node, "condition", true), true);
    SLinkOperations.setNewChild(ifStatement, "ifTrue", "jetbrains.mps.baseLanguage.structure.StatementList");
    SLinkOperations.insertChildFirst(SLinkOperations.getTarget(ifStatement, "ifTrue", true), "statement", throwStatement);
    // replace assert with if
    SNodeOperations.replaceWithAnother(node, ifStatement);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
