package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ConvertToArrayType_Intention extends BaseIntention {

  public ConvertToArrayType_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Type";
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
    return "Convert to Array Type";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", "implementedInterface")) && !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", "superclass")) && !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface"));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ArrayType", null);
    SLinkOperations.setTarget(result, "componentType", SNodeOperations.copyNode(node), true);
    SNodeOperations.replaceWithAnother(node, result);
    editorContext.selectWRTFocusPolicy(result);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
