package jetbrains.mps.xmlQuery.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class addHandler_Intention extends BaseIntention implements Intention {
  public addHandler_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule";
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
    return "Add handler";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "handler", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.setTarget(node, "handler", SNodeFactoryOperations.createNewNode("jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler", null), true);
  }

  public String getLocationString() {
    return "jetbrains.mps.xmlQuery.intentions";
  }
}
