package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_LocalVariableReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_LocalVariableReference_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406407", true), typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "variable", false), "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406409", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406406", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.LocalVariableReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
