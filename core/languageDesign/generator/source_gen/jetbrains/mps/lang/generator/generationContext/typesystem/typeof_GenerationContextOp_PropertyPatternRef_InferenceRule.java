package jetbrains.mps.lang.generator.generationContext.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GenerationContextOp_PropertyPatternRef_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_GenerationContextOp_PropertyPatternRef_InferenceRule() {
  }

  public void applyRule(final SNode generationContextOp_PropertyPatternRef, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = generationContextOp_PropertyPatternRef;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902f1(jetbrains.mps.lang.generator.generationContext.typesystem)", "1758784108619321952", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902f1(jetbrains.mps.lang.generator.generationContext.typesystem)", "1758784108619321959", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(generationContextOp_PropertyPatternRef, "propertyPatternVar", false), "r:00000000-0000-4000-0000-011c895902f1(jetbrains.mps.lang.generator.generationContext.typesystem)", "1758784108619321954", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_PropertyPatternRef";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
