package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class Order_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements OrderConstraints_BehaviorDescriptor, INamedConcept_BehaviorDescriptor {
  public Order_BehaviorDescriptor() {
  }

  public boolean virtual_presents_1499919975383879508(SNode thisNode, SNode tab) {
    return Order_Behavior.virtual_presents_1499919975383879508(thisNode, tab);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public SNode virtual_getOrder_3038738109029048953(SNode thisNode) {
    return Order_Behavior.virtual_getOrder_3038738109029048953(thisNode);
  }
}
