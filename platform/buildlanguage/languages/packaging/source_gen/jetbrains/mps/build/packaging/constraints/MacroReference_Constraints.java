package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.build.packaging.behavior.IMacroHolder_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MacroReference_Constraints extends ConstraintsDataHolder {
  public MacroReference_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.build.packaging.structure.MacroReference";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("path", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        return IMacroHolder_Behavior.call_evaluateMacro_1234975967990(SNodeOperations.getAncestor(node, "jetbrains.mps.build.packaging.structure.Layout", false, true), SPropertyOperations.getString(node, "name"));
      }
    });
    return result;
  }
}
