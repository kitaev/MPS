package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class any_type_supertypeof_nulltype_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public any_type_supertypeof_nulltype_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(supertype, "jetbrains.mps.baseLanguage.structure.PrimitiveType") || SNodeOperations.isInstanceOf(supertype, "jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeDescriptor")) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "null type is not a subtype of primitive type", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1215774901982", intentionProvider, errorTarget);
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    if (SNodeOperations.isInstanceOf(supertype, "jetbrains.mps.baseLanguage.structure.PrimitiveType") || SNodeOperations.isInstanceOf(supertype, "jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeDescriptor")) {
      result_14532009 = false;
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicableSubtype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
  }

  public boolean isApplicableSupertype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.NullType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }
}
