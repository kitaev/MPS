package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public class GenericFeature_Constraints extends BaseConstraintsDescriptor {
  public GenericFeature_Constraints() {
    super("jetbrains.mps.ypath.structure.GenericFeature");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("writable", new BasePropertyConstraintsDescriptor("writable", this) {
      @Override
      public boolean hasOwnSetter() {
        return true;
      }

      @Override
      public void setValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "writable";
        // nothing to do, it's a read-only property 
      }
    });
    return properties;
  }
}
