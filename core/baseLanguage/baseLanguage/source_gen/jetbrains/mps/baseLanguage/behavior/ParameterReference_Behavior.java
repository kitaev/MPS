package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ParameterReference_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean call_isParameterOfThisMethod_1240394425603(SNode thisNode) {
    if (SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false) == SNodeOperations.getAncestor(SLinkOperations.getTarget(thisNode, "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false)) {
      if (SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Closureoid", false, false) == SNodeOperations.getAncestor(SLinkOperations.getTarget(thisNode, "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.Closureoid", false, false)) {
        return true;
      }
    }
    return false;
  }
}
