package jetbrains.mps.bootstrap.helgins.test.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -1897619696:
        return new AConcept_BehaviorDescriptor();
      case -154809361:
        return new BConcept_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
