package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public class SequenceFeature_Constraints extends BaseConstraintsDescriptor {
  public SequenceFeature_Constraints() {
    super("jetbrains.mps.ypath.structure.SequenceFeature");
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
        //  this is a read only property 
      }
    });
    return properties;
  }
}
