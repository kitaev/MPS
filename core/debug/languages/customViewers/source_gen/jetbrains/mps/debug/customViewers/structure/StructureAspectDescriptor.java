package jetbrains.mps.debug.customViewers.structure;

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
      case 385455873:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ValueType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case -1266363140:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ArrayValueType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case -1840125438:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ObjectValueType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case -413293266:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.PrimitiveValueType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 1596457070:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.CustomWatchable", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -1554117572:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.CustomWatchablesContainer", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -979047827:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.CustomViewer", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -423315143:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.WatchableType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 924295629:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.WatchableCreator", new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"});
      case -902504040:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.GetWatchablesBlock_ConceptFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -214302830:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.OriginalValue_ConceptFunctionParameter", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -1566379162:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.FieldsListOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1136979095:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.FieldOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1553631659:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ElementOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -173829120:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.GetValuePresentation_ConceptFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -811022110:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.CanWrapValue_ConceptFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -1729275250:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ClassNameOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1759524093:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ClassFqNameOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 343760412:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.SizeOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 717792793:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.AllElementsOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 929781387:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ElementsRangeOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -2122334594:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.CallMethodOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -896987198:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.JavaValueOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1817147760:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.StringValueType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 1881791729:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.StringValueOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -2116950617:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.IsInstanceOfOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 817968827:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 2113227254:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.GetHighLevelValuePresentation_ConceptFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -1941463794:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.GetHighLevelWatchablesBlock_ConceptFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case 711558688:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.CanWrapHighLevelValue_ConceptFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case 1061219375:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.HighLevelValue_ConceptFunctionParameter", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -411494629:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.HighLevelWatchableCreator", new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"});
      case 1020490266:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.WatchablesListCreator", new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"});
      case -1886369929:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.WatchableListType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case -463695957:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.customViewers.structure.ToProcessMethod", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
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
