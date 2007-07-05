package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class RulesFunctions_Collections {

  public static SNode get_inputSequenceType_elementType(SNode op) {
    SNode sequenceType = RulesFunctions_Collections.get_inputSequenceType(op);
    return SLinkOperations.getTarget(sequenceType, "elementType", true);
  }
  public static SNode get_inputSequenceType(SNode op) {
    SNode parent = SNodeOperations.getParent(op, null, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression")) {
      SNode leftExpression = SLinkOperations.getTarget(parent, "leftExpression", true);
      SNode sequenceType = TypeUtil_Collections.coerceTo_SequenceType(TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(leftExpression));
      if(sequenceType != null) {
        return sequenceType;
      } else
      {
        TypeChecker.getInstance().reportTypeError(leftExpression, "sequence is expected");
      }
    } else
    {
      TypeChecker.getInstance().reportTypeError(op, "not expected here: is only applicable to sequence");
    }
    return null;
  }
  public static SNode get_inputListType_elementType(SNode op) {
    SNode listType = RulesFunctions_Collections.get_inputListType(op);
    return SLinkOperations.getTarget(listType, "elementType", true);
  }
  public static SNode get_inputListType(SNode op) {
    SNode parent = SNodeOperations.getParent(op, null, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression")) {
      SNode leftExpression = SLinkOperations.getTarget(parent, "leftExpression", true);
      SNode leftExpressionType = TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(leftExpression);
      SNode listType = TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType"), true);
      if(listType != null) {
        return listType;
      } else
      {
        TypeChecker.getInstance().reportTypeError(leftExpression, "list is expected but was " + leftExpressionType);
      }
    } else
    {
      TypeChecker.getInstance().reportTypeError(op, "not expected here: is only applicable to list");
    }
    return null;
  }
  public static Iterable<SNode> collectYieldStatements(SNode node) {
    Iterable<SNode> yieldStatements = SequenceOperations.map(SNodeOperations.getChildren(node), new zMapper(null, null));
    return yieldStatements;
  }
  public static SNode computeLeastCommonSupertype(SNode exprWithType, SNode currentLeastCommonSupertype) {
    SNode exprType = TypeChecker.getInstance().getRuntimeSupport().typeOf(exprWithType);
    if(exprType == null) {
      TypeChecker.getInstance().reportTypeError(exprWithType, "no type");
      return currentLeastCommonSupertype;
    }
    if(currentLeastCommonSupertype == null) {
      return exprType;
    }
    if(TypeChecker.getInstance().getSubtypingManager().isSubtype(currentLeastCommonSupertype, exprType)) {
      return exprType;
    }
    if(TypeChecker.getInstance().getSubtypingManager().isSubtype(exprType, currentLeastCommonSupertype)) {
      return currentLeastCommonSupertype;
    }
    TypeChecker.getInstance().reportTypeError(exprWithType, "type " + exprType + " is not compatible with infered " + currentLeastCommonSupertype);
    return currentLeastCommonSupertype;
  }
  public static SNode boxPrimitive(SNode primitiveType, SNode nodeToReportError) {
    SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce(primitiveType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
    if(classifierType != null) {
      return classifierType;
    }
    TypeChecker.getInstance().reportTypeError(nodeToReportError, "couldn't coerse " + primitiveType + " to classifier");
    return new QuotationClass_().createNode();
  }
}
