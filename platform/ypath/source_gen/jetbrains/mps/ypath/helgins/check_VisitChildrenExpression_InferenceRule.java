package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ypath.behavior.VisitChildrenExpression_Behavior;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VisitChildrenExpression_InferenceRule implements InferenceRule_Runtime {

  public check_VisitChildrenExpression_InferenceRule() {
  }

  public void applyRule(final SNode visitChildrenExpression) {
    int actualCount = SLinkOperations.getCount(visitChildrenExpression, "actualArgument");
    SNode visitBlock = VisitChildrenExpression_Behavior.call_getEnclosingVisitNodesStatement_1213877259423(visitChildrenExpression);
    if (!((visitBlock != null))) {
      TypeChecker.getInstance().reportTypeError(visitChildrenExpression, "visit children is unexpected here", "jetbrains.mps.ypath.helgins", "1180014856089");
    }
    List<SNode> parameters = SLinkOperations.getTargets(SLinkOperations.getTarget(visitBlock, "visitParameterDeclarationList", true), "visitParameterDeclaration", true);
    int expectedCount = ListSequence.fromList(parameters).count();
    if (!(actualCount == expectedCount)) {
      TypeChecker.getInstance().reportTypeError(visitChildrenExpression, "wrong parameters number: expected " + expectedCount + " , actual " + actualCount, "jetbrains.mps.ypath.helgins", "1180014444793");
    }
    {
      SNode arg;
      SNode param;
      Iterator<SNode> arg_iterator = SLinkOperations.getTargets(visitChildrenExpression, "actualArgument", true).iterator();
      Iterator<SNode> param_iterator = parameters.iterator();
      while (true) {
        if (!(arg_iterator.hasNext())) {
          break;
        }
        if (!(param_iterator.hasNext())) {
          break;
        }
        arg = arg_iterator.next();
        param = param_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = visitChildrenExpression;
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(arg, "jetbrains.mps.ypath.helgins", "1180014730654", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(param, "jetbrains.mps.ypath.helgins", "1180014739452", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.ypath.helgins", "1180014737422", false, 0, intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.VisitChildrenExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
