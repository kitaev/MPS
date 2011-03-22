package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TransactionPropertyHandler_oldValue_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TransactionPropertyHandler_oldValue_InferenceRule() {
  }

  public void applyRule(final SNode value, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode transactionalProperty = SNodeOperations.getAncestor(value, "jetbrains.mps.lang.editor.structure.CellModel_TransactionalProperty", false, false);
    {
      SNode _nodeToCheck_1029348928467 = value;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "2735767332089496685", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "2735767332089496682", true), (SNode) DataTypeDeclaration_Behavior.call_toBaseLanguageType_1213877229718(SLinkOperations.getTarget(SLinkOperations.getTarget(transactionalProperty, "property", false), "dataType", false)), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.editor.structure.TransactionPropertyHandler_oldValue";
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
