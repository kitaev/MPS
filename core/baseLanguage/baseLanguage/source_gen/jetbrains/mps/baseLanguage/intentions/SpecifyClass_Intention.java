package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SpecifyClass_Intention extends BaseIntention implements Intention {
  public SpecifyClass_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Specify Class";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode classConcept = SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(node, "baseMethodDeclaration", false)), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode smc = SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null));
    SLinkOperations.setTarget(smc, "classConcept", classConcept, false);
    SLinkOperations.setTarget(smc, "baseMethodDeclaration", SLinkOperations.getTarget(node, "baseMethodDeclaration", false), false);
    List<SNode> args = SLinkOperations.getTargets(node, "actualArgument", true);
    for (SNode arg : args) {
      ListSequence.fromList(SLinkOperations.getTargets(smc, "actualArgument", true)).addElement(SNodeOperations.detachNode(arg));
    }
    editorContext.selectWRTFocusPolicy(smc);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
