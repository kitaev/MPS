package jetbrains.mps.baseLanguage.dates.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_WithPropertyCompareExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_WithPropertyCompareExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "1239808503999", true), (SNode)new _Quotations.QuotationClass_53().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "1239808508190", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SLinkOperations.getTarget(expression, "operation", true), "leftExpression", true);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "5600029375248457529", true), (SNode)new _Quotations.QuotationClass_122().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "5600029375248457527", true, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SLinkOperations.getTarget(expression, "operation", true), "rightExpression", true);
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "5600029375248457540", true), (SNode)new _Quotations.QuotationClass_123().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "5600029375248457538", true, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
