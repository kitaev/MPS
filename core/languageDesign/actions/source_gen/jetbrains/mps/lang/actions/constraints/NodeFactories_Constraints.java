package jetbrains.mps.lang.actions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeARootContext;
import jetbrains.mps.smodel.LanguageAspect;

public class NodeFactories_Constraints {
  public static boolean canBeARoot(final IOperationContext operationContext, final CanBeARootContext _context) {
    return LanguageAspect.ACTIONS.is(_context.getModel());
  }
}
