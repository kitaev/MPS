package jetbrains.mps.execution.commands.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.ConceptRegistry;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch ((conceptFqName).hashCode()) {
      case 765900688:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandType", new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType"});
      case 2082581805:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandReferenceExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -102526088:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandParameterReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1755614617:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandParameterDeclaration", new String[]{"jetbrains.mps.baseLanguage.structure.VariableDeclaration"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.VariableDeclaration"});
      case 757971008:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandParameterAssignment", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1372404663:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandMethod", new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration"});
      case 1884250212:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandDeclaration", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.execution.common.structure.IGeneratedToClass"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.execution.common.structure.IGeneratedToClass", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 1115859376:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandDebuggerOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1539140605:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.CommandBuilderExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 1283902600:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.BuilderBlockStatement", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -61891901:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.BuilderParameter", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case 176886297:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.ReportExecutionError", new String[]{"jetbrains.mps.execution.commands.structure.ReportErrorStatement"}, new String[]{"jetbrains.mps.execution.commands.structure.ReportErrorStatement"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 1989889168:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.ReportErrorStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -79711690:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1126180519:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.ProcessBuilderExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -359839791:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.ProcessBuilderKeyPart", new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart"}, new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1602293620:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.ProcessBuilderPart", new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart"}, new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1865300812:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.ProcessType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 214110698:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.execution.commands.structure.RedirectOutputExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      default:
        return null;
    }
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private ImmutableSet<String> ancestors;

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

    private static ImmutableSet<String> getAncestors(String conceptFqName, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      ArrayList<String> result = new ArrayList(ancestorsInLanguage.length + 1);

      for (String ancestor : ancestorsInLanguage) {
        result.add(ancestor);
      }

      result.add(conceptFqName);
      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : ancestorsNotInLanguage) {
        result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
      }
      return ImmutableSet.copyOf(result);
    }
  }
}
