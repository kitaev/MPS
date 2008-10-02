package jetbrains.mps.samples.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixIndexVariableDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_MatrixIndexVariableDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210248715900", true), new QuotationClass_10().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210248722055", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
