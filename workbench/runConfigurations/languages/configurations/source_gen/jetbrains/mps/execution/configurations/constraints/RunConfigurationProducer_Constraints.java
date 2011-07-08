package jetbrains.mps.execution.configurations.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.execution.configurations.behavior.RunConfigurationProducer_Behavior;

public class RunConfigurationProducer_Constraints extends BaseConstraintsDescriptor {
  public RunConfigurationProducer_Constraints() {
    super("jetbrains.mps.execution.configurations.structure.RunConfigurationProducer");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        return RunConfigurationProducer_Behavior.call_getDisplayedName_4366236229294143331(node);
      }
    });
    return properties;
  }
}
