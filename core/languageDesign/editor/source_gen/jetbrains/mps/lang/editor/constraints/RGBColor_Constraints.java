package jetbrains.mps.lang.editor.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyValidator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class RGBColor_Constraints extends ConstraintsDataHolder {
  public RGBColor_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.RGBColor";
  }

  public Map<String, INodePropertyValidator> getNodePropertyValidators() {
    HashMap<String, INodePropertyValidator> result = new HashMap<String, INodePropertyValidator>();
    result.put("value", new BaseNodePropertyValidator() {
      public boolean checkPropertyValue(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
        return SPropertyOperations.getString(node, "value") == null || (SPropertyOperations.getString(propertyValue)).matches("[0-9a-fA-Z]{1,6}");
      }
    });
    return result;
  }
}
