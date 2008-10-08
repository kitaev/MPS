package jetbrains.mps.baseLanguage.classifiers.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.classifiers.behavior.BaseClassifierType_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_IMemberOperation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_IMemberOperation_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      final SNode operandType = TypeChecker.getInstance().getRuntimeSupport().typeOf(IOperation_Behavior.call_getOperand_1213877410070(nodeToCheck), "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.helgins)", "1205921836720", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(operandType, new Runnable() {

        public void run() {
          {
            IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType");
            SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(operandType), pattern_0);
            if (coercedNode_0 != null) {
              if (!(ListSequence.fromList(BaseClassifierType_Behavior.call_getMembers_1213877402148(coercedNode_0, nodeToCheck)).contains(SLinkOperations.getTarget(nodeToCheck, "member", false)))) {
                {
                  BaseIntentionProvider intentionProvider = null;
                  TypeChecker.getInstance().reportTypeError(nodeToCheck, "Declaration is out of scope", "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.helgins)", "1205921883388", intentionProvider);
                }
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c89590371(jetbrains.mps.baseLanguage.classifiers.helgins)", "1205921833059");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
