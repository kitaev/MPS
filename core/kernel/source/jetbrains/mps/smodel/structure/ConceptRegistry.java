package jetbrains.mps.smodel.structure;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.runtime.adapter.BehaviorDescriptorAdapter;
import jetbrains.mps.smodel.runtime.adapter.ConceptDescriptorAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConceptRegistry {
  private static final ConceptRegistry REGISTRY = new ConceptRegistry();

  private final jetbrains.mps.smodel.language.ConceptRegistry inner = jetbrains.mps.smodel.language.ConceptRegistry.getInstance();

  private ConceptRegistry() {
  }

  public static ConceptRegistry getInstance() {
    return REGISTRY;
  }

  @Deprecated
  public StructureDescriptor getStructureDescriptor(String fqName) {
    return new ConceptDescriptorAdapter(getConceptDescriptor(fqName));
  }

  @Deprecated
  public BehaviorDescriptor getBehaviorDescriptor(String fqName) {
    return new BehaviorDescriptorAdapter(getBehaviorDescriptorNew(fqName));
  }

  @Deprecated
  public BehaviorDescriptor getBehaviorDescriptorForInstanceNode(@Nullable SNode node) {
    return new BehaviorDescriptorAdapter(getBehaviorDescriptorForInstanceNodeNew(node));
  }

  @Deprecated
  public ConceptDescriptor getConceptDescriptorForInstanceNode(@Nullable SNode node) {
    return new NullableBehaviorConceptDescriptor(getBehaviorDescriptorForInstanceNodeNew(node));
  }

  @NotNull
  public jetbrains.mps.smodel.runtime.ConceptDescriptor getConceptDescriptor(@Nullable String fqName) {
    return inner.getConceptDescriptor(fqName);
  }

  @NotNull
  public jetbrains.mps.smodel.runtime.BehaviorDescriptor getBehaviorDescriptorNew(@Nullable String fqName) {
    return inner.getBehaviorDescriptor(fqName);
  }

  public jetbrains.mps.smodel.runtime.BehaviorDescriptor getBehaviorDescriptorForInstanceNodeNew(@Nullable SNode node) {
    return inner.getBehaviorDescriptorForInstanceNode(node);
  }

  @NotNull
  public jetbrains.mps.smodel.runtime.ConstraintsDescriptor getConstraintsDescriptorNew(@Nullable String fqName) {
    return inner.getConstraintsDescriptor(fqName);
  }

  private class NullableBehaviorConceptDescriptor extends ConceptDescriptor {
    private final jetbrains.mps.smodel.runtime.BehaviorDescriptor behaviorDescriptor;

    NullableBehaviorConceptDescriptor(jetbrains.mps.smodel.runtime.BehaviorDescriptor behaviorDescriptor) {
      this.behaviorDescriptor = behaviorDescriptor;
    }

    @Override
    public String fqName() {
      throw new UnsupportedOperationException();
    }

    @Override
    public StructureDescriptor structure() {
      throw new UnsupportedOperationException();
    }

    @Override
    public BehaviorDescriptor behavior() {
      return new BehaviorDescriptorAdapter(behaviorDescriptor);
    }

    @Override
    public ConstraintsDescriptor constraints() {
      throw new UnsupportedOperationException();
    }
  }
}
