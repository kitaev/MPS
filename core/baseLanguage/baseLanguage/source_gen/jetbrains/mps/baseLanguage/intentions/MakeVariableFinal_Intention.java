package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MakeVariableFinal_Intention extends BaseIntention implements Intention {
  public MakeVariableFinal_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.LocalVariableReference";
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
    return "Make Variable Final";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode varDeclStmt = SNodeOperations.getAncestor(SLinkOperations.getTarget(node, "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    SNode classNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.AnonymousClass", false, false);
    if ((classNode == null)) {
      return false;
    }
    return !(ListSequence.fromList(SNodeOperations.getAncestors(varDeclStmt, null, false)).contains(classNode));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(SLinkOperations.getTarget(node, "variableDeclaration", false), "isFinal", "" + (true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
