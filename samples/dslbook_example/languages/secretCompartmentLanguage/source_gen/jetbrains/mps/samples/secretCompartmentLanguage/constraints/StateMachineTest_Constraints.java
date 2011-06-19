package jetbrains.mps.samples.secretCompartmentLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public class StateMachineTest_Constraints extends BaseConstraintsDescriptor {
  public StateMachineTest_Constraints() {
    super("jetbrains.mps.samples.secretCompartmentLanguage.structure.StateMachineTest");
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
        return StateMachineTest_Behavior.call_getStateMachineName_1197251245696(node) + " State Machine Test";
      }
    });
    return properties;
  }
}
