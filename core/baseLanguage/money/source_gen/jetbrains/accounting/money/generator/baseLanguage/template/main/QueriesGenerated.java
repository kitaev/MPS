package jetbrains.accounting.money.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.accounting.money.generator.baseLanguage.template.util.Util;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1187352489455(final IOperationContext operationContext, final BaseMappingRuleContext _parameterObject) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_parameterObject.getNode(), "creator", true), "jetbrains.accounting.money.structure.MoneyCreator");
  }

  public static boolean baseMappingRule_Condition_1187347436103(final IOperationContext operationContext, final BaseMappingRuleContext _parameterObject) {
    return Util.isPlusMinusExpressionMoneyExpression(_parameterObject.getNode());
  }

  public static boolean baseMappingRule_Condition_1187349818811(final IOperationContext operationContext, final BaseMappingRuleContext _parameterObject) {
    return Util.isPlusMinusExpressionMoneyExpression(_parameterObject.getNode());
  }

  public static boolean baseMappingRule_Condition_1187350249789(final IOperationContext operationContext, final BaseMappingRuleContext _parameterObject) {
    return Util.isMulDivExpressionMoneyExpression(_parameterObject.getNode());
  }

  public static boolean baseMappingRule_Condition_1187350287829(final IOperationContext operationContext, final BaseMappingRuleContext _parameterObject) {
    return Util.isMulDivExpressionMoneyExpression(_parameterObject.getNode());
  }

  public static SNode sourceNodeQuery_1187347202363(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    SNode new_node = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StringLiteral", null);
    SPropertyOperations.set(new_node, "value", SPropertyOperations.getString(_parameterObject.getNode(), "amount"));
    return new_node;
  }

  public static SNode sourceNodeQuery_1187347224873(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    SNode new_node = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StringLiteral", null);
    SPropertyOperations.set(new_node, "value", SPropertyOperations.getString(_parameterObject.getNode(), "currency"));
    return new_node;
  }

  public static SNode sourceNodeQuery_1187347392064(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "creator", true), "amount", true);
  }

  public static SNode sourceNodeQuery_1187347370038(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "creator", true), "currency", true);
  }

  public static SNode sourceNodeQuery_1187350208470(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1187350208481(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1187349818793(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1187349818803(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1187350308246(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1187350367397(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1187350312051(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1187350349293(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1187358522938(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "instance", true);
  }

  public static SNode sourceNodeQuery_1187358546122(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "instance", true);
  }

  public static SNode sourceNodeQuery_1187617814400(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "instance", true);
  }

}
