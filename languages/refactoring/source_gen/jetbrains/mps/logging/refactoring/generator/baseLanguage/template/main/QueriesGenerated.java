package jetbrains.mps.logging.refactoring.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.bootstrap.editorLanguage.constraints.CellKeyMapKeystroke_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.ArrayList;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1189763520881(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode parent = SNodeOperations.getParent(_context.getNode(), null, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      return !(SLinkOperations.getTarget(parent, "lValue", true) == _context.getNode());
    }
    return true;
  }

  public static boolean baseMappingRule_Condition_1189763354452(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference");
  }

  public static Object propertyMacro_GetPropertyValue_1199462157225(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return CellKeyMapKeystroke_Behavior.call_getKeyStroke_1199461571140(SLinkOperations.getTarget(_context.getNode(), "keystroke", true));
  }

  public static Object propertyMacro_GetPropertyValue_1199462256696(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode overriden = SLinkOperations.getTarget(_context.getNode(), "overrides", false);
    return SNodeOperations.getModel(overriden) + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199464161444(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode conceptDeclaration = SLinkOperations.getTarget(_context.getNode(), "applicableConcept", false);
    return SNodeOperations.getModel(conceptDeclaration) + "." + SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199464123907(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode overriden = SLinkOperations.getTarget(_context.getNode(), "overrides", false);
    return SNodeOperations.getModel(overriden) + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1198673899511(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "My_" + SPropertyOperations.getString(_context.getNode(), "name") + "_Condition";
  }

  public static Object propertyMacro_GetPropertyValue_1189698210116(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776889452(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189698215259(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189776896095(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1191238748328(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "userFriendlyName");
  }

  public static Object propertyMacro_GetPropertyValue_1199466527696(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode conceptDeclaration = SLinkOperations.getTarget(_context.getNode(), "applicableConcept", false);
    return SNodeOperations.getModel(conceptDeclaration) + "." + SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1199468168869(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode overriden = SLinkOperations.getTarget(_context.getNode(), "overrides", false);
    return SNodeOperations.getModel(overriden) + "." + SPropertyOperations.getString(overriden, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1200921209509(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "updateModelClause", true) != null);
  }

  public static Object propertyMacro_GetPropertyValue_1197993525530(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_componentCreator";
  }

  public static Object propertyMacro_GetPropertyValue_1198600574129(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "_initialValue";
  }

  public static Object propertyMacro_GetPropertyValue_1200668668101(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668141(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668149(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668177(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668185(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668194(final IOperationContext operationContext, final PropertyMacroContext _context) {
    {
      Pattern_ pattern_1200921959366 = new Pattern_();
      SNode coercedNode_1200921959365 = TypeChecker.getInstance().getRuntimeSupport().coerce(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), pattern_1200921959366);
      if(coercedNode_1200921959365 != null) {
        SNode abstractConceptDeclaration = (SNode)pattern_1200921959366.PatternVar;
        return SNodeOperations.getModel(abstractConceptDeclaration).toString() + "." + SPropertyOperations.getString(abstractConceptDeclaration, "name");
      }
    }
    return null;
  }

  public static Object propertyMacro_GetPropertyValue_1200668668248(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668256(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668284(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "presentation");
  }

  public static Object propertyMacro_GetPropertyValue_1200668668292(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1189697560065(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1190733623863(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "lValue", true), "argument", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1198175268210(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "argument", false), "name");
  }

  public static Object referenceMacro_GetReferent_1200668668110(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "componentCreator");
  }

  public static Object referenceMacro_GetReferent_1200668668323(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "initialValue");
  }

  public static Object referenceMacro_GetReferent_1200668668344(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "conditionConstructor");
  }

  public static Object referenceMacro_GetReferent_1189764427569(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode conceptFunction = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent();
    return ListOperations.getElement(SLinkOperations.getTargets(method, "parameter", true), 1);
  }

  public static Object referenceMacro_GetReferent_1198175268220(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode conceptFunction = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    SNode method = (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(conceptFunction, "body", true), "methodBody").getParent().getParent().getParent();
    return ListOperations.getElement(SLinkOperations.getTargets(method, "parameter", true), 1);
  }

  public static boolean ifMacro_Condition_1199462382860(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) == null) && (SLinkOperations.getTarget(_context.getNode(), "keystroke", true) == null);
  }

  public static boolean ifMacro_Condition_1199462333157(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) == null) && (SLinkOperations.getTarget(_context.getNode(), "keystroke", true) != null);
  }

  public static boolean ifMacro_Condition_1199462335285(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1199464602796(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) == null);
  }

  public static boolean ifMacro_Condition_1199464637201(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1198674172362(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1199467946000(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) == null);
  }

  public static boolean ifMacro_Condition_1199468168888(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "overrides", false) != null);
  }

  public static boolean ifMacro_Condition_1190725064806(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "isApplicableClause", true) != null);
  }

  public static boolean ifMacro_Condition_1190725026904(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "isApplicableClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190724959339(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "doRefactorClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592317472(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getModelsToGenerateClause", true) != null);
  }

  public static boolean ifMacro_Condition_1191592504958(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "getModelsToGenerateClause", true) == null);
  }

  public static boolean ifMacro_Condition_1190724916731(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "updateModelClause", true) != null);
  }

  public static boolean ifMacro_Condition_1200668668128(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) != null);
  }

  public static boolean ifMacro_Condition_1200668668157(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new QuotationClass_().createNode());
  }

  public static boolean ifMacro_Condition_1200668668227(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new QuotationClass_1().createNode());
  }

  public static boolean ifMacro_Condition_1200668668264(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new QuotationClass_2().createNode());
  }

  public static boolean ifMacro_Condition_1200668668301(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true) == null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(_context.getNode(), "argumentType", true), new QuotationClass_3().createNode());
  }

  public static boolean ifMacro_Condition_1200668668331(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "initialValue", true) != null);
  }

  public static boolean ifMacro_Condition_1200668668353(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_1200668711127(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(SequenceOperations.isEmpty(SLinkOperations.getTargets(_context.getNode(), "arguments", true)));
  }

  public static boolean ifMacro_Condition_1200668775327(final IOperationContext operationContext, final IfMacroContext _context) {
    return SequenceOperations.isEmpty(SLinkOperations.getTargets(_context.getNode(), "arguments", true));
  }

  public static boolean ifMacro_Condition_1192803873886(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "filterClause", true) != null);
  }

  public static boolean ifMacro_Condition_1192803930628(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "filterClause", true) == null);
  }

  public static SNode sourceNodeQuery_1198673965458(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198674072178(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198674859451(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1198674956266(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1190725081382(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "isApplicableClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724963405(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "doRefactorClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1191592317463(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "getModelsToGenerateClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1190724923720(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "updateModelClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197993779521(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1197992605929(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "chooseComponentClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1198600035299(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1198600088963(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "initialValue", true), "body", true);
  }

  public static SNode sourceNodeQuery_1200668668090(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1200668668120(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1197373531048(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rValue", true);
  }

  public static SNode sourceNodeQuery_1198175268252(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "argument", false), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192804088431(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192804118336(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argumentType", true);
  }

  public static SNode sourceNodeQuery_1192803833747(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "filterClause", true), "body", true);
  }

  public static SNode sourceNodeQuery_1197387263078(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "feature", true);
  }

  public static SNode sourceNodeQuery_1197387243573(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "newConceptFQName", true);
  }

  public static SNode sourceNodeQuery_1197387243581(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "newFeatureName", true);
  }

  public static SNode sourceNodeQuery_1198577826555(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "argument", true);
  }

  public static SNode sourceNodeQuery_1199623494551(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623490797(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623613817(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623611204(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1199623608450(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623733861(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199623737069(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static SNode sourceNodeQuery_1199623873330(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "whatToMove", true);
  }

  public static SNode sourceNodeQuery_1199625039959(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "roleInTarget", true);
  }

  public static SNode sourceNodeQuery_1199623869841(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "destination", true);
  }

  public static List sourceNodesQuery_1198673830801(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(_context.getNode(), "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if((SLinkOperations.getTarget(argument, "filterClause", true) != null)) {
        ListOperations.addElement(result, argument);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1189698183859(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "arguments", true);
  }

  public static List sourceNodesQuery_1189698208144(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "internalArguments", true);
  }

  public static List sourceNodesQuery_1197992301257(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(_context.getNode(), "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if((SLinkOperations.getTarget(argument, "chooseComponentClause", true) != null)) {
        ListOperations.addElement(result, argument);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1198600029014(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> requiredUserEnteredArguments = SLinkOperations.getTargets(_context.getNode(), "arguments", true);
    for(SNode argument : requiredUserEnteredArguments) {
      if((SLinkOperations.getTarget(argument, "initialValue", true) != null)) {
        ListOperations.addElement(result, argument);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1200668668366(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "arguments", true);
  }

}
