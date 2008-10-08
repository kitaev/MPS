package jetbrains.mps.baseLanguage.classifiers.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.classifiers.behavior.ThisClassifierExpresson_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ThisClassifierExpresson_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ThisClassifierExpresson_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode classifier = ThisClassifierExpresson_Behavior.call_getClassifier_1213877512819(nodeToCheck);
    if (classifier != null) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.helgins)", "1205753197519", true), IClassifier_Behavior.call_createType_1213877527970(classifier), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.helgins)", "1205753196184", intentionProvider);
      }
    } else
    {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(nodeToCheck, "this classifier expression isn't applicable in this place", "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.helgins)", "1205753211126", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
