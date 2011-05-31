package jetbrains.mps.lang.descriptor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import java.util.Arrays;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.lang.descriptor.structure.LanguageDescriptor"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 0:
        return new LanguageDescriptor_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
