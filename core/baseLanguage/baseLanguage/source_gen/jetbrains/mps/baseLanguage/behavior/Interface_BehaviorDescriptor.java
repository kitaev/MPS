package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.traceable.behavior.UnitConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.Set;

public class Interface_BehaviorDescriptor extends Classifier_BehaviorDescriptor implements IBLDeprecatable_BehaviorDescriptor, UnitConcept_BehaviorDescriptor {
  public Interface_BehaviorDescriptor() {
  }

  public boolean virtual_isDeprecated_1224609060727(SNode thisNode) {
    return IBLDeprecatable_Behavior.virtual_isDeprecated_1224609060727(thisNode);
  }

  public boolean virtual_isDescendant_checkLoops_7165541881557222950(SNode thisNode, SNode nodeToCompare, Set<SNode> visited) {
    return Interface_Behavior.virtual_isDescendant_checkLoops_7165541881557222950(thisNode, nodeToCompare, visited);
  }

  public String virtual_getUnitName_5067982036267369911(SNode thisNode) {
    return Interface_Behavior.virtual_getUnitName_5067982036267369911(thisNode);
  }

  public String virtual_getMessage_1225207468592(SNode thisNode) {
    return IBLDeprecatable_Behavior.virtual_getMessage_1225207468592(thisNode);
  }

  public boolean virtual_checkLoops_3980490811621705349(SNode thisNode, Set<SNode> visited) {
    return Interface_Behavior.virtual_checkLoops_3980490811621705349(thisNode, visited);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }
}
