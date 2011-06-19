package jetbrains.mps.lang.actions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModel;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.smodel.constraints.CanBeARootContext;
import jetbrains.mps.smodel.LanguageAspect;

public class NodeSubstituteActions_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer canBeRootBreakingPoint = new SNodePointer("r:00000000-0000-4000-0000-011c895902a4(jetbrains.mps.lang.actions.constraints)", "1227088789865");

  public NodeSubstituteActions_Constraints() {
    super("jetbrains.mps.lang.actions.structure.NodeSubstituteActions");
  }

  @Override
  public boolean hasOwnCanBeRootMethod() {
    return true;
  }

  @Override
  public boolean canBeRoot(IOperationContext context, SModel model, @Nullable CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeARoot(context, new CanBeARootContext(model));

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeRootBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeARoot(final IOperationContext operationContext, final CanBeARootContext _context) {
    return LanguageAspect.ACTIONS.is(_context.getModel());
  }
}
