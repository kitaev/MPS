package jetbrains.mps.bootstrap.smodelLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePrecondition_ParameterObject;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.smodel.action.RTransformPrecondition_ParameterObject;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.action.NodeSetup_ParameterObject;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import java.util.ArrayList;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration;
import jetbrains.mps.smodel.search.SModelSearchUtil_new;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptPropertyDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptLinkDeclaration;
import jetbrains.mps.smodel.action.ModelActions;
import jetbrains.mps.smodel.action.AbstractRTransformHintSubstituteAction;
import java.util.Iterator;
import jetbrains.mps.util.Condition;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_SNodeOperation_1161715685433(final IOperationContext operationContext, final NodeSubstitutePrecondition_ParameterObject _parameterObject) {
    SNode leftExpression = SLinkOperations.getTarget(_parameterObject.getParentNode(), "leftExpression", true);
    return ActionUtil_smodel.isExpression_appropriateFor_ourOperations(leftExpression);
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_SNodeOperation_1179529852529(final IOperationContext operationContext, final NodeSubstitutePrecondition_ParameterObject _parameterObject) {
    SNode leftExpression = SLinkOperations.getTarget(_parameterObject.getParentNode(), "leftExpression", true);
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
    return nodeType != null;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_SNodeOperation_1179530205324(final IOperationContext operationContext, final NodeSubstitutePrecondition_ParameterObject _parameterObject) {
    SNode leftExpression = SLinkOperations.getTarget(_parameterObject.getParentNode(), "leftExpression", true);
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
    return nodeType != null;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_SNodeOperation_1196936366507(final IOperationContext operationContext, final NodeSubstitutePrecondition_ParameterObject _parameterObject) {
    SNode expression = _parameterObject.getParentNode();
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(expression, "leftExpression", true)), new QuotationClass_().createNode());
  }

  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_SNodeOperation_1154637518825(final IOperationContext operationContext, final RTransformPrecondition_ParameterObject _parameterObject) {
    boolean alreadyHasParms = SLinkOperations.getCount(_parameterObject.getSourceNode(), "parameter") > 0;
    if(alreadyHasParms) {
      return false;
    }
    return SequenceOperations.getSize(SLinkOperations.getConceptLinkTargets(_parameterObject.getSourceNode(), "applicableParameter")) > 0;
  }

  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1179535189083(final IOperationContext operationContext, final RTransformPrecondition_ParameterObject _parameterObject) {
    return ActionUtil_smodel.isExpression_appropriateFor_ourOperations(_parameterObject.getSourceNode());
  }

  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1179535189126(final IOperationContext operationContext, final RTransformPrecondition_ParameterObject _parameterObject) {
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(_parameterObject.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
    return nodeType != null;
  }

  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1179535648215(final IOperationContext operationContext, final RTransformPrecondition_ParameterObject _parameterObject) {
    return ActionUtil_smodel.isExpression_appropriateFor_SemanticDowncast(_parameterObject.getSourceNode());
  }

  public static void nodeFactory_NodeSetup_Node_GetAncestorOperation_1171415364778(final IOperationContext operationContext, final NodeSetup_ParameterObject _parameterObject) {
    if(SNodeOperations.isInstanceOf(_parameterObject.getSampleNode(), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation")) {
      List<SNode> parms = SLinkOperations.getTargets(_parameterObject.getSampleNode(), "parameter", true);
      {
        ICursor<SNode> _zCursor = CursorFactory.createCursor(parms);
        try {
          while(_zCursor.moveToNext()) {
            SNode parm = _zCursor.getCurrent();
            SLinkOperations.addChild(_parameterObject.getNewNode(), "parameter", parm);
          }
        } finally {
          _zCursor.release();
        }
      }
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SNodeOperation_1138413233760(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode leftExpressionType;
    final Boolean leftIsModel;
    final Boolean leftIsNode;
    final Boolean leftIsConcept;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(parentNode, "leftExpression", true));
        }

      };
      leftExpressionType = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType"), false) != null;
        }

      };
      leftIsModel = (Boolean)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false) != null;
        }

      };
      leftIsNode = (Boolean)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType"), false) != null;
        }

      };
      leftIsConcept = (Boolean)calc.calculate();
    }
    // TODO: The initializer doesn't work for 'remove by condition' action
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SNodeOperation_1179529852420(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode leftNodeConcept;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
          SNode leftNodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
          if(SLinkOperations.getTarget(leftNodeType, "concept", false) == null) {
            return SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
          }
          return SLinkOperations.getTarget(leftNodeType, "concept", false);
        }

      };
      leftNodeConcept = (SNode)calc.calculate();
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          List<PropertyDeclaration> adapters = SModelSearchUtil_new.getPropertyDeclarationsExcludingOverridden(((AbstractConceptDeclaration)SNodeOperations.getAdapter(leftNodeConcept)));
          return (List<SNode>)BaseAdapter.toNodes(adapters);
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess", null);
            SLinkOperations.setTarget(newNode, "property", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SNodeOperation_1179530205323(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode leftNodeConcept;
    final List<SNode> links;
    final List<SNode> singularLinks;
    final List<SNode> pluralLinks;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
          SNode leftNodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
          if(SLinkOperations.getTarget(leftNodeType, "concept", false) == null) {
            return SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
          }
          return SLinkOperations.getTarget(leftNodeType, "concept", false);
        }

      };
      leftNodeConcept = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          List<LinkDeclaration> adapters = SModelSearchUtil_new.getLinkDeclarationsExcludingOverridden(((AbstractConceptDeclaration)SNodeOperations.getAdapter(leftNodeConcept)));
          return (List<SNode>)BaseAdapter.toNodes(adapters);
        }

      };
      links = (List<SNode>)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SequenceOperations.toList(SequenceOperations.where(links, new zPredicate(null, null)));
        }

      };
      singularLinks = (List<SNode>)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SequenceOperations.toList(SequenceOperations.where(links, new zPredicate1(null, null)));
        }

      };
      pluralLinks = (List<SNode>)calc.calculate();
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return singularLinks;
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess", null);
            SLinkOperations.setTarget(newNode, "link", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

        });
      }
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccessAsNode", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return singularLinks;
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccessAsNode", null);
            SLinkOperations.setTarget(newNode, "link", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

          public String getMatchingText(String pattern) {
            return SPropertyOperations.getString(((SNode)this.getParameterObject()), "role") + "/node";
          }

        });
      }
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return pluralLinks;
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess", null);
            SLinkOperations.setTarget(newNode, "link", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

        });
      }
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccessAsList", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return pluralLinks;
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccessAsList", null);
            SLinkOperations.setTarget(newNode, "link", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

          public String getMatchingText(String pattern) {
            return SPropertyOperations.getString(((SNode)this.getParameterObject()), "role") + "/list";
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SNodeOperation_1180538139816(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode leftConcept;
    final ISearchScope hierarchyScope;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
          SNode maybeConceptType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType"), false);
          if(maybeConceptType != null) {
            if(SLinkOperations.getTarget(maybeConceptType, "conceptDeclaraton", false) != null) {
              return SLinkOperations.getTarget(maybeConceptType, "conceptDeclaraton", false);
            } else
            {
              return SConceptOperations.findConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration");
            }
          }
          SNode maybeNodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(leftExpression), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false);
          if(maybeNodeType != null) {
            if(SLinkOperations.getTarget(maybeNodeType, "concept", false) != null) {
              return SLinkOperations.getTarget(maybeNodeType, "concept", false);
            } else
            {
              return SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
            }
          }
          return null;
        }

      };
      leftConcept = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration)SNodeOperations.getAdapter(leftConcept)));
        }

      };
      hierarchyScope = (ISearchScope)calc.calculate();
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          List<ConceptPropertyDeclaration> adapters = hierarchyScope.getAdapters(ConceptPropertyDeclaration.class);
          return (List<SNode>)BaseAdapter.toNodes(adapters);
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess", currentTargetNode);
            SLinkOperations.setTarget(newNode, "conceptProperty", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

        });
      }
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          List<ConceptLinkDeclaration> adapters = hierarchyScope.getAdapters(ConceptLinkDeclaration.class);
          return (List<SNode>)BaseAdapter.toNodes(adapters);
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess", null);
            SLinkOperations.setTarget(newNode, "conceptLinkDeclaration", ((SNode)this.getParameterObject()), false);
            return newNode;
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Type_1196933387032(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("null", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SModelOperations.getNodesIncludingImported(SNodeOperations.getModel(parentNode), operationContext.getScope(), "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration");
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType", null);
            SLinkOperations.setTarget(result, "concept", ((SNode)this.getParameterObject()), false);
            return result;
          }

          public String getMatchingText(String pattern) {
            return "snode<" + SPropertyOperations.getString(((SNode)this.getParameterObject()), "name") + ">";
          }

          public String getDescriptionText(String pattern) {
            return SNodeOperations.getModel(((SNode)this.getParameterObject())).getUID().getCompactPresentation();
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SNodeOperation_1196936340075(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("null", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SModelOperations.getNodesIncludingImported(SNodeOperations.getModel(parentNode), operationContext.getScope(), "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration");
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation", null);
            SLinkOperations.setTarget(result, "concept", ((SNode)this.getParameterObject()), false);
            return result;
          }

          public String getMatchingText(String pattern) {
            return "new node(" + SPropertyOperations.getString(((SNode)this.getParameterObject()), "name");
          }

        });
      }
    }
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("null", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          List<SNode> concepts = SModelOperations.getNodesIncludingImported(SNodeOperations.getModel(parentNode), operationContext.getScope(), "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration");
          return SequenceOperations.where(concepts, new zPredicate2(null, null));
        }

      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      assert queryResult != null;
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewRootNodeOperation", null);
            SLinkOperations.setTarget(result, "concept", ((SNode)this.getParameterObject()), false);
            return result;
          }

          public String getMatchingText(String pattern) {
            return "new root node(" + SPropertyOperations.getString(((SNode)this.getParameterObject()), "name");
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_SNodeOperation_1138669164825(final SNode sourceNode, final SModel model, String transformationTag, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SNodeOperations.getParent(sourceNode, null, false, false);
        }

      };
      SNode node = (SNode)calc.calculate();
      result.addAll(ModelActions.createRightTransformHintSubstituteActions(node, transformationTag, operationContext));
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_SNodeOperation_1144103719164(final SNode sourceNode, final SModel model, String transformationTag, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), sourceNode) {

        public SNode doSubstitute(String pattern) {
          SLinkOperations.addNewChild(sourceNode, "parameter", "jetbrains.mps.bootstrap.smodelLanguage.structure.AbstractOperationParameter");
          return sourceNode;
        }

        public String getMatchingText(String pattern) {
          return "< .. >";
        }

        public String getDescriptionText(String pattern) {
          return "add operation parameters";
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_Expression_1179535189082(final SNode sourceNode, final SModel model, String transformationTag, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), sourceNode) {

        public SNode doSubstitute(String pattern) {
          // replace expression with snode-operation-expression
          SNode expression = sourceNode;
          SNode opExpression = SModelOperations.createNewNode(model, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression", null);
          SNodeOperations.replaceWithAnother(expression, opExpression);
          SLinkOperations.setTarget(opExpression, "leftExpression", expression, true);
          return opExpression;
        }

        public String getMatchingText(String pattern) {
          return ".";
        }

        public String getDescriptionText(String pattern) {
          return "smodel language operation";
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_Expression_1179535189125(final SNode sourceNode, final SModel model, String transformationTag, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), sourceNode) {

        public SNode doSubstitute(String pattern) {
          SNode newNode = SNodeOperations.replaceWithNewChild(sourceNode, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression");
          SLinkOperations.setTarget(newNode, "leftExpression", sourceNode, true);
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return ":";
        }

        public String getDescriptionText(String pattern) {
          return "node type cast";
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> rightTransform_ActionsFactory_Expression_1179535648214(final SNode sourceNode, final SModel model, String transformationTag, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression", operationContext.getScope());
      result.add(new AbstractRTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), sourceNode) {

        public SNode doSubstitute(String pattern) {
          SNode newNode = SNodeOperations.replaceWithNewChild(sourceNode, "jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression");
          SLinkOperations.setTarget(newNode, "leftExpression", sourceNode, true);
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return "/";
        }

        public String getDescriptionText(String pattern) {
          return "downcast to lower semantic level";
        }

      });
    }
    return result;
  }

  public static void removeActionsByCondition_1180467401112(Iterator<INodeSubstituteAction> actions, final SNode parentNode, final SNode currentChild, final SNode childConcept, final IOperationContext operationContext) {
    final SNode leftExpressionType;
    final Boolean leftIsModel;
    final Boolean leftIsNode;
    final Boolean leftIsConcept;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(parentNode, "leftExpression", true));
        }

      };
      leftExpressionType = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType"), false) != null;
        }

      };
      leftIsModel = (Boolean)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false) != null;
        }

      };
      leftIsNode = (Boolean)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return TypeChecker.getInstance().getRuntimeSupport().coerce(leftExpressionType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType"), false) != null;
        }

      };
      leftIsConcept = (Boolean)calc.calculate();
    }
    // TODO: The initializer doesn't work for 'remove by condition' action
    while(actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      if(!(current.getParameterObject() instanceof SNode)) {
        continue;
      }
      final SNode concept = (SNode)current.getParameterObject();
      Condition cond = new Condition() {

        public boolean met(Object object) {
          if(!(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation"))) {
            return false;
          }
          SNode parameterOp = (SNode)concept;
          SNode leftExpression = SLinkOperations.getTarget(parentNode, "leftExpression", true);
          if(SNodeOperations.isInstanceOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression")) {
            SNode nodeOperation = SLinkOperations.getTarget(leftExpression, "nodeOperation", true);
            if(SNodeOperations.isInstanceOf(nodeOperation, "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
              SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(nodeOperation, "property", false), "dataType", false);
              if(SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration")) {
                return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_enum_property"));
              } else
              {
                return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_simple_property"));
              }
            }
            if(SNodeOperations.isInstanceOf(nodeOperation, "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess")) {
              return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_concept_property"));
            }
            if(SNodeOperations.isInstanceOf(nodeOperation, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
              return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_link"));
            }
            if(SNodeOperations.isInstanceOf(nodeOperation, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
              return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_linkList"));
            }
          }
          // ==========
          SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
          // is concept ?
          if(TypeChecker.getInstance().getRuntimeSupport().coerce(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType"), false) != null) {
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_concept"));
          }
          // is node ?
          if(TypeChecker.getInstance().getRuntimeSupport().coerce(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), false) != null) {
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_node"));
          }
          // is smodel ?
          if(TypeChecker.getInstance().getRuntimeSupport().coerce(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType"), false) != null) {
            return !(SConceptPropertyOperations.getBoolean(parameterOp, "applicable_to_model"));
          }
          return true;
        }

      };
      if(cond.met(null)) {
        actions.remove();
      }
    }
  }

}
