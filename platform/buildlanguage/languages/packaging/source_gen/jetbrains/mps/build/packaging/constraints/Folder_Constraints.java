package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.packaging.behavior.Path_Behavior;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;

public class Folder_Constraints extends ConstraintsDataHolder {
  public Folder_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.build.packaging.structure.Folder";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("name", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        if ((SLinkOperations.getTarget(node, "sourcePath", true) != null) && ((SLinkOperations.getTarget(node, "title", true) == null))) {
          return Path_Behavior.call_getName_1221141245424(SLinkOperations.getTarget(node, "sourcePath", true));
        }
        if ((SLinkOperations.getTarget(node, "title", true) == null)) {
          return "";
        }
        return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(node, "title", true));
      }
    });
    return result;
  }
}
