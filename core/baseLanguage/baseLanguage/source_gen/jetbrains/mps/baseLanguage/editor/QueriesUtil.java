package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueriesUtil {
  public static List<SNode> replaceNodeMenu_parameterObjects(SNode classifier, SNode contextNode) {
    ISearchScope searchScope = new ClassifierVisibleStaticMembersScope(((Classifier) SNodeOperations.getAdapter(classifier)), contextNode, IClassifiersSearchScope.STATIC_MEMBER);
    List<SNode> members = (List<SNode>) searchScope.getNodes();
    List<SNode> result = ListSequence.fromList(members).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration") || SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") || SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration");
      }
    }).toListSequence();
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.EnumClass")) {
      ListSequence.fromList(result).addElement(SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.EnumValueOfExpression", null));
      ListSequence.fromList(result).addElement(SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.EnumValuesExpression", null));
    }
    return result;
  }

  public static SNode replaceNodeMenu_createNewNode(SNode classifier, SNode parameterObject, SNode oldNode) {
    SModel model = SNodeOperations.getModel(classifier);
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.StaticMethodCall", null);
      SLinkOperations.setTarget(newNode, "baseMethodDeclaration", SNodeOperations.cast(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), false);
      SLinkOperations.setTarget(newNode, "classConcept", SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), false);
      if (SNodeOperations.isInstanceOf(oldNode, "jetbrains.mps.baseLanguage.structure.StaticMethodCall")) {
        SNode call = SNodeOperations.cast(oldNode, "jetbrains.mps.baseLanguage.structure.StaticMethodCall");
        for (SNode arg : ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true))) {
          ListSequence.fromList(SLinkOperations.getTargets(newNode, "actualArgument", true)).addElement(SNodeOperations.copyNode(arg));
        }
      }
      for (SNode attribute : ListSequence.fromList(oldNode.getAllAttributes())) {
        String role = oldNode.getRoleOf(attribute);
        newNode.addChild(role, SNodeOperations.copyNode(((SNode) attribute)));
      }
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.StaticFieldReference", null);
      SLinkOperations.setTarget(newNode, "variableDeclaration", SNodeOperations.cast(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"), false);
      SLinkOperations.setTarget(newNode, "classifier", classifier, false);
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.EnumConstantReference", null);
      SLinkOperations.setTarget(newNode, "enumConstantDeclaration", SNodeOperations.cast(parameterObject, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration"), false);
      SLinkOperations.setTarget(newNode, "enumClass", SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.EnumClass"), false);
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.EnumValueOfExpression")) {
      SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.EnumValueOfExpression", null);
      SLinkOperations.setTarget(newNode, "enumClass", SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.EnumClass"), false);
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.EnumValuesExpression")) {
      SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.EnumValuesExpression", null);
      SLinkOperations.setTarget(newNode, "enumClass", SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.EnumClass"), false);
      return newNode;
    }
    throw new RuntimeException("Bad parameter object " + parameterObject);
  }
}
