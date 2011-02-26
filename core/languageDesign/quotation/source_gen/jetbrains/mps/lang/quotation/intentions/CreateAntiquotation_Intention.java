package jetbrains.mps.lang.quotation.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class CreateAntiquotation_Intention extends BaseIntention implements Intention {
  public CreateAntiquotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.quotation.structure.Quotation";
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
    return "Create Antiquotation";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode contextNode = editorContext.getSelectedCell().getSNode();
    if (contextNode == null) {
      return;
    }
    if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.Antiquotation")) {
      AttributeOperations.setAttribute(SNodeOperations.getParent(contextNode), new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.Antiquotation")), null);
      return;
    }
    if (AttributeOperations.getAttribute(contextNode, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.Antiquotation"))) != null) {
      AttributeOperations.setAttribute(contextNode, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.Antiquotation")), null);
    } else {
      SNode antiquotation = SNodeFactoryOperations.setNewAttribute(contextNode, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.Antiquotation")), "jetbrains.mps.lang.quotation.structure.Antiquotation");
      editorContext.selectWRTFocusPolicy(antiquotation);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.quotation.intentions";
  }
}
