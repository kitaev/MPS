package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ThisExpression_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if ((SLinkOperations.getTarget(node, "classConcept", false) != null)) {
      this.append(SPropertyOperations.getString(SLinkOperations.getTarget(node, "classConcept", false), "name"));
      this.append(".this");
    } else {
      this.append("this");
    }
  }
}
