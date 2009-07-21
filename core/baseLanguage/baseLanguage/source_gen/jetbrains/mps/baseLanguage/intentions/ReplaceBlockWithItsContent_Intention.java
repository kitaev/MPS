package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;

public class ReplaceBlockWithItsContent_Intention extends BaseIntention {

  public ReplaceBlockWithItsContent_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BlockStatement";
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
    return "Replace Block with Its Content";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    boolean applicable = false;
    if ((SNodeOperations.getParent(node) != null)) {
      String role = node.getRole_();
      SNode linkDeclaration = SNodeOperations.cast(BaseAdapter.fromAdapter(SNodeOperations.getParent(node).getLinkDeclaration(role)), "jetbrains.mps.lang.structure.structure.LinkDeclaration");
      if (SConceptOperations.isSuperConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement"), NameUtil.nodeFQName(SLinkOperations.getTarget(linkDeclaration, "target", false)))) {
        int statementsCount = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "statements", true), "statement", true)).count();
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "0..1", "0..1")) {
          applicable = statementsCount <= 1;
        } else
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "0..n", "0..1")) {
          applicable = true;
        } else
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "1", "0..1")) {
          applicable = statementsCount == 1;
        } else
        if (SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "1..n", "0..1")) {
          applicable = statementsCount >= 1;
        }
      }
    }
    return applicable;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    List<SNode> statements = SLinkOperations.getTargets(SLinkOperations.getTarget(node, "statements", true), "statement", true);
    for(SNode statement : ListSequence.fromList(statements)) {
      SNodeOperations.insertPrevSiblingChild(node, statement);
    }
    SNodeOperations.deleteNode(node);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
