package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class QueryFunction_RemoveBy_Condition_Behavior {

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    return !(SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_concept"));
  }

}
