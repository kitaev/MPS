package jetbrains.mps.regexp.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.regexp.generator.baseLanguage.template.util.GeneratorUtil;
import java.util.ArrayList;
import jetbrains.mps.regexp.behavior.Regexp_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.regex.Pattern;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {

  public static boolean createRootRule_Condition_1194610104145(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    SModel smodel = _context.getInputModel();
    return ListSequence.fromList(SModelOperations.getNodes(smodel, "jetbrains.mps.regexp.structure.InlineRegexpExpression")).count() > 0;
  }

  public static boolean baseMappingRule_Condition_1174659531465(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    boolean isReplaceExpression = SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ReplaceWithRegexpExpression");
    boolean isReplaceOperation = SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ReplaceWithRegexpOperation");
    return isReplaceExpression || isReplaceOperation;
  }

  public static boolean baseMappingRule_Condition_1222259398301(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.regexp.structure.SplitOperation");
  }

  public static boolean baseMappingRule_Condition_1222261187751(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.regexp.structure.ReplaceWithRegexpOperation");
  }

  public static boolean baseMappingRule_Condition_1222261663847(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.regexp.structure.MatchRegexpOperation");
  }

  public static boolean baseMappingRule_Condition_1222428491437(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    boolean isMatchStatement = SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.MatchRegexpStatement");
    boolean isMatchOperation = SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.MatchRegexpOperation");
    boolean isForEach = SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ForEachMatchStatement");
    boolean isFindMatch = SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.FindMatchStatement");
    return isMatchStatement || isMatchOperation || isForEach || isFindMatch;
  }

  public static Object propertyMacro_GetPropertyValue_1174655168104(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1174655313358(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1174658262046(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("_Replacer", null);
  }

  public static Object propertyMacro_GetPropertyValue_1174659618559(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<SNode> parensList = new ArrayList<SNode>();
    Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true), parensList);
    return 1 + parensList.indexOf(parens);
  }

  public static Object propertyMacro_GetPropertyValue_1175155526348(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175155558088(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175169642723(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175169648262(final IOperationContext operationContext, final PropertyMacroContext _context) {
    List<SNode> nodes = SNodeOperations.getAncestors(_context.getNode(), "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + ListSequence.fromList(nodes).count();
  }

  public static Object propertyMacro_GetPropertyValue_1175170026397(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode parens = SLinkOperations.getTarget(_context.getNode(), "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode());
    List<SNode> parensList = new ArrayList<SNode>();
    Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true), parensList);
    return 1 + parensList.indexOf(parens);
  }

  public static Object propertyMacro_GetPropertyValue_1194610282338(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Regexp_Behavior.call_toString_1213877429451(SLinkOperations.getTarget(_context.getNode(), "regexp", true));
  }

  public static Object propertyMacro_GetPropertyValue_1194610282348(final IOperationContext operationContext, final PropertyMacroContext _context) {
    int result = 0;
    if (SPropertyOperations.getBoolean(_context.getNode(), "multiLine")) {
      result = result + Pattern.MULTILINE;
    }
    if (SPropertyOperations.getBoolean(_context.getNode(), "dotAll")) {
      result = result + Pattern.DOTALL;
    }
    if (SPropertyOperations.getBoolean(_context.getNode(), "caseInsensitive")) {
      result = result + Pattern.CASE_INSENSITIVE;
    }
    return result;
  }

  public static Object propertyMacro_GetPropertyValue_1194610650675(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("REGEXP", null);
  }

  public static Object referenceMacro_GetReferent_1175170026388(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(GeneratorUtil.findRegexpUsingConstructionFor(_context.getNode()), "matcher");
  }

  public static Object referenceMacro_GetReferent_1194610323562(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "precompiledRegexp");
  }

  public static SNode sourceNodeQuery_1174512824855(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1174512909652(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1174512937325(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1174658308251(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1174659183903(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1174659193709(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1174659237673(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "replaceBlock", true);
  }

  public static SNode sourceNodeQuery_1175155573909(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175155635929(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175155725139(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1175164955452(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175164958475(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175169696431(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1175169704904(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expr", true);
  }

  public static SNode sourceNodeQuery_1175169838691(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1179358309388(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "regexp", true);
  }

  public static SNode sourceNodeQuery_1179358364442(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "inputExpression", true);
  }

  public static SNode sourceNodeQuery_1222257141471(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_1222257141479(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "operation", true), "regexp", true);
  }

  public static SNode sourceNodeQuery_1222261273767(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if ((SLinkOperations.getTarget(_context.getNode(), "operation", true) == null) || !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.regexp.structure.ReplaceWithRegexpOperation"))) {
      return null;
    }
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "operation", true), "replaceBlock", true);
  }

  public static SNode sourceNodeQuery_1222261743052(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "operation", true), "regexp", true);
  }

  public static SNode sourceNodeQuery_1222261743061(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_1222418914656(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if ((SLinkOperations.getTarget(_context.getNode(), "operation", true) == null) || !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.regexp.structure.ReplaceWithRegexpOperation"))) {
      return null;
    }
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "operation", true), "regexp", true);
  }

  public static SNode sourceNodeQuery_1222418938523(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static Iterable sourceNodesQuery_1194610249636(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.regexp.structure.InlineRegexpExpression");
  }

}
