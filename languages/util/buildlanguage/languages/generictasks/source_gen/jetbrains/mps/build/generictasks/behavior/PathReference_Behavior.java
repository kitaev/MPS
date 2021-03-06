package jetbrains.mps.build.generictasks.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.buildlanguage.behavior.PropertyValueExpression_Behavior;

public class PathReference_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_toString_1213877472569(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "call", false) == null)) {
      return "";
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "call", false), "name");
  }

  public static List<String> virtual_getPaths_1213877276955(SNode thisNode) {
    return PathReference_Behavior.call_getPaths_353793545802854909(thisNode, SLinkOperations.getTarget(thisNode, "call", false));
  }

  public static List<String> call_getPaths_353793545802854909(SNode thisNode, SNode call) {
    List<String> list = ListSequence.fromList(new ArrayList<String>());
    String attName = "path";
    if ((call != null)) {
      String path = TaskCall_Behavior.call_getAttributeValue_353793545802643859(call, attName);
      if (path != null) {
        ListSequence.fromList(list).addElement(path);
      }
      for (SNode nested : ListSequence.fromList(SLinkOperations.getTargets(call, "nested", true))) {
        if (SNodeOperations.isInstanceOf(nested, "jetbrains.mps.build.generictasks.structure.TaskCall")) {
          SNode ngeneric = SNodeOperations.cast(nested, "jetbrains.mps.build.generictasks.structure.TaskCall");
          if ((SLinkOperations.getTarget(ngeneric, "declaration", false) != null) && SPropertyOperations.getString(SLinkOperations.getTarget(ngeneric, "declaration", false), "name").equals("path")) {
            ListSequence.fromList(list).addSequence(ListSequence.fromList(PathReference_Behavior.call_getPaths_353793545802854909(thisNode, ngeneric)));
          }
        }
      }
    }
    return list;
  }

  public static String virtual_getActualValue_1213877472572(SNode thisNode) {
    return PropertyValueExpression_Behavior.call_toString_1213877472569(thisNode);
  }
}
