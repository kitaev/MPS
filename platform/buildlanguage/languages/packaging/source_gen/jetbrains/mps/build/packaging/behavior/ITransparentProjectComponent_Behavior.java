package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ITransparentProjectComponent_Behavior {
  private static Class[] PARAMETERS_1240564451382 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> call_getChildrenToDo_1240564451382(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent"), "virtual_getChildrenToDo_1240564451382", PARAMETERS_1240564451382);
  }

  public static List<SNode> callSuper_getChildrenToDo_1240564451382(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent"), callerConceptFqName, "virtual_getChildrenToDo_1240564451382", PARAMETERS_1240564451382);
  }
}
