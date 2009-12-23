package jetbrains.mps.baseLanguage.refactorings;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;

public class RenameMethod_Target implements IRefactoringTarget {
  public RenameMethod_Target() {
  }

  public IRefactoringTarget.TargetType getTarget() {
    return IRefactoringTarget.TargetType.NODE;
  }

  public boolean allowMultipleTargets() {
    return false;
  }

  public boolean isApplicableToEntityType(Object entity) {
    return true;
  }

  public boolean isApplicable(final Object entity) {
    if (!(this.isApplicableToEntityType(entity))) {
      return false;
    }
    return SNodeOperations.isInstanceOf(((SNode) entity), "jetbrains.mps.baseLanguage.structure.IMethodCall") || SNodeOperations.isInstanceOf(((SNode) entity), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
  }
}
