package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;

public class SortedSetType_BehaviorDescriptor extends SetType_BehaviorDescriptor {
  public SortedSetType_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getAbstractCreators_7602110602933317830(SNode thisNode, SModel targetModel) {
    return SortedSetType_Behavior.virtual_getAbstractCreators_7602110602933317830(thisNode, targetModel);
  }

  public SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return SortedSetType_Behavior.virtual_getClassExpression_1213877337357(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SortedSetType";
  }
}
