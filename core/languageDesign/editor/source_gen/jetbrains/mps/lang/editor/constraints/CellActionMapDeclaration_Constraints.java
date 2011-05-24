package jetbrains.mps.lang.editor.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.structure.CanBeASomethingMethod;
import jetbrains.mps.smodel.constraints.CanBeARootContext;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.structure.CheckingNodeContext;
import jetbrains.mps.smodel.LanguageAspect;

public class CellActionMapDeclaration_Constraints extends ConstraintsDataHolder {
  public CellActionMapDeclaration_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration";
  }

  @Override
  @Nullable
  public CanBeASomethingMethod<CanBeARootContext> getCanBeARootMethod() {
    return new CanBeASomethingMethod<CanBeARootContext>() {
      private SNodePointer breakingNode = new SNodePointer("r:00000000-0000-4000-0000-011c89590298(jetbrains.mps.lang.editor.constraints)", "1227090163036");

      public boolean canBe(IOperationContext operationContext, CanBeARootContext _context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = canBeARoot(operationContext, _context);
        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.breakingNodePointer = breakingNode;
        }
        return result;
      }
    };
  }

  public static boolean canBeARoot(final IOperationContext operationContext, final CanBeARootContext _context) {
    return LanguageAspect.EDITOR.is(_context.getModel());
  }
}
