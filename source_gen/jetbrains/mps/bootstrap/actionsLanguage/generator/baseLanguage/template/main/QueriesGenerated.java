package jetbrains.mps.bootstrap.actionsLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRule_ParameterObject;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacro_ParameterObject;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.ActionQueryMethodName;
import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacro_ParameterObject;
import jetbrains.mps.generator.template.SourceSubstituteMacro_Node_ParameterObject;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.actionsLanguage.generator.baseLanguage.template.util.QueriesUtil;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1177330440365(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SPropertyOperations.getBoolean(_parameterObject.getNode(), "useNewActions");
  }

  public static boolean baseMappingRule_Condition_1177442255229(final IOperationContext operationContext, final BaseMappingRule_ParameterObject _parameterObject) {
    return SPropertyOperations.getBoolean(_parameterObject.getNode(), "useNewActions");
  }

  public static Object propertyMacro_GetPropertyValue_1183017316762(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    if(_parameterObject.getSourceModel().getLongName().endsWith(".actions")) {
      return "QueriesGenerated";
    } else
    {
      return "ActionsQueriesGenerated";
    }
  }

  public static Object propertyMacro_GetPropertyValue_1172253230032(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode builder = SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false);
    return ActionQueryMethodName.nodeSubstituteActionsBuilder_Precondition(((NodeSubstituteActionsBuilder)SNodeOperations.getAdapter(builder)));
  }

  public static Object propertyMacro_GetPropertyValue_1172253315888(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode builder = SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", false, false);
    return ActionQueryMethodName.rTransformHintSubstituteActionsBuilder_Precondition(((RTransformHintSubstituteActionsBuilder)SNodeOperations.getAdapter(builder)));
  }

  public static Object propertyMacro_GetPropertyValue_1172253035856(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    SNode nodeFactory = SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory", false, false);
    return ActionQueryMethodName.nodeFactory_NodeSetupFunction(((NodeFactory)SNodeOperations.getAdapter(nodeFactory)));
  }

  public static Object propertyMacro_GetPropertyValue_1177328723627(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ActionQueryMethodName.nodeFactory_SubstituteActionBuilder(((NodeSubstituteActionsBuilder)SNodeOperations.getAdapter(_parameterObject.getNode())));
  }

  public static Object propertyMacro_GetPropertyValue_1178541129260(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1177331479810(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177340188447(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177399369144(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177404507235(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177404645418(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_parameterObject.getNode(), "wrappedConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1181738947306(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1181736567569(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return "removeActionsByCondition_" + _parameterObject.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1177441873740(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return ActionQueryMethodName.nodeFactory_RightTransformActionBuilder(((RTransformHintSubstituteActionsBuilder)SNodeOperations.getAdapter(_parameterObject.getNode())));
  }

  public static Object propertyMacro_GetPropertyValue_1177499289033(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177509909274(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177527514739(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177527741008(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_parameterObject.getNode(), "baseConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177530577519(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_parameterObject.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1178542556851(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_parameterObject.getNode(), "variableDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1180136156113(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_parameterObject.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1182820930213(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_parameterObject.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1196434222023(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_1196435166148(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getString(_parameterObject.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_1197457082670(final IOperationContext operationContext, final PropertyMacro_ParameterObject _parameterObject) {
    return "removeRTActionsByCondition_" + _parameterObject.getNode().getId();
  }

  public static boolean ifMacro_Condition_1178782034640(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "commonInitializer", true) != null;
  }

  public static boolean ifMacro_Condition_1177335419476(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "canSubstitute", true) != null;
  }

  public static boolean ifMacro_Condition_1177335619232(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "canSubstitute", true) != null;
  }

  public static boolean ifMacro_Condition_1177336393312(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true) != null;
  }

  public static boolean ifMacro_Condition_1177336442294(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true) != null;
  }

  public static boolean ifMacro_Condition_1177399369238(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true) != null;
  }

  public static boolean ifMacro_Condition_1177399369261(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true) != null;
  }

  public static boolean ifMacro_Condition_1198600310110(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return !(SPropertyOperations.getBoolean(_parameterObject.getNode(), "returnSmallPart"));
  }

  public static boolean ifMacro_Condition_1198600330839(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SPropertyOperations.getBoolean(_parameterObject.getNode(), "returnSmallPart");
  }

  public static boolean ifMacro_Condition_1181738756958(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "commonInitializer", true) != null;
  }

  public static boolean ifMacro_Condition_1177499903622(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true) != null;
  }

  public static boolean ifMacro_Condition_1177499899976(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true) != null;
  }

  public static boolean ifMacro_Condition_1177514488331(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true), "body", true) != null;
  }

  public static boolean ifMacro_Condition_1177514494000(final IOperationContext operationContext, final IfMacro_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true), "body", true) != null;
  }

  public static SNode sourceNodeQuery_1172253302099(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1172253384416(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1172253185556(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1178541085974(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1179457640853(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "initializerBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1179457640870(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return Type_Behavior.call_getUnboxedType_1182580547590(SLinkOperations.getTarget(_parameterObject.getNode(), "type", true));
  }

  public static SNode sourceNodeQuery_1178782016772(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "commonInitializer", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177332016999(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177331967800(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "canSubstitute", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177336383605(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177336437649(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177353800103(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177357415115(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    if(SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false) != null) {
      return SLinkOperations.getTarget(SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart", false, false), "type", true);
    }
    if(SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedRightTransformMenuPart", false, false) != null) {
      return SLinkOperations.getTarget(SNodeOperations.getAncestor(_parameterObject.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedRightTransformMenuPart", false, false), "type", true);
    }
    return null;
  }

  public static SNode sourceNodeQuery_1177399369165(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177399369182(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177399369193(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177399369215(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177399369227(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177399369250(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177405091687(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "wrapperBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181738947298(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1181738985209(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "initializerBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181738985228(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return Type_Behavior.call_getUnboxedType_1182580547590(SLinkOperations.getTarget(_parameterObject.getNode(), "type", true));
  }

  public static SNode sourceNodeQuery_1181738763214(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getParent(_parameterObject.getNode(), null, false, false), "commonInitializer", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181736318685(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "condition", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177499792023(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177499861510(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177499864799(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177510051563(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177510450110(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177510459082(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177510544571(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177510684590(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177514451569(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177514456119(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177528022223(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1178542510747(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "variableDeclaration", false), "type", true);
  }

  public static SNode sourceNodeQuery_1180114556480(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "nodeBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1182820930324(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197457249775(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "condition", true), "body", true);
  }

  public static SNode sourceNodeQuery_1199903106468(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_parameterObject.getNode(), "query", true), "body", true);
  }

  public static List sourceNodesQuery_1178541065624(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "variable", true);
  }

  public static List sourceNodesQuery_1179457640889(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "variable", true);
  }

  public static List sourceNodesQuery_1177330914926(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getDescendantsWhereConceptInList(node, new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart","jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart"}, false);
  }

  public static List sourceNodesQuery_1181738947315(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(SNodeOperations.getParent(node, null, false, false), "variable", true);
  }

  public static List sourceNodesQuery_1181738985246(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(SNodeOperations.getParent(node, null, false, false), "variable", true);
  }

  public static List sourceNodesQuery_1177441873770(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getDescendantsWhereConceptInList(node, new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.IncludeRightTransformForNodePart","jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart","jetbrains.mps.bootstrap.actionsLanguage.structure.RightTransformMenuPart"}, false);
  }

  public static List sourceNodesQuery_1177530541055(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "exclude", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186794781128(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795057567(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795061791(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795065171(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795068567(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795071822(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1197455643098(SNode node, ITemplateGenerator generator) {
    return QueriesUtil.get_QueriesGenerated_class(generator);
  }

}
