package jetbrains.mps.bash.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class VariableNameDeclaration_BehaviorDescriptor extends LValue_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor {
  public VariableNameDeclaration_BehaviorDescriptor() {
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.bash.structure.VariableNameDeclaration";
  }
}
