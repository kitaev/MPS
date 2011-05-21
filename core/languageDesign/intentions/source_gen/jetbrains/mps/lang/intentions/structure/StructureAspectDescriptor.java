package jetbrains.mps.lang.intentions.structure;

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
    if (hash == -713206842) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.IntentionDeclaration", "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration");
    }
    if (hash == -488683575) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.DescriptionBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 599031500) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.IsApplicableBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 1103938544) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ExecuteBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -328333184) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 1264391293) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.QueryBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -417352459) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.IntentionParameter", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1572281711) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ParameterizedIntentionDeclaration", "jetbrains.mps.lang.intentions.structure.IntentionDeclaration");
    }
    if (hash == -198052079) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ChildFilterBlock");
    }
    if (hash == -1133772076) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ChildFilterFunction", "jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.lang.intentions.structure.ChildFilterBlock");
    }
    if (hash == 226602368) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_childNode", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == -619229129) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy", "jetbrains.mps.lang.structure.structure.IConceptAspect");
    }
    if (hash == -1468598053) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.GenerateIntentionDeclaration", "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration");
    }
    if (hash == 789005578) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.SurroundWithIntentionDeclaration", "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration");
    }
    if (hash == -1332584164) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.ExecuteUIBlock", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -706594644) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.IntentionContextParameterDeclaration", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == -238295015) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.intentions.structure.IntentionContextParamReference", "jetbrains.mps.baseLanguage.structure.Expression");
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
