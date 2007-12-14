package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InstanceMethodCall_InferenceRule implements InferenceRule_Runtime {

  public  typeof_InstanceMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    if(SequenceOperations.getSize(SLinkOperations.getTargets(argument, "parameter", true)) != SequenceOperations.getSize(SLinkOperations.getTargets(SLinkOperations.getTarget(argument, "method", false), "parameter", true))) {
      TypeChecker.getInstance().reportTypeError(argument, "Wrong parameters number", "jetbrains.mps.nanoj.helgins", "1197638406572");
      return;
    }
    List<SNode> params = SLinkOperations.getTargets(SLinkOperations.getTarget(argument, "method", false), "parameter", true);
    List<SNode> arguments = SLinkOperations.getTargets(argument, "parameter", true);
    for(int i = 0 ; i < SequenceOperations.getSize(params) ; i = i + 1) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(ListOperations.getElement(arguments, i), "jetbrains.mps.nanoj.helgins", "1197638406622", true), SLinkOperations.getTarget(ListOperations.getElement(params, i), "type", true), ListOperations.getElement(arguments, i), null, "jetbrains.mps.nanoj.helgins", "1197638406620");
    }
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197638406635", true), SLinkOperations.getTarget(SLinkOperations.getTarget(argument, "method", false), "type", true), argument, null, "jetbrains.mps.nanoj.helgins", "1197638406634");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.InstanceMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
