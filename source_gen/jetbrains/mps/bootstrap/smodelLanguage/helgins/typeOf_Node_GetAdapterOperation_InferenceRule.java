package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS  */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Node_GetAdapterOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Node_GetAdapterOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    if(RulesUtil.checkAppliedCorrectly_generic(argument)) {
      SNode leftExpressionType = RulesUtil.typeOf_leftExpression(argument);
      // to do: type adapt to nodeType
      SNode leftExpressionTypeAsSNodeType = leftExpressionType;
      SNode concept = SLinkOperations.getTarget(leftExpressionTypeAsSNodeType, "concept", false);
      TypeChecker.getInstance().getRuntimeSupport().givetype(RulesUtil.get_AdapterClassType_for_Concept(concept), argument);
    } else 
    {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_64().createNode(), argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178287490356"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
