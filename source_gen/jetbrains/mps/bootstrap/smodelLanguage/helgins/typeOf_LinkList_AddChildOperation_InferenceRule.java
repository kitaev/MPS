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

public class typeOf_LinkList_AddChildOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_LinkList_AddChildOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    if(RulesUtil.checkAppliedTo_LinkListAccess_aggregation(argument)) {
      SNode parameter = SLinkOperations.getTarget(argument, "parameter", true);
      if((parameter != null)) {
        SNode parmType = TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(parameter);
        if(!((parmType != null))) {
          TypeChecker.getInstance().reportTypeError(parameter, "no type");
        }
        SNode expectedType = RulesUtil.get_typeOfTarget_from_LinkOrLinkListAccess(RulesUtil.leftExpression(argument));
        if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(parmType, expectedType))) {
          TypeChecker.getInstance().reportTypeError(parameter, "incompatible type\nexpected: " + expectedType + "\nwas: " + parmType);
        }
      }
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.bootstrap.smodelLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1178156073878"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
