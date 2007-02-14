package smodelLanguage.samples;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class Child_Referent_Parent {

  public void accessToChildNode_1(SNode ifStatement) {
    SNode condition = SLinkOperations.getTarget(ifStatement, "condition", true);
    SNodeOperations.deleteNode(condition);
    SLinkOperations.deleteChild(ifStatement, "condition");
  }
  public void accessToChildNode_2(SNode ifStatement, SNode newCondition) {
    SLinkOperations.setTarget(ifStatement, "condition", newCondition, true);
    SNode condition = SLinkOperations.getTarget(ifStatement, "condition", true);
    SNodeOperations.replaceWithAnother(condition, newCondition);
  }
  public void accessToChildNode_3(SNode ifStatement1, SNode ifStatement2) {
    SLinkOperations.setTarget(ifStatement1, "condition", SNodeOperations.copyNode(SLinkOperations.getTarget(ifStatement2, "condition", true)), true);
    SNode condition = SLinkOperations.getTarget(ifStatement1, "condition", true);
    SNodeOperations.replaceWithAnother(condition, SNodeOperations.copyNode(SLinkOperations.getTarget(ifStatement2, "condition", true)));
  }
  public void accessToChildNode_4(SNode ifStatement) {
    SNode newCondition1 = SLinkOperations.setNewChild(ifStatement, "condition", "jetbrains.mps.baseLanguage.structure.Expression");
    SNode newCondition2 = SLinkOperations.setNewChild(ifStatement, "condition", "jetbrains.mps.baseLanguage.structure.EqualsExpression");
    SNode newCondition3 = SNodeOperations.replaceWithNewChild(newCondition1, "jetbrains.mps.baseLanguage.structure.NotExpression");
  }
  public void accessToReferentNode_1(SNode methodCall, SNode method) {
    SNode oldMethod = SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false);
    String oldMethopdName = SPropertyOperations.getString(oldMethod, "name");
    oldMethopdName = SPropertyOperations.getString(SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false), "name");
    SLinkOperations.setTarget(methodCall, "baseMethodDeclaration", method, false);
  }
  public void accessToParentNode_1(SNode expression) {
    SNode parent_IfStatement = null;
    SNode mayBe_IfStatement = SNodeOperations.getParent(expression, null, false, false);
    while(mayBe_IfStatement != null) {
      if(SNodeOperations.isInstanceOf(mayBe_IfStatement, "jetbrains.mps.baseLanguage.structure.IfStatement")) {
        parent_IfStatement = mayBe_IfStatement;
        break;
      }
      mayBe_IfStatement = SNodeOperations.getParent(mayBe_IfStatement, null, false, false);
    }
  }
  public void accessToParentNode_2(SNode expression) {
    SNode parent_IfStatement = SNodeOperations.getParent(expression, "jetbrains.mps.baseLanguage.structure.IfStatement", false, false);
  }
  public void accessToAncestor_1(SNode expression) {
    SNode ifStatement = SNodeOperations.getParent(expression, "jetbrains.mps.baseLanguage.structure.IfStatement", true, false);
  }
  public void accessToParentNode_3(SNode expression) {
    SNode parent_If_or_WhileStatement = SNodeOperations.getParentWhereConceptInList(expression, new String[]{"jetbrains.mps.baseLanguage.structure.IfStatement","jetbrains.mps.baseLanguage.structure.WhileStatement"}, false, false);
  }
  public void accessToParentNode_4(SNode expression) {
    SNode declaringClass = SNodeOperations.getParent(SLinkOperations.getTarget(expression, "baseMethodDeclaration", false), null, false, false);
  }
  public void accessToParentNode_5(SNode node) {
    SNode root = SNodeOperations.getContainingRoot(node);
  }
}
