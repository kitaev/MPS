package jetbrains.mps.baseLanguageInternal.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.baseLanguageInternal.generator.template.util.Flags;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguageInternal.generator.template.util.ContextUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_5546896804536307549(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return Flags.EXTRACT_STATEMENTS.isFlagged(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1238251891480(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(_context.getNode(), "makeUnique")) {
      SNode context = ContextUtil.getContextForConstant(_context, _context.getNode(), true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), "fieldName"), context);
    }
    return SPropertyOperations.getString(_context.getNode(), "fieldName");
  }

  public static Object propertyMacro_GetPropertyValue_5822086619725756114(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression"), "makeUnique")) {
      SNode context = ContextUtil.getContextForInnerClass(_context, SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassExpression"), true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), "name"), context);
    }
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8733626498296662444(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode esm = SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethodExpression");
    if (SPropertyOperations.getBoolean(esm, "makeUnique")) {
      SNode context = ContextUtil.getContextForMethod(_context, esm, true);
      return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), "name"), context);
    }
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_1238251743299(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ExtractToField");
  }

  public static Object referenceMacro_GetReferent_5822086619725756473(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "baseMethodDeclaration", false), "ExtractedCtor");
  }

  public static Object referenceMacro_GetReferent_8881995820265485461(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "baseMethodDeclaration", false), "ExtractedMeth");
  }

  public static SNode sourceNodeQuery_1238251880657(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "expression", true));
  }

  public static SNode sourceNodeQuery_1238251903567(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1822032100475268596(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inner", true);
  }

  public static SNode sourceNodeQuery_5822086619725756086(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "innerClass", true);
  }

  public static SNode sourceNodeQuery_5822086619725756099(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "visibility", true);
  }

  public static SNode sourceNodeQuery_5822086619725756147(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "superclass", true);
  }

  public static SNode sourceNodeQuery_5822086619725756204(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "staticInitializer", true);
  }

  public static SNode sourceNodeQuery_5822086619725756291(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "instanceInitializer", true);
  }

  public static SNode sourceNodeQuery_5822086619725756459(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inner", true);
  }

  public static SNode sourceNodeQuery_8733626498296395211(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "innerExpr", true), "inner", true);
  }

  public static SNode sourceNodeQuery_8733626498296637791(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "returnType", true);
  }

  public static SNode sourceNodeQuery_8733626498296662849(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_8733626498296662866(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "visibility", true);
  }

  public static SNode sourceNodeQuery_8733626498296662888(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "method", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756164(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "implementedInterface", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756184(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticField", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756224(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "field", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756268(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756307(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "constructor", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756332(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "method", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756410(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticMethod", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756432(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticInnerClassifiers", true);
  }

  public static Iterable sourceNodesQuery_5822086619725756498(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "actualArgument", true);
  }

  public static Iterable sourceNodesQuery_7905975464767281412(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> stlist = new ArrayList<SNode>();
    for (SNode exl : SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression", false, new String[]{})) {
      if ((SLinkOperations.getTarget(exl, "stmts", true) != null)) {
        ListSequence.fromList(stlist).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(exl, "stmts", true), "statement", true)));
      }
    }
    ListSequence.fromList(stlist).addElement(_context.getNode());
    return stlist;
  }

  public static Iterable sourceNodesQuery_8733626498296662462(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_8733626498296662815(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "throwsItem", true);
  }

  public static Iterable sourceNodesQuery_8881995820265483078(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "actualArgument", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1238251595165(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForConstant(_context, _context.getNode(), true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_5822086619725756049(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForInnerClass(_context, _context.getNode(), false);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_8881995820265482161(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return ContextUtil.getContextForMethod(_context, _context.getNode(), false);
  }

  public static void mappingScript_CodeBlock_5546896804536307448(final IOperationContext operationContext, final MappingScriptContext _context) {
    for (SNode nn : SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression")) {
      List<SNode> all = SNodeOperations.getAncestors(nn, "jetbrains.mps.baseLanguage.structure.Statement", false);
      for (SNode statement : all) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(statement), "jetbrains.mps.baseLanguage.structure.StatementList")) {
          Flags.EXTRACT_STATEMENTS.flag(statement);
          break;
        }
      }
    }
  }
}
