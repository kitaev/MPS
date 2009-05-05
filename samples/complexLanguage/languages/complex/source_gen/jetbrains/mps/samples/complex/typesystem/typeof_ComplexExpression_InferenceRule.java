package jetbrains.mps.samples.complex.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.samples.complex.typesystem._Quotations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ComplexExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ComplexExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong((SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "complexExpression", true), "r:00000000-0000-4000-0000-011c89590424(jetbrains.mps.samples.complex.typesystem)", "1196268989252", true), (SNode)new _Quotations.QuotationClass_0().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590424(jetbrains.mps.samples.complex.typesystem)", "1196268989250", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590424(jetbrains.mps.samples.complex.typesystem)", "1196267668258", true), (SNode)ListSequence.fromList(SLinkOperations.getConceptLinkTargets(nodeToCheck, "returnType")).first(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590424(jetbrains.mps.samples.complex.typesystem)", "1196267675385", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.samples.complex.structure.SingleComplexExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
