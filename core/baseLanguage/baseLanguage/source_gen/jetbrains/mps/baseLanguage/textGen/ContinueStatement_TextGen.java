package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ContinueStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    if ((SLinkOperations.getTarget(node, "loopLabelReference", true) != null)) {
      this.appendWithIndent("continue ");
      this.append(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "loopLabelReference", true), "loopLabel", false), "name"));
      this.append(";");
    } else if (SPropertyOperations.getString(node, "label") != null) {
      this.appendWithIndent("continue ");
      this.append(SPropertyOperations.getString(node, "label"));
      this.append(";");
    } else {
      this.appendWithIndent("continue;");
    }
  }
}
