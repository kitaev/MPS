package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TreeNodeKindProperty_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getClassName_1213877513203(SNode thisNode) {
    return SPropertyOperations.getString(SNodeOperations.getParent(thisNode), "name") + "_" + SPropertyOperations.getString(thisNode, "name") + "_Property";
  }

  public static String call_getFQClassName_1213877513221(SNode thisNode) {
    String packageName = SNodeOperations.getModel(thisNode).getModelDescriptor().getLongName();
    String outerClassName = SPropertyOperations.getString(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.ypath.structure.TreePathAspect", false, false), "name");
    String innerClassName = TreeNodeKindProperty_Behavior.call_getClassName_1213877513203(thisNode);
    return packageName + "!" + outerClassName + "." + innerClassName;
  }

}
