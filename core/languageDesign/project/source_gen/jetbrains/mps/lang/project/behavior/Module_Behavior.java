package jetbrains.mps.lang.project.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Module_Behavior {
  private static Class[] PARAMETERS_6370754048397730432 = {SNode.class};
  private static Class[] PARAMETERS_6370754048397730452 = {SNode.class};
  private static Class[] PARAMETERS_9020561928507315628 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getFqName_1213877404258(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "namespace");
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "namespace");
  }

  public static String virtual_getModuleReference_9020561928507315628(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "uuid") + "(" + SPropertyOperations.getString(thisNode, "namespace") + ")";
  }

  public static String call_getFqName_6370754048397730432(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.project.structure.Module"), "virtual_getFqName_1213877404258", PARAMETERS_6370754048397730432);
  }

  public static String call_getPresentation_6370754048397730452(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.project.structure.Module"), "virtual_getPresentation_1213877396640", PARAMETERS_6370754048397730452);
  }

  public static String call_getModuleReference_9020561928507315628(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.project.structure.Module"), "virtual_getModuleReference_9020561928507315628", PARAMETERS_9020561928507315628);
  }

  public static String callSuper_getFqName_6370754048397730432(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.project.structure.Module"), callerConceptFqName, "virtual_getFqName_1213877404258", PARAMETERS_6370754048397730432);
  }

  public static String callSuper_getPresentation_6370754048397730452(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.project.structure.Module"), callerConceptFqName, "virtual_getPresentation_1213877396640", PARAMETERS_6370754048397730452);
  }

  public static String callSuper_getModuleReference_9020561928507315628(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.project.structure.Module"), callerConceptFqName, "virtual_getModuleReference_9020561928507315628", PARAMETERS_9020561928507315628);
  }
}
