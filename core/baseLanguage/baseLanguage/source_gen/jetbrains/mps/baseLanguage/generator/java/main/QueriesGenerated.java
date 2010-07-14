package jetbrains.mps.baseLanguage.generator.java.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.Property_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1202097921504(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode lValue = SLinkOperations.getTarget(_context.getNode(), "lValue", true);
    return SNodeOperations.isInstanceOf(lValue, "jetbrains.mps.baseLanguage.structure.DotExpression") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(lValue, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.PropertyReference");
  }

  public static boolean baseMappingRule_Condition_1201386765715(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(_context.getNode(), "operation", true)), "jetbrains.mps.baseLanguage.structure.PropertyReference");
  }

  public static Object propertyMacro_GetPropertyValue_1224072736283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "resource_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1201571350771(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "my" + NameUtil.capitalize(SPropertyOperations.getString(_context.getNode(), "propertyName"));
  }

  public static Object propertyMacro_GetPropertyValue_1201570306027(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Property_Behavior.call_getGetterMethodName_1213877383170(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1202008885748(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Property_Behavior.call_getSetterMethodName_1213877383179(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1206153259009(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode property = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.PropertyReference"), "property", false);
    return Property_Behavior.call_getSetterMethodName_1213877383179(property);
  }

  public static Object propertyMacro_GetPropertyValue_1206154728906(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode property = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.structure.PropertyReference"), "property", false);
    return Property_Behavior.call_getGetterMethodName_1213877383170(property);
  }

  public static Object referenceMacro_GetReferent_2492830749282740166(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "classifierType", true), "classifier", false);
  }

  public static boolean ifMacro_Condition_3073231036165996124(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(_context.getNode()), new QueriesGenerated.QuotationClass_x583g4_a1a0a0a9().createNode()));
  }

  public static boolean ifMacro_Condition_1201570983175(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isDefaultImplementation_1213877383134(_context.getNode());
  }

  public static boolean ifMacro_Condition_1201570447832(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isCustomImplementation_1213877383144(_context.getNode());
  }

  public static boolean ifMacro_Condition_1201571423789(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isDefaultImplementation_1213877383134(_context.getNode());
  }

  public static boolean ifMacro_Condition_1202009232386(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isCustomImplementation_1213877383144(_context.getNode());
  }

  public static boolean ifMacro_Condition_1202009182092(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_isDefaultImplementation_1213877383134(_context.getNode());
  }

  public static boolean ifMacro_Condition_1202008840753(final IOperationContext operationContext, final IfMacroContext _context) {
    return Property_Behavior.call_hasSetter_1213877383224(_context.getNode());
  }

  public static SNode sourceNodeQuery_1224072736270(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(_context.getNode());
  }

  public static SNode sourceNodeQuery_1224072736278(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1224072736302(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1224072736313(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(_context.getNode());
  }

  public static SNode sourceNodeQuery_1201571340778(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1201570279414(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1201570293393(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "visibility", true);
  }

  public static SNode sourceNodeQuery_1202009151075(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1202008874192(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Property_Behavior.call_getSetterVisibility_1213877383188(_context.getNode());
  }

  public static SNode sourceNodeQuery_1206153169167(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rValue", true);
  }

  public static SNode sourceNodeQuery_1206153202718(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
  }

  public static SNode sourceNodeQuery_1206154777294(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode property = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.structure.PropertyReference"), "property", false);
    return SLinkOperations.getTarget(property, "type", true);
  }

  public static SNode sourceNodeQuery_1206154706538(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_2492830749282199462(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static Iterable sourceNodesQuery_1224072736293(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "resource", true);
  }

  public static Iterable sourceNodesQuery_1224072736321(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "resource", true);
  }

  public static Iterable sourceNodesQuery_1201570443454(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(Property_Behavior.call_getCustomPropertyImplementation_1213877383154(_context.getNode()), "getAccessor", true), "statementList", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_1202009237531(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(Property_Behavior.call_getCustomPropertyImplementation_1213877383154(_context.getNode()), "setAccessor", true), "statementList", true), "statement", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1201570605396(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }

  public static class QuotationClass_x583g4_a1a0a0a9 {
    public QuotationClass_x583g4_a1a0a0a9() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.io(java.io@java_stub)"), SNodeId.fromString("~Closeable")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
