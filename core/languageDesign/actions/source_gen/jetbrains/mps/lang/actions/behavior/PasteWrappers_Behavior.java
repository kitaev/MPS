package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class PasteWrappers_Behavior {
  private static Class[] PARAMETERS_5270353093116089917 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode nodeFactory : SLinkOperations.getTargets(thisNode, "wrapper", true)) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(nodeFactory, "sourceConcept", false));
    }
    return result;
  }

  public static List<SNode> call_getBaseConceptCollection_5270353093116089917(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.actions.structure.PasteWrappers"), "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_5270353093116089917);
  }

  public static List<SNode> callSuper_getBaseConceptCollection_5270353093116089917(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.actions.structure.PasteWrappers"), callerConceptFqName, "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_5270353093116089917);
  }
}
