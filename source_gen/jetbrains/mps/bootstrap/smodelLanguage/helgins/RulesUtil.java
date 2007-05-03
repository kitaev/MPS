package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;

public class RulesUtil {

  public static SNode leftExpression(SNode op) {
    SNode parent = SNodeOperations.getParent(op, null, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      return SLinkOperations.getTarget(parent, "leftExpression", true);
    }
    return null;
  }
  public static SNode typeOf_leftExpression(SNode op) {
    SNode leftExpression = RulesUtil.leftExpression(op);
    if((leftExpression != null)) {
      TypeChecker.getInstance().getRuntimeSupport().check(leftExpression);
      return TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression);
    }
    return null;
  }
  public static boolean checkAppliedTo_SConcept(SNode op) {
    SNode type = RulesUtil.typeOf_leftExpression(op);
    if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(type, new QuotationClass_3().createNode()))) {
      TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to concept");
      return false;
    }
    return true;
  }
  public static boolean checkAppliedTo_SModel(SNode op) {
    SNode type = RulesUtil.typeOf_leftExpression(op);
    if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(type, new QuotationClass_4().createNode()))) {
      TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to model");
      return false;
    }
    return true;
  }
  public static boolean checkAppliedTo_SNode(SNode op) {
    // todo: get type of left expression and try to 'adapt' to snode
    SNode type = RulesUtil.typeOf_leftExpression(op);
    if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(type, new QuotationClass_5().createNode()))) {
      TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to node");
      return false;
    }
    return true;
  }
  public static boolean checkAppliedTo_LinkListAccess_aggregation(SNode op) {
    SNode leftExpression = RulesUtil.leftExpression(op);
    if(SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
        SNode link = SLinkOperations.getTarget(leftOp, "link", false);
        if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
          return true;
        }
      }
    }
    TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to aggregation-link-list-access");
    return false;
  }
  public static boolean checkAppliedTo_LinkListAccess(SNode op) {
    SNode leftExpression = RulesUtil.leftExpression(op);
    if(SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      return SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess");
    }
    TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to link-list-access");
    return false;
  }
  public static boolean checkAppliedTo_LinkAccess_aggregation(SNode op) {
    SNode leftExpression = RulesUtil.leftExpression(op);
    if(SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
        SNode link = SLinkOperations.getTarget(leftOp, "link", false);
        if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
          return true;
        }
      }
    }
    TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to aggregation-link-access");
    return false;
  }
  public static boolean checkAppliedTo_LinkAccess(SNode op) {
    SNode leftExpression = RulesUtil.leftExpression(op);
    if(SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      return SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess");
    }
    TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to link-access");
    return false;
  }
  public static boolean checkAssignableConcept(SNode fromConcept, SNode toConcept, SNode nodeToReportError, String errorTextPrefix) {
    if(fromConcept == null || toConcept == null) {
      return false;
    }
    String toConceptFqName = NameUtil.nodeFQName(toConcept);
    String fromConcepFqName = NameUtil.nodeFQName(fromConcept);
    if(!(SModelUtil_new.isAssignableConcept(fromConcepFqName, toConceptFqName))) {
      TypeChecker.getInstance().reportTypeError(nodeToReportError, "" + errorTextPrefix + "\nexpected: " + toConceptFqName + "\nwas: " + fromConcepFqName);
      return false;
    }
    return true;
  }
  public static SNode get_targetConcept_from_LinkOrLinkListAccess(SNode expression) {
    // todo: just compute type of the expression
    // now: the expression is expected to be SNodeOperationExpression with Link/LinkList access operation
    if(!(SNodeOperations.isInstanceOf(expression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"))) {
      return null;
    }
    SNode op = SLinkOperations.getTarget(expression, "nodeOperation", true);
    if(SNodeOperations.isInstanceOf(op, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
      return SLinkOperations.getTarget(SLinkOperations.getTarget(op, "link", false), "target", false);
    }
    if(SNodeOperations.isInstanceOf(op, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
      return SLinkOperations.getTarget(SLinkOperations.getTarget(op, "link", false), "target", false);
    }
    return null;
  }
  public static SNode get_typeOfTarget_from_LinkOrLinkListAccess(SNode expression) {
    SNode targetConcept = RulesUtil.get_targetConcept_from_LinkOrLinkListAccess(expression);
    SNode targetType = new QuotationClass_6().createNode();
    SLinkOperations.setTarget(targetType, "concept", targetConcept, false);
    return targetType;
  }
  public static SNode get_AdapterClassType_for_Concept(SNode concept) {
    if(concept == null) {
      return new QuotationClass_7().createNode();
    }
    String adapterClassFqName = NameUtil.nodeFQName(concept);
    Object adapterClassAdapter = SModelUtil_new.findNodeByFQName(adapterClassFqName, Classifier.class, GlobalScope.getInstance());
    SNode adapterClass = BaseAdapter.fromAdapter((INodeAdapter)adapterClassAdapter);
    SNode adapterClassType = SModelOperations.createNewNode(SNodeOperations.getModel(new QuotationClass_8().createNode()), "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(adapterClassType, "classifier", adapterClass, false);
    return adapterClassType;
  }
}
