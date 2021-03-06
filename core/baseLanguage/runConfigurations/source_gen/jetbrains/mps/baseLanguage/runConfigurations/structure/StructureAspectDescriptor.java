package jetbrains.mps.baseLanguage.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.ComponentInsideOfChangeListenerAnnotation", "jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock", "jetbrains.mps.baseLanguage.runConfigurations.structure.IsApplicableBlock", "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaCheckBlock", "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaConfigurationRunParameters_FunctionParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeConfigurationEditorDeclaration", "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeRunConfiguration", "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration", "jetbrains.mps.baseLanguage.runConfigurations.structure.NodeRunConfigPropertyInstance", "jetbrains.mps.baseLanguage.runConfigurations.structure.Node_FunctionParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.OnChangeNodeBlock", "jetbrains.mps.baseLanguage.runConfigurations.structure.UserComponentReferenceAnnotation"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.ComponentInsideOfChangeListenerAnnotation", "jetbrains.mps.lang.core.structure.NodeAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter", null, true, new String[]{}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock", null, true, new String[]{}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IsApplicableBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaCheckBlock", "jetbrains.mps.lang.plugin.structure.AbstractCheckConfigBlock", false, new String[]{"jetbrains.mps.lang.plugin.structure.AbstractCheckConfigBlock"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaConfigurationRunParameters_FunctionParameter", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeConfigurationEditorDeclaration", "jetbrains.mps.lang.plugin.structure.ConfigurationEditorDeclaration", false, new String[]{"jetbrains.mps.lang.plugin.structure.ConfigurationEditorDeclaration"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeRunConfiguration", "jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration", false, new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration"}, new String[]{"generate"}, new String[]{"conceptDeclaration"});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration", "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, new String[]{"jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", "jetbrains.mps.lang.plugin.structure.IEnhancedRunConfiguration"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.NodeRunConfigPropertyInstance", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.plugin.structure.IRunConfigPropertyInstance"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.Node_FunctionParameter", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter"}, new String[]{}, new String[]{});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.OnChangeNodeBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.UserComponentReferenceAnnotation", "jetbrains.mps.lang.core.structure.NodeAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
