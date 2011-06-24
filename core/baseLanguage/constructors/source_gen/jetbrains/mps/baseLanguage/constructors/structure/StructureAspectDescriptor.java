package jetbrains.mps.baseLanguage.constructors.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause", "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorContainer", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorUsage", "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause", "jetbrains.mps.baseLanguage.constructors.structure.ListCustomParameter", "jetbrains.mps.baseLanguage.constructors.structure.ListParameterReference"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause", "jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause", false, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"description", "separator", "leftParenthesis", "rightParenthesis"}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorContainer", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"parameter"});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorUsage", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"customConstructor"});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause", "jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause", false, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ListCustomParameter", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter", false, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ListParameterReference", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference", false, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
