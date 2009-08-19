package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ClassConcept_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    BaseLanguageTextGen.fileHeader(node, this);
    BaseLanguageTextGen.annotations(node, this);
    BaseLanguageTextGen.visibilityWithIndent(SLinkOperations.getTarget(node, "visibility", true), this);
    if (!(node.isRoot())) {
      this.append("static ");
    }
    if (SPropertyOperations.getBoolean(node, "abstractClass")) {
      this.append("abstract ");
    }
    this.append("class ");
    this.append(SPropertyOperations.getString(node, "name"));
    GenericDeclarationTextGen2.typeDeclarations(node, this);
    if ((SLinkOperations.getTarget(node, "superclass", true) != null)) {
      this.append(" extends ");
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "superclass", true), this.getSNode());
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "implementedInterface", true)).isNotEmpty()) {
      this.append(" implements ");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "implementedInterface", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "implementedInterface", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "implementedInterface", true)).last()) {
            this.append(", ");
          }
        }
      }
    }
    this.append(" {");
    this.increaseDepth();
    BaseClassConceptTextGen.body(node, this);
    this.decreaseDepth();
    if ((SLinkOperations.getTarget(node, "classInitializer", true) == null) && ListSequence.fromList(SLinkOperations.getTargets(node, "constructor", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(node, "field", true)).isEmpty() && (SLinkOperations.getTarget(node, "instanceInitializer", true) == null) && ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(node, "staticField", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(node, "property", true)).isEmpty() && (SLinkOperations.getTarget(node, "staticInitializer", true) == null) && ListSequence.fromList(SLinkOperations.getTargets(node, "staticInnerClassifiers", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(node, "staticMethod", true)).isEmpty()) {
      this.appendNewLine();
    }
    if (!(node.isRoot())) {
      this.appendWithIndent("}");
    } else {
      this.append("}");
    }
    this.appendNewLine();
  }
}
