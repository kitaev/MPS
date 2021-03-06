package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IAbstractCompositeComponent_Behavior {
  private static Class[] PARAMETERS_1237389224202 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getChildrenTargetDir_1237389224202(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent"), "virtual_getChildrenTargetDir_1237389224202", PARAMETERS_1237389224202);
  }

  public static String callSuper_getChildrenTargetDir_1237389224202(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent"), callerConceptFqName, "virtual_getChildrenTargetDir_1237389224202", PARAMETERS_1237389224202);
  }
}
