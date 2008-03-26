package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.VisibleClassifierMembersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;

public class QueriesUtil {

  public static List<SNode> replaceNodeMenu_StaticFieldReference_getParameterObjects(SNode node) {
    List<SNode> result = new ArrayList<SNode>();
    SNode classifier = SLinkOperations.getTarget(node, "classifier", false);
    if (classifier == null) {
      return result;
    }
    ISearchScope searchScope = new VisibleClassifierMembersScope(((Classifier)SNodeOperations.getAdapter(classifier)), node, IClassifiersSearchScope.STATIC_MEMBER);
    List<SNode> members = (List<SNode>)searchScope.getNodes();
    ListOperations.addAllElements(result, SequenceOperations.where(members, new zPredicate(null, null)));
    return result;
  }

  public static SNode replaceNodeMenu_StaticFieldReference_createReplacementNode(SNode node, SNode parameterObject) {
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.StaticMethodCall", null);
      SLinkOperations.setTarget(newNode, "baseMethodDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "classConcept", SLinkOperations.getTarget(node, "classifier", false), false);
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.EnumConstantReference", null);
      SLinkOperations.setTarget(newNode, "enumConstantDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "enumClass", SLinkOperations.getTarget(node, "classifier", false), false);
      return newNode;
    }
    return node;
  }

  public static List<SNode> replaceNodeMenu_StaticMethodCall_getParameterObjects(SNode node) {
    List<SNode> result = new ArrayList<SNode>();
    SNode classifier = SLinkOperations.getTarget(node, "classConcept", false);
    if (classifier == null) {
      return result;
    }
    ISearchScope searchScope = new VisibleClassifierMembersScope(((Classifier)SNodeOperations.getAdapter(classifier)), node, IClassifiersSearchScope.STATIC_MEMBER);
    List<SNode> members = (List<SNode>)searchScope.getNodes();
    ListOperations.addAllElements(result, SequenceOperations.where(members, new zPredicate1(null, null)));
    return result;
  }

  public static SNode replaceNodeMenu_StaticMethodCall_createReplacementNode(SNode node, SNode parameterObject) {
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.StaticFieldReference", null);
      SLinkOperations.setTarget(newNode, "variableDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "classifier", SLinkOperations.getTarget(node, "classConcept", false), false);
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.EnumConstantReference", null);
      SLinkOperations.setTarget(newNode, "enumConstantDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "enumClass", SLinkOperations.getTarget(node, "classConcept", false), false);
      return newNode;
    }
    return node;
  }

  public static List<SNode> replaceNodeMenu_EnumConstantReference_getParameterObjects(SNode node) {
    List<SNode> result = new ArrayList<SNode>();
    SNode classifier = SLinkOperations.getTarget(node, "enumClass", false);
    if (classifier == null) {
      return result;
    }
    ISearchScope searchScope = new VisibleClassifierMembersScope(((Classifier)SNodeOperations.getAdapter(classifier)), node, IClassifiersSearchScope.STATIC_MEMBER);
    List<SNode> members = (List<SNode>)searchScope.getNodes();
    ListOperations.addAllElements(result, SequenceOperations.where(members, new zPredicate2(null, null)));
    return result;
  }

  public static SNode replaceNodeMenu_EnumConstantReference_createReplacementNode(SNode node, SNode parameterObject) {
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.StaticFieldReference", null);
      SLinkOperations.setTarget(newNode, "variableDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "classifier", SLinkOperations.getTarget(node, "enumClass", false), false);
      return newNode;
    }
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.StaticMethodCall", null);
      SLinkOperations.setTarget(newNode, "baseMethodDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "classConcept", SLinkOperations.getTarget(node, "enumClass", false), false);
      return newNode;
    }
    return node;
  }

  public static List<SNode> replaceNodeMenu_FieldReference_getParameterObjects(SNode node) {
    SNode instance = SLinkOperations.getTarget(node, "instance", true);
    SNode instanceType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
    if (instanceType == null) {
      return new ArrayList<SNode>();
    }
    ISearchScope searchScope = new VisibleClassifierMembersScope(((Classifier)SNodeOperations.getAdapter(SLinkOperations.getTarget(instanceType, "classifier", false))), node, IClassifiersSearchScope.INSTANCE_METHOD);
    return (List<SNode>)searchScope.getNodes();
  }

  public static SNode replaceNodeMenu_FieldReference_createReplacementNode(SNode node, SNode parameterObject) {
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.InstanceMethodCall", null);
      SLinkOperations.setTarget(newNode, "baseMethodDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "instance", SLinkOperations.getTarget(node, "instance", true), true);
      return newNode;
    }
    return node;
  }

  public static List<SNode> replaceNodeMenu_InstanceMethodCall_getParameterObjects(SNode referenceNode) {
    SNode instance = SLinkOperations.getTarget(referenceNode, "instance", true);
    SNode instanceType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
    if (instanceType == null) {
      return new ArrayList<SNode>();
    }
    ISearchScope searchScope = new VisibleClassifierMembersScope(((Classifier)SNodeOperations.getAdapter(SLinkOperations.getTarget(instanceType, "classifier", false))), referenceNode, IClassifiersSearchScope.INSTANCE_FIELD);
    return (List<SNode>)searchScope.getNodes();
  }

  public static SNode replaceNodeMenu_InstanceMethodCall_createReplacementNode(SNode node, SNode parameterObject) {
    if (SNodeOperations.isInstanceOf(parameterObject, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
      SNode newNode = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.FieldReference", null);
      SLinkOperations.setTarget(newNode, "variableDeclaration", parameterObject, false);
      SLinkOperations.setTarget(newNode, "instance", SLinkOperations.getTarget(node, "instance", true), true);
      return newNode;
    }
    return node;
  }

}
