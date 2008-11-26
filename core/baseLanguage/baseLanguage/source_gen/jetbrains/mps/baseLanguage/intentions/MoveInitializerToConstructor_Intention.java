package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class MoveInitializerToConstructor_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Move Initializer to Constructor";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null) {
      return false;
    }
    if (SLinkOperations.getTarget(node, "initializer", true) == null) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode classNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    // 
    SNode assignmentStmt = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SNode assignmentExpr = SLinkOperations.setNewChild(assignmentStmt, "expression", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
    SLinkOperations.setTarget(assignmentExpr, "rValue", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "initializer", true)), true);
    // 
    SNode lValue = SLinkOperations.setNewChild(assignmentExpr, "lValue", "jetbrains.mps.baseLanguage.structure.DotExpression");
    SLinkOperations.setNewChild(lValue, "operand", "jetbrains.mps.baseLanguage.structure.ThisExpression");
    SLinkOperations.setTarget(SLinkOperations.setNewChild(lValue, "operation", "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"), "fieldDeclaration", node, false);
    // 
    for(SNode constr : Sequence.fromIterable(SLinkOperations.getTargets(classNode, "constructor", true))) {
      SLinkOperations.insertChildFirst(SLinkOperations.getTarget(constr, "body", true), "statement", SNodeOperations.copyNode(assignmentStmt));
    }
    // 
    SLinkOperations.removeChild(node, "initializer");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
