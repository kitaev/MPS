package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class FromNToMTimesRegexp_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222867684394(SNode thisNode, List<SNode> vars) {
    return Regexp_Behavior.call_par_1222433790846(thisNode, Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(thisNode, "regexp", true), vars)) + "{" + SPropertyOperations.getInteger(thisNode, "n") + "," + SPropertyOperations.getInteger(thisNode, "m") + "}";
  }

}
