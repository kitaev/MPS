package jetbrains.mps.ide.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.ide.uiLanguage.constraints.DialogUtil;

public class DisposeDialogExpression_Constraints {

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return DialogUtil.dialogAccessible(_context.getParentNode());
  }

}
