package jetbrains.mps.execution.commands.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ExplicitCommandParameterDeclaration_Behavior {
  private static Class[] PARAMETERS_856705193941282038 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_isRequired_856705193941282030(SNode thisNode) {
    return SPropertyOperations.getBoolean(thisNode, "isRequired");
  }

  public static boolean virtual_generateField_8478830098674441876(SNode thisNode) {
    return !(ExplicitCommandParameterDeclaration_Behavior.call_isRequired_856705193941282030(thisNode));
  }

  public static boolean virtual_isInitializable_1213877517488(SNode thisNode) {
    return !(ExplicitCommandParameterDeclaration_Behavior.call_isRequired_856705193941282030(thisNode));
  }

  public static boolean call_isInitializable_856705193941282038(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.ExplicitCommandParameterDeclaration"), "virtual_isInitializable_1213877517488", PARAMETERS_856705193941282038);
  }

  public static boolean callSuper_isInitializable_856705193941282038(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.ExplicitCommandParameterDeclaration"), callerConceptFqName, "virtual_isInitializable_1213877517488", PARAMETERS_856705193941282038);
  }
}
