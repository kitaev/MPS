package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import java.util.Iterator;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.structure.Classifier;
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
  public static boolean checkAppliedCorrectly_generic(SNode op) {
    List<String> applicables = new ArrayList<String>();
    // ===========
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_model")) {
      SNode leftType = RulesUtil.typeOf_leftExpression(op);
      if(TypeChecker.getInstance().getSubtypingManager().isSubtype(leftType, new QuotationClass_46().createNode())) {
        return true;
      }
      applicables.add("model");
    }
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_concept")) {
      SNode leftType = RulesUtil.typeOf_leftExpression(op);
      if(TypeChecker.getInstance().getSubtypingManager().isSubtype(leftType, new QuotationClass_47().createNode())) {
        return true;
      }
      applicables.add("concept");
    }
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_node")) {
      // todo: get type of left expression and try to 'adapt' to snode
      SNode leftType = RulesUtil.typeOf_leftExpression(op);
      if(TypeChecker.getInstance().getSubtypingManager().isSubtype(leftType, new QuotationClass_48().createNode())) {
        return true;
      }
      applicables.add("node");
    }
    // ===========
    SNode leftExpression = RulesUtil.leftExpression(op);
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_link")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
        return true;
      }
      applicables.add("link-access");
    }
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_linkList")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
        return true;
      }
      applicables.add("link-list-access");
    }
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_simple_property")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
        SNode propertyDecl = SLinkOperations.getTarget(leftOp, "property", false);
        if(DataTypeUtil.isSimple(((DataTypeDeclaration)SNodeOperations.getAdapter(SLinkOperations.getTarget(propertyDecl, "dataType", false))))) {
          return true;
        }
      }
      applicables.add("simple-property-access");
    }
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_enum_property")) {
      SNode leftOp = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
      if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOp), "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
        SNode propertyDecl = SLinkOperations.getTarget(leftOp, "property", false);
        if(DataTypeUtil.isEnum(((DataTypeDeclaration)SNodeOperations.getAdapter(SLinkOperations.getTarget(propertyDecl, "dataType", false))))) {
          return true;
        }
      }
      applicables.add("enum-property-access");
    }
    if(SConceptPropertyOperations.getBoolean(op, "applicable_to_concept_property")) {
      // ???
    }
    // ===========
    String applicableTo = "";
    Iterator<String> iter = applicables.iterator();
    while(iter.hasNext()) {
      applicableTo = applicableTo + iter.next();
      if(iter.hasNext()) {
        applicableTo = applicableTo + ",";
      }
    }
    TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to " + applicableTo);
    return false;
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
  public static boolean checkOpParameters_generic(SNode op) {
    boolean noProblem = true;
    List<SNode> applicableParmConcepts = op.getConceptLinkTargets(SNodeOperation.CLNK_ApplicableParameter, true, GlobalScope.getInstance());
    {
      ICursor<SNode> _zCursor = CursorFactory.createCursor(SLinkOperations.getTargets(op, "parameter", true));
      try {
        while(_zCursor.moveToNext()) {
          SNode parm = _zCursor.getCurrent();
          if(!(SequenceOperations.contains(applicableParmConcepts, SNodeOperations.getConceptDeclaration(parm)))) {
            TypeChecker.getInstance().reportTypeError(parm, "not applicable here");
            noProblem = false;
          }
        }
      } finally {
        _zCursor.release();
      }
    }
    return noProblem;
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
    SNode targetType = new QuotationClass_49().createNode();
    SLinkOperations.setTarget(targetType, "concept", targetConcept, false);
    return targetType;
  }
  public static SNode get_AdapterClassType_for_Concept(SNode concept) {
    if(concept == null) {
      return new QuotationClass_50().createNode();
    }
    String adapterClassFqName = NameUtil.nodeFQName(concept);
    Object adapterClassAdapter = SModelUtil_new.findNodeByFQName(adapterClassFqName, Classifier.class, GlobalScope.getInstance());
    SNode adapterClass = BaseAdapter.fromAdapter((INodeAdapter)adapterClassAdapter);
    SNode adapterClassType = SModelOperations.createNewNode(SNodeOperations.getModel(new QuotationClass_51().createNode()), "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(adapterClassType, "classifier", adapterClass, false);
    return adapterClassType;
  }
  public static SNode get_SNodeType_fromOpParameter(SNode op) {
    SNode type = new QuotationClass_52().createNode();
    SNode parm = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(op, "parameter", true), new zPredicate(null, null)));
    if(parm != null) {
      SLinkOperations.setTarget(type, "concept", SLinkOperations.getTarget(parm, "concept", false), false);
    }
    return type;
  }
  public static SNode get_SNodeListType_fromOpParameter(SNode op) {
    SNode type = new QuotationClass_53().createNode();
    SNode parm = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(op, "parameter", true), new zPredicate1(null, null)));
    if(parm != null) {
      SLinkOperations.setTarget(type, "elementConcept", SLinkOperations.getTarget(parm, "concept", false), false);
    }
    return type;
  }
}
