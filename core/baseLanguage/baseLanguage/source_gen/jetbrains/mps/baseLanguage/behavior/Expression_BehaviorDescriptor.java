package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;

public abstract class Expression_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor {
  public Expression_BehaviorDescriptor() {
  }

  public boolean virtual_isLegalAsStatement_1239211900844(SNode thisNode) {
    return Expression_Behavior.virtual_isLegalAsStatement_1239211900844(thisNode);
  }

  public Object virtual_getCompileTimeConstantValue_1238860310638(SNode thisNode, IModule module) {
    return Expression_Behavior.virtual_getCompileTimeConstantValue_1238860310638(thisNode, module);
  }

  public boolean virtual_isCompileTimeConstant_1238860258777(SNode thisNode) {
    return Expression_Behavior.virtual_isCompileTimeConstant_1238860258777(thisNode);
  }

  public boolean virtual_isLValue_1213877519786(SNode thisNode) {
    return Expression_Behavior.virtual_isLValue_1213877519786(thisNode);
  }

  public String virtual_getVariableExpectedName_1213877519781(SNode thisNode) {
    return Expression_Behavior.virtual_getVariableExpectedName_1213877519781(thisNode);
  }

  public Object virtual_eval_1213877519769(SNode thisNode, IModule module) {
    return Expression_Behavior.virtual_eval_1213877519769(thisNode, module);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.Expression";
  }
}
