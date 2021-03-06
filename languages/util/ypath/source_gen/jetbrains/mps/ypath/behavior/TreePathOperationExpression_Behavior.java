package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class TreePathOperationExpression_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean call_isGeneric_1213877409257(SNode thisNode) {
    SNode tpae = ListSequence.fromList(SNodeOperations.getDescendants(thisNode, null, false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.TreePathAdapterExpression");
      }
    }).first();
    return (tpae != null) && TreePathAdapterExpression_Behavior.call_isGeneric_1213877411663(SNodeOperations.cast(tpae, "jetbrains.mps.ypath.structure.TreePathAdapterExpression"));
  }
}
