package jetbrains.mps.lang.intentions.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.intentions.behavior.IntentionDeclaration_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
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

  public static boolean ifMacro_Condition_1204743248015(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "isApplicableFunction", true) != null;
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

}
