package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import java.util.Collections;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch ((conceptFqName).hashCode()) {
      case -1205517430:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.IFacet", new String[]{}, new String[]{}, new String[]{});
      case 141486335:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.FacetDeclaration", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.structure.IWillBeClassifier"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IWillBeClassifier", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 2113881325:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.TargetDeclaration", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 107334008:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.TargetDependency", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1240215536:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.FacetReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -584621039:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.ExtendsFacetReference", new String[]{"jetbrains.mps.make.facet.structure.FacetReference"}, new String[]{"jetbrains.mps.make.facet.structure.FacetReference"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1375745059:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.RelatedFacetReference", new String[]{"jetbrains.mps.make.facet.structure.FacetReference"}, new String[]{"jetbrains.mps.make.facet.structure.FacetReference"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1145966348:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.ParametersDeclaration", new String[]{"jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration"});
      case 84807153:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.LocalParametersExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 1983802428:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.LocalParametersComponentExpression", new String[]{"jetbrains.mps.baseLanguage.structure.DotExpression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.DotExpression"});
      case -1750433830:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.ForeignParametersExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -722923405:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.ForeignParametersComponentExpression", new String[]{"jetbrains.mps.baseLanguage.structure.DotExpression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.DotExpression"});
      case -871274826:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.ResourceTypeDeclaration", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 596111717:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.make.facet.structure.ResourceClassifierType", new String[]{"jetbrains.mps.baseLanguage.structure.ClassifierType"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ClassifierType"});
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
