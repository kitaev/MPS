package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_LinkList_AddNewChildOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_LinkList_AddNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    SNode resultConcept = null;
    if(RulesUtil.checkAppliedTo_LinkListAccess_aggregation(node)) {
      SNode expectedConcept = RulesUtil.get_inputNodeConcept(node);
      SNode parameterConcept = SLinkOperations.getTarget(node, "concept", false);
      if(parameterConcept == null) {
        resultConcept = expectedConcept;
      } else
      {
        resultConcept = parameterConcept;
        if(!(SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(expectedConcept)))) {
          TypeChecker.getInstance().reportTypeError(node, SPropertyOperations.getString(parameterConcept, "name") + " is not sub-concept of " + SPropertyOperations.getString(expectedConcept, "name"), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1194374844329");
        }
      }
    }
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711948298", true), new QuotationClass_47().createNode(resultConcept), node, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711948296");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
