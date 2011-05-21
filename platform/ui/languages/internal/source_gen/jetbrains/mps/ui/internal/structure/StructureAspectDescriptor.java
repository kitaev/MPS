package jetbrains.mps.ui.internal.structure;

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
    if (hash == -958159147) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ContextBindingWrapper", "jetbrains.mps.ui.internal.structure.ContextCompartmentWrapper");
    }
    if (hash == 46355948) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ContextWrapper", "jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.ui.internal.structure.IContextWrapper");
    }
    if (hash == -1949889785) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ContextViewWrapper", "jetbrains.mps.ui.internal.structure.ContextWrapper");
    }
    if (hash == 1319424232) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ContextCompartmentWrapper", "jetbrains.mps.ui.internal.structure.ContextWrapper");
    }
    if (hash == 1107322736) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ContextControllerWrapper", "jetbrains.mps.ui.internal.structure.ContextWrapper");
    }
    if (hash == 65161903) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.AuxObjectHandler", "jetbrains.mps.baseLanguage.structure.Statement");
    }
    if (hash == -949698192) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.GeometryHandler", "jetbrains.mps.baseLanguage.structure.Statement");
    }
    if (hash == -1804323931) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.IContextWrapper");
    }
    if (hash == -385921628) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ContextWrapperExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.ui.internal.structure.IContextWrapper");
    }
    if (hash == 1339320080) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.TypeStub", "jetbrains.mps.baseLanguage.structure.Type", "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub");
    }
    if (hash == 1966630254) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.ExpressionStub", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub");
    }
    if (hash == 928355253) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.internal.structure.StatementStub", "jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub");
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
