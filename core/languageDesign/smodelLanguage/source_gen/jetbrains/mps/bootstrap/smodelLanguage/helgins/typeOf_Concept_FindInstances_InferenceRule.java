package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.constraints.SNodeOperation_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Concept_FindInstances_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Concept_FindInstances_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    if(SLinkOperations.getTarget(node, "scope", true) != null) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(node, "scope", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061356670", true), new QuotationClass_66().createNode(), SLinkOperations.getTarget(node, "scope", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1182280010621");
    }
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(node);
    final SNode C_typevar_1186061393954 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061373207", true), new QuotationClass_67().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186061393954)), leftExpression, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061378772");
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711484278", true), new QuotationClass_68().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186061393954)), node, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711484276");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_FindInstances";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
