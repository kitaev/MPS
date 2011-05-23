package jetbrains.mps.lang.test.structure;

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
      case 1916190128:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.TestNodeAnnotation", new String[]{"jetbrains.mps.lang.test.structure.INodeAnnotattion", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.lang.test.structure.INodeAnnotattion"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -1367369558:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.TestNodeReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -650333934:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.AssertMatch", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -649377961:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.AbstractNodeAssert", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -2031946953:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.CheckNodeForErrors", new String[]{"jetbrains.mps.lang.test.structure.AbstractNodeAssert"}, new String[]{"jetbrains.mps.lang.test.structure.AbstractNodeAssert"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 1712347551:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodePropertiesContainer", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case 328961380:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeProperty", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -962771890:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeErrorPropety", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 759830306:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeWarningProperty", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1196146590:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeReachable", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -828487874:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeTypeProperty", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -301787208:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 849612550:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeOperationsContainer", new String[]{"jetbrains.mps.lang.test.structure.INodeAnnotattion"}, new String[]{"jetbrains.mps.lang.test.structure.INodeAnnotattion"}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case 1253708299:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.TypesCheckOperation", new String[]{"jetbrains.mps.lang.test.structure.NodeOperation"}, new String[]{"jetbrains.mps.lang.test.structure.NodeOperation"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -57863340:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.CheckDataFlowOperation", new String[]{"jetbrains.mps.lang.test.structure.NodeOperation"}, new String[]{"jetbrains.mps.lang.test.structure.NodeOperation"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 844676325:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeUnreachable", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1173232970:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.VariableInialized", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1804081397:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.VariableLive", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1839988454:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodesTestCase", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -1007599849:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodesTestMethod", new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -966636639:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.TestNode", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 870761941:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.CheckNodeDataflow", new String[]{"jetbrains.mps.lang.test.structure.AbstractNodeAssert"}, new String[]{"jetbrains.mps.lang.test.structure.AbstractNodeAssert"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 1886145348:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.ProjectExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1864058860:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.ModelExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1385565773:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.SimpleNodeTest", new String[]{"jetbrains.mps.lang.test.structure.NodesTestMethod"}, new String[]{"jetbrains.mps.lang.test.structure.NodesTestMethod"}, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 143764690:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.EditorExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 551107944:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.InvokeIntentionStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 2140900333:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.EditorOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1132010833:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.INodeAnnotattion", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -1812298985:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.TypeKeyStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -573247898:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.PressKeyStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -1131873380:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.EditorTestCase", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -340572559:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", new String[]{"jetbrains.mps.lang.test.structure.INodeAnnotattion", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.lang.test.structure.INodeAnnotattion"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.NodeAttribute"});
      case 154973318:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.MockAnnotation", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case 1333472846:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.NodeTypeSetProperty", new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.test.structure.NodeProperty"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 395165884:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.ExpressionContainer", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -2126681189:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.SwitchToInspector", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -1099367813:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.EditorComponentExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -966786483:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.TestInfo", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1604102004:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.InvokeActionStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case -1242961112:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.ActionReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 748028244:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.BootstrapActionReference", new String[]{"jetbrains.mps.lang.test.structure.ActionReference"}, new String[]{"jetbrains.mps.lang.test.structure.ActionReference"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1606777326:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.test.structure.MPSActionReference", new String[]{"jetbrains.mps.lang.test.structure.ActionReference"}, new String[]{"jetbrains.mps.lang.test.structure.ActionReference"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
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
