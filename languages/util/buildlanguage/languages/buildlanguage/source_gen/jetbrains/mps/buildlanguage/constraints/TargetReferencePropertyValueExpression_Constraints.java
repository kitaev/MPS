package jetbrains.mps.buildlanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TargetReferencePropertyValueExpression_Constraints extends BaseConstraintsDescriptor {
  public TargetReferencePropertyValueExpression_Constraints() {
    super("jetbrains.mps.buildlanguage.structure.TargetReferencePropertyValueExpression");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("fullName", new BasePropertyConstraintsDescriptor("fullName", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "fullName";
        if ((SLinkOperations.getTarget(node, "declaration", false) == null)) {
          return null;
        }
        return SLinkOperations.getTarget(node, "declaration", false) + "@" + SNodeOperations.getAncestor(SLinkOperations.getTarget(node, "declaration", false), "jetbrains.mps.buildlanguage.structure.Project", false, true);
      }
    });
    return properties;
  }
}
