package jetbrains.mps.baseLanguage.jdk7.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_StringSwitchCase_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_StringSwitchCase_NonTypesystemRule() {
  }

  public void applyRule(final SNode switchStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    // checking case elements 
    for (SNode caseElement : SLinkOperations.getTargets(switchStatement, "case", true)) {
      if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(caseElement, "expression", true), "jetbrains.mps.baseLanguage.structure.StringLiteral"))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(caseElement, "expression", true), "Case expression should be string literal", "r:ed059f83-fdac-4e67-8269-91684666291c(jetbrains.mps.baseLanguage.jdk7.typesystem)", "400642802550421757", null, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.jdk7.structure.StringSwitchStatement";
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
