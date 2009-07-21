package jetbrains.mps.lang.pattern.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.pattern.util.PatternAddingUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class CreateAsPattern_Intention extends BaseIntention {

  public CreateAsPattern_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.pattern.structure.PatternExpression";
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
    return "Create As-Pattern";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return PatternAddingUtil.isPatternApplicable(editorContext);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode currentNode = editorContext.getSelectedNode();
    SLinkOperations.setNewChild(currentNode, AttributesRolesUtil.childRoleFromAttributeRole("asPattern"), "jetbrains.mps.lang.pattern.structure.AsPattern");
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.pattern.intentions";
  }

}
