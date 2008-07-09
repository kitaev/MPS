package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyReference_InferenceRule implements InferenceRule_Runtime {

  public typeof_PropertyReference_InferenceRule() {
  }

  public void applyRule(final SNode propertyReference) {
    SNode property = SLinkOperations.getTarget(propertyReference, "property", false);
    if ((property != null)) {
      {
        SNode _nodeToCheck_1029348928467 = propertyReference;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215599145115", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(property, "jetbrains.mps.baseLanguage.helgins@5_0", "1215599145112", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215599145110");
      }
      {
        SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(propertyReference);
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215599145124", true), new QuotationClass_73().createNode(SNodeOperations.getAncestor(property, "jetbrains.mps.baseLanguage.structure.Classifier", false, false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215599145116", false, 0);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.PropertyReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
