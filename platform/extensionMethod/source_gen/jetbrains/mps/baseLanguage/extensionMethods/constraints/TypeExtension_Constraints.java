package jetbrains.mps.baseLanguage.extensionMethods.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.structure.CanBeASomethingMethod;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.structure.CheckingNodeContext;
import jetbrains.mps.smodel.constraints.CanBeAParentContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TypeExtension_Constraints extends ConstraintsDataHolder {
  public TypeExtension_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.extensionMethods.structure.TypeExtension";
  }

  @Override
  @Nullable
  public CanBeASomethingMethod<CanBeAChildContext> getCanBeAChildMethod() {
    return new CanBeASomethingMethod<CanBeAChildContext>() {
      private SNodePointer breakingNode = new SNodePointer("r:8a519067-4481-4fce-a84b-d7a47e974dd7(jetbrains.mps.baseLanguage.extensionMethods.constraints)", "1550313277220707355");

      public boolean canBe(IOperationContext operationContext, CanBeAChildContext _context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = canBeAChild(operationContext, _context);
        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.breakingNodePointer = breakingNode;
        }
        return result;
      }
    };
  }

  @Nullable
  @Override
  public CanBeASomethingMethod<CanBeAParentContext> getCanBeAParentMethod() {
    return new CanBeASomethingMethod<CanBeAParentContext>() {
      private SNodePointer breakingNode = new SNodePointer("r:8a519067-4481-4fce-a84b-d7a47e974dd7(jetbrains.mps.baseLanguage.extensionMethods.constraints)", "5617464356391443670");

      public boolean canBe(IOperationContext operationContext, CanBeAParentContext _context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = canBeAParent(operationContext, _context);
        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.breakingNodePointer = breakingNode;
        }
        return result;
      }
    };
  }

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.Expression");
  }

  public static boolean canBeAParent(final IOperationContext operationContext, final CanBeAParentContext _context) {
    if (!(SConceptOperations.isExactly(_context.getChildConcept(), "jetbrains.mps.baseLanguage.structure.PublicVisibility")) && _context.getLink() == SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.extensionMethods.structure.TypeExtension", "visibility")) {
      return false;
    }
    return true;
  }
}
