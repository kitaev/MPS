package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class ReplaceEqualsWithEquality_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace equals with equality";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null) {
      return false;
    }
    if (SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name") == null) {
      return false;
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name").equals("equals") && SLinkOperations.getCount(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter") == 1;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode leftExpr = SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), "operand", true);
    SNode rightExpression = ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first();
    SNode equalsExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.EqualsExpression", null);
    SLinkOperations.setTarget(equalsExpression, "leftExpression", leftExpr, true);
    SLinkOperations.setTarget(equalsExpression, "rightExpression", rightExpression, true);
    SNodeOperations.replaceWithAnother(node, equalsExpression);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
