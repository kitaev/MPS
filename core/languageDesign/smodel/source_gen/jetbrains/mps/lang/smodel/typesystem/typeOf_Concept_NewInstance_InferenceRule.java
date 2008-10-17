package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Concept_NewInstance_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_Concept_NewInstance_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(node, "prototypeNode", true) != null) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(node, "prototypeNode", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186061176339", true), new _Quotations.QuotationClass_70().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1181950211367", false, 0, intentionProvider);
      }
    }
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(node);
    {
      final SNode LeftType = typeCheckingContext.typeOf(leftExpression, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207688101928", false);
      typeCheckingContext.whenConcrete(LeftType, new Runnable() {

        public void run() {
          {
            IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType");
            SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(LeftType), pattern_0, typeCheckingContext);
            if (coercedNode_0 != null) {
              {
                SNode _nodeToCheck_1029348928467 = node;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation(typeCheckingContext.typeOf(node, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207688101919", true), new _Quotations.QuotationClass_71().createNode(SLinkOperations.getTarget(coercedNode_0, "conceptDeclaraton", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207688101917", intentionProvider);
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207688101911");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Concept_NewInstance";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
