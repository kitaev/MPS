package jetbrains.mps.lang.editor.tableTests.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", "jetbrains.mps.lang.editor.tableTests.structure.EventReference", "jetbrains.mps.lang.editor.tableTests.structure.StateReference"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 1:
        return new EventReference_Constraints();
      case 0:
        return new AbstractStateMachineElement_Constraints();
      case 2:
        return new StateReference_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
