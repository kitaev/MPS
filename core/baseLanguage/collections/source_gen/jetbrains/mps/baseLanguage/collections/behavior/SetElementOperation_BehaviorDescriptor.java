package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public class SetElementOperation_BehaviorDescriptor extends SequenceOperation_BehaviorDescriptor implements IListOperation_BehaviorDescriptor {
  public SetElementOperation_BehaviorDescriptor() {
  }

  public SNode virtual_expectedOperandType_2141797557973018589(SNode thisNode, SNode elementType) {
    return IContainerOperation_Behavior.virtual_expectedOperandType_2141797557973018589(thisNode, elementType);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SetElementOperation";
  }
}
