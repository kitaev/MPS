package jetbrains.mps.baseLanguage.constructors.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 1724814137:
        return new CustomConstructorContainer_BehaviorDescriptor();
      case 2066564648:
        return new CustomConstructor_BehaviorDescriptor();
      case 894689369:
        return new CustomConstructorUsage_BehaviorDescriptor();
      case 707139725:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause 
        return null;
      case 704260230:
        return new ListArgumentsClause_BehaviorDescriptor();
      case 1479201182:
        return new CustomArgumentClause_BehaviorDescriptor();
      case -204735903:
        return new CustomConstructorParameter_BehaviorDescriptor();
      case -1456569878:
        return new CustomConstructorParameterReference_BehaviorDescriptor();
      case 168815585:
        return new ListParameterReference_BehaviorDescriptor();
      case 1584506201:
        return new ListCustomParameter_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
