package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ILayoutComponent_Behavior {
private    static Class[] PARAMETERS_1213877230696 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getPath_1213877230696(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getPath_1213877230696", PARAMETERS_1213877230696);
  }

  public static String callSuper_getPath_1213877230696(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getPath_1213877230696", PARAMETERS_1213877230696);
  }

}
