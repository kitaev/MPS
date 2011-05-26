package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class CellModel_URL_Behavior {
  private static Class[] PARAMETERS_3696012239575646497 = {SNode.class};
  private static Class[] PARAMETERS_3696012239575646509 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getRoleForCell_1216377898846(SNode thisNode) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "relationDeclaration", false), "name");
  }

  public static String virtual_getOpeningText_1220339714057(SNode thisNode) {
    return "{";
  }

  public static String virtual_getClosingText_1220339738643(SNode thisNode) {
    return "}";
  }

  public static String call_getOpeningText_3696012239575646497(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellModel_URL"), "virtual_getOpeningText_1220339714057", PARAMETERS_3696012239575646497);
  }

  public static String call_getClosingText_3696012239575646509(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellModel_URL"), "virtual_getClosingText_1220339738643", PARAMETERS_3696012239575646509);
  }

  public static String callSuper_getOpeningText_3696012239575646497(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellModel_URL"), callerConceptFqName, "virtual_getOpeningText_1220339714057", PARAMETERS_3696012239575646497);
  }

  public static String callSuper_getClosingText_3696012239575646509(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellModel_URL"), callerConceptFqName, "virtual_getClosingText_1220339738643", PARAMETERS_3696012239575646509);
  }
}
