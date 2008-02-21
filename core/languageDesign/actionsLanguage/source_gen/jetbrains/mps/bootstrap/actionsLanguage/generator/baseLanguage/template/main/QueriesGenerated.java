package jetbrains.mps.bootstrap.actionsLanguage.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.ActionQueryMethodName;
import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory;
import jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.bootstrap.actionsLanguage.generator.baseLanguage.template.util.QueriesUtil;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1177330440365(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "useNewActions");
  }

  public static boolean baseMappingRule_Condition_1177442255229(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "useNewActions");
  }

  public static Object propertyMacro_GetPropertyValue_1172253035856(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode nodeFactory = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory", false, false);
    return ActionQueryMethodName.nodeFactory_NodeSetupFunction(((NodeFactory)SNodeOperations.getAdapter(nodeFactory)));
  }

  public static Object propertyMacro_GetPropertyValue_1172253230032(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode builder = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false);
    return ActionQueryMethodName.nodeSubstituteActionsBuilder_Precondition(((NodeSubstituteActionsBuilder)SNodeOperations.getAdapter(builder)));
  }

  public static Object propertyMacro_GetPropertyValue_1172253315888(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode builder = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", false, false);
    return ActionQueryMethodName.rTransformHintSubstituteActionsBuilder_Precondition(((RTransformHintSubstituteActionsBuilder)SNodeOperations.getAdapter(builder)));
  }

  public static Object propertyMacro_GetPropertyValue_1177328723627(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ActionQueryMethodName.nodeFactory_SubstituteActionBuilder(((NodeSubstituteActionsBuilder)SNodeOperations.getAdapter(_context.getNode())));
  }

  public static Object propertyMacro_GetPropertyValue_1177331479810(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode outputConcept = SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false);
    if(outputConcept == null) {
      _context.getGenerator().showWarningMessage(SNodeOperations.getParent(_context.getNode(), null, false, false), "output concept is not specified");
      return "?output concept is not specified?";
    }
    return NameUtil.nodeFQName(outputConcept);
  }

  public static Object propertyMacro_GetPropertyValue_1177340188447(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177399369144(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode concept = SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false);
    if((concept == null)) {
      _context.getGenerator().showErrorMessage(_context.getNode(), _context.getTemplateNode(), "output concept is not specified");
      return "?output concept is not specified?";
    }
    return NameUtil.nodeFQName(concept);
  }

  public static Object propertyMacro_GetPropertyValue_1177404507235(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177404645418(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "wrappedConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177441873740(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ActionQueryMethodName.nodeFactory_RightTransformActionBuilder(((RTransformHintSubstituteActionsBuilder)SNodeOperations.getAdapter(_context.getNode())));
  }

  public static Object propertyMacro_GetPropertyValue_1177499289033(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177509909274(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177527514739(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177527741008(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "baseConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1177530577519(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1178541129260(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1178542556851(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1181736567569(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "removeActionsByCondition_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1181738947306(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1183017316762(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if(_context.getSourceModel().getLongName().endsWith(".actions")) {
      return "QueriesGenerated";
    } else
    {
      return "ActionsQueriesGenerated";
    }
  }

  public static Object propertyMacro_GetPropertyValue_1196434222023(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_1196435166148(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_1197457082670(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "removeRTActionsByCondition_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1203025883846(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_1203348876735(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1203349256426(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "name");
  }

  public static Object referenceMacro_GetReferent_1202914532639(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false), "applicableConcept", false);
  }

  public static Object referenceMacro_GetReferent_1203068874715(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "concept", false);
  }

  public static boolean ifMacro_Condition_1177499899976(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "descriptionText", true) != null;
  }

  public static boolean ifMacro_Condition_1177499903622(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "matchingText", true) != null;
  }

  public static boolean ifMacro_Condition_1177514488331(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "matchingText", true), "body", true) != null;
  }

  public static boolean ifMacro_Condition_1177514494000(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionText", true), "body", true) != null;
  }

  public static boolean ifMacro_Condition_1178782034640(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "commonInitializer", true) != null;
  }

  public static boolean ifMacro_Condition_1181738756958(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "commonInitializer", true) != null;
  }

  public static boolean ifMacro_Condition_1198600310110(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(SPropertyOperations.getBoolean(_context.getNode(), "returnSmallPart"));
  }

  public static boolean ifMacro_Condition_1198600330839(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "returnSmallPart");
  }

  public static boolean ifMacro_Condition_1201900835343(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "matchingText", true) != null;
  }

  public static boolean ifMacro_Condition_1201900835367(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "descriptionText", true) != null;
  }

  public static boolean ifMacro_Condition_1203026970108(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canSubstitute", true) != null;
  }

  public static boolean ifMacro_Condition_1203026970132(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canSubstitute", true) != null;
  }

  public static boolean ifMacro_Condition_1203026970156(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "descriptionText", true) != null;
  }

  public static boolean ifMacro_Condition_1203026970180(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "matchingText", true) != null;
  }

  public static boolean ifMacro_Condition_1203073021643(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "icon", true) != null;
  }

  public static boolean ifMacro_Condition_1203073315188(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "icon", true) != null;
  }

  public static boolean ifMacro_Condition_1203073872725(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "icon", true) != null;
  }

  public static boolean ifMacro_Condition_1203074384106(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "icon", true), "body", true) != null;
  }

  public static boolean ifMacro_Condition_1203349777665(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "commonInitializer", true) != null;
  }

  public static SNode sourceNodeQuery_1172253185556(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1172253302099(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1172253384416(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1177353800103(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177405091687(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "wrapperBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177499792023(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177499861510(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177499864799(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177510051563(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177510450110(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177510459082(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177510544571(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1177510684590(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177514451569(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177514456119(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1177528022223(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1178541085974(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1178542510747(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "type", true);
  }

  public static SNode sourceNodeQuery_1178782016772(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "commonInitializer", true), "body", true);
  }

  public static SNode sourceNodeQuery_1179457640853(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "initializerBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1179457640870(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1182580547590(SLinkOperations.getTarget(_context.getNode(), "type", true));
  }

  public static SNode sourceNodeQuery_1180114556480(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "nodeBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181736318685(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "condition", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181738763214(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getParent(_context.getNode(), null, false, false), "commonInitializer", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181738947298(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1181738985209(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "initializerBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1181738985228(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return Type_Behavior.call_getUnboxedType_1182580547590(SLinkOperations.getTarget(_context.getNode(), "type", true));
  }

  public static SNode sourceNodeQuery_1182820930324(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197457249775(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "condition", true), "body", true);
  }

  public static SNode sourceNodeQuery_1199903106468(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1201900835262(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "query", true), "body", true);
  }

  public static SNode sourceNodeQuery_1201900835281(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1201900835296(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1201900835319(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1201900835332(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1201900835356(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203026970093(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203026970121(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canSubstitute", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203026970147(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "descriptionText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203026970171(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "matchingText", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203073040158(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "icon", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203073328859(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "icon", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203073876261(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "icon", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203074405261(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "icon", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203348867882(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1203348974786(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "initializerBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1203349032899(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1203349791101(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "commonInitializer", true), "body", true);
  }

  public static List sourceNodesQuery_1177330914926(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendantsWhereConceptInList(_context.getNode(), new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart","jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart"}, false);
  }

  public static List sourceNodesQuery_1177441873770(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendantsWhereConceptInList(_context.getNode(), new String[]{"jetbrains.mps.bootstrap.actionsLanguage.structure.IncludeRightTransformForNodePart","jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart","jetbrains.mps.bootstrap.actionsLanguage.structure.RightTransformMenuPart"}, false);
  }

  public static List sourceNodesQuery_1177530541055(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "exclude", true);
  }

  public static List sourceNodesQuery_1178541065624(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "variable", true);
  }

  public static List sourceNodesQuery_1179457640889(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "variable", true);
  }

  public static List sourceNodesQuery_1181738947315(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getParent(_context.getNode(), null, false, false), "variable", true);
  }

  public static List sourceNodesQuery_1181738985246(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getParent(_context.getNode(), null, false, false), "variable", true);
  }

  public static List sourceNodesQuery_1203348857747(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "variable", true);
  }

  public static List sourceNodesQuery_1203348941622(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "variable", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186794781128(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795057567(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795061791(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795065171(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795068567(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1186795071822(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1197455643098(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return QueriesUtil.get_QueriesGenerated_class(_context.getGenerator());
  }

}
