package jetbrains.mps.execution.settings.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class EditorExpression_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", true, false) != null);
  }
}
