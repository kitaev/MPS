package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;

public class LocalInstanceMethodCall_BehaviorDescriptor extends BaseMethodCall_BehaviorDescriptor {
  public LocalInstanceMethodCall_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    return LocalInstanceMethodCall_Behavior.virtual_getAvailableMethodDeclarations_5776618742611315379(thisNode, methodName);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall";
  }
}
