package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class PredefinedSymbolClassRegexp_Behavior {
  public static Class[] PARAMETERS_1222433142247 = {SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return "\\" + SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "symbolClass", false), "name");
  }

  public static String call_getString_1222433142247(SNode thisNode, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getString_1222432436326", PARAMETERS_1222433142247, vars);
  }

  public static String callSuper_getString_1222433142247(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222433142247, vars);
  }

}
