package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NewExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_NewExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    SNode ct = SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.ClassifierType", null);
    SLinkOperations.setTarget(ct, "classifier", SNodeOperations.getParent(SLinkOperations.getTarget(nodeToCheck, "constructor", false), null, false, false), false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.nanoj.helgins", "1197638406461", true), ct, nodeToCheck, null, "jetbrains.mps.nanoj.helgins", "1197638406460");
    if (SequenceOperations.getSize(SLinkOperations.getTargets(nodeToCheck, "parameter", true)) != SequenceOperations.getSize(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeToCheck, "constructor", false), "parameter", true))) {
      TypeChecker.getInstance().reportTypeError(nodeToCheck, "Wrong parameters number", "jetbrains.mps.nanoj.helgins", "1197638406466");
      return;
    }
    List<SNode> args = SLinkOperations.getTargets(nodeToCheck, "parameter", true);
    List<SNode> params = SLinkOperations.getTargets(SLinkOperations.getTarget(nodeToCheck, "constructor", false), "parameter", true);
    for(int i = 0 ; i < SequenceOperations.getSize(SLinkOperations.getTargets(nodeToCheck, "parameter", true)) ; i = i + 1) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(ListOperations.getElement(args, i), "jetbrains.mps.nanoj.helgins", "1197638406518", true), SLinkOperations.getTarget(ListOperations.getElement(params, i), "type", true), ListOperations.getElement(args, i), null, "jetbrains.mps.nanoj.helgins", "1197638406516", false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.NewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
