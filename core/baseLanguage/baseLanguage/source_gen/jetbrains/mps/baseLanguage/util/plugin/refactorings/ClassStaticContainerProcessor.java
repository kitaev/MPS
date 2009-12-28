package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ClassStaticContainerProcessor extends AbstractStaticContainerProcessor {
  public ClassStaticContainerProcessor(SNode node) {
    super(node);
  }

  public SNode createNewMethod() {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", null);
  }

  public SNode createMethodCall(SNode method, List<SNode> arguments) {
    SNode call = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null);
    SLinkOperations.setTarget(call, "classConcept", SNodeOperations.cast(this.myStaticContainer, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false);
    SLinkOperations.setTarget(call, "baseMethodDeclaration", SNodeOperations.cast(method, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), false);
    SLinkOperations.addAll(call, "actualArgument", arguments);
    return call;
  }
}
