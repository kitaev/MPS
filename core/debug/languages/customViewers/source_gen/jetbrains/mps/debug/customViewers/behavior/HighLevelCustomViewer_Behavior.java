package jetbrains.mps.debug.customViewers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class HighLevelCustomViewer_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getValueTypeCopy_43370322128260022(SNode thisNode) {
    return SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "valueType", true));
  }

  public static String call_getClassName_7570572250661284600(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name") + "_WrapperFactory";
  }

  public static String call_getClassFqName_7570572250661287362(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + HighLevelCustomViewer_Behavior.call_getClassName_7570572250661284600(thisNode);
  }
}
