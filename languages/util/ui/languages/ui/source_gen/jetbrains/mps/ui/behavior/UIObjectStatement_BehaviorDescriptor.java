package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Statement_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public abstract class UIObjectStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor {
  public UIObjectStatement_BehaviorDescriptor() {
  }

  public SNode virtual_expectedContextType_5197527271413889619(SNode thisNode, SNode belongsTo) {
    return UIObjectStatement_Behavior.virtual_expectedContextType_5197527271413889619(thisNode, belongsTo);
  }

  public boolean virtual_shouldReturnValue_7109250785404509292(SNode thisNode) {
    return UIObjectStatement_Behavior.virtual_shouldReturnValue_7109250785404509292(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.ui.structure.UIObjectStatement";
  }
}
