package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CellMenuPart_ReplaceChild_Group_Query_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode hostMenuPart = SNodeOperations.getParent(thisNode);
    SNode parameterObjectType = SLinkOperations.getTarget(hostMenuPart, "parameterObjectType", true);
    if (parameterObjectType == null) {
      return new QuotationClass_1().createNode();
    }
    return SNodeOperations.copyNode(new QuotationClass_2().createNode(parameterObjectType));
  }

}
