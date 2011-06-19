package jetbrains.mps.lang.intentions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.intentions.structure.GenerateIntentionDeclaration", "jetbrains.mps.lang.intentions.structure.IntentionContextParamReference", "jetbrains.mps.lang.intentions.structure.IntentionContextParameterDeclaration", "jetbrains.mps.lang.intentions.structure.IntentionDeclaration", "jetbrains.mps.lang.intentions.structure.SurroundWithIntentionDeclaration"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 3:
        return new IntentionDeclaration_Constraints();
      case 0:
        return new GenerateIntentionDeclaration_Constraints();
      case 4:
        return new SurroundWithIntentionDeclaration_Constraints();
      case 1:
        return new IntentionContextParamReference_Constraints();
      case 2:
        return new IntentionContextParameterDeclaration_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
