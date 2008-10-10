package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MapRemoveOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_MapRemoveOperation_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    final SNode KEY_typevar_1207233776692 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    final SNode VALUE_typevar_1207233776693 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(nodeToCheck), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.ext.collections.lang.helgins)", "1207233776696", true), new QuotationClass_76().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(VALUE_typevar_1207233776693), TypeChecker.getInstance().getEquationManager().getRepresentator(KEY_typevar_1207233776692)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.ext.collections.lang.helgins)", "1207233776694", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "key", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.ext.collections.lang.helgins)", "1207233776715", true), TypeChecker.getInstance().getEquationManager().getRepresentator(KEY_typevar_1207233776692), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.ext.collections.lang.helgins)", "1207233776711", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.ext.collections.lang.helgins)", "1207233776690", true), TypeChecker.getInstance().getEquationManager().getRepresentator(KEY_typevar_1207233776692), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.ext.collections.lang.helgins)", "1207233776685", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapRemoveOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
