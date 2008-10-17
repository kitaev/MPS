package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TreePathCreator_InferenceRule() {
  }

  public void applyRule(final SNode tpCreator, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = tpCreator;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(tpCreator, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184578650091", true), SLinkOperations.getTarget(tpCreator, "treePathType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184578650090", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
