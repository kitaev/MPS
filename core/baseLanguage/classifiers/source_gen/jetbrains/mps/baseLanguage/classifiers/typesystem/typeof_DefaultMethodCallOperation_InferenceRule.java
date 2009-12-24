package jetbrains.mps.baseLanguage.classifiers.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_DefaultMethodCallOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_DefaultMethodCallOperation_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1205769679712", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1205769685435", true), (SNode) SLinkOperations.getTarget(SLinkOperations.getTarget(nodeToCheck, "member", false), "returnType", true), _info_12389875345);
    }
    {
      SNode parameter;
      SNode argument;
      Iterator<SNode> parameter_iterator = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeToCheck, "member", false), "parameter", true)).iterator();
      Iterator<SNode> argument_iterator = ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "actualArgument", true)).iterator();
      while (true) {
        if (!(parameter_iterator.hasNext())) {
          break;
        }
        if (!(argument_iterator.hasNext())) {
          break;
        }
        parameter = parameter_iterator.next();
        argument = argument_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = argument;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1205854571586", 0, intentionProvider);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1205854575356", true), (SNode) SLinkOperations.getTarget(parameter, "type", true), false, _info_12389875345);
        }
      }
    }
    if (SLinkOperations.getCount(SLinkOperations.getTarget(nodeToCheck, "member", false), "parameter") != SLinkOperations.getCount(nodeToCheck, "actualArgument")) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToCheck, "Number of parameters doesn't match", "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.typesystem)", "1205854659855", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
