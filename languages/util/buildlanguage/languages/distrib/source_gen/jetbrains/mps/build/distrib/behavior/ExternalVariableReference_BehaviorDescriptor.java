package jetbrains.mps.build.distrib.behavior;

/*Generated by MPS */

import jetbrains.mps.buildlanguage.behavior.PropertyValueExpression_BehaviorDescriptor;
import jetbrains.mps.build.packaging.behavior.IStringExpression_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class ExternalVariableReference_BehaviorDescriptor extends PropertyValueExpression_BehaviorDescriptor implements IStringExpression_BehaviorDescriptor {
  public ExternalVariableReference_BehaviorDescriptor() {
  }

  public String virtual_getAntValue_8148924375507875982(SNode thisNode) {
    return ExternalVariableReference_Behavior.virtual_getAntValue_8148924375507875982(thisNode);
  }

  public String virtual_getActualValue_1213877472572(SNode thisNode) {
    return ExternalVariableReference_Behavior.virtual_getActualValue_1213877472572(thisNode);
  }

  public String virtual_getValue_1213877173054(SNode thisNode) {
    return ExternalVariableReference_Behavior.virtual_getValue_1213877173054(thisNode);
  }

  public String virtual_toString_1213877472569(SNode thisNode) {
    return ExternalVariableReference_Behavior.virtual_toString_1213877472569(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.build.distrib.structure.ExternalVariableReference";
  }
}
