package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SConceptLinkAccess_InferenceRule implements InferenceRule_Runtime {

  public typeof_SConceptLinkAccess_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    final SNode conceptLinkDecl = SLinkOperations.getTarget(op, "conceptLinkDeclaration", false);
    if (conceptLinkDecl == null) {
      return;
    }
    final SNode Concept_typevar_1208191126316 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConceptOrInputConceptType(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1208191126316));
    {
      final SNode concreteConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1208191126316);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(concreteConcept, new Runnable() {

        public void run() {
          SNode declaringConcept = SNodeOperations.getParent(conceptLinkDecl, null, false, false);
          RulesUtil.checkAssignableConcept((SNode)TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept), declaringConcept, op, "operation is applied to wrong concept");
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1208191126321");
    }
    // ==========
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712042826", true), new QuotationClass_22().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(op, "conceptLinkDeclaration", false), "targetType", false)), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712042824");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
