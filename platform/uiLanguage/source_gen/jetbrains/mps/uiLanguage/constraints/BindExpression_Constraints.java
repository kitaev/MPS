package jetbrains.mps.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class BindExpression_Constraints {

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.uiLanguage.structure.AttributeValue") || SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.uiLanguage.structure.ListElements") || SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.uiLanguage.structure.CellRendererAttribute");
  }

}
