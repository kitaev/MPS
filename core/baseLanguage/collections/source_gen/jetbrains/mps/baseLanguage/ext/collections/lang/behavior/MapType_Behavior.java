package jetbrains.mps.baseLanguage.ext.collections.lang.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MapType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return "map<" + BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "keyType", true)) + "," + BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "valueType", true)) + ">";
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode mapCreator = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.ext.collections.lang.structure.HashMapCreator", null);
    SLinkOperations.setTarget(mapCreator, "keyType", SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "keyType", true)), true);
    SLinkOperations.setTarget(mapCreator, "valueType", SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "valueType", true)), true);
    return mapCreator;
  }

}
