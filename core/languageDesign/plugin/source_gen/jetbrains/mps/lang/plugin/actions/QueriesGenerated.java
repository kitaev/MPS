package jetbrains.mps.lang.plugin.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.plugin.behavior.ActionDataParameterDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.action.RemoveSubstituteActionByConditionContext;
import java.util.Iterator;
import jetbrains.mps.util.Condition;

public class QueriesGenerated {
  public static boolean nodeSubstituteActionsBuilder_Precondition_Type_1217414480519(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", true, false) != null;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_9101790344583086387(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.plugin.structure.ExecuteConfigBlock", true, false) != null;
  }

  public static void nodeFactory_NodeSetup_ToolTab_485694842828664422(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNode disposeTabClosure = SLinkOperations.getTarget(_context.getNewNode(), "disposeTabClosure", true);
    if ((disposeTabClosure == null)) {
      disposeTabClosure = SLinkOperations.setNewChild(_context.getNewNode(), "disposeTabClosure", "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral");
    }
    SNode pd = SLinkOperations.addNewChild(SNodeOperations.cast(disposeTabClosure, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "parameter", "jetbrains.mps.lang.plugin.structure.SmartDisposeClosureParameterDeclaration");
    SPropertyOperations.set(pd, "name", "component");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Type_1217414463812(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ActionParameter_1218807115883(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionParameter");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return ListSequence.fromListAndArray(new ArrayList<SNode>(), new _Quotations.QuotationClass_0().createNode(), new _Quotations.QuotationClass_1().createNode(), new _Quotations.QuotationClass_2().createNode());
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", null);
                SLinkOperations.setTarget(result, "type", (item), true);
                return result;
              }

              public String getDescriptionText(String pattern) {
                if (SNodeOperations.isInstanceOf((item), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
                  return "current node";
                } else if (SNodeOperations.isInstanceOf((item), "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
                  return "current nodes";
                } else if (SNodeOperations.isInstanceOf((item), "jetbrains.mps.lang.smodel.structure.SModelType")) {
                  return "current model";
                }
                return "";
              }
            });
          }
        }
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionParameter");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return ActionDataParameterDeclaration_Behavior.getVariants_1227641865136();
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration", null);
                SLinkOperations.setTarget(result, "key", (item), false);
                return result;
              }

              public String getDescriptionText(String pattern) {
                SNode annotation = ListSequence.fromList(SLinkOperations.getTargets((item), "annotation", true)).where(new IWhereFilter<SNode>() {
                  public boolean accept(SNode it) {
                    return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_3().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.Annotation"), "name"));
                  }
                }).first();
                if (annotation == null) {
                  return "";
                }
                SNode value = ListSequence.fromList(SLinkOperations.getTargets(annotation, "value", true)).where(new IWhereFilter<SNode>() {
                  public boolean accept(SNode it) {
                    return SPropertyOperations.getString(SLinkOperations.getTarget(it, "key", false), "name").equals("description");
                  }
                }).first();
                if (value == null) {
                  return "";
                }
                return SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(value, "value", true), "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value");
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ActionGroupMember_1218809043213(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.Separator");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.GroupAnchor");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionInstance");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return SModelOperations.getRootsIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.lang.plugin.structure.ActionDeclaration");
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.plugin.structure.ActionInstance", null);
                SLinkOperations.setTarget(result, "action", (item), false);
                return result;
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_9101790344583086386(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    return result;
  }

  public static void removeActionsByCondition_1217414474266(final IOperationContext operationContext, final RemoveSubstituteActionByConditionContext _context) {
    Iterator<INodeSubstituteAction> actions = _context.getActions();
    while (actions.hasNext()) {
      INodeSubstituteAction current = actions.next();
      final SNode concept = current.getOutputConcept();
      SNode applicableConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type");
      Condition cond = new Condition() {
        public boolean met(Object object) {
          boolean isNode = SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.SNodeType");
          boolean isNList = SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.SNodeListType");
          boolean isModel = SConceptOperations.isExactly(concept, "jetbrains.mps.lang.smodel.structure.SModelType");
          return !(isNode || isNList || isModel);
        }
      };
      if (SConceptOperations.isSuperConceptOf(applicableConcept, NameUtil.nodeFQName(concept)) && cond.met(concept)) {
        actions.remove();
      }
    }
  }
}
