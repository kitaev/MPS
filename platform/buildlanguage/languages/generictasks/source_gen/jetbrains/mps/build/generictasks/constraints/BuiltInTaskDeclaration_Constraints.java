package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeARootContext;
import jetbrains.mps.build.generictasks.behavior.BuiltInTaskDeclaration_Behavior;

public class BuiltInTaskDeclaration_Constraints {

  public static boolean canBeARoot(final IOperationContext operationContext, final CanBeARootContext _context) {
    return BuiltInTaskDeclaration_Behavior.isInGeneratedModels_1445805690439864419(operationContext);
  }

}
