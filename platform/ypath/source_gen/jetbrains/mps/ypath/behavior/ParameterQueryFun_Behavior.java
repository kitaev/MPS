package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ParameterQueryFun_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode parameterType = SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ypath.structure.IFeature", false, false), "parameterType", true);
    if ((parameterType == null)) {
      return null;
    }
    return new QuotationClass_0().createNode(SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ypath.structure.IFeature", false, false), "parameterType", true));
  }

}
