package jetbrains.mps.build.distrib.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.build.distrib.structure.DistribConfiguration", "jetbrains.mps.build.distrib.structure.ExternalVariableReference", "jetbrains.mps.build.distrib.structure.SystemSpecificConfig"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 2:
        return new SystemSpecificConfig_Constraints();
      case 0:
        return new DistribConfiguration_Constraints();
      case 1:
        return new ExternalVariableReference_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
