package jetbrains.mps.uiLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IComponentInstance_Behavior {
  public static Class[] PARAMETERS_1213877498080 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getLayoutConstraint_1213877498060(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "content", true)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.uiLanguage.structure.LayoutConstraint");
      }

    }).first();
  }

  public static SNode virtual_getExtendedComponent_1213877498080(SNode thisNode) {
    return null;
  }

  public static SNode call_getExtendedComponent_1213877498080(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getExtendedComponent_1213877498080", PARAMETERS_1213877498080);
  }

  public static SNode callSuper_getExtendedComponent_1213877498080(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getExtendedComponent_1213877498080", PARAMETERS_1213877498080);
  }

}
