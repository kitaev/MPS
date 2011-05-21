package jetbrains.mps.baseLanguage.classifiers.structure;

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
    int hash = conceptFqName.hashCode();
    if (hash == -1553485628) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable");
    }
    if (hash == -1984697667) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.IMember", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == 1392477911) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart");
    }
    if (hash == 1578447933) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IThisExpression");
    }
    if (hash == -573869166) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == -1002552714) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", "jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType");
    }
    if (hash == 98094890) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == 1785336861) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.IMember", "jetbrains.mps.baseLanguage.structure.IVisible");
    }
    if (hash == 975488652) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation");
    }
    if (hash == -661473956) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration", "jetbrains.mps.baseLanguage.structure.FieldDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.IMember");
    }
    if (hash == -987394235) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation");
    }
    if (hash == -1101238887) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.SuperClassifierExpresson", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 225062172) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier");
    }
    return null;
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private ImmutableSet<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String... parents) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, parents);
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

    private static ImmutableSet<String> getAncestors(String conceptFqName, String... parents) {
      List<String> result = new ArrayList();

      result.add(conceptFqName);
      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : parents) {
        result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
      }
      return ImmutableSet.copyOf(result);
    }
  }
}
