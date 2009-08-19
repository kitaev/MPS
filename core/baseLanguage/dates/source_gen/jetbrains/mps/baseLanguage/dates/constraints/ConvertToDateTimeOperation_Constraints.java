package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ConvertToDateTimeOperation_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    boolean can = false;
    if (SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode operandType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true));
      can = TypeChecker.getInstance().getSubtypingManager().isSubtype(operandType, new _Quotations.QuotationClass_0().createNode());
      can = can || TypeChecker.getInstance().getSubtypingManager().isSubtype(operandType, new _Quotations.QuotationClass_1().createNode());
      can = can || TypeChecker.getInstance().getSubtypingManager().isSubtype(operandType, new _Quotations.QuotationClass_2().createNode());
      can = can || TypeChecker.getInstance().getSubtypingManager().isSubtype(operandType, new _Quotations.QuotationClass_3().createNode());
    }
    return can;
  }
}
