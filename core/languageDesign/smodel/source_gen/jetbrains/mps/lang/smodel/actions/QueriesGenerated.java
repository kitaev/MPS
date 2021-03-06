package jetbrains.mps.lang.smodel.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import java.util.List;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.lang.smodel.behavior.ILinkAccess_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.behavior.StaticConceptMethodCall_Behavior;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.smodel.action.ModelActions;
import jetbrains.mps.nodeEditor.CellSide;
import jetbrains.mps.smodel.action.RemoveSubstituteActionByConditionContext;
import java.util.Iterator;
import jetbrains.mps.util.Condition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class QueriesGenerated {
  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SNodeOperation_1154637518825(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    boolean alreadyHasParms = ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "parameter", true)).count() > 0;
    if (alreadyHasParms) {
      return false;
    }
    return ListSequence.fromList(SLinkOperations.getConceptLinkTargets(_context.getSourceNode(), "applicableParameter")).count() > 0;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1179535189126(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    // use weak coerce because we want ':' to be applicable to SNode (class), linkAccess etc. 
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), true);
    return nodeType != null;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1179535648215(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    SNode expressionType = TypeChecker.getInstance().getTypeOf(_context.getSourceNode());
    if (SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.lang.smodel.structure.SConceptType")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.lang.smodel.structure.SModelType")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.lang.smodel.structure.SearchScopeType")) {
      return true;
    }
    return false;
  }

  public static void nodeFactory_NodeSetup_Node_GetAncestorOperation_1171415364778(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation")) {
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
    // init default parms 
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).isEmpty()) {
      SNodeFactoryOperations.addNewChild(_context.getNewNode(), "parameter", "jetbrains.mps.lang.smodel.structure.OperationParm_Concept");
    }
  }

  public static void nodeFactory_NodeSetup_Node_GetDescendantsOperation_1207248813875(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation")) {
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
    // init default parms 
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).isEmpty()) {
      SNodeFactoryOperations.addNewChild(_context.getNewNode(), "parameter", "jetbrains.mps.lang.smodel.structure.OperationParm_Concept");
    }
  }

  public static void nodeFactory_NodeSetup_Concept_IsSuperConceptOfOperation_1203553726915(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Concept_IsSubConceptOfOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "conceptArgument", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Concept_IsSubConceptOfOperation"), "conceptArgument", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_Concept_IsSubConceptOfOperation_1203553739271(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "conceptArgument", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation"), "conceptArgument", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_SNodeListType_1205353787834(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.baseLanguage.collections.structure.SequenceType")) {
      SNode elementType = SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.baseLanguage.collections.structure.SequenceType"), "elementType", true);
      if (SNodeOperations.isInstanceOf(elementType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
        SLinkOperations.setTarget(_context.getNewNode(), "elementConcept", SLinkOperations.getTarget(SNodeOperations.cast(elementType, "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false), false);
      }
    }
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.baseLanguage.collections.structure.ListType")) {
      SNode elementType = SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.baseLanguage.collections.structure.ListType"), "elementType", true);
      if (SNodeOperations.isInstanceOf(elementType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
        SLinkOperations.setTarget(_context.getNewNode(), "elementConcept", SLinkOperations.getTarget(SNodeOperations.cast(elementType, "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false), false);
      }
    }
  }

  public static void nodeFactory_NodeSetup_SNodeCreator_3602058458308809798(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeCreator")) {
      SLinkOperations.setTarget(_context.getNewNode(), "createdType", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeCreator"), "createdType", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_Concept_NewInstance_3341893916018829254(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Concept_NewInstance")) {
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static void nodeFactory_NodeSetup_Model_CreateNewNodeOperation_3341893916018829317(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "concept", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation"), "concept", false), false);
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static void nodeFactory_NodeSetup_Node_InsertNewNextSiblingOperation_3341893916018829414(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Node_InsertNewNextSiblingOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "concept", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Node_InsertNewNextSiblingOperation"), "concept", false), false);
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static void nodeFactory_NodeSetup_Node_InsertNewPrevSiblingOperation_3341893916018829508(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Node_InsertNewPrevSiblingOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "concept", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Node_InsertNewPrevSiblingOperation"), "concept", false), false);
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static void nodeFactory_NodeSetup_Node_ReplaceWithNewOperation_3341893916018829549(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Node_ReplaceWithNewOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "concept", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Node_ReplaceWithNewOperation"), "concept", false), false);
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static void nodeFactory_NodeSetup_Link_SetNewChildOperation_3341893916018829590(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "concept", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation"), "concept", false), false);
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static void nodeFactory_NodeSetup_LinkList_AddNewChildOperation_3341893916018829633(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation")) {
      SLinkOperations.setTarget(_context.getNewNode(), "concept", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation"), "concept", false), false);
      List<SNode> parms = SLinkOperations.getTargets(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "parameter", true);
      for (SNode parm : ListSequence.fromList(parms)) {
        ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(parm);
      }
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SNodeOperation_1138413233760(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    final ApplicableTypesInfo appTypesInfo;
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          ApplicableTypesInfo result = new ApplicableTypesInfo();
          SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
          SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
          SNode operation = SLinkOperations.getTarget(SNodeOperations.as(leftExpression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
          SNode linkAccess = SNodeOperations.as(operation, "jetbrains.mps.lang.smodel.structure.ILinkAccess");
          result.myLinkAccess = linkAccess;
          if ((linkAccess != null) && ILinkAccess_Behavior.call_isSingularCardinality_4024382256428848847(linkAccess)) {
            if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), true) != null) {
              result.myLinkToConcept = true;
            }
          }
          // is concept ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), false) != null) {
            result.myToConcept = true;
          }
          // is node ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), false) != null) {
            result.myToNode = true;
          }
          // is smodel ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SModelType"), false) != null) {
            result.myToModel = true;
          }
          return result;
        }
      };
      appTypesInfo = (ApplicableTypesInfo) calc.calculate();
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1206022149742(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.StaticConceptMethodCall");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return StaticConceptMethodCall_Behavior.getClassifiersWithStaticMethods_1213877485028(_context.getModel(), operationContext.getScope(), _context.getParentNode());
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.smodel.structure.StaticConceptMethodCall", null);
                SLinkOperations.setTarget(result, "concept", (item), false);
                return result;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "name") + ".";
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "static access";
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_AbstractOperationParameter_1206996889215(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          return ((List<SNode>) SLinkOperations.getConceptLinkTargets(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.lang.smodel.structure.SNodeOperation"), "applicableParameter"));
        }
      };
      Iterable queryResult = (Iterable) calc.calculate();
      if (queryResult != null) {
        for (Object item : queryResult) {
          List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions((SNode) item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
          ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SNodeOperation_1144103719164(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeOperation");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "parameter", "jetbrains.mps.lang.smodel.structure.AbstractOperationParameter");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "< .. >";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "add operation parameter(s)";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1179535189125(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode newNode = SNodeFactoryOperations.replaceWithNewChild(_context.getSourceNode(), "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression");
          SLinkOperations.setTarget(newNode, "leftExpression", _context.getSourceNode(), true);
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return ":";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "node type cast";
        }
      });
    }
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode newNode = SNodeFactoryOperations.replaceWithNewChild(_context.getSourceNode(), "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression");
          SLinkOperations.setTarget(newNode, "leftExpression", _context.getSourceNode(), true);
          SPropertyOperations.set(newNode, "asCast", "" + (true));
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return "as";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "node as cast";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1179535648214(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode newNode = SNodeFactoryOperations.replaceWithNewChild(_context.getSourceNode(), "jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression");
          SLinkOperations.setTarget(newNode, "leftExpression", _context.getSourceNode(), true);
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return "/";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "downcast to lower semantic level";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_IAttributeAccessQualifier_1205263933103(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          return SNodeOperations.getParent(_context.getSourceNode());
        }
      };
      SNode node = (SNode) calc.calculate();
      ListSequence.fromList(result).addSequence(ListSequence.fromList(ModelActions.createRightTransformHintSubstituteActions(node, CellSide.RIGHT, _context.getTransformationTag(), operationContext)));
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SEnumOperation_1241013269073(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          return SNodeOperations.getParent(_context.getSourceNode());
        }
      };
      SNode node = (SNode) calc.calculate();
      ListSequence.fromList(result).addSequence(ListSequence.fromList(ModelActions.createRightTransformHintSubstituteActions(node, CellSide.RIGHT, _context.getTransformationTag(), operationContext)));
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_AttributeQualifier_2788452359611995743(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          return SNodeOperations.getParent(_context.getSourceNode());
        }
      };
      SNode node = (SNode) calc.calculate();
      ListSequence.fromList(result).addSequence(ListSequence.fromList(ModelActions.createRightTransformHintSubstituteActions(node, CellSide.RIGHT, _context.getTransformationTag(), operationContext)));
    }
    return result;
  }

  public static void removeActionsByCondition_1180467401112(final IOperationContext operationContext, final RemoveSubstituteActionByConditionContext _context) {
    final ApplicableTypesInfo appTypesInfo;
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          ApplicableTypesInfo result = new ApplicableTypesInfo();
          SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
          SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
          SNode operation = SLinkOperations.getTarget(SNodeOperations.as(leftExpression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
          SNode linkAccess = SNodeOperations.as(operation, "jetbrains.mps.lang.smodel.structure.ILinkAccess");
          result.myLinkAccess = linkAccess;
          if ((linkAccess != null) && ILinkAccess_Behavior.call_isSingularCardinality_4024382256428848847(linkAccess)) {
            if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), true) != null) {
              result.myLinkToConcept = true;
            }
          }
          // is concept ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), false) != null) {
            result.myToConcept = true;
          }
          // is node ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), false) != null) {
            result.myToNode = true;
          }
          // is smodel ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SModelType"), false) != null) {
            result.myToModel = true;
          }
          return result;
        }
      };
      appTypesInfo = (ApplicableTypesInfo) calc.calculate();
    }
    Iterator<INodeSubstituteAction> actions = _context.getActions();
    while (actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      final SNode concept = current.getOutputConcept();
      SNode applicableConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeOperation");
      Condition cond = new Condition() {
        public boolean met(Object object) {
          SNode parameterOp = (SNode) concept;
          SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
          SNode leftOperation = null;
          if (SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.baseLanguage.structure.DotExpression")) {
            leftOperation = SLinkOperations.getTarget(SNodeOperations.cast(leftExpression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
          }
          // --- 
          if (leftOperation != null) {
            if (SNodeOperations.isInstanceOf(leftOperation, "jetbrains.mps.lang.smodel.structure.SPropertyAccess")) {
              SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(leftOperation, "jetbrains.mps.lang.smodel.structure.SPropertyAccess"), "property", false), "dataType", false);
              if (SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration")) {
                return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToEnumProperty"));
              } else {
                return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToSimpleProperty"));
              }
            }
            if (SNodeOperations.isInstanceOf(leftOperation, "jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess")) {
              return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToConceptProperty"));
            }
          }
          // ========== 
          SNode linkAccess = appTypesInfo.myLinkAccess;
          if (linkAccess != null) {
            if (ILinkAccess_Behavior.call_isSingularCardinality_4024382256428848847(linkAccess)) {
              // some ops are only applicable to 'link to concept' 
              if (SConceptPropertyOperations.getBoolean(parameterOp, "applicableToConcept") && !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToNode"))) {
                return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToLink") && appTypesInfo.myLinkToConcept);
              }
              return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToLink"));
            }
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToLinkList"));
          }
          // is concept ? 
          if (appTypesInfo.myToConcept) {
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToConcept"));
          }
          // is node ? 
          if (appTypesInfo.myToNode) {
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToNode"));
          }
          // is smodel ? 
          if (appTypesInfo.myToModel) {
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicableToModel"));
          }
          return true;
        }
      };
      if (SConceptOperations.isSuperConceptOf(applicableConcept, NameUtil.nodeFQName(concept)) && cond.met(concept)) {
        actions.remove();
      }
    }
  }

  public static void removeActionsByCondition_1230335583234(final IOperationContext operationContext, final RemoveSubstituteActionByConditionContext _context) {
    final ApplicableTypesInfo appTypesInfo;
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          ApplicableTypesInfo result = new ApplicableTypesInfo();
          SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
          SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
          SNode operation = SLinkOperations.getTarget(SNodeOperations.as(leftExpression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true);
          SNode linkAccess = SNodeOperations.as(operation, "jetbrains.mps.lang.smodel.structure.ILinkAccess");
          result.myLinkAccess = linkAccess;
          if ((linkAccess != null) && ILinkAccess_Behavior.call_isSingularCardinality_4024382256428848847(linkAccess)) {
            if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), true) != null) {
              result.myLinkToConcept = true;
            }
          }
          // is concept ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SConceptType"), false) != null) {
            result.myToConcept = true;
          }
          // is node ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), false) != null) {
            result.myToNode = true;
          }
          // is smodel ? 
          if (TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SModelType"), false) != null) {
            result.myToModel = true;
          }
          return result;
        }
      };
      appTypesInfo = (ApplicableTypesInfo) calc.calculate();
    }
    Iterator<INodeSubstituteAction> actions = _context.getActions();
    while (actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      final SNode concept = current.getOutputConcept();
      SNode applicableConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeOperation");
      Condition cond = new Condition() {
        public boolean met(Object object) {
          SNode linkAccess = appTypesInfo.myLinkAccess;
          if (linkAccess != null && !(ILinkAccess_Behavior.call_isAggregation_4024382256428848854(linkAccess))) {
            //  some operations are only applicable to aggregation links 
            if (SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.Link_DeleteChildOperation")) {
              return true;
            }
            if (SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation")) {
              return true;
            }
            if (SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.Node_DetachOperation")) {
              return true;
            }
          }
          return false;
        }
      };
      if (SConceptOperations.isSuperConceptOf(applicableConcept, NameUtil.nodeFQName(concept)) && cond.met(concept)) {
        actions.remove();
      }
    }
  }
}
