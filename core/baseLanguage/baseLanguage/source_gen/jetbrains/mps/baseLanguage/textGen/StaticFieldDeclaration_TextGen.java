package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.textGen.TextGenManager;

public class StaticFieldDeclaration_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    this.appendNewLine();
    BaseLanguageTextGen.annotations(node, this);
    BaseLanguageTextGen.visibilityWithIndent(SLinkOperations.getTarget(node, "visibility", true), this);
    this.append("static ");
    if (SPropertyOperations.getBoolean(node, "isFinal")) {
      this.append("final ");
    }
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "type", true), this.getSNode());
    this.append(" ");
    this.append(SPropertyOperations.getString(node, "name"));
    if ((SLinkOperations.getTarget(node, "initializer", true) != null)) {
      this.append(" = ");
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "initializer", true), this.getSNode());
    }
    this.append(";");
  }

}
