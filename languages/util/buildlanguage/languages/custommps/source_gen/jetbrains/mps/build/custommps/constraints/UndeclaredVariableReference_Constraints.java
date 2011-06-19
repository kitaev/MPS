package jetbrains.mps.build.custommps.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;

public class UndeclaredVariableReference_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:2b83e52c-afc8-4c83-b809-300cb1b3c99f(jetbrains.mps.build.custommps.constraints)", "8431776905956790267");

  public UndeclaredVariableReference_Constraints() {
    super("jetbrains.mps.build.custommps.structure.UndeclaredVariableReference");
  }

  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }

  @Override
  public boolean canBeChild(final IOperationContext operationContext, SNode node, SNode node1, SNode node2, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(operationContext, new CanBeAChildContext(node, node1, node2));

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return MPSBuild_Behavior.isInCustomMPSLanguage_1238403397946(operationContext);
  }
}
