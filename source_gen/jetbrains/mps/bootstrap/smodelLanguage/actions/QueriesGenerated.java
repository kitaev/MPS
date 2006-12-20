package jetbrains.mps.bootstrap.smodelLanguage.actions;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.ITypeObject;
import jetbrains.mps.typesystem.TypeCheckerAccess;
import jetbrains.mps.bootstrap.smodelLanguage.types.Snode_TypeObject;
import jetbrains.mps.bootstrap.smodelLanguage.types.Slink_TypeObject;
import java.util.List;
import jetbrains.mps.smodel.SModelUtil;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_SNodeOperation_1161715685433(SNode parentNode, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
      return ActionsUtil_mpsLoadable.isExpressionOf_any_our_Type(leftExpression);
    }
    return false;
  }
  public static boolean nodeSubstituteActionsBuilder_Precondition_SNodeOperation_1161716815601(SNode parentNode, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
      SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
      return ActionsUtil_mpsLoadable.isExpressionOf_snode_or_slink_Type(leftExpression);
    }
    return false;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1154624855279(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return ActionsUtil_mpsLoadable.isExpressionOf_any_our_Type(sourceNode);
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1154634535241(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    ITypeObject type = TypeCheckerAccess.getTypeChecker().getNodeType(sourceNode);
    return (type instanceof Snode_TypeObject) || (type instanceof Slink_TypeObject);
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1154636612745(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return ActionsUtil_mpsLoadable.isExpressionOf_any_our_Type(sourceNode);
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_SNodeOperation_1154637518825(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    boolean alreadyHasParms = SLinkOperations.getCount(sourceNode, "parameter") > 0;
    if(alreadyHasParms) {
      return false;
    }
    List<SNode> applicableParms = SModelUtil.getConceptLinkTargets(sourceNode, "applicableParameter", true, scope);
    return applicableParms.size() > 0;
  }
}
