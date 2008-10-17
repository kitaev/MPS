package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertNextSiblingOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_Node_InsertNextSiblingOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedCorrectly_generic(typeCheckingContext, op);
    SNode parameter = SLinkOperations.getTarget(op, "insertedNode", true);
    if (!((parameter == null))) {
      {
        SNode _nodeToCheck_1029348928467 = parameter;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186057239248", true), new _Quotations.QuotationClass_20().createNode(typeCheckingContext), _nodeToCheck_1029348928467, "incompatible type: snode expected", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186057239246", false, 0, intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_InsertNextSiblingOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
