package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VariableAssignedToItself_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_VariableAssignedToItself_NonTypesystemRule() {
  }

  public void applyRule(final SNode assignmentExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(assignmentExpression, "lValue", true) == null || SLinkOperations.getTarget(assignmentExpression, "rValue", true) == null) {
      return;
    }
    SNode lDeclaration = RulesFunctions_BaseLanguage.getVariableDeclaration(SLinkOperations.getTarget(assignmentExpression, "lValue", true));
    SNode rDeclaration = RulesFunctions_BaseLanguage.getVariableDeclaration(SLinkOperations.getTarget(assignmentExpression, "rValue", true));
    if (lDeclaration != null && lDeclaration == rDeclaration) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(assignmentExpression, "Variable is assigned to itself", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8559617843245280240", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AssignmentExpression";
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
