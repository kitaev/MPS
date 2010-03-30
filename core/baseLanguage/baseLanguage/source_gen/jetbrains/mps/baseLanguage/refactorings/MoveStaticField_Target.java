package jetbrains.mps.baseLanguage.refactorings;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;

public class MoveStaticField_Target implements IRefactoringTarget {
  public MoveStaticField_Target() {
  }

  public IRefactoringTarget.TargetType getTarget() {
    return IRefactoringTarget.TargetType.NODE;
  }

  public boolean allowMultipleTargets() {
    return false;
  }

  public boolean isApplicableToEntityType(final Object entity) {
    return SNodeOperations.isInstanceOf(((SNode) entity), "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
  }

  public boolean isApplicable(final Object entity) {
    if (!(this.isApplicableToEntityType(entity))) {
      return false;
    }
    return true;
  }
}
