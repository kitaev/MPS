package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_Behavior;

public class Validator_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements TypeDerivable_BehaviorDescriptor {
  public Validator_BehaviorDescriptor() {
  }

  public SNode virtual_deriveType_4555537781928374706(SNode thisNode, SNode expression, SNode link) {
    return TypeDerivable_Behavior.virtual_deriveType_4555537781928374706(thisNode, expression, link);
  }

  public SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    return Validator_Behavior.virtual_deriveType_1213877435747(thisNode, expression);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.ui.structure.Validator";
  }
}
