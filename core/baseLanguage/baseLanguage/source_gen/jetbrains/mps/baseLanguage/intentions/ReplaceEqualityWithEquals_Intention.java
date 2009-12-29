package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ReplaceEqualityWithEquals_Intention extends BaseIntention implements Intention {
  public ReplaceEqualityWithEquals_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.EqualsExpression";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace Equality with equals()";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode leftExpr = SLinkOperations.getTarget(node, "leftExpression", true);
    SNode rightExpression = SLinkOperations.getTarget(node, "rightExpression", true);
    SNode equalsExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
    SLinkOperations.setTarget(equalsExpression, "operand", leftExpr, true);
    SNode operation = SLinkOperations.setNewChild(equalsExpression, "operation", "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation");
    SLinkOperations.setTarget(operation, "baseMethodDeclaration", SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "operation", true), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"), "baseMethodDeclaration", false), false);
    ListSequence.fromList(SLinkOperations.getTargets(operation, "actualArgument", true)).insertElement(0, rightExpression);
    SNodeOperations.replaceWithAnother(node, equalsExpression);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
