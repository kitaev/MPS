package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class PropertyImplementation_Behavior {
  private static Class[] PARAMETERS_1213877430658 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_hasSetter_1213877430658(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.PropertyImplementation"), "virtual_hasSetter_1213877430658", PARAMETERS_1213877430658);
  }

  public static boolean callSuper_hasSetter_1213877430658(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.PropertyImplementation"), callerConceptFqName, "virtual_hasSetter_1213877430658", PARAMETERS_1213877430658);
  }
}
