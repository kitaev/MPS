package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.plugin.IExtractMethodRefactoringProcessor;
import jetbrains.mps.baseLanguage.plugin.AbstractExtractMethodRefactoringProcessor;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IExtractMethodAvailable_Behavior {
  private static Class[] PARAMETERS_1221393367929 = {SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static IExtractMethodRefactoringProcessor virtual_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, List<SNode> nodesToExtract) {
    return new AbstractExtractMethodRefactoringProcessor(thisNode, nodesToExtract);
  }

  public static IExtractMethodRefactoringProcessor call_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, List<SNode> nodesToExtract) {
    return (IExtractMethodRefactoringProcessor)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable"), "virtual_getExtractMethodRefactoringProcessor_1221393367929", PARAMETERS_1221393367929, nodesToExtract);
  }

  public static IExtractMethodRefactoringProcessor callSuper_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, String callerConceptFqName, List<SNode> nodesToExtract) {
    return (IExtractMethodRefactoringProcessor)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable"), callerConceptFqName, "virtual_getExtractMethodRefactoringProcessor_1221393367929", PARAMETERS_1221393367929, nodesToExtract);
  }
}
