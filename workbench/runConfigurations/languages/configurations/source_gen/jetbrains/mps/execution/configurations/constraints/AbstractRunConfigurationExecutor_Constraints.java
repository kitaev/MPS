package jetbrains.mps.execution.configurations.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AbstractRunConfigurationExecutor_Constraints extends ConstraintsDataHolder {
  public AbstractRunConfigurationExecutor_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.execution.configurations.structure.AbstractRunConfigurationExecutor";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("name", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        if (SLinkOperations.getTarget(node, "configuration", false) != null) {
          return SPropertyOperations.getString(SLinkOperations.getTarget(node, "configuration", false), "name") + " Executor";
        }
        return null;
      }
    });
    return result;
  }
}
