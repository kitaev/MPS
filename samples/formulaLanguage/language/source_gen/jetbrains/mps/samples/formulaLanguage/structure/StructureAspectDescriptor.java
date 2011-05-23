package jetbrains.mps.samples.formulaLanguage.structure;

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
      case -1019858176:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.Formula", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1613959870:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.Expression", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -644561538:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.Function", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 708846181:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.Reference", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1701655882:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.Constant", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -998262655:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.Operation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -2104864100:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.IntegerConstant", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Constant"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Constant", "jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1065354488:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.FloatingPointConstant", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Constant"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Constant", "jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1724184635:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.IfFunction", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Function"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Function"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -872490233:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.PlusOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1461782525:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.MinusOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -182827833:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.LessThanOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -34357199:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.MultOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1442054254:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.GreaterThanOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -275643397:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.StringConstant", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Constant"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Constant", "jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 120171510:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.AndOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -836543650:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.OrOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -956341246:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.EqualsOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -460077430:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.ParenthisizedExpression", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1274043151:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.NullConstant", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -2012121552:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.IsNullOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1152046714:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.formulaLanguage.structure.NotOperation", new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.samples.formulaLanguage.structure.Expression", "jetbrains.mps.samples.formulaLanguage.structure.Operation"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
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
