package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_FinalVariableReferenceNotAssigned_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_FinalVariableReferenceNotAssigned_NonTypesystemRule() {
  }

  public void applyRule(final SNode variableReference, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SPropertyOperations.getBoolean(SLinkOperations.getTarget(variableReference, "variableDeclaration", false), "isFinal")) {
      if (!(VariableReferenceUtil.isUninitializedOrBad(variableReference))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(variableReference, "assignment to a final variable", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3084663847510173642", null, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.VariableReference";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
