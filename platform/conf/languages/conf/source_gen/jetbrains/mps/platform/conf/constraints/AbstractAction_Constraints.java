package jetbrains.mps.platform.conf.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class AbstractAction_Constraints extends ConstraintsDataHolder {
  public AbstractAction_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.platform.conf.structure.AbstractAction";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("resolveInfo", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        String id = node.getProperty("id");
        id = (id == null ?
          node.getId() :
          id
        );
        return SConceptPropertyOperations.getString(node, "alias") + "$" + (id).replace('.', '-');

      }
    });
    return result;
  }
}
