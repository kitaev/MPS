package jetbrains.mps.bootstrap.constraintsLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.bootstrap.constraintsLanguage.constraints.ConceptMethodDeclaration_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;

import java.util.List;

public class QueriesGenerated {

  public static String propertyMacro_GetPropertyValue_1177677003299(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ConceptMethodDeclaration_Behavior.getGeneratedName_1177681178696(node);
  }
  public static String propertyMacro_GetPropertyValue_1181726948102(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ConceptMethodDeclaration_Behavior.getVirtualCallerName_1181725268250(node);
  }
  public static String propertyMacro_GetPropertyValue_1181727149831(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return ConceptMethodDeclaration_Behavior.getGeneratedName_1177681178696(node);
  }
  public static String propertyMacro_GetPropertyValue_1181727126085(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }
  public static String propertyMacro_GetPropertyValue_1177676953415(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }
  public static boolean ifMacro_Condition_1177759890771(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return !(SPropertyOperations.getBoolean(node, "isAbstract"));
  }
  public static boolean ifMacro_Condition_1181726948109(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(node, "isVirtual");
  }
  public static List sourceNodesQuery_1177676783297(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }
  public static List sourceNodesQuery_1177676798785(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "method", true);
  }
  public static List sourceNodesQuery_1181726948063(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }
  public static List sourceNodesQuery_1181726948095(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "method", true);
  }
  public static List sourceNodesQuery_1181727087114(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "parameter", true);
  }
  public static SNode sourceNodeQuery_1177676686820(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "constructor", true), "body", true);
  }
  public static SNode sourceNodeQuery_1177676837084(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }
  public static SNode sourceNodeQuery_1177676892345(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "returnType", true);
  }
  public static SNode sourceNodeQuery_1177676915590(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1181726948071(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }
  public static SNode sourceNodeQuery_1181726948078(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "returnType", true);
  }
  public static SNode sourceNodeQuery_1181727110484(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "type", true);
  }
  public static SNode sourceNodeQuery_1181727002179(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "returnType", true);
  }
  public static SNode sourceNodeQuery_1177762503932(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }
}
