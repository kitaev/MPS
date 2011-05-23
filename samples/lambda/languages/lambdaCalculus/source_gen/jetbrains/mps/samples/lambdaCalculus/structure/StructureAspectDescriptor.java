package jetbrains.mps.samples.lambdaCalculus.structure;

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
      case 1687922204:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -106727006:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LambdaAbstraction", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 598926277:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.AbstractionVariable", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.Variable", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.Variable"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -1527043470:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.StringConstant", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1778472404:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.NumericConstant", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -2130288052:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LambdaApplication", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1182719609:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.Program", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -1496603787:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.AbstractionVarRef", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.VariableReference"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.VariableReference"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1404709481:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1507395747:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.AddOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation", "jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1987793638:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.MultiplyOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation", "jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -979538954:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.SubtractOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation", "jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 2128068849:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.DivideOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation", "jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1069771330:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LambdaType", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1087147072:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.NumberType", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaType"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaType"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -93754104:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.StringType", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaType"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaType"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -228576753:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.FunctionType", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1091927727:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.ParenthesisExpression", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1271713253:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.MultipleExpression", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1759814248:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -881056808:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.BinaryStringOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1156557809:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.ConcatenateOperation", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryStringOperation"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation", "jetbrains.mps.samples.lambdaCalculus.structure.BinaryStringOperation", "jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 195157974:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LetExpression", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1272924907:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LetRef", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.VariableReference"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.VariableReference"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -952543430:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.LetVariable", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.Variable", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.samples.lambdaCalculus.structure.Variable"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 783209050:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner", new String[]{}, new String[]{}, new String[]{});
      case -2082475150:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.VariableReference", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1741893593:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.samples.lambdaCalculus.structure.Variable", new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
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
