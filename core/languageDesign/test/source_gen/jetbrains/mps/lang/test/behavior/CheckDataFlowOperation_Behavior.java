package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.lang.reflect.Method;

public class CheckDataFlowOperation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void virtual_perform_1215601182156(SNode thisNode, SNode node) {
    try {
      Class<?> cls = Class.forName("jetbrains.mps.lang.test.runtime.SubtreeChecker");
      Method meth = cls.getMethod("checkDataFlow", SNode.class);
      meth.invoke(null, node);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static String virtual_getName_1217435265700(SNode thisNode) {
    return "DataFlow";
  }
}
