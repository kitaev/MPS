package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ypath.behavior.VisitChildrenExpression_Behavior;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import java.util.List;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VisitChildrenExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public check_VisitChildrenExpression_InferenceRule() {
  }

  public void applyRule(final SNode visitChildrenExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    int actualCount = ListSequence.fromList(SLinkOperations.getTargets(visitChildrenExpression, "actualArgument", true)).count();
    SNode visitBlock = VisitChildrenExpression_Behavior.call_getEnclosingVisitNodesStatement_1213877259423(visitChildrenExpression);
    if (!((visitBlock != null))) {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(visitChildrenExpression, "visit children is unexpected here", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1180014856089", null, errorTarget);
    }
    List<SNode> parameters = SLinkOperations.getTargets(SLinkOperations.getTarget(visitBlock, "visitParameterDeclarationList", true), "visitParameterDeclaration", true);
    int expectedCount = ListSequence.fromList(parameters).count();
    if (!(actualCount == expectedCount)) {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(visitChildrenExpression, "wrong parameters number: expected " + expectedCount + " , actual " + actualCount, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1180014444793", null, errorTarget);
    }
    {
      SNode arg;
      SNode param;
      Iterator<SNode> arg_iterator = ListSequence.fromList(SLinkOperations.getTargets(visitChildrenExpression, "actualArgument", true)).iterator();
      Iterator<SNode> param_iterator = ListSequence.fromList(parameters).iterator();
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
          SNode _nodeToCheck_1029348928467 = arg;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1180014737422", 0, null);
          typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1180014730654", true), (SNode) typeCheckingContext.typeOf(param, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1180014739452", true), false, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.VisitChildrenExpression";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
