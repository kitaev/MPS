package jetbrains.mps.baseLanguage.javadoc.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ReturnBlockDocTag_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    this.indentBuffer();
    this.append("@throws ");
    this.append(SPropertyOperations.getString(node, "text"));
  }
}
