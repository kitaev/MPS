package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InvokeExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_InvokeExpression_InferenceRule() {
  }

  public void applyRule(final SNode invoke) {
    final SNode cl = SNodeOperations.getAncestor(invoke, "jetbrains.mps.closures.structure.ClosureLiteral", false, false);
    if (!((cl != null))) {
      TypeChecker.getInstance().reportTypeError(invoke, "Must be within ClosureLiteral", "jetbrains.mps.closures.helgins", "1199711581032");
    }
    {
      final SNode _representatorVar1 = TypeChecker.getInstance().getRuntimeSupport().typeOf(cl, "jetbrains.mps.closures.helgins@5_0", "1215598000860", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar1, new Runnable() {

        public void run() {
          SNode ft = TypeChecker.getInstance().getRuntimeSupport().typeOf(cl, "jetbrains.mps.closures.helgins@5_0", "1215598000867", true);
          {
            SNode _nodeToCheck_1029348928467 = invoke;
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.closures.helgins@5_0", "1215598000871", true), SLinkOperations.getTarget(ft, "resultType", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.closures.helgins@5_0", "1215598000869");
          }
          if (!(SLinkOperations.getCount(ft, "parameterType") == SLinkOperations.getCount(invoke, "parameter"))) {
            TypeChecker.getInstance().reportTypeError(invoke, "Wrong parameters number", "jetbrains.mps.closures.helgins", "1199711857568");
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
                SNode _nodeToCheck_1029348928467 = p;
                TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.closures.helgins@5_0", "1215598000901", true), pt, _nodeToCheck_1029348928467, null, "jetbrains.mps.closures.helgins@5_0", "1215598000899", false, 0);
              }
            }
          }
        }

      }, "jetbrains.mps.closures.helgins", "1199711624300");
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
