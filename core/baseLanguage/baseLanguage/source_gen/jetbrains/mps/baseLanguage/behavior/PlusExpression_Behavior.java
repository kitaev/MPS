package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class PlusExpression_Behavior {

  public static void init(SNode thisNode) {
  }

  public static Object virtual_eval_1213877519769(SNode thisNode, IModule module) {
    Object result;
    Object leftExpression = Expression_Behavior.call_eval_1213877519769(SLinkOperations.getTarget(thisNode, "leftExpression", true), module);
    Object rightExpression = Expression_Behavior.call_eval_1213877519769(SLinkOperations.getTarget(thisNode, "rightExpression", true), module);
    if (leftExpression instanceof String) {
      result = "" + leftExpression + rightExpression;
    } else
    {
      throw new UnsupportedOperationException();
    }
    return result;
  }

}
