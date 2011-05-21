package jetbrains.mps.debug.apiLang.structure;

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
    if (hash == 1300900393) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.BreakpointCreator", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -1540193358) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.BreakpointableNodeItem", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 246842686) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptFunction_CreateBreakpoint", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -938382871) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptFunctionParameter_Debug_Project", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 1851804052) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptFunctionParameter_DebuggableNode", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 585642791) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptDeclarationReference", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 486523661) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.DebuggerType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == -1326942376) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.DebuggerReference", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1041442568) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.CreateBreakpointOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
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
