package jetbrains.mps.bash.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class BasedIntegerLiteral_Constraints extends BaseConstraintsDescriptor {
  public BasedIntegerLiteral_Constraints() {
    super("jetbrains.mps.bash.structure.BasedIntegerLiteral");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("base", new BasePropertyConstraintsDescriptor("base", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "base";
        return (SPropertyOperations.getInteger(propertyValue)) >= 2 && (SPropertyOperations.getInteger(propertyValue)) <= 64;
      }
    });
    return properties;
  }
}
