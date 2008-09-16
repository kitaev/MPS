package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class MoveInitializerToConstructor_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Move initializer to constructor";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null) {
      return false;
    }
    if (SLinkOperations.getTarget(node, "initializer", true) == null) {
      return false;
    }
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode classNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    // 
    SNode assignmentStmt = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SNode assignmentExpr = SLinkOperations.setNewChild(assignmentStmt, "expression", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
    SLinkOperations.setTarget(assignmentExpr, "rValue", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "initializer", true)), true);
    SNode fieldReference = SLinkOperations.setNewChild(assignmentExpr, "lValue", "jetbrains.mps.baseLanguage.structure.FieldReference");
    SLinkOperations.setTarget(fieldReference, "variableDeclaration", node, false);
    SLinkOperations.setNewChild(fieldReference, "instance", "jetbrains.mps.baseLanguage.structure.ThisExpression");
    // 
    for(SNode constr : SLinkOperations.getTargets(classNode, "constructor", true)) {
      SLinkOperations.insertChildFirst(SLinkOperations.getTarget(constr, "body", true), "statement", SNodeOperations.copyNode(assignmentStmt));
    }
    // 
    SLinkOperations.removeChild(node, "initializer");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
