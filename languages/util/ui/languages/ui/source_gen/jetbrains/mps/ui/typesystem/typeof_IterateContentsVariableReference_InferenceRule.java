package jetbrains.mps.ui.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_IterateContentsVariableReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_IterateContentsVariableReference_InferenceRule() {
  }

  public void applyRule(final SNode icvarref, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = icvarref;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "2459884175397939353", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "2459884175397939350", true), (SNode) typeCheckingContext.typeOf(SLinkOperations.getTarget(icvarref, "variable", false), "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "2459884175397939358", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ui.structure.IterateContentsVariableReference";
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
