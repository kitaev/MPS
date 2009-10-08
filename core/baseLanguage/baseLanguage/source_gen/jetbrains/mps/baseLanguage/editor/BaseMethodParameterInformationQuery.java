package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.ParametersInformation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.IMemberContainer_Behavior;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.editor.runtime.StyledTextPrinter;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;

public class BaseMethodParameterInformationQuery extends ParametersInformation<SNode> {
  public BaseMethodParameterInformationQuery() {
  }

  public Iterable<SNode> getMethods(SNode node, EditorContext editorContext) {
    SNode method = SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false);
    SNode classifier = SNodeOperations.cast(SNodeOperations.getParent(method), "jetbrains.mps.baseLanguage.structure.IMemberContainer");
    List<SNode> members = IMemberContainer_Behavior.call_getMembers_1213877531970(classifier);
    List<SNode> methodsToShow = new ArrayList<SNode>();
    for (SNode member : ListSequence.fromList(members)) {
      if (SNodeOperations.isInstanceOf(member, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") && ObjectUtils.equals(SPropertyOperations.getString(SNodeOperations.cast(member, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "name"), SPropertyOperations.getString(method, "name"))) {
        ListSequence.fromList(methodsToShow).addElement(SNodeOperations.cast(member, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"));
      }
    }
    return methodsToShow;
  }

  public void getStyledMethodPresentation(SNode node, EditorContext editorContext, SNode parameterObject, StyledTextPrinter styledText) {
    SNode argument = editorContext.getSelectedNode();
    SNode methodCall = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IMethodCall");
    while (argument != null && !(SNodeOperations.isInstanceOf(argument, "jetbrains.mps.baseLanguage.structure.Expression") && ListSequence.fromList(SLinkOperations.getTargets(methodCall, "actualArgument", true)).contains(SNodeOperations.cast(argument, "jetbrains.mps.baseLanguage.structure.Expression")))) {
      argument = SNodeOperations.getParent(argument);
    }
    int argumentIndex = -1;
    if (argument != null) {
      for (int i = 0 ; i < ListSequence.fromList(SLinkOperations.getTargets(methodCall, "actualArgument", true)).count() ; i++ ) {
        if (ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(methodCall, "actualArgument", true)).toListSequence()).getElement(i) == argument) {
          argumentIndex = i;
        }
      }
    }
    SNode methodDeclaration = parameterObject;
    if (SLinkOperations.getTarget(methodDeclaration, "returnType", true) != null) {
      styledText.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(methodDeclaration, "returnType", true)) + " ");
    } else {
      styledText.append("??? ");
    }
    if (SPropertyOperations.getString(methodDeclaration, "name") != null) {
      styledText.append(SPropertyOperations.getString(methodDeclaration, "name"));
    } else {
      styledText.append("<no name>");
    }
    styledText.append("(");
    int i = 0;
    for (SNode param : SLinkOperations.getTargets(methodDeclaration, "parameter", true)) {
      if (i > 0) {
        styledText.append(", ");
      }
      if (i == argumentIndex) {
      }
      if (SLinkOperations.getTarget(param, "type", true) != null) {
        styledText.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(param, "type", true)));
      } else {
        styledText.append("???");
      }
      if (SPropertyOperations.getString(param, "name") != null) {
        styledText.append(" " + SPropertyOperations.getString(param, "name"));
      }
      i++ ;
    }
    styledText.append(")");
  }

  public boolean isMethodCurrent(SNode node, EditorContext editorContext, SNode parameterObject) {
    return SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false) == parameterObject;
  }
}
