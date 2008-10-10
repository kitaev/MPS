package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TreePathType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return "treepath<" + BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "nodeType", true)) + ">";
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.ypath.structure.TreePathCreator", null);
    SLinkOperations.setTarget(creator, "treePathType", SNodeOperations.copyNode(thisNode), true);
    return creator;
  }

}
