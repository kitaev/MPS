package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Property_Constraints extends BaseConstraintsDescriptor {
  public Property_Constraints() {
    super("jetbrains.mps.baseLanguage.structure.Property");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("alias", new BasePropertyConstraintsDescriptor("alias", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "alias";
        return SPropertyOperations.getString(node, "propertyName");
      }
    });
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        return SPropertyOperations.getString(node, "propertyName");
      }
    });
    return properties;
  }
}
