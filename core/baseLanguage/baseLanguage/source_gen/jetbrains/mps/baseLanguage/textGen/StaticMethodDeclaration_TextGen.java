package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class StaticMethodDeclaration_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true), this.getSNode());
    }
    this.appendNewLine();
    BaseLanguageTextGen.annotations(node, this);
    BaseLanguageTextGen.visibilityWithIndent(SLinkOperations.getTarget(node, "visibility", true), this);
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      this.append("static ");
    }
    GenericDeclarationTextGen2.typeDeclarations(node, this);
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeVariableDeclaration", true)).isNotEmpty()) {
      this.append(" ");
    }
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "returnType", true), this.getSNode());
    this.append(" ");
    this.append(SPropertyOperations.getString(node, "name"));
    this.append("(");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append(")");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isNotEmpty()) {
      this.append(" throws ");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "throwsItem", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).last()) {
            this.append(", ");
          }
        }
      }
    }
    this.append(" {");
    this.increaseDepth();
    if ((SLinkOperations.getTarget(node, "body", true) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "body", true), this.getSNode());
    } else {
      this.appendNewLine();
      this.appendWithIndent("throw new RuntimeException(\"NOT IMPLEMENTED\");");
    }
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
    this.appendNewLine();
  }
}
