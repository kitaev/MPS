package jetbrains.mps.baseLanguage.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ClosureLiteral_Behavior {
  private static Class[] PARAMETERS_1229718192182 = {SNode.class ,List.class ,SNode.class ,SNode.class ,SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder sb = new StringBuilder("{");
    String sep = " ";
    for(SNode pd : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      sb.append(sep).append(BaseConcept_Behavior.call_getPresentation_1213877396640(pd));
      sep = ", ";
    }
    return sb.append(" => <body> }").toString();
  }

  public static String call_getFunctionInterfaceName_1213877338544(SNode thisNode) {
    return "_function_" + ((SNode)thisNode).getId();
  }

  public static SNode virtual_getType_1229718192182(SNode thisNode, List<SNode> paramTypes, SNode resultType, SNode returnType, SNode termType, List<SNode> throwsTypes) {
    return new _Quotations.QuotationClass_1().createNode(paramTypes, resultType, throwsTypes);
  }

  public static boolean virtual_isStatementListCompactable_1237546012856(SNode thisNode) {
    return true;
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "body", true);
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    // everything which is not void and null is good,
    // look at ExpressionStatement.canServeAsReturn
    return new _Quotations.QuotationClass_10().createNode();
  }

  public static SNode call_getType_1229718192182(SNode thisNode, List<SNode> paramTypes, SNode resultType, SNode returnType, SNode termType, List<SNode> throwsTypes) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "virtual_getType_1229718192182", PARAMETERS_1229718192182, paramTypes, resultType, returnType, termType, throwsTypes);
  }

  public static SNode callSuper_getType_1229718192182(SNode thisNode, String callerConceptFqName, List<SNode> paramTypes, SNode resultType, SNode returnType, SNode termType, List<SNode> throwsTypes) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), callerConceptFqName, "virtual_getType_1229718192182", PARAMETERS_1229718192182, paramTypes, resultType, returnType, termType, throwsTypes);
  }

}
