package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GetIteratorOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_GetIteratorOperation_InferenceRule() {
  }

  public void applyRule(final SNode iterator, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1237470428123 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(iterator);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237470396562", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237470398548", true), (SNode) new _Quotations.QuotationClass_101().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1237470428123), typeCheckingContext), false, _info_12389875345);
    }
    do {
      SNode matchedNode_2 = typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(iterator), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152232529", true);
      {
        boolean matches_2 = false;
        {
          SNode matchingNode_2 = typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(iterator), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152232529", true);
          if (matchingNode_2 != null) {
            matches_2 = SModelUtil_new.isAssignableConcept(matchingNode_2.getConceptFqName(), "jetbrains.mps.baseLanguage.collections.structure.ListType");
          }
        }
        if (matches_2) {
          {
            SNode _nodeToCheck_1029348928467 = iterator;
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152280223", 0, intentionProvider);
            typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152280231", true), (SNode) new _Quotations.QuotationClass_122().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1237470428123), typeCheckingContext), _info_12389875345);
          }
          break;
        }
      }
      {
        boolean matches_3 = false;
        {
          SNode matchingNode_3 = typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(iterator), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152232529", true);
          if (matchingNode_3 != null) {
            matches_3 = SModelUtil_new.isAssignableConcept(matchingNode_3.getConceptFqName(), "jetbrains.mps.baseLanguage.collections.structure.SetType");
          }
        }
        if (matches_3) {
          {
            SNode _nodeToCheck_1029348928467 = iterator;
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152294406", 0, intentionProvider);
            typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152294414", true), (SNode) new _Quotations.QuotationClass_123().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1237470428123), typeCheckingContext), _info_12389875345);
          }
          break;
        }
      }
      {
        SNode _nodeToCheck_1029348928467 = iterator;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152278173", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240152278181", true), (SNode) new _Quotations.QuotationClass_121().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1237470428123), typeCheckingContext), _info_12389875345);
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
