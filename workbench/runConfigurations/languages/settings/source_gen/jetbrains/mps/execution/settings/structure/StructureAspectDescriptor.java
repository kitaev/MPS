package jetbrains.mps.execution.settings.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.execution.settings.structure.ApplyTo_Function", "jetbrains.mps.execution.settings.structure.CheckProperitesOperation", "jetbrains.mps.execution.settings.structure.CheckProperties_Function", "jetbrains.mps.execution.settings.structure.Configuration_Parameter", "jetbrains.mps.execution.settings.structure.CreateEditor_Function", "jetbrains.mps.execution.settings.structure.Dispose_Function", "jetbrains.mps.execution.settings.structure.EditorExpression", "jetbrains.mps.execution.settings.structure.EditorOperationCall", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", "jetbrains.mps.execution.settings.structure.EditorPropertyDeclaration", "jetbrains.mps.execution.settings.structure.EditorPropertyReference", "jetbrains.mps.execution.settings.structure.GetEditorOperation", "jetbrains.mps.execution.settings.structure.IPersistentPropertyHolder", "jetbrains.mps.execution.settings.structure.PersistentConfiguration", "jetbrains.mps.execution.settings.structure.PersistentConfigurationAssistent", "jetbrains.mps.execution.settings.structure.PersistentConfigurationMethod", "jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplate", "jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplateInitializer", "jetbrains.mps.execution.settings.structure.PersistentConfigurationType", "jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration", "jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation", "jetbrains.mps.execution.settings.structure.ReportConfigurationErrorStatement", "jetbrains.mps.execution.settings.structure.ResetFrom_Function", "jetbrains.mps.execution.settings.structure.SettingsEditor", "jetbrains.mps.execution.settings.structure.SettingsEditorType", "jetbrains.mps.execution.settings.structure.TemplateParameter", "jetbrains.mps.execution.settings.structure.TemplateParameterReference", "jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.ApplyTo_Function", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", false, new String[]{"jetbrains.mps.execution.settings.structure.EditorOperationDeclaration"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.CheckProperitesOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation"}, new String[]{}, new String[]{"checkProperties"});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.CheckProperties_Function", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.baseLanguage.classifiers.structure.IMember"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.Configuration_Parameter", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.CreateEditor_Function", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", false, new String[]{"jetbrains.mps.execution.settings.structure.EditorOperationDeclaration"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.Dispose_Function", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", false, new String[]{"jetbrains.mps.execution.settings.structure.EditorOperationDeclaration"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.EditorExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"persistentPropertyDeclaration"});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.EditorOperationCall", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"editorOperationDeclaration"});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.EditorPropertyDeclaration", "jetbrains.mps.baseLanguage.structure.VariableDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.structure.VariableDeclaration"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.EditorPropertyReference", "jetbrains.mps.baseLanguage.structure.VariableReference", false, new String[]{"jetbrains.mps.baseLanguage.structure.VariableReference"}, new String[]{}, new String[]{"editorPropertyDeclaration"});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.GetEditorOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.IPersistentPropertyHolder", null, true, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentConfiguration", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.execution.settings.structure.IPersistentPropertyHolder", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.execution.common.structure.IGeneratedToClass"}, new String[]{}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentConfigurationAssistent", null, true, new String[]{}, new String[]{}, new String[]{"configuration"});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentConfigurationMethod", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration"}, new String[]{}, new String[]{});
      case 16:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplate", "jetbrains.mps.execution.settings.structure.PersistentConfiguration", false, new String[]{"jetbrains.mps.execution.settings.structure.PersistentConfiguration"}, new String[]{}, new String[]{});
      case 17:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplateInitializer", "jetbrains.mps.baseLanguage.structure.AbstractCreator", false, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"}, new String[]{}, new String[]{"template"});
      case 18:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentConfigurationType", "jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType", false, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType"}, new String[]{}, new String[]{"persistentConfiguration"});
      case 19:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration", "jetbrains.mps.baseLanguage.structure.VariableDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.structure.VariableDeclaration"}, new String[]{}, new String[]{});
      case 20:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"variableDeclaration"});
      case 21:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.ReportConfigurationErrorStatement", "jetbrains.mps.baseLanguage.structure.Statement", false, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{});
      case 22:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.ResetFrom_Function", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", false, new String[]{"jetbrains.mps.execution.settings.structure.EditorOperationDeclaration"}, new String[]{}, new String[]{});
      case 23:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.SettingsEditor", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 24:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.SettingsEditorType", "jetbrains.mps.baseLanguage.structure.Type", false, new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"configuration"});
      case 25:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.TemplateParameter", "jetbrains.mps.baseLanguage.structure.VariableDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.structure.VariableDeclaration"}, new String[]{}, new String[]{});
      case 26:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.TemplateParameterReference", "jetbrains.mps.baseLanguage.structure.VariableReference", false, new String[]{"jetbrains.mps.baseLanguage.structure.VariableReference"}, new String[]{}, new String[]{"constructorParameterDeclaration"});
      case 27:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType", "jetbrains.mps.execution.settings.structure.PersistentConfigurationType", false, new String[]{"jetbrains.mps.execution.settings.structure.PersistentConfigurationType"}, new String[]{}, new String[]{"template"});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
