package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IEnhancedRunConfiguration_Behavior {
  private static Class[] PARAMETERS_3636700473138841189 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getAdditionalParameters_3636700473138841189(SNode thisNode) {
    return ListSequence.fromList(new LinkedList<SNode>());
  }

  public static List<SNode> call_getAdditionalParameters_3636700473138841189(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.IEnhancedRunConfiguration"), "virtual_getAdditionalParameters_3636700473138841189", PARAMETERS_3636700473138841189);
  }

  public static List<SNode> callSuper_getAdditionalParameters_3636700473138841189(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.IEnhancedRunConfiguration"), callerConceptFqName, "virtual_getAdditionalParameters_3636700473138841189", PARAMETERS_3636700473138841189);
  }
}
