package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.helgins.inference.TypeChecker;

public class typeof_IsEmptyOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_IsEmptyOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    SNode parent = SNodeOperations.getParent(op, null, false, false);
    do {
      SNode matchedNode_1178725705148 = parent;
      {
        boolean matches_1205249562568 = false;
        matches_1205249562568 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression");
        if(matches_1205249562568) {
          TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_61().createNode(), op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1205249562571");
          break;
        }
      }
      {
        boolean matches_1178725705150 = false;
        matches_1178725705150 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.DotExpression");
        if(matches_1178725705150) {
          TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_13().createNode(), op, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1178725705153");
          break;
        }
      }
      TypeChecker.getInstance().reportTypeError(op, "not expected here", "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1178725705159");
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsEmptyOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
