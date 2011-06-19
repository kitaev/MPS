package jetbrains.mps.lang.sharedConcepts.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_node", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_scope"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 1:
        return new ConceptFunctionParameter_model_BehaviorDescriptor();
      case 3:
        return new ConceptFunctionParameter_operationContext_BehaviorDescriptor();
      case 4:
        return new ConceptFunctionParameter_scope_BehaviorDescriptor();
      case 0:
        return new ConceptFunctionParameter_editorContext_BehaviorDescriptor();
      case 2:
        return new ConceptFunctionParameter_node_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
