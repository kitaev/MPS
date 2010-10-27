package jetbrains.mps.lang.plugin.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PrepareReturnType_FunctionParameter_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PrepareReturnType_FunctionParameter_InferenceRule() {
  }

  public void applyRule(final SNode prepareReturnType_FunctionParameter, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode runConfigurationDeclaration = SNodeOperations.getAncestor(prepareReturnType_FunctionParameter, "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, false);
    if ((runConfigurationDeclaration != null) && (SLinkOperations.getTarget(runConfigurationDeclaration, "prepareBlock", true) != null)) {
      {
        SNode _nodeToCheck_1029348928467 = runConfigurationDeclaration;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "9017024590937198742", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "9017024590937198739", true), (SNode) SLinkOperations.getTarget(SLinkOperations.getTarget(runConfigurationDeclaration, "prepareBlock", true), "retrunTypeParameter", true), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.plugin.structure.PrepareReturnType_FunctionParameter";
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
