package jetbrains.mps.lang.intentions.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.intentions.behavior.IntentionDeclaration_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.intentions.behavior.BaseIntentionDeclaration_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_1192802755354(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IntentionDeclaration_Behavior.call_getGeneratedName_1213877237628(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1192804188826(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(_context.getNode(), "forConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1193397361930(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isErrorIntention");
  }

  public static Object propertyMacro_GetPropertyValue_1210842798123(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SNodeOperations.getModel(_context.getNode()).getLongName();
  }

  public static Object propertyMacro_GetPropertyValue_1225199866371(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes");
  }

  public static Object propertyMacro_GetPropertyValue_1240406868383(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IntentionDeclaration_Behavior.call_isParameterized_1240406910049(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_5711848865190513478(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BaseIntentionDeclaration_Behavior.call_getGeneratedName_6263518417926802289(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_5711848865190532187(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BaseIntentionDeclaration_Behavior.call_getGeneratedName_6263518417926802289(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_5711848865190532220(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(_context.getNode(), "forConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_5711848865190532425(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SNodeOperations.getModel(_context.getNode()).getLongName();
  }

  public static Object propertyMacro_GetPropertyValue_5711848865190532635(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SNodeOperations.getModel(_context.getNode()).getLongName();
  }

  public static Object propertyMacro_GetPropertyValue_5711848865190532652(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(_context.getNode(), "forConcept", false));
  }

  public static Object referenceMacro_GetReferent_4945049520561168160(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return IntentionDeclaration_Behavior.call_getGeneratedName_1213877237628(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_4945049520561168169(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return IntentionDeclaration_Behavior.call_getGeneratedName_1213877237628(_context.getNode());
  }

  public static boolean ifMacro_Condition_1204743248015(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_3618415754251192082(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null);
  }

  public static boolean ifMacro_Condition_3618415754251195574(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_3618415754251195625(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null);
  }

  public static boolean ifMacro_Condition_3618415754251195639(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null)) || SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_4945049520561168333(final IOperationContext operationContext, final IfMacroContext _context) {
    return IntentionDeclaration_Behavior.call_isParameterized_1240406910049(_context.getNode());
  }

  public static boolean ifMacro_Condition_4945049520561168352(final IOperationContext operationContext, final IfMacroContext _context) {
    return IntentionDeclaration_Behavior.call_isParameterized_1240406910049(_context.getNode());
  }

  public static boolean ifMacro_Condition_5711848865190532284(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_5711848865190532312(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null);
  }

  public static boolean ifMacro_Condition_5711848865190532327(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null)) || SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_5711848865190532364(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_5711848865190532390(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null);
  }

  public static boolean ifMacro_Condition_5711848865190532494(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_5711848865190532522(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null);
  }

  public static boolean ifMacro_Condition_5711848865190532537(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null)) || SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_5711848865190532574(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
  }

  public static boolean ifMacro_Condition_5711848865190532600(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "isAvailableInChildNodes") && (SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true) != null);
  }

  public static boolean ifMacro_Condition_8499078905499803540(final IOperationContext operationContext, final IfMacroContext _context) {
    return IntentionDeclaration_Behavior.call_isParameterized_1240406910049(_context.getNode());
  }

  public static SNode sourceNodeQuery_1192806258867(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_1192806443196(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_1192806465664(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "executeFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_2011896947621803615(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.intentions.structure.ParameterizedIntentionDeclaration"), "queryBlock", true), "paramType", true);
  }

  public static SNode sourceNodeQuery_2925366645633602038(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.intentions.structure.ParameterizedIntentionDeclaration"), "queryBlock", true), "paramType", true);
  }

  public static SNode sourceNodeQuery_3618415754251192111(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true);
  }

  public static SNode sourceNodeQuery_3618415754251192135(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_4945049520561168189(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.intentions.structure.ParameterizedIntentionDeclaration"), "queryBlock", true), "paramType", true);
  }

  public static SNode sourceNodeQuery_4945049520561168304(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.intentions.structure.ParameterizedIntentionDeclaration"), "queryBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_4945049520561168371(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.intentions.structure.ParameterizedIntentionDeclaration"), "queryBlock", true), "paramType", true);
  }

  public static SNode sourceNodeQuery_5711848865190532252(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_5711848865190532355(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_5711848865190532383(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true);
  }

  public static SNode sourceNodeQuery_5711848865190532411(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "executeFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_5711848865190532565(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_5711848865190532593(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "childFilterFunction", true);
  }

  public static SNode sourceNodeQuery_5711848865190532621(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "executeFunction", true), "body", true);
  }

  public static SNode sourceNodeQuery_5711848865190532702(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionFunction", true), "body", true);
  }
}
