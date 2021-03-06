package jetbrains.mps.ui.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_Behavior;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_FunctionParameterDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_FunctionParameterDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode fpd, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.as(TypeDerivable_Behavior.call_deriveType_1213877435747(SNodeOperations.getAncestor(fpd, "jetbrains.mps.baseLanguage.structure.TypeDerivable", false, false), SNodeOperations.as(SNodeOperations.getParent(fpd), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral")), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "parameterType", true);
    {
      SNode _nodeToCheck_1029348928467 = fpd;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "5224413709453691456", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "5224413709453691453", true), (SNode) ListSequence.fromList(parms).getElement(SNodeOperations.getIndexInParent(fpd)), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ui.structure.FunctionParameterDeclaration";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }
}
