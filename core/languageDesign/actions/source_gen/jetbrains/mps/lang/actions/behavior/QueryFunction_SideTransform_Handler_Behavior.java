package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueryFunction_SideTransform_Handler_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_pattern")) {
      return false;
    }
    return true;
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.actions.structure.ConceptPart", false, false);
    SNode conceptOfNodeReturnedByHandler = SLinkOperations.getTarget(ancestor, "concept", false);
    return new _Quotations.QuotationClass_1().createNode();
  }
}
