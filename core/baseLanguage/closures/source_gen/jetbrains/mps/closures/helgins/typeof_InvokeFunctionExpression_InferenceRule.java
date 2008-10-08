package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InvokeFunctionExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_InvokeFunctionExpression_InferenceRule() {
  }

  public void applyRule(final SNode invoke, final TypeCheckingContext typeCheckingContext) {
    SNode Domains = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.helgins.structure.RuntimeListVariable", null);
    final SNode Range_typevar_1223471463815 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(invoke, "function", true), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1223471463828", true), new QuotationClass_8().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(Range_typevar_1223471463815), Domains), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1223471463817", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = invoke;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(invoke, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1223471463834", true), TypeChecker.getInstance().getEquationManager().getRepresentator(Range_typevar_1223471463815), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1223471463830", intentionProvider);
    }
    {
      final SNode _representatorVar0 = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(invoke, "function", true), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199567116884", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar0, new Runnable() {

        public void run() {
          SNode ft = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(invoke, "function", true), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199567532549", true);
          if (!(SLinkOperations.getCount(ft, "parameterType") == SLinkOperations.getCount(invoke, "parameter"))) {
            TypeChecker.getInstance().reportTypeError(invoke, "Wrong parameters number", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199568419784");
          }
          {
            SNode pt;
            SNode p;
            Iterator<SNode> pt_iterator = SLinkOperations.getTargets(ft, "parameterType", true).iterator();
            Iterator<SNode> p_iterator = SLinkOperations.getTargets(invoke, "parameter", true).iterator();
            while (true) {
              if (!(pt_iterator.hasNext())) {
                break;
              }
              if (!(p_iterator.hasNext())) {
                break;
              }
              pt = pt_iterator.next();
              p = p_iterator.next();
              {
                SNode _nodeToCheck_1029348928467 = invoke;
                BaseIntentionProvider intentionProvider = null;
                TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(p, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1202920138888", true), pt, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1202920135673", false, 0, intentionProvider);
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199567113016");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.closures.structure.InvokeFunctionExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
