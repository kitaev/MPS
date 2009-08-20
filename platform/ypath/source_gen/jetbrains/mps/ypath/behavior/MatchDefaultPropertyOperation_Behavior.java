package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MatchDefaultPropertyOperation_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_getDefaultProperty_1213877365175(SNode thisNode) {
    SNode tpoe = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
    SNode treePath = ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe);
    assert (treePath != null);
    return TreePathAspect_Behavior.call_getDefaultProperty_1213877241846(SNodeOperations.cast(treePath, "jetbrains.mps.ypath.structure.TreePathAspect"));
  }

}
