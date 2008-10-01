package jetbrains.mps.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class StringLiteralRegexp_Behavior {
  public static Class[] PARAMETERS_1222431822198 = {SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    char[] chars = new char[]{'\\','(',')','}','{','[',']','+','*','?','|','^','.','$'};
    String text = SPropertyOperations.getString(thisNode, "text");
    for(int i = 0 ; i < chars.length ; i++ ) {
      text = text.replaceAll("\\" + chars[i], "\\\\\\\\" + chars[i]);
    }
    return text;
  }

  public static String call_getString_1222431822198(SNode thisNode, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getString_1222432436326", PARAMETERS_1222431822198, vars);
  }

  public static String callSuper_getString_1222431822198(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222431822198, vars);
  }

}
