package jetbrains.mps.lang.constraints.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConstraintFunctionParameter_newReferentNode_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ConstraintFunctionParameter_newReferentNode_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    SNode targetConcept = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.lang.constraints.structure.NodeReferentConstraint", false, false), "applicableLink", false), "target", false);
    if ((targetConcept == null)) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590309(jetbrains.mps.lang.constraints.typesystem)", "1208198552379", true), (SNode)new _Quotations.QuotationClass_6().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590309(jetbrains.mps.lang.constraints.typesystem)", "1208198552377", intentionProvider);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590309(jetbrains.mps.lang.constraints.typesystem)", "1208198556680", true), (SNode)new _Quotations.QuotationClass_7().createNode(targetConcept, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590309(jetbrains.mps.lang.constraints.typesystem)", "1208198556678", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_newReferentNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
