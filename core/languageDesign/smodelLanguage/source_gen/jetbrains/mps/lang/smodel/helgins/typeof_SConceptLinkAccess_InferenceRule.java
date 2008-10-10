package jetbrains.mps.lang.smodel.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SConceptLinkAccess_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SConceptLinkAccess_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedCorrectly_generic(typeCheckingContext, op);
    final SNode conceptLinkDecl = SLinkOperations.getTarget(op, "conceptLinkDeclaration", false);
    if (conceptLinkDecl == null) {
      return;
    }
    final SNode Concept_typevar_1208191126316 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConceptOrInputConceptType(typeCheckingContext, op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1208191126316));
    {
      final SNode concreteConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1208191126316);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(concreteConcept, new Runnable() {

        public void run() {
          SNode declaringConcept = SNodeOperations.getParent(conceptLinkDecl);
          RulesUtil.checkAssignableConcept((SNode)TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept), declaringConcept, op, "operation is applied to wrong concept");
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1208191126321");
    }
    // ==========
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1203712042826", true), new QuotationClass_22().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(op, "conceptLinkDeclaration", false), "targetType", false)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1203712042824", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SConceptLinkAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
