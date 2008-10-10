package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InvokeExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_InvokeExpression_InferenceRule() {
  }

  public void applyRule(final SNode invoke, final TypeCheckingContext typeCheckingContext) {
    final SNode cl = SNodeOperations.getAncestor(invoke, "jetbrains.mps.closures.structure.ClosureLiteral", false, false);
    if (!((cl != null))) {
      TypeChecker.getInstance().reportTypeError(invoke, "Must be within ClosureLiteral", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711581032");
    }
    {
      final SNode _representatorVar1 = TypeChecker.getInstance().getRuntimeSupport().typeOf(cl, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711625694", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar1, new Runnable() {

        public void run() {
          SNode ft = TypeChecker.getInstance().getRuntimeSupport().typeOf(cl, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711616632", true);
          {
            SNode _nodeToCheck_1029348928467 = invoke;
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(invoke, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711815333", true), SLinkOperations.getTarget(ft, "resultType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711813747", intentionProvider);
          }
          if (!(SLinkOperations.getCount(ft, "parameterType") == SLinkOperations.getCount(invoke, "parameter"))) {
            TypeChecker.getInstance().reportTypeError(invoke, "Wrong parameters number", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711857568");
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
                TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(p, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1202920161360", true), pt, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1202920161358", false, 0, intentionProvider);
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.closures.helgins)", "1199711624300");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.closures.structure.InvokeExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
