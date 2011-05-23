package jetbrains.mps.baseLanguageInternal.structure;

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
      case -1776008649:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalStaticMethodCall", new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"});
      case -748575031:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalStaticFieldReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1202134450:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression", new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"});
      case -181962325:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IOperation"});
      case -332116314:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalClassExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 1164317125:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalClassifierType", new String[]{"jetbrains.mps.baseLanguage.structure.ClassifierType"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ClassifierType"});
      case 1895497509:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalVariableReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1419340984:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalPartialFieldReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IOperation"});
      case -569834106:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.TypeHintExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 2121366688:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.InternalThisExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 1991186635:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1043226863:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.ILocalVariableElementList"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.ILocalVariableElementList"});
      case 2027888821:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListInnerExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.ILocalVariableElement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.ILocalVariableElement"});
      case -338199173:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1222117134:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression", new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"});
      case -971598052:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 525429288:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassCreator", new String[]{"jetbrains.mps.baseLanguage.structure.ClassCreator"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ClassCreator"});
      case 447898724:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassConcept", new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept"});
      case -1194740616:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantRefExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 484023672:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguageInternal.structure.WeakClassReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
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
