package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MakeParameterFinal_Intention extends BaseIntention {
  public MakeParameterFinal_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ParameterReference";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return true;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Make Parameter Final";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode methodNode = SNodeOperations.getAncestor(SLinkOperations.getTarget(node, "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    SNode classNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.AnonymousClass", false, false);
    if ((classNode == null)) {
      return false;
    }
    return ListSequence.fromList(SNodeOperations.getAncestors(classNode, null, false)).contains(methodNode);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(SLinkOperations.getTarget(node, "variableDeclaration", false), "isFinal", "" + (true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
