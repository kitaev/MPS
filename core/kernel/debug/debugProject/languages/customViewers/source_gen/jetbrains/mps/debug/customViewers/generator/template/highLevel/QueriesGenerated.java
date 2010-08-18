package jetbrains.mps.debug.customViewers.generator.template.highLevel;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.MappingScriptContext;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_4334584678156211292(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer")).isNotEmpty();
  }

  public static Object propertyMacro_GetPropertyValue_4334584678156217477(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "Wrapper";
  }

  public static Object propertyMacro_GetPropertyValue_4334584678156217411(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_WrapperFactory";
  }

  public static Object referenceMacro_GetReferent_4334584678156211313(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "viewer"), "constructor", true)).first();
  }

  public static boolean ifMacro_Condition_4334584678156217531(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getValuePresentation", true) != null);
  }

  public static SNode sourceNodeQuery_4334584678156217499(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getWatchables", true), "body", true);
  }

  public static SNode sourceNodeQuery_4334584678156217547(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getValuePresentation", true), "body", true);
  }

  public static SNode sourceNodeQuery_4334584678156217458(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canWrapValue", true), "body", true);
  }

  public static Iterable sourceNodesQuery_4334584678156211330(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer");
  }

  public static void mappingScript_CodeBlock_5331618481217787843(final IOperationContext operationContext, final MappingScriptContext _context) {
    // todo 
  }
}
