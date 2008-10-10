package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathAdapterExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_TreePathAdapterExpression_InferenceRule() {
  }

  public void applyRule(final SNode exp) {
    final SNode ExpType_typevar_1190288659521 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = exp;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(exp, "expression", true), "r:1222075024810(jetbrains.mps.ypath.helgins)", "1190288685890", true), _nodeToCheck_1029348928467, null, "r:1222075024810(jetbrains.mps.ypath.helgins)", "1190288669877", intentionProvider);
    }
    {
      final SNode _representatorVar0 = TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar0, new Runnable() {

        public void run() {
          final SNode treePathType = SLinkOperations.getTarget(SLinkOperations.getTarget(exp, "treepathAspect", false), "treePathType", true);
          if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521), SLinkOperations.getTarget(treePathType, "nodeType", true)))) {
            TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(exp, "expression", true), "Incompatible type", "r:1222075024810(jetbrains.mps.ypath.helgins)", "1196166858319");
          }
          if ((SLinkOperations.getTarget(treePathType, "nodeType", true) != null)) {
            TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_0().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(ExpType_typevar_1190288659521)), exp, "r:1222075024810(jetbrains.mps.ypath.helgins)", "1196715484404");
          }
        }

      }, "r:1222075024810(jetbrains.mps.ypath.helgins)", "1190288695814");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathAdapterExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
