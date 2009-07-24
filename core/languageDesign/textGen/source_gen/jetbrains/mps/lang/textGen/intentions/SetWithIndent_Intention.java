package jetbrains.mps.lang.textGen.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.textGen.behavior.AbstractAppendPart_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class SetWithIndent_Intention extends BaseIntention {

  public SetWithIndent_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.textGen.structure.AbstractAppendPart";
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
    return "Append " + (AbstractAppendPart_Behavior.call_withIndent_1237466287046(node) ?
      "without" :
      "with"
    ) + " Indent";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.textGen.structure.NodeAppendPart");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    boolean indent = AbstractAppendPart_Behavior.call_withIndent_1237466287046(node);
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart")) {
      SPropertyOperations.set(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart"), "withIndent", "" + !(indent));
    } else
    {
      SPropertyOperations.set(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.NodeAppendPart"), "withIndent", "" + !(indent));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.textGen.intentions";
  }

}
