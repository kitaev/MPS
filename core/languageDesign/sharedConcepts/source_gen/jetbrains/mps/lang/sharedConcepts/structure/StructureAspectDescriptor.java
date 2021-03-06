package jetbrains.mps.lang.sharedConcepts.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_node", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext", "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_scope"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_node", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_scope", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
