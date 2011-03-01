package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class list_covariant_with_extends_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public list_covariant_with_extends_InequationReplacementRule() {
  }

  public boolean isApplicableCustom(SNode subtype, SNode supertype) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(supertype, "elementType", true), "jetbrains.mps.baseLanguage.structure.UpperBoundType");
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status) {
    {
      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "5562883592575036766", 0, intentionProvider);
      _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
      _info_12389875345.setInequationGroup("");
      typeCheckingContext.createLessThanInequation((SNode) SLinkOperations.getTarget(subtype, "elementType", true), (SNode) SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(supertype, "elementType", true), "jetbrains.mps.baseLanguage.structure.UpperBoundType"), "bound", true), false, _info_12389875345);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status) {
    boolean result_14532009 = true;
    result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) SLinkOperations.getTarget(subtype, "elementType", true), (SNode) SLinkOperations.getTarget(SNodeOperations.as(SLinkOperations.getTarget(supertype, "elementType", true), "jetbrains.mps.baseLanguage.structure.UpperBoundType"), "bound", true), true);
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableSubtypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSupertypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ListType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ListType";
  }
}
