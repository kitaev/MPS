package jetbrains.mps.build.generictasks.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class AttributeDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, IMember_BehaviorDescriptor {
  public AttributeDeclaration_BehaviorDescriptor() {
  }

  public SNode virtual_createOperation_1213877353000(SNode thisNode) {
    return IMember_Behavior.virtual_createOperation_1213877353000(thisNode);
  }

  public boolean virtual_canBeReferent_8179323502814657526(SNode thisNode, SNode referentConcept) {
    return IMember_Behavior.virtual_canBeReferent_8179323502814657526(thisNode, referentConcept);
  }

  public boolean virtual_canOperationBeChild_4593153787954614840(SNode thisNode, SNode parentNode) {
    return IMember_Behavior.virtual_canOperationBeChild_4593153787954614840(thisNode, parentNode);
  }

  public SNode virtual_getVisiblity_1213877352965(SNode thisNode) {
    return IMember_Behavior.virtual_getVisiblity_1213877352965(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public SNode virtual_getOperationConcept_1213877352972(SNode thisNode) {
    return IMember_Behavior.virtual_getOperationConcept_1213877352972(thisNode);
  }
}
