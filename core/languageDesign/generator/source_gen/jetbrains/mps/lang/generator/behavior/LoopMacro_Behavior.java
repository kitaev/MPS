package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class LoopMacro_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    {
      _Patterns.Pattern_2 pattern_2 = new _Patterns.Pattern_2();
      SNode coercedNode_2 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodesQuery", true)), pattern_2);
      if (coercedNode_2 != null) {
        return pattern_2.PatternVar2;
      } else
      {
      }
    }
    return null;
  }

}
