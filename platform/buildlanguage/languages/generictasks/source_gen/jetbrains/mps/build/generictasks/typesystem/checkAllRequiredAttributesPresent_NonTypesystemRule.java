package jetbrains.mps.build.generictasks.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.build.generictasks.behavior.TaskDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.generictasks.behavior.AttributeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkAllRequiredAttributesPresent_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public checkAllRequiredAttributesPresent_NonTypesystemRule() {
  }

  public void applyRule(final SNode genericTaskCall, final TypeCheckingContext typeCheckingContext) {
    for(SNode attrDecl : ListSequence.fromList(TaskDeclaration_Behavior.call_getAttributesDeaclarations_353793545802644071(SLinkOperations.getTarget(genericTaskCall, "declaration", false)))) {
      if (AttributeDeclaration_Behavior.call_isRequired_353793545802643811(attrDecl)) {
        boolean found = false;
        for(SNode attr : ListSequence.fromList(SLinkOperations.getTargets(genericTaskCall, "atributes", true))) {
          if (SPropertyOperations.getString(SLinkOperations.getTarget(attr, "attributeDeclaration", false), "name").equals(SPropertyOperations.getString(attrDecl, "name"))) {
            if ((SLinkOperations.getTarget(attr, "value", true) != null)) {
              found = true;
            }
            break;
          }
        }
        if (!(found)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            typeCheckingContext.reportTypeError(genericTaskCall, "Required attribute \"" + SPropertyOperations.getString(attrDecl, "name") + "\" undefined.", "r:eac20369-5993-49cc-a9ac-fbeb7a91d81f(jetbrains.mps.build.generictasks.typesystem)", "353793545802854846", intentionProvider, errorTarget);
          }
          return;
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.build.generictasks.structure.TaskCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
