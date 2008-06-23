package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ReturnStatement_Behavior {

  public static void init(SNode thisNode) {
  }

  public static List<SNode> call_getFinallyBlocks_1213877501572(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    SNode current = thisNode;
    while (true) {
      if (SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.TryStatement")) {
        SNode tryStatement = current;
        if ((SLinkOperations.getTarget(tryStatement, "finallyBody", true) != null) && SLinkOperations.getTarget(tryStatement, "finallyBody", true) != SNodeOperations.getParent(thisNode, null, false, false)) {
          ListSequence.fromList(result).addElement(SLinkOperations.getTarget(tryStatement, "finallyBody", true));
        }
      }
      current = SNodeOperations.getParent(current, null, false, false);
      if (!(SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.Statement")) && !(SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.StatementList"))) {
        break;
      }
    }
    return result;
  }

  public static SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    SNode type = null;
    if (SNodeOperations.getParent(expression, null, false, false) == thisNode && SNodeOperations.hasRole(expression, "jetbrains.mps.baseLanguage.structure.ReturnStatement", "expression")) {
      SNode ancestor = SNodeOperations.getAncestorWhereConceptInList(thisNode, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration","jetbrains.mps.baseLanguage.structure.ConceptFunction"}, false, false);
      if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
        type = SNodeOperations.copyNode(SLinkOperations.getTarget(ancestor, "returnType", true));
      } else
      {
        type = SNodeOperations.copyNode(ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(ancestor));
      }
    }
    return type;
  }

}
