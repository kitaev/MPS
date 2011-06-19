package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.ypath.structure.GenericFeature", "jetbrains.mps.ypath.structure.GenericParamFeature", "jetbrains.mps.ypath.structure.IFeature", "jetbrains.mps.ypath.structure.IterateOperation", "jetbrains.mps.ypath.structure.ListFeature", "jetbrains.mps.ypath.structure.MatchPropertyOperation", "jetbrains.mps.ypath.structure.NodeKindSpecificCase", "jetbrains.mps.ypath.structure.SequenceFeature", "jetbrains.mps.ypath.structure.TreeNodeKindOccurrence", "jetbrains.mps.ypath.structure.TreeNodeKindProperty", "jetbrains.mps.ypath.structure.TreeNodeKindReference", "jetbrains.mps.ypath.structure.TreePathAdapterExpression", "jetbrains.mps.ypath.structure.TreePathAspect", "jetbrains.mps.ypath.structure.TreePathOperation"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 5:
        return new MatchPropertyOperation_Constraints();
      case 12:
        return new TreePathAspect_Constraints();
      case 9:
        return new TreeNodeKindProperty_Constraints();
      case 3:
        return new IterateOperation_Constraints();
      case 2:
        return new IFeature_Constraints();
      case 11:
        return new TreePathAdapterExpression_Constraints();
      case 10:
        return new TreeNodeKindReference_Constraints();
      case 8:
        return new TreeNodeKindOccurrence_Constraints();
      case 6:
        return new NodeKindSpecificCase_Constraints();
      case 13:
        return new TreePathOperation_Constraints();
      case 0:
        return new GenericFeature_Constraints();
      case 1:
        return new GenericParamFeature_Constraints();
      case 4:
        return new ListFeature_Constraints();
      case 7:
        return new SequenceFeature_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
