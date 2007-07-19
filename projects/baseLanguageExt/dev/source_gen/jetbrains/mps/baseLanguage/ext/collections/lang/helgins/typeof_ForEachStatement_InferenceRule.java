package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ForEachStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ForEachStatement_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode variable = SLinkOperations.getTarget(argument, "variable", true);
    SNode inputSequence = SLinkOperations.getTarget(argument, "inputSequence", true);
    if((inputSequence != null) && (variable != null)) {
      SNode elementType_typevar_1184771826645 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(new QuotationClass_21().createNode(elementType_typevar_1184771826645), TypeChecker.getInstance().getRuntimeSupport().typeOf(inputSequence), inputSequence, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184772149777");
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(variable), elementType_typevar_1184771826645, variable, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1184772002733");
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
