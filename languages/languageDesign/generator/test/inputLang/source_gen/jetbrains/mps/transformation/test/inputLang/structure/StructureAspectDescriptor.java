package jetbrains.mps.transformation.test.inputLang.structure;

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
      case -918625170:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.InputRoot", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -918744690:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.InputNode", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 1849618896:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.InputNode_A", new String[]{"jetbrains.mps.transformation.test.inputLang.structure.InputNode"}, new String[]{"jetbrains.mps.transformation.test.inputLang.structure.InputNode"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 1849618897:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.InputNode_B", new String[]{"jetbrains.mps.transformation.test.inputLang.structure.InputNode_A"}, new String[]{"jetbrains.mps.transformation.test.inputLang.structure.InputNode", "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 1849618898:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.InputNode_C", new String[]{"jetbrains.mps.transformation.test.inputLang.structure.InputNode_B"}, new String[]{"jetbrains.mps.transformation.test.inputLang.structure.InputNode", "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A", "jetbrains.mps.transformation.test.inputLang.structure.InputNode_B"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 260868253:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.ExpressionToReduceToStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 780367033:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.transformation.test.inputLang.structure.InputRootWithStatementList", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
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
