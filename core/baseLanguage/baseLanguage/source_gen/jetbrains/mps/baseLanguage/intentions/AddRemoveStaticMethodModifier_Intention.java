package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class AddRemoveStaticMethodModifier_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration") ?
      "Remove static modifier" :
      "Add static modifier"
    );
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
      return false;
    }
    for(SNode variableReference : ListSequence.fromList(SNodeOperations.getDescendants(node, null, false)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.VariableReference");
      }

    })) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(variableReference, "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
        return false;
      }
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode classConcept = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    SNode method;
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) {
      method = SLinkOperations.addNewChild(classConcept, "method", "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
    } else
    {
      method = SLinkOperations.addNewChild(classConcept, "staticMethod", "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
    }
    SLinkOperations.setTarget(method, "returnType", SLinkOperations.getTarget(node, "returnType", true), true);
    SLinkOperations.addAll(method, "parameter", SLinkOperations.getTargets(node, "parameter", true));
    SLinkOperations.setTarget(method, "body", SLinkOperations.getTarget(node, "body", true), true);
    SLinkOperations.addAll(method, "throwsItem", SLinkOperations.getTargets(node, "throwsItem", true));
    SLinkOperations.setTarget(method, "visibility", SLinkOperations.getTarget(node, "visibility", true), true);
    SPropertyOperations.set(method, "name", SPropertyOperations.getString(node, "name"));
    SPropertyOperations.set(method, "isFinal", "" + (SPropertyOperations.getBoolean(node, "isFinal")));
    SLinkOperations.addAll(method, "annotation", SLinkOperations.getTargets(node, "annotation", true));
    SNodeOperations.deleteNode(node);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
