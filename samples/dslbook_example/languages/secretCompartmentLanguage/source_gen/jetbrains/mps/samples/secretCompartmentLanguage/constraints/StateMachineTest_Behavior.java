package jetbrains.mps.samples.secretCompartmentLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class StateMachineTest_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getStateMachineName_1197251245696(SNode thisNode) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "stateMachine", false), "stateMachineName");
  }

}
