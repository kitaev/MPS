package jetbrains.mps.xmlSchema.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Sequence_Behavior {

  public static void init(SNode thisNode) {
  }

  public static void virtual_checkElements_1213877382378(SNode thisNode, Set<SNode> elementDeclarations) {
    TypeExpressionList_Behavior.call_checkElements_1213877199094(SLinkOperations.getTarget(thisNode, "typeExpressionList", true), elementDeclarations);
  }

  public static boolean virtual_hasElementReferences_1213877382383(SNode thisNode) {
    return true;
  }

}
