package jetbrains.mps.ypath.generator.baseLanguage.template.generic;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ypath.constraints.TreePathOperationExpression_Behavior;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ypath.constraints.IGenericFeature_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.newGenerator.CloneUtil;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1191842720188(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode tpa = TreePathOperationExpression_Behavior.call_getTreePath_1184590859224(node);
    return !(SequenceOperations.isEmpty(SequenceOperations.where(SLinkOperations.getTargets(tpa, "features", true), new zPredicate(null, null))));
  }

  public static boolean baseMappingRule_Condition_1191856295120(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "operation", true), "jetbrains.mps.ypath.structure.IterateOperation") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "expression", true), "jetbrains.mps.ypath.structure.TreePathAdapterExpression");
  }

  public static boolean baseMappingRule_Condition_1191856350792(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "operation", true), "jetbrains.mps.ypath.structure.IterateOperation") && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "expression", true), "jetbrains.mps.ypath.structure.TreePathAdapterExpression"));
  }

  public static boolean ifMacro_Condition_1191863129014(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return IGenericFeature_Behavior.call_isSingleCardinality_1191862685760(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false));
  }

  public static boolean ifMacro_Condition_1193757842704(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return !(IGenericFeature_Behavior.call_isSingleCardinality_1191862685760(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false)));
  }

  public static boolean ifMacro_Condition_1191864519940(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return IGenericFeature_Behavior.call_isSingleCardinality_1191862685760(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false));
  }

  public static boolean ifMacro_Condition_1191864550814(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return !(IGenericFeature_Behavior.call_isSingleCardinality_1191862685760(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false)));
  }

  public static SNode sourceNodeQuery_1191861038777(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expression", true);
  }

  public static SNode mapSrcMacro_mapper_1191922729830(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode cp = SLinkOperations.getTarget(SNodeOperations.getAncestor(parentOutputNode, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapperBlock", false, false), "defaultInputElement", true);
    SNode cpr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClosureParameterReference", null);
    SLinkOperations.setTarget(cpr, "closureParameter", cp, false);
    return IGenericFeature_Behavior.call_getterExpression_1191865774161(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), cpr, SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false));
  }

  public static SNode mapSrcMacro_mapper_1193757829951(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode cp = SLinkOperations.getTarget(SNodeOperations.getAncestor(parentOutputNode, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapperBlock", false, false), "defaultInputElement", true);
    SNode cpr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClosureParameterReference", null);
    SLinkOperations.setTarget(cpr, "closureParameter", cp, false);
    return IGenericFeature_Behavior.call_getterExpression_1191865774161(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), cpr, SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false));
  }

  public static SNode mapSrcMacro_mapper_1191922016311(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode expression = SLinkOperations.getTarget(node, "expression", true);
    if(SNodeOperations.isInstanceOf(expression, "jetbrains.mps.ypath.structure.TreePathAdapterExpression")) {
      expression = SLinkOperations.getTarget(expression, "expression", true);
    }
    expression = CloneUtil.cloneNotPreservingId(expression, generator.getTargetModel(), generator.getScope());
    return IGenericFeature_Behavior.call_getterExpression_1191865774161(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), expression, SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false));
  }

  public static SNode mapSrcMacro_mapper_1191922089607(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode expression = SLinkOperations.getTarget(node, "expression", true);
    if(SNodeOperations.isInstanceOf(expression, "jetbrains.mps.ypath.structure.TreePathAdapterExpression")) {
      expression = SLinkOperations.getTarget(expression, "expression", true);
    }
    expression = CloneUtil.cloneNotPreservingId(expression, generator.getTargetModel(), generator.getScope());
    return IGenericFeature_Behavior.call_getterExpression_1191865774161(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "usedFeature", false), expression, SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "paramObject", true), "paramRef", false));
  }

}
