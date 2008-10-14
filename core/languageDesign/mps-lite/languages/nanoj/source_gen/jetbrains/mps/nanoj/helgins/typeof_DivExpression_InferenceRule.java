package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_DivExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_DivExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "leftPart", true), "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406713", true), typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406718", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406711", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "rightPart", true), "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406722", true), typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406727", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406720", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.DivExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
