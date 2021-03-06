package jetbrains.mps.debug.customViewers.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.debug.customViewers.structure.AllElementsOperation", "jetbrains.mps.debug.customViewers.structure.CallMethodOperation", "jetbrains.mps.debug.customViewers.structure.CanWrapHighLevelValue_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.ClassFqNameOperation", "jetbrains.mps.debug.customViewers.structure.ClassNameOperation", "jetbrains.mps.debug.customViewers.structure.ElementOperation", "jetbrains.mps.debug.customViewers.structure.ElementsRangeOperation", "jetbrains.mps.debug.customViewers.structure.FieldOperation", "jetbrains.mps.debug.customViewers.structure.FieldsListOperation", "jetbrains.mps.debug.customViewers.structure.GetHighLevelValuePresentation_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetHighLevelWatchablesBlock_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.HighLevelWatchableCreator", "jetbrains.mps.debug.customViewers.structure.IsInstanceOfOperation", "jetbrains.mps.debug.customViewers.structure.JavaValueOperation", "jetbrains.mps.debug.customViewers.structure.SizeOperation", "jetbrains.mps.debug.customViewers.structure.StringValueOperation", "jetbrains.mps.debug.customViewers.structure.WatchableCreator"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 16:
        return new WatchableCreator_Constraints();
      case 8:
        return new FieldsListOperation_Constraints();
      case 7:
        return new FieldOperation_Constraints();
      case 5:
        return new ElementOperation_Constraints();
      case 4:
        return new ClassNameOperation_Constraints();
      case 3:
        return new ClassFqNameOperation_Constraints();
      case 14:
        return new SizeOperation_Constraints();
      case 0:
        return new AllElementsOperation_Constraints();
      case 6:
        return new ElementsRangeOperation_Constraints();
      case 1:
        return new CallMethodOperation_Constraints();
      case 13:
        return new JavaValueOperation_Constraints();
      case 15:
        return new StringValueOperation_Constraints();
      case 12:
        return new IsInstanceOfOperation_Constraints();
      case 9:
        return new GetHighLevelValuePresentation_ConceptFunction_Constraints();
      case 2:
        return new CanWrapHighLevelValue_ConceptFunction_Constraints();
      case 10:
        return new GetHighLevelWatchablesBlock_ConceptFunction_Constraints();
      case 11:
        return new HighLevelWatchableCreator_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
