package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class PathComponent_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getFullPath_1220977780435(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "path");
  }

}
