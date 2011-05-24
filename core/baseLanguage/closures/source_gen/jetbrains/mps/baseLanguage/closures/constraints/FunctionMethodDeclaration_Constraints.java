package jetbrains.mps.baseLanguage.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public class FunctionMethodDeclaration_Constraints extends ConstraintsDataHolder {
  public FunctionMethodDeclaration_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionMethodDeclaration";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("name", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        return "invoke";
      }
    });
    result.put("isAbstract", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        return false;
      }
    });
    return result;
  }
}
