package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AllConstant_Behavior {

  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "value", "" + Integer.MAX_VALUE);
  }

}
