package jetbrains.mps.lang.behavior.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;

public class ThisNodeExpression_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return ConstraintsUtil.isInsideOfNonStaticBehaviorContext(_context.getParentNode());
  }
}
