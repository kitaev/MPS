package jetbrains.mps.regexp.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.regexp.RegexpProcessor;
import jetbrains.mps.regexp.generator.baseLanguage.template.util.GeneratorUtil;
import jetbrains.mps.regexp.structure.MatchParensRegexp;
import jetbrains.mps.regexp.structure.Regexp;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1174659423207(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.MatchRegexpStatement");
  }
  public static boolean baseMappingRule_Condition_1174659531465(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ReplaceWithRegexpExpression");
  }
  public static boolean baseMappingRule_Condition_1175155943336(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.ForEachMatchStatement");
  }
  public static boolean baseMappingRule_Condition_1175170005292(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false, false), "jetbrains.mps.regexp.structure.FindMatchStatement");
  }
  public static String propertyMacro_GetPropertyValue_1174511161822(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return BehaviorManager.getInstance().invoke(String.class, SLinkOperations.getTarget(node, "regexp", true), "virtual_toString_1177760132955");
  }
  public static String propertyMacro_GetPropertyValue_1175160038498(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    int result = 0;
    if(SPropertyOperations.getBoolean(node, "multiLine")) {
      result = result + Pattern.MULTILINE;
    }
    if(SPropertyOperations.getBoolean(node, "dotAll")) {
      result = result + Pattern.DOTALL;
    }
    if(SPropertyOperations.getBoolean(node, "caseInsensitive")) {
      result = result + Pattern.CASE_INSENSITIVE;
    }
    return "" + result;
  }
  public static String propertyMacro_GetPropertyValue_1174655313358(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> nodes = SNodeOperations.getAncestors(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + SequenceOperations.getSize(nodes);
  }
  public static String propertyMacro_GetPropertyValue_1174655168104(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> nodes = SNodeOperations.getAncestors(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + SequenceOperations.getSize(nodes);
  }
  public static String propertyMacro_GetPropertyValue_1174565617595(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parens = SLinkOperations.getTarget(node, "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(node);
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }
  public static String propertyMacro_GetPropertyValue_1174658262046(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("_Replacer");
  }
  public static String propertyMacro_GetPropertyValue_1174659618559(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parens = SLinkOperations.getTarget(node, "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(node);
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }
  public static String propertyMacro_GetPropertyValue_1175155526348(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> nodes = SNodeOperations.getAncestors(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + SequenceOperations.getSize(nodes);
  }
  public static String propertyMacro_GetPropertyValue_1175155558088(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> nodes = SNodeOperations.getAncestors(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + SequenceOperations.getSize(nodes);
  }
  public static String propertyMacro_GetPropertyValue_1175155997050(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parens = SLinkOperations.getTarget(node, "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(node);
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }
  public static String propertyMacro_GetPropertyValue_1175169642723(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> nodes = SNodeOperations.getAncestors(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_pattern_" + SequenceOperations.getSize(nodes);
  }
  public static String propertyMacro_GetPropertyValue_1175169648262(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> nodes = SNodeOperations.getAncestors(node, "jetbrains.mps.regexp.structure.RegexpUsingConstruction", false);
    return "_matcher_" + SequenceOperations.getSize(nodes);
  }
  public static String propertyMacro_GetPropertyValue_1175170026397(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parens = SLinkOperations.getTarget(node, "match", false);
    SNode c = GeneratorUtil.findRegexpUsingConstructionFor(node);
    List<MatchParensRegexp> matchparens = new ArrayList<MatchParensRegexp>();
    RegexpProcessor.toString(((Regexp)SNodeOperations.getAdapter(SLinkOperations.getTarget(SLinkOperations.getTarget(c, "regexp", true), "regexp", true))), matchparens);
    return "" + (1 + matchparens.indexOf(((MatchParensRegexp)SNodeOperations.getAdapter(parens))));
  }
  public static SNode referenceMacro_GetReferent_1174655509856(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return GeneratorUtil.findBuilderForMatcher(generator, node).getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1175155997041(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return GeneratorUtil.findBuilderForMatcher(generator, node).getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1175170026388(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return GeneratorUtil.findBuilderForMatcher(generator, node).getTargetNode();
  }
  public static SNode sourceNodeQuery_1174512824855(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "regexp", true);
  }
  public static SNode sourceNodeQuery_1174512909652(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expr", true);
  }
  public static SNode sourceNodeQuery_1174512937325(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1174659183903(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expr", true);
  }
  public static SNode sourceNodeQuery_1174659193709(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "regexp", true);
  }
  public static SNode sourceNodeQuery_1174659237673(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "replaceBlock", true);
  }
  public static SNode sourceNodeQuery_1174658308251(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1175155573909(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "regexp", true);
  }
  public static SNode sourceNodeQuery_1175155635929(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expr", true);
  }
  public static SNode sourceNodeQuery_1175155725139(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1175164955452(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expr", true);
  }
  public static SNode sourceNodeQuery_1175164958475(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "regexp", true);
  }
  public static SNode sourceNodeQuery_1175169696431(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "regexp", true);
  }
  public static SNode sourceNodeQuery_1175169704904(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expr", true);
  }
  public static SNode sourceNodeQuery_1175169838691(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
}
