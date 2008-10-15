package jetbrains.mps.lang.generator.generationContext.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.generator.generationContext.behavior.GenerationContextOp_UserObjectAccessBase_Behavior;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1216862267898(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_Base");
  }

  public static boolean baseMappingRule_Condition_1217891542034(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "operation", true), "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_UserObjectAccessBase");
  }

  public static boolean baseMappingRule_Condition_1217892220393(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return GenerationContextOp_UserObjectAccessBase_Behavior.call_isLValueInAssignment_1217892546644(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1217894198725(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return GenerationContextOp_UserObjectAccessBase_Behavior.call_isLValueInAssignment_1217892546644(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1217894200267(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return GenerationContextOp_UserObjectAccessBase_Behavior.call_isLValueInAssignment_1217892546644(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1216862267927(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "labelName_intern") != null) {
      // operation has been preprocessed by mapping script in TLBase
      return SPropertyOperations.getString(_context.getNode(), "labelName_intern");
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1216862267963(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "labelName_intern") != null) {
      // operation has been preprocessed by mapping script in TLBase
      return SPropertyOperations.getString(_context.getNode(), "labelName_intern");
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1217882311150(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "labelName_intern") != null) {
      // operation has been preprocessed by mapping script in TLBase
      return SPropertyOperations.getString(_context.getNode(), "labelName_intern");
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1221157951099(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "labelName_intern") != null) {
      // operation has been preprocessed by mapping script in TLBase
      return SPropertyOperations.getString(_context.getNode(), "labelName_intern");
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1221219976864(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "labelName_intern") != null) {
      // operation has been preprocessed by mapping script in TLBase
      return SPropertyOperations.getString(_context.getNode(), "labelName_intern");
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object referenceMacro_GetReferent_1216862267882(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    // method parameter
    return "_context";
  }

  public static boolean ifMacro_Condition_1217963743178(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referenceNode", true) != null;
  }

  public static boolean ifMacro_Condition_1217970163385(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referenceNode", true) != null;
  }

  public static boolean ifMacro_Condition_1217970189759(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referenceNode", true) != null;
  }

  public static boolean ifMacro_Condition_1218050438807(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "contextNode", true) != null;
  }

  public static SNode sourceNodeQuery_1216862267891(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    // delegate reduction to operation
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_1216862267915(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1216862267943(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1216862267955(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputNode", true);
  }

  public static SNode sourceNodeQuery_1216945829070(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217005065141(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217026990251(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217282271516(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217369738546(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217882311138(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217885063604(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217885063616(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputNode", true);
  }

  public static SNode sourceNodeQuery_1217891713240(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    // delegate reduction to operation
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "operation", true);
  }

  public static SNode sourceNodeQuery_1217892355021(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217892378550(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "userKey", true);
  }

  public static SNode sourceNodeQuery_1217892400236(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217892400248(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "userKey", true);
  }

  public static SNode sourceNodeQuery_1217892428790(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(SNodeOperations.getParent(_context.getNode())), "rValue", true);
  }

  public static SNode sourceNodeQuery_1217894198738(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217894198750(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "userKey", true);
  }

  public static SNode sourceNodeQuery_1217894198758(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(SNodeOperations.getParent(_context.getNode())), "rValue", true);
  }

  public static SNode sourceNodeQuery_1217894198777(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217894198789(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "userKey", true);
  }

  public static SNode sourceNodeQuery_1217894200280(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217894200292(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "userKey", true);
  }

  public static SNode sourceNodeQuery_1217894200300(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(SNodeOperations.getParent(_context.getNode())), "rValue", true);
  }

  public static SNode sourceNodeQuery_1217894200319(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217894200331(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "userKey", true);
  }

  public static SNode sourceNodeQuery_1217963666605(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217963701356(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "messageText", true);
  }

  public static SNode sourceNodeQuery_1217963768161(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referenceNode", true);
  }

  public static SNode sourceNodeQuery_1217970163373(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217970163396(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referenceNode", true);
  }

  public static SNode sourceNodeQuery_1217970163404(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "messageText", true);
  }

  public static SNode sourceNodeQuery_1217970189747(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1217970189770(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "referenceNode", true);
  }

  public static SNode sourceNodeQuery_1217970189778(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "messageText", true);
  }

  public static SNode sourceNodeQuery_1218050010029(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1218050010041(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "baseName", true);
  }

  public static SNode sourceNodeQuery_1218050478654(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "contextNode", true);
  }

  public static SNode sourceNodeQuery_1221157725124(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1221157951091(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputNode", true);
  }

  public static SNode sourceNodeQuery_1221219976844(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

  public static SNode sourceNodeQuery_1221219976856(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputNode", true);
  }

  public static SNode sourceNodeQuery_1224103049238(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode()), "operand", true);
  }

}
