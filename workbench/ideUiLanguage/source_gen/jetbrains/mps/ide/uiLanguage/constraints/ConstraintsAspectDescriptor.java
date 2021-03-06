package jetbrains.mps.ide.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.ide.uiLanguage.structure.DialogExpression", "jetbrains.mps.ide.uiLanguage.structure.DisposeDialogExpression", "jetbrains.mps.ide.uiLanguage.structure.DisposeDialogStatement", "jetbrains.mps.ide.uiLanguage.structure.IDEDialog", "jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression", "jetbrains.mps.ide.uiLanguage.structure.ReportErrorStatement"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 1:
        return new DisposeDialogExpression_Constraints();
      case 0:
        return new DialogExpression_Constraints();
      case 4:
        return new ReportErrorExpression_Constraints();
      case 3:
        return new IDEDialog_Constraints();
      case 5:
        return new ReportErrorStatement_Constraints();
      case 2:
        return new DisposeDialogStatement_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
