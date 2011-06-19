package jetbrains.mps.debug.customViewers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.debug.customViewers.structure.AllElementsOperation", "jetbrains.mps.debug.customViewers.structure.ArrayValueType", "jetbrains.mps.debug.customViewers.structure.CallMethodOperation", "jetbrains.mps.debug.customViewers.structure.CanWrapHighLevelValue_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.CanWrapValue_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.ClassFqNameOperation", "jetbrains.mps.debug.customViewers.structure.ClassNameOperation", "jetbrains.mps.debug.customViewers.structure.CustomViewer", "jetbrains.mps.debug.customViewers.structure.CustomWatchable", "jetbrains.mps.debug.customViewers.structure.CustomWatchablesContainer", "jetbrains.mps.debug.customViewers.structure.ElementOperation", "jetbrains.mps.debug.customViewers.structure.ElementsRangeOperation", "jetbrains.mps.debug.customViewers.structure.FieldOperation", "jetbrains.mps.debug.customViewers.structure.FieldsListOperation", "jetbrains.mps.debug.customViewers.structure.GetHighLevelValuePresentation_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetHighLevelWatchablesBlock_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetValuePresentation_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetWatchablesBlock_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer", "jetbrains.mps.debug.customViewers.structure.HighLevelValue_ConceptFunctionParameter", "jetbrains.mps.debug.customViewers.structure.HighLevelWatchableCreator", "jetbrains.mps.debug.customViewers.structure.IsInstanceOfOperation", "jetbrains.mps.debug.customViewers.structure.JavaValueOperation", "jetbrains.mps.debug.customViewers.structure.ObjectValueType", "jetbrains.mps.debug.customViewers.structure.OriginalValue_ConceptFunctionParameter", "jetbrains.mps.debug.customViewers.structure.PrimitiveValueType", "jetbrains.mps.debug.customViewers.structure.SizeOperation", "jetbrains.mps.debug.customViewers.structure.StringValueOperation", "jetbrains.mps.debug.customViewers.structure.StringValueType", "jetbrains.mps.debug.customViewers.structure.ToProcessMethod", "jetbrains.mps.debug.customViewers.structure.ValueType", "jetbrains.mps.debug.customViewers.structure.WatchableCreator", "jetbrains.mps.debug.customViewers.structure.WatchableListType", "jetbrains.mps.debug.customViewers.structure.WatchableType", "jetbrains.mps.debug.customViewers.structure.WatchablesListCreator"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 30:
        return new ValueType_BehaviorDescriptor();
      case 1:
        return new ArrayValueType_BehaviorDescriptor();
      case 23:
        return new ObjectValueType_BehaviorDescriptor();
      case 25:
        return new PrimitiveValueType_BehaviorDescriptor();
      case 8:
        return new CustomWatchable_BehaviorDescriptor();
      case 9:
        return new CustomWatchablesContainer_BehaviorDescriptor();
      case 7:
        return new CustomViewer_BehaviorDescriptor();
      case 33:
        return new WatchableType_BehaviorDescriptor();
      case 31:
        return new WatchableCreator_BehaviorDescriptor();
      case 17:
        return new GetWatchablesBlock_ConceptFunction_BehaviorDescriptor();
      case 24:
        return new OriginalValue_ConceptFunctionParameter_BehaviorDescriptor();
      case 13:
        return new FieldsListOperation_BehaviorDescriptor();
      case 12:
        return new FieldOperation_BehaviorDescriptor();
      case 10:
        return new ElementOperation_BehaviorDescriptor();
      case 16:
        return new GetValuePresentation_ConceptFunction_BehaviorDescriptor();
      case 4:
        return new CanWrapValue_ConceptFunction_BehaviorDescriptor();
      case 6:
        return new ClassNameOperation_BehaviorDescriptor();
      case 5:
        return new ClassFqNameOperation_BehaviorDescriptor();
      case 26:
        return new SizeOperation_BehaviorDescriptor();
      case 0:
        return new AllElementsOperation_BehaviorDescriptor();
      case 11:
        return new ElementsRangeOperation_BehaviorDescriptor();
      case 2:
        return new CallMethodOperation_BehaviorDescriptor();
      case 22:
        return new JavaValueOperation_BehaviorDescriptor();
      case 28:
        return new StringValueType_BehaviorDescriptor();
      case 27:
        return new StringValueOperation_BehaviorDescriptor();
      case 21:
        return new IsInstanceOfOperation_BehaviorDescriptor();
      case 18:
        return new HighLevelCustomViewer_BehaviorDescriptor();
      case 14:
        return new GetHighLevelValuePresentation_ConceptFunction_BehaviorDescriptor();
      case 15:
        return new GetHighLevelWatchablesBlock_ConceptFunction_BehaviorDescriptor();
      case 3:
        return new CanWrapHighLevelValue_ConceptFunction_BehaviorDescriptor();
      case 19:
        return new HighLevelValue_ConceptFunctionParameter_BehaviorDescriptor();
      case 20:
        return new HighLevelWatchableCreator_BehaviorDescriptor();
      case 34:
        return new WatchablesListCreator_BehaviorDescriptor();
      case 32:
        return new WatchableListType_BehaviorDescriptor();
      case 29:
        return new ToProcessMethod_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
