package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetNewChildOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Link_SetNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedTo_LinkAccess_aggregation(op);
    final SNode Concept_typevar_1206099875685 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099875685));
    {
      final SNode concreteConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099875685);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(concreteConcept, new Runnable() {

        public void run() {
          SNode resultConcept = null;
          SNode parameterConcept = SLinkOperations.getTarget(op, "concept", false);
          if (parameterConcept == null) {
            resultConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept);
          } else
          {
            resultConcept = parameterConcept;
            if (!(SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept))))) {
              TypeChecker.getInstance().reportTypeError(op, SPropertyOperations.getString(parameterConcept, "name") + " is not sub-concept of " + SPropertyOperations.getString(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept), "name"), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205442304609");
            }
          }
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205442304627", true), new QuotationClass_69().createNode(resultConcept), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205442304625");
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205442246000");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
