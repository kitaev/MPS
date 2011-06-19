package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import java.util.Collections;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.Antcall", "jetbrains.mps.build.packaging.structure.BaseDirPath", "jetbrains.mps.build.packaging.structure.Block", "jetbrains.mps.build.packaging.structure.BlockReference", "jetbrains.mps.build.packaging.structure.BuildLanguageTargetReference", "jetbrains.mps.build.packaging.structure.ComponentsList", "jetbrains.mps.build.packaging.structure.CompositePathComponent", "jetbrains.mps.build.packaging.structure.CompositeString", "jetbrains.mps.build.packaging.structure.Configuration", "jetbrains.mps.build.packaging.structure.ConfigurationReference", "jetbrains.mps.build.packaging.structure.Copy", "jetbrains.mps.build.packaging.structure.Delete", "jetbrains.mps.build.packaging.structure.Echo", "jetbrains.mps.build.packaging.structure.File", "jetbrains.mps.build.packaging.structure.FileExistsCondition", "jetbrains.mps.build.packaging.structure.Folder", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent", "jetbrains.mps.build.packaging.structure.ICondition", "jetbrains.mps.build.packaging.structure.ILayoutComponent", "jetbrains.mps.build.packaging.structure.IMacroHolder", "jetbrains.mps.build.packaging.structure.INotBuildableComponent", "jetbrains.mps.build.packaging.structure.IPath", "jetbrains.mps.build.packaging.structure.IStringExpression", "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent", "jetbrains.mps.build.packaging.structure.IVariableHolder", "jetbrains.mps.build.packaging.structure.Jar", "jetbrains.mps.build.packaging.structure.Layout", "jetbrains.mps.build.packaging.structure.MPSLayoutConfigurationReferencePropertyValueExpression", "jetbrains.mps.build.packaging.structure.Macro", "jetbrains.mps.build.packaging.structure.MacroReference", "jetbrains.mps.build.packaging.structure.Manifest", "jetbrains.mps.build.packaging.structure.ManifestAttribute", "jetbrains.mps.build.packaging.structure.Module", "jetbrains.mps.build.packaging.structure.ModuleCycle", "jetbrains.mps.build.packaging.structure.ModuleCycleReference", "jetbrains.mps.build.packaging.structure.NewModuleReference", "jetbrains.mps.build.packaging.structure.NonExistingPath", "jetbrains.mps.build.packaging.structure.NotCondition", "jetbrains.mps.build.packaging.structure.Pair", "jetbrains.mps.build.packaging.structure.Path", "jetbrains.mps.build.packaging.structure.PathComponent", "jetbrains.mps.build.packaging.structure.PathHolder", "jetbrains.mps.build.packaging.structure.Plugin", "jetbrains.mps.build.packaging.structure.PostProcessingTask", "jetbrains.mps.build.packaging.structure.PropertiesImport", "jetbrains.mps.build.packaging.structure.PropertyFileImport", "jetbrains.mps.build.packaging.structure.PropertyNodeImport", "jetbrains.mps.build.packaging.structure.Replace", "jetbrains.mps.build.packaging.structure.SimpleString", "jetbrains.mps.build.packaging.structure.Space", "jetbrains.mps.build.packaging.structure.Variable", "jetbrains.mps.build.packaging.structure.VariableReference", "jetbrains.mps.build.packaging.structure.Zip"};

  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.AbstractProjectComponent", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 1:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Antcall", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 2:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.BaseDirPath", new String[]{"jetbrains.mps.build.packaging.structure.Path"}, new String[]{"jetbrains.mps.build.packaging.structure.IPath", "jetbrains.mps.build.packaging.structure.Path"}, new String[]{"jetbrains.mps.buildlanguage.structure.PropertyValueExpression"});
      case 3:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Block", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.build.packaging.structure.IMacroHolder", "jetbrains.mps.build.packaging.structure.IVariableHolder"}, new String[]{"jetbrains.mps.build.packaging.structure.IMacroHolder", "jetbrains.mps.build.packaging.structure.IVariableHolder"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 4:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.BlockReference", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 5:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.BuildLanguageTargetReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 6:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ComponentsList", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 7:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.CompositePathComponent", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 8:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.CompositeString", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 9:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Configuration", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 10:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ConfigurationReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 11:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Copy", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 12:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Delete", new String[]{"jetbrains.mps.build.packaging.structure.PostProcessingTask"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.PostProcessingTask"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 13:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Echo", new String[]{"jetbrains.mps.build.packaging.structure.File"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.File"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 14:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.File", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 15:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.FileExistsCondition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.ICondition"}, new String[]{"jetbrains.mps.build.packaging.structure.ICondition"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 16:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Folder", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 17:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"});
      case 18:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ICompositeComponent", new String[]{"jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"});
      case 19:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ICondition", new String[]{}, new String[]{}, new String[]{});
      case 20:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ILayoutComponent", new String[]{"jetbrains.mps.build.packaging.structure.IMacroHolder"}, new String[]{"jetbrains.mps.build.packaging.structure.IMacroHolder"}, new String[]{});
      case 21:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.IMacroHolder", new String[]{}, new String[]{}, new String[]{});
      case 22:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.INotBuildableComponent", new String[]{}, new String[]{}, new String[]{});
      case 23:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.IPath", new String[]{}, new String[]{}, new String[]{});
      case 24:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.IStringExpression", new String[]{}, new String[]{}, new String[]{});
      case 25:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ITransparentProjectComponent", new String[]{}, new String[]{}, new String[]{});
      case 26:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.IVariableHolder", new String[]{}, new String[]{}, new String[]{});
      case 27:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Jar", new String[]{"jetbrains.mps.build.packaging.structure.Zip"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent", "jetbrains.mps.build.packaging.structure.Zip"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 28:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Layout", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.ILayoutComponent", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.build.packaging.structure.IVariableHolder", "jetbrains.mps.build.packaging.structure.IMacroHolder", "jetbrains.mps.buildlanguage.structure.IAntScript"}, new String[]{"jetbrains.mps.build.packaging.structure.ILayoutComponent", "jetbrains.mps.build.packaging.structure.IMacroHolder", "jetbrains.mps.build.packaging.structure.IVariableHolder"}, new String[]{"jetbrains.mps.buildlanguage.structure.IAntScript", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 29:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.MPSLayoutConfigurationReferencePropertyValueExpression", new String[]{"jetbrains.mps.buildlanguage.structure.PropertyValueExpression"}, new String[]{}, new String[]{"jetbrains.mps.buildlanguage.structure.PropertyValueExpression"});
      case 30:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Macro", new String[]{"jetbrains.mps.buildlanguage.structure.PropertyDeclaration", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.buildlanguage.structure.PropertyDeclaration", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 31:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.MacroReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 32:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Manifest", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 33:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ManifestAttribute", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 34:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Module", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 35:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ModuleCycle", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 36:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.ModuleCycleReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 37:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.NewModuleReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 38:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.NonExistingPath", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.IPath"}, new String[]{"jetbrains.mps.build.packaging.structure.IPath"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 39:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.NotCondition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.ICondition"}, new String[]{"jetbrains.mps.build.packaging.structure.ICondition"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 40:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Pair", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 41:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Path", new String[]{"jetbrains.mps.buildlanguage.structure.PropertyValueExpression", "jetbrains.mps.build.packaging.structure.IPath"}, new String[]{"jetbrains.mps.build.packaging.structure.IPath"}, new String[]{"jetbrains.mps.buildlanguage.structure.PropertyValueExpression"});
      case 42:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.PathComponent", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 43:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.PathHolder", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 44:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Plugin", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 45:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.PostProcessingTask", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 46:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.PropertiesImport", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 47:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.PropertyFileImport", new String[]{"jetbrains.mps.build.packaging.structure.PropertiesImport"}, new String[]{"jetbrains.mps.build.packaging.structure.PropertiesImport"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 48:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.PropertyNodeImport", new String[]{"jetbrains.mps.build.packaging.structure.PropertiesImport"}, new String[]{"jetbrains.mps.build.packaging.structure.PropertiesImport"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 49:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Replace", new String[]{"jetbrains.mps.build.packaging.structure.File"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.File"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 50:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.SimpleString", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 51:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Space", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 52:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Variable", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 53:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.VariableReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.build.packaging.structure.IStringExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 54:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.build.packaging.structure.Zip", new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent"}, new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      default:
        return null;
    }
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private Set<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String[] parents, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, ancestorsInLanguage, ancestorsNotInLanguage);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static Set<String> getAncestors(String conceptFqName, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      Set<String> result = new HashSet(ancestorsInLanguage.length + 1);

      result.add(conceptFqName);
      for (String ancestor : ancestorsInLanguage) {
        result.add(ancestor);
      }

      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : ancestorsNotInLanguage) {
        if (!(result.contains(parent))) {
          result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
        }
      }

      return Collections.unmodifiableSet(result);
    }
  }
}
