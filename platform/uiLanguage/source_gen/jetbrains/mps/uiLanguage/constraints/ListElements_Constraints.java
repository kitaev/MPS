package jetbrains.mps.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ListElements_Constraints {

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.uiLanguage.structure.ComponentInstance")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.uiLanguage.structure.ComponentInstance"), "componentDeclaration", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "componentDeclaration", false);
    }
    return false;
  }

}
