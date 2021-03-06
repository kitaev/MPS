package jetbrains.mps.baseLanguage.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ClosureLiteral_Behavior {
  private static Class[] PARAMETERS_1229718192182 = {SNode.class, List.class, SNode.class, SNode.class, SNode.class, List.class};
  private static Class[] PARAMETERS_3262277503800835449 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder sb = new StringBuilder("{");
    String sep = " ";
    for (SNode pd : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      sb.append(sep).append(BaseConcept_Behavior.call_getPresentation_1213877396640(pd));
      sep = ", ";
    }
    return sb.append(" => <body> }").toString();
  }

  public static String call_getFunctionInterfaceName_1213877338544(SNode thisNode) {
    return "_function_" + ((SNode) thisNode).getId();
  }

  public static SNode virtual_getType_1229718192182(SNode thisNode, List<SNode> paramTypes, SNode resultType, SNode returnType, SNode termType, List<SNode> throwsTypes) {
    return new ClosureLiteral_Behavior.QuotationClass_l77foe_a0a0d().createNode(paramTypes, resultType, throwsTypes);
  }

  public static boolean virtual_isStatementListCompactable_1237546012856(SNode thisNode) {
    return !(SPropertyOperations.getBoolean(thisNode, "forceMultiLine"));
  }

  public static SNode virtual_getBody_1239354440022(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "body", true);
  }

  public static SNode virtual_getExpectedRetType_1239354342632(SNode thisNode) {
    // everything which is not void and null is good, 
    // look at ExpressionStatement.canServeAsReturn 
    return new ClosureLiteral_Behavior.QuotationClass_l77foe_a0c0g().createNode();
  }

  public static List<SNode> virtual_getThrowableTypes_6204026822016975623(SNode thisNode) {
    return new ArrayList<SNode>();
  }

  public static boolean virtual_implicitThrows_4989157187872658723(SNode thisNode) {
    return true;
  }

  public static boolean virtual_isClosure_3262277503800835439(SNode thisNode) {
    return true;
  }

  public static SNode call_getType_1229718192182(SNode thisNode, List<SNode> paramTypes, SNode resultType, SNode returnType, SNode termType, List<SNode> throwsTypes) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "virtual_getType_1229718192182", PARAMETERS_1229718192182, paramTypes, resultType, returnType, termType, throwsTypes);
  }

  public static boolean call_isClosure_3262277503800835449(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "virtual_isClosure_3262277503800835439", PARAMETERS_3262277503800835449);
  }

  public static SNode callSuper_getType_1229718192182(SNode thisNode, String callerConceptFqName, List<SNode> paramTypes, SNode resultType, SNode returnType, SNode termType, List<SNode> throwsTypes) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), callerConceptFqName, "virtual_getType_1229718192182", PARAMETERS_1229718192182, paramTypes, resultType, returnType, termType, throwsTypes);
  }

  public static boolean callSuper_isClosure_3262277503800835449(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), callerConceptFqName, "virtual_isClosure_3262277503800835439", PARAMETERS_3262277503800835449);
  }

  public static class QuotationClass_l77foe_a0a0d {
    public QuotationClass_l77foe_a0a0d() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8, Object parameter_9) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        {
          List<SNode> nodes = (List<SNode>) parameter_7;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameterType", HUtil.copyIfNecessary(child));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = HUtil.copyIfNecessary(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        {
          List<SNode> nodes = (List<SNode>) parameter_9;
          for (SNode child : nodes) {
            quotedNode_1.addChild("throwsType", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_l77foe_a0c0g {
    public QuotationClass_l77foe_a0c0g() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
