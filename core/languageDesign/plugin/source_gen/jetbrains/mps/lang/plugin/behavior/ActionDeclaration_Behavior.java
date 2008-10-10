package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ActionDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_1213877371942(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Action";
  }

  public static String call_getGeneratedClassFQName_1213877371952(SNode thisNode) {
    return ((SModel)SNodeOperations.getModel(thisNode)).getLongName() + "." + ActionDeclaration_Behavior.call_getGeneratedName_1213877371942(thisNode);
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    SNode type = SConceptOperations.createNewNode("jetbrains.mps.lang.plugin.structure.ActionType", null);
    SLinkOperations.setTarget(type, "action", thisNode, false);
    return type;
  }

}
