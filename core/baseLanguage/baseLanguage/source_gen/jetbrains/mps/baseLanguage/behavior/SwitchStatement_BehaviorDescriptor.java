package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;

public class SwitchStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor {
  public SwitchStatement_BehaviorDescriptor() {
  }

  public void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    SwitchStatement_Behavior.virtual_collectUncaughtMethodThrowables_5412515780383134223(thisNode, throwables, ignoreMayBeThrowables);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.SwitchStatement";
  }
}
