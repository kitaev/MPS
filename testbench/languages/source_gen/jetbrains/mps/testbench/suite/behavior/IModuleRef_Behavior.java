package jetbrains.mps.testbench.suite.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IModuleRef_Behavior {
  private static Class[] PARAMETERS_1280144168199513544 = {SNode.class};
  private static Class[] PARAMETERS_1280144168199745474 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static ModuleReference call_moduleReference_1280144168199513544(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (ModuleReference) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.testbench.suite.structure.IModuleRef"), "virtual_moduleReference_1280144168199513544", PARAMETERS_1280144168199513544);
  }

  public static String call_presentation_1280144168199745474(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.testbench.suite.structure.IModuleRef"), "virtual_presentation_1280144168199745474", PARAMETERS_1280144168199745474);
  }

  public static ModuleReference callSuper_moduleReference_1280144168199513544(SNode thisNode, String callerConceptFqName) {
    return (ModuleReference) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.testbench.suite.structure.IModuleRef"), callerConceptFqName, "virtual_moduleReference_1280144168199513544", PARAMETERS_1280144168199513544);
  }

  public static String callSuper_presentation_1280144168199745474(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.testbench.suite.structure.IModuleRef"), callerConceptFqName, "virtual_presentation_1280144168199745474", PARAMETERS_1280144168199745474);
  }
}
