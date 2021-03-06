package jetbrains.mps.build.generictasks.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.buildlanguage.behavior.Enum_Behavior;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkAttributeDeclarationDefaultValueIsInEnum_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public checkAttributeDeclarationDefaultValueIsInEnum_NonTypesystemRule() {
  }

  public void applyRule(final SNode genericAttributeDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if ((SLinkOperations.getTarget(genericAttributeDeclaration, "default", true) != null) && (SLinkOperations.getTarget(genericAttributeDeclaration, "enum", true) != null)) {
      if (!(Enum_Behavior.call_inEnum_1213877413964(SLinkOperations.getTarget(genericAttributeDeclaration, "enum", true), SLinkOperations.getTarget(genericAttributeDeclaration, "default", true)))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(genericAttributeDeclaration, "Default value of attribute \"" + SPropertyOperations.getString(genericAttributeDeclaration, "name") + "\" must be in " + Enum_Behavior.call_toString_1213877413898(SLinkOperations.getTarget(genericAttributeDeclaration, "enum", true)), "r:eac20369-5993-49cc-a9ac-fbeb7a91d81f(jetbrains.mps.build.generictasks.typesystem)", "353793545802854645", null, errorTarget);
        }
      }
    }
    if (SPropertyOperations.getString(genericAttributeDeclaration, "name") != null && SPropertyOperations.getString(genericAttributeDeclaration, "name").contains(" ")) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(genericAttributeDeclaration, "Attribute name contains whitespaces!", "r:eac20369-5993-49cc-a9ac-fbeb7a91d81f(jetbrains.mps.build.generictasks.typesystem)", "353793545802854662", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.build.generictasks.structure.AttributeDeclaration";
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
