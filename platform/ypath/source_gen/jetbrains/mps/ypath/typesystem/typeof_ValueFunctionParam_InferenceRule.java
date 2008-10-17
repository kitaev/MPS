package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ValueFunctionParam_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ValueFunctionParam_InferenceRule() {
  }

  public void applyRule(final SNode value, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = value;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595255", true), SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(value, "jetbrains.mps.ypath.structure.TreePath", false, false), "treePathType", true), "nodeType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595250", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.ValueFunctionParam";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
