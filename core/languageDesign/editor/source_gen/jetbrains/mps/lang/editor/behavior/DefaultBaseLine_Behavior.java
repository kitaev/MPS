package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DefaultBaseLine_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isApplicableTo_1214304723440(SNode thisNode, SNode cellModel) {
    do {
      SNode matchedNode_9749_1tbobfsuko7hn = cellModel;
      {
        boolean matches_9749_1tbobfsuko7hp = false;
        {
          SNode matchingNode_9749_1tbobfsuko7hp = cellModel;
          if (matchingNode_9749_1tbobfsuko7hp != null) {
            matches_9749_1tbobfsuko7hp = SModelUtil_new.isAssignableConcept(matchingNode_9749_1tbobfsuko7hp.getConceptFqName(), "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList");
          }
        }
        if (matches_9749_1tbobfsuko7hp) {
          return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_9749_1tbobfsuko7hn, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Vertical") || (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_9749_1tbobfsuko7hn, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Table"));
        }
      }
      {
        boolean matches_9749_1tbobfsuko7ht = false;
        {
          SNode matchingNode_9749_1tbobfsuko7ht = cellModel;
          if (matchingNode_9749_1tbobfsuko7ht != null) {
            matches_9749_1tbobfsuko7ht = SModelUtil_new.isAssignableConcept(matchingNode_9749_1tbobfsuko7ht.getConceptFqName(), "jetbrains.mps.lang.editor.structure.CellModel_Collection");
          }
        }
        if (matches_9749_1tbobfsuko7ht) {
          return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_9749_1tbobfsuko7hn, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Vertical") || (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_9749_1tbobfsuko7hn, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Table"));
        }
      }
      return false;
    } while(false);
  }
}
