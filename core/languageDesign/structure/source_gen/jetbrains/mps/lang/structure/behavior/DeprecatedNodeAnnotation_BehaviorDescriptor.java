package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.NodeAttribute_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class DeprecatedNodeAnnotation_BehaviorDescriptor extends NodeAttribute_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor {
  public DeprecatedNodeAnnotation_BehaviorDescriptor() {
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation";
  }
}
