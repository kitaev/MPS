package jetbrains.mps.ui.modeling.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class LayoutConstraintType_Behavior {
  private static Class[] PARAMETERS_5572604531249685429 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return SConceptPropertyOperations.getString(thisNode, "alias") + "<" + (((SLinkOperations.getTarget(thisNode, "constraintConcept", false) != null) ?
      SConceptPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "constraintConcept", false), "alias") :
      ""
    )) + ">";
  }

  public static String call_getPresentation_5572604531249685429(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.LayoutConstraintType"), "virtual_getPresentation_1213877396640", PARAMETERS_5572604531249685429);
  }

  public static String callSuper_getPresentation_5572604531249685429(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.LayoutConstraintType"), callerConceptFqName, "virtual_getPresentation_1213877396640", PARAMETERS_5572604531249685429);
  }
}
