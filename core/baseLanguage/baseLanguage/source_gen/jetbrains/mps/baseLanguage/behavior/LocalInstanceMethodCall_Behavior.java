package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class LocalInstanceMethodCall_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    SNode classifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    List<SNode> methods = new ClassifierAndSuperClassifiersScope(classifier, IClassifiersSearchScope.INSTANCE_METHOD).getMethodsByName(methodName);
    return methods;
  }
}
