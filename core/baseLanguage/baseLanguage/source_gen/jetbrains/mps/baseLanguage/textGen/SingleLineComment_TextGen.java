package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class SingleLineComment_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    this.indentBuffer();
    this.append("// ");
    for (SNode commentPart : SLinkOperations.getTargets(node, "commentPart", true)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), commentPart, this.getSNode());
      this.append(" ");
    }
  }
}
