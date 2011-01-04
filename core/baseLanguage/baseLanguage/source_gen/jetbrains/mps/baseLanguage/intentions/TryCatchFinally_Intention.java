package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.SurroundWithIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TryCatchFinally_Intention extends SurroundWithIntention implements Intention {
  public TryCatchFinally_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Try / Catch / Finally";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode tryStatement = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.TryStatement", null);
    List<SNode> selectedNodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(node, tryStatement);
    for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(tryStatement, "body", true), "statement", true)).addElement(SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
    }
    SNodeFactoryOperations.addNewChild(tryStatement, "catchClause", "jetbrains.mps.baseLanguage.structure.CatchClause");
    editorContext.select(SLinkOperations.getTarget(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(tryStatement, "catchClause", true)).first(), "throwable", true), "type", true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
