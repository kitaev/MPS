package jetbrains.mpslite.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class LinePart_Behavior {
  private static Class[] PARAMETERS_1238593834306 = {SNode.class ,SNode.class ,SNode.class ,Map.class ,Map.class};

  public static void init(SNode thisNode) {
  }

  public static void virtual_fillConceptStructure_1238593834306(SNode thisNode, SNode templateBasedConcept, SNode concept, Map<SNode, SNode> conceptsToTargets, Map<SNode, SNode> linePartsToLinks) {
  }

  public static SNode call_createCellModel_1238614099938(SNode thisNode, SNode templateBasedConcept, Map<SNode, SNode> linePartsToLinks) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellModel_Error", null);
    SPropertyOperations.set(result, "text", "not implemented");
    return result;
  }

  public static void call_fillConceptStructure_1238593834306(SNode thisNode, SNode templateBasedConcept, SNode concept, Map<SNode, SNode> conceptsToTargets, Map<SNode, SNode> linePartsToLinks) {
    BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_fillConceptStructure_1238593834306", PARAMETERS_1238593834306, templateBasedConcept, concept, conceptsToTargets, linePartsToLinks);
  }

  public static void callSuper_fillConceptStructure_1238593834306(SNode thisNode, String callerConceptFqName, SNode templateBasedConcept, SNode concept, Map<SNode, SNode> conceptsToTargets, Map<SNode, SNode> linePartsToLinks) {
    BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_fillConceptStructure_1238593834306", PARAMETERS_1238593834306, templateBasedConcept, concept, conceptsToTargets, linePartsToLinks);
  }

}
