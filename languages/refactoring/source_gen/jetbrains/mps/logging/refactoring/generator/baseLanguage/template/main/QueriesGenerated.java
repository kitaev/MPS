package jetbrains.mps.logging.refactoring.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import java.util.List;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1189763520881(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode parent = SNodeOperations.getParent(node, null, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      return !(SLinkOperations.getTarget(parent, "lValue", true) == node);
    }
    return true;
  }

  public static boolean baseMappingRule_Condition_1189763354452(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference");
  }

  public static Object propertyMacro_GetPropertyValue_1189698210116(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776889452(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189698215259(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776896095(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1191238748328(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "userFriendlyName");
  }

  public static Object propertyMacro_GetPropertyValue_1191238835892(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getModel(node).toString() + "#" + node.getId();
  }

  public static Object propertyMacro_GetPropertyValue_1189697560065(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1190733623863(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "lValue", true), "argument", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1190733601350(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "argument", false), "name");
  }

  public static SNode referenceMacro_GetReferent_1189764427569(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode conceptFunction = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = (SNode)generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent();
    return ListOperations.getElement(SLinkOperations.getTargets(method, "parameter", true), 1);
  }

  public static SNode referenceMacro_GetReferent_1189764645520(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode conceptFunction = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = (SNode)generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent();
    return ListOperations.getElement(SLinkOperations.getTargets(method, "parameter", true), 1);
  }

  public static boolean ifMacro_Condition_1190725064806(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "isApplicableClause", true) != null);
  }

  public static boolean ifMacro_Condition_1190725026904(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "isApplicableClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190724959339(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "doRefactorClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592317472(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "getModelsToGenerateClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592504958(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "getModelsToGenerateClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190724916731(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "updateModelClause", true) != null);
  }

  public static boolean ifMacro_Condition_1192803873886(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_1192803930628(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (SLinkOperations.getTarget(node, "filterClause", true) == null);
  }

  public static List sourceNodesQuery_1189698183859(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "arguments", true);
  }

  public static List sourceNodesQuery_1189698208144(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "internalArguments", true);
  }

  public static SNode sourceNodeQuery_1190725081382(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "isApplicableClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724963405(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "doRefactorClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1191592317463(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "getModelsToGenerateClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724923720(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "updateModelClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197373531048(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "rValue", true);
  }

  public static SNode sourceNodeQuery_1192804088431(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192804118336(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192803833747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197376335545(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1197376295419(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

  public static SNode sourceNodeQuery_1197376395359(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1197376386350(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

  public static SNode sourceNodeQuery_1197376574865(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1197376658791(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1197376672098(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

  public static SNode sourceNodeQuery_1197376737930(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1197376726631(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1197376726639(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "destination", true);
  }

}
