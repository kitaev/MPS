package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DefaultSetAccessor_Behavior {
  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "visibility", "jetbrains.mps.baseLanguage.structure.PrivateVisibility");
  }
}
