package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_UnaryMinus_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_UnaryMinus_InferenceRule() {
  }

  public void applyRule(final SNode minus, final TypeCheckingContext typeCheckingContext) {
    final SNode expressionType_typevar_7602524515424797598 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(minus, "expression", true);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(expressionType_typevar_7602524515424797598), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7602524515424797608", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7602524515424797603", intentionProvider);
    }
    {
      final SNode exType = typeCheckingContext.getEquationManager().getRepresentator(expressionType_typevar_7602524515424797598);
      typeCheckingContext.whenConcrete(exType, new Runnable() {
        public void run() {
          SNode type = typeCheckingContext.getOverloadedOperationType(minus, typeCheckingContext.getEquationManager().getRepresentator(exType), new _Quotations.QuotationClass_115().createNode(typeCheckingContext));
          if (type != null) {
            {
              SNode _nodeToCheck_1029348928467 = minus;
              BaseIntentionProvider intentionProvider = null;
              typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525541", true), (SNode)type, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525538", intentionProvider);
            }
          } else {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              typeCheckingContext.reportTypeError(minus, "- can't be applied to these operands.", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525553", intentionProvider, errorTarget);
            }
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3860149536565525509", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.UnaryMinus";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }
}
