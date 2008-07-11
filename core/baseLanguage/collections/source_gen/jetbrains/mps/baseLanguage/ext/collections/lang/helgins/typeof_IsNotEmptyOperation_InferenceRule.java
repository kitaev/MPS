package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;

public class typeof_IsNotEmptyOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_IsNotEmptyOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    do {
      SNode matchedNode_2 = SNodeOperations.getParent(op, null, false, false);
      {
        boolean matches_4 = false;
        {
          SNode matchingNode_4 = SNodeOperations.getParent(op, null, false, false);
          if (matchingNode_4 != null) {
            matches_4 = SModelUtil_new.isAssignableConcept(matchingNode_4.getConceptFqName(), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression");
          }
        }
        if (matches_4) {
          TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_62().createNode(), op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1205249567352");
          break;
        }
      }
      {
        boolean matches_5 = false;
        {
          SNode matchingNode_5 = SNodeOperations.getParent(op, null, false, false);
          if (matchingNode_5 != null) {
            matches_5 = SModelUtil_new.isAssignableConcept(matchingNode_5.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.DotExpression");
          }
        }
        if (matches_5) {
          TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_34().createNode(), op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1178725705674");
          break;
        }
      }
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(op, "not expected here", "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709901570", intentionProvider);
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
