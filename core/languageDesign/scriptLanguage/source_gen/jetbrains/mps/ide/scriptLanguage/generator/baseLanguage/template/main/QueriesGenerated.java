package jetbrains.mps.ide.scriptLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.ide.scriptLanguage.util.ScriptNameUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {

  public static Object propertyMacro_GetPropertyValue_1172274241857(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ScriptNameUtil.getClassName(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1172315115191(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "conceptDeclaration", false));
  }

  public static Object propertyMacro_GetPropertyValue_1172354478331(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String caption = SPropertyOperations.getString(_context.getNode(), "caption");
    return (caption == null ?
      "<no name>" :
      caption
    );
  }

  public static Object propertyMacro_GetPropertyValue_1177464819480(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "title");
  }

  public static Object propertyMacro_GetPropertyValue_1177555396906(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String title = SPropertyOperations.getString(_context.getNode(), "description");
    return (title != null ?
      title :
      ""
    );
  }

  public static Object propertyMacro_GetPropertyValue_1177555562762(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String title = SPropertyOperations.getString(_context.getNode(), "description");
    return (title != null ?
      title :
      ""
    );
  }

  public static Object propertyMacro_GetPropertyValue_1177465342820(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode affectedConcept = SLinkOperations.getTarget(_context.getNode(), "affectedInstanceConcept", false);
    return NameUtil.nodeFQName(affectedConcept);
  }

  public static Object propertyMacro_GetPropertyValue_1177464650516(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ScriptNameUtil.getMigrationScriptClassName(_context.getNode());
  }

  public static SNode sourceNodeQuery_1172287555052(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "statementList", true);
  }

  public static SNode sourceNodeQuery_1172333760299(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "nodeList", true);
  }

  public static SNode sourceNodeQuery_1177001853600(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "nodeExpression", true);
  }

  public static SNode sourceNodeQuery_1177466395402(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "affectedInstancePredicate", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177466489905(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "affectedInstanceUpdater", true), "body", true);
  }

  public static SNode sourceNodeQuery_1179444592655(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "oldNode", true);
  }

  public static SNode sourceNodeQuery_1179444604084(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "newNode", true);
  }

  public static List sourceNodesQuery_1202770334479(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticMethod", true);
  }

  public static List sourceNodesQuery_1177464931683(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "part", true);
  }

}
