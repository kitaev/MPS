package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class MappingConfiguration_Behavior {
  private static Class[] PARAMETERS_8360039740498071265 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getMembers_1213877531970(SNode thisNode) {
    List<SNode> members = new ArrayList<SNode>();
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "rootMappingRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "weavingMappingRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "reductionMappingRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "createRootRule", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "preMappingScript", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "postMappingScript", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "mappingLabel", true)));
    return members;
  }

  public static List<SNode> virtual_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode mapConfChild : SNodeOperations.getChildren(thisNode)) {
      if (SNodeOperations.isInstanceOf(mapConfChild, "jetbrains.mps.lang.generator.structure.BaseMappingRule")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(mapConfChild, "jetbrains.mps.lang.generator.structure.BaseMappingRule"), "applicableConcept", false));
      } else if (SNodeOperations.isInstanceOf(mapConfChild, "jetbrains.mps.lang.generator.structure.DropRootRule")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(mapConfChild, "jetbrains.mps.lang.generator.structure.DropRootRule"), "applicableConcept", false));
      }
    }
    return result;
  }

  public static List<SNode> call_getBaseConceptCollection_8360039740498071265(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.MappingConfiguration"), "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_8360039740498071265);
  }

  public static List<SNode> callSuper_getBaseConceptCollection_8360039740498071265(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.MappingConfiguration"), callerConceptFqName, "virtual_getBaseConceptCollection_5270353093116013036", PARAMETERS_8360039740498071265);
  }
}
