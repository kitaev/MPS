package jetbrains.mps.baseLanguage.regexp.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class FindMatchStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public FindMatchStatement_InferenceRule() {
  }

  public void applyRule(final SNode fm, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = fm;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(fm, "expr", true), "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.typesystem)", "1178179183657", true), (SNode)new _Quotations.QuotationClass_6().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.typesystem)", "1178179183656", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.regexp.structure.FindMatchStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
