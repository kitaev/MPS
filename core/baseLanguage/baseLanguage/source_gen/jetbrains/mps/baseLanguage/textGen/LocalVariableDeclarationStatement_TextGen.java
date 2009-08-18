package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class LocalVariableDeclarationStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    this.indentBuffer();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "localVariableDeclaration", true), this.getSNode());
    this.append(";");
  }
}
