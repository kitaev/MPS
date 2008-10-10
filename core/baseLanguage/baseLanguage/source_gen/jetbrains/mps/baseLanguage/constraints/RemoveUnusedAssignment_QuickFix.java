package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class RemoveUnusedAssignment_QuickFix extends QuickFix_Runtime {

  public RemoveUnusedAssignment_QuickFix() {
  }

  public String getDescription() {
    return "remove unused assignment";
  }

  public void execute(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      SNode assignmentExpression = node;
      SNode lValue = SLinkOperations.getTarget(assignmentExpression, "lValue", true);
      SNodeOperations.replaceWithAnother(assignmentExpression, lValue);
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(lValue), "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNodeOperations.deleteNode(SNodeOperations.getParent(lValue));
      }
    }
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) {
      SLinkOperations.removeChild(node, "initializer");
    }
  }

}
