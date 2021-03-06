package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class OrderReference_Behavior {
  private static Class[] PARAMETERS_1499919975383980893 = {SNode.class, SNode.class};
  private static Class[] PARAMETERS_3038738109029048964 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_presents_1499919975383879508(SNode thisNode, SNode tab) {
    return OrderConstraints_Behavior.call_presents_1499919975383879508(SLinkOperations.getTarget(thisNode, "order", false), tab);
  }

  public static SNode virtual_getOrder_3038738109029048953(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "order", false);
  }

  public static boolean call_presents_1499919975383980893(SNode thisNode, SNode tab) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.OrderReference"), "virtual_presents_1499919975383879508", PARAMETERS_1499919975383980893, tab);
  }

  public static SNode call_getOrder_3038738109029048964(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.OrderReference"), "virtual_getOrder_3038738109029048953", PARAMETERS_3038738109029048964);
  }

  public static boolean callSuper_presents_1499919975383980893(SNode thisNode, String callerConceptFqName, SNode tab) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.OrderReference"), callerConceptFqName, "virtual_presents_1499919975383879508", PARAMETERS_1499919975383980893, tab);
  }

  public static SNode callSuper_getOrder_3038738109029048964(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.OrderReference"), callerConceptFqName, "virtual_getOrder_3038738109029048953", PARAMETERS_3038738109029048964);
  }
}
