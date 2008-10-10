package jetbrains.mps.lang.pattern.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AsPattern_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AsPattern_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202491120336", true), new QuotationClass_5().createNode(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(nodeToCheck))), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202491123370", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.pattern.structure.AsPattern";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
