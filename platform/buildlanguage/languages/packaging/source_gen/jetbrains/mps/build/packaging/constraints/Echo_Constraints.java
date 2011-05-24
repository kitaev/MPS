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
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;

public class Echo_Constraints extends ConstraintsDataHolder {
  public Echo_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.build.packaging.structure.Echo";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("name", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        if ((SLinkOperations.getTarget(node, "title", true) == null)) {
          return "";
        }
        return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(node, "title", true));
      }
    });
    return result;
  }
}
