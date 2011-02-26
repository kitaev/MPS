package jetbrains.mps.platform.conf.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.platform.conf.behavior.BeanUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.platform.conf.behavior.BeanExtensionPoint_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class QueriesGenerated {
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Component_4569055436237489039(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.Component");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return Sequence.fromIterable(Sequence.<SNode>singleton(SEnumOperations.enumMemberForValue(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), SPropertyOperations.getString_def(SNodeOperations.as(_context.getParentNode(), "jetbrains.mps.platform.conf.structure.Components"), "level", "APPLICATION")))).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode cmp = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.Component", null);
                return cmp;
              }

              public String getMatchingText(String pattern) {
                return SEnumOperations.getEnumMemberValue((item)).toLowerCase() + "Component";
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Service_6121364846593714735(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.Service");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return SEnumOperations.getEnumMembers(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"));
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode srv = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.Service", null);
                SPropertyOperations.set(srv, "level", SEnumOperations.getEnumMemberValue((item)));
                return srv;
              }

              public String getMatchingText(String pattern) {
                return SEnumOperations.getEnumMemberValue((item)).toLowerCase() + "Service";
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_BeanExtensionPoint_6183559520328570476(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.BeanExtensionPoint");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return Sequence.fromIterable(((Iterable<Classifier>) new VisibleClassifiersScope(_context.getParentNode(), IClassifiersSearchScope.CLASS, operationContext.getScope()).getClassifiers())).<SNode>select(new ISelector<Classifier, SNode>() {
              public SNode select(Classifier cls) {
                return (SNode) cls.getNode();
              }
            }).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode node) {
                return BeanUtil.isBean(SNodeOperations.as(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"));
              }
            }).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode bep = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.BeanExtensionPoint", null);
                SLinkOperations.setTarget(bep, "beanClass", (item), false);
                return bep;
              }

              public String getMatchingText(String pattern) {
                return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.BeanExtensionPoint"), "alias") + " " + "beanClass" + "=" + INamedConcept_Behavior.call_getFqName_1213877404258((item));
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_IntefaceExtensionPoint_6618365175184889516(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return Sequence.fromIterable(((Iterable<Classifier>) new VisibleClassifiersScope(_context.getParentNode(), IClassifiersSearchScope.INTERFACE, operationContext.getScope()).getClassifiers())).<SNode>select(new ISelector<Classifier, SNode>() {
              public SNode select(Classifier cls) {
                return (SNode) cls.getNode();
              }
            }).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode iep = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", null);
                SLinkOperations.setTarget(iep, "iface", (item), false);
                return iep;
              }

              public String getMatchingText(String pattern) {
                return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint"), "alias") + " interface" + "=" + INamedConcept_Behavior.call_getFqName_1213877404258((item));
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_BeanExtensionAttribute_6618365175184971340(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.BeanExtensionAttribute");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return Sequence.fromIterable(BeanExtensionPoint_Behavior.call_propertyNames_618741292999315209(SLinkOperations.getTarget(SNodeOperations.as(_context.getParentNode(), "jetbrains.mps.platform.conf.structure.BeanExtension"), "extensionPoint", false))).toListSequence();
          }
        };
        Iterable<String> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final String item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode bea = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", null);
                SPropertyOperations.set(bea, "name", (item));
                return bea;
              }

              public String getMatchingText(String pattern) {
                return (item) + "=";
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_BeanExtension_7161354651095863073(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.BeanExtension");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.platform.conf.structure.BeanExtensionPoint");
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode be = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.BeanExtension", null);
                SLinkOperations.setTarget(be, "extensionPoint", (item), false);
                for (String pn : BeanExtensionPoint_Behavior.call_propertyNames_618741292999315209((item))) {
                  SNode bea = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", null);
                  SPropertyOperations.set(bea, "name", pn);
                  ListSequence.fromList(SLinkOperations.getTargets(be, "attribute", true)).addElement(bea);
                }
                return be;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_InterfaceExtension_7161354651095876188(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.platform.conf.structure.InterfaceExtension");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            List<Classifier> classifiers = new VisibleClassifiersScope(_context.getParentNode(), IClassifiersSearchScope.CLASS, operationContext.getScope()).getClassifiers();
            List<Tuples._2<SNode, SNode>> result = ListSequence.fromList(new ArrayList<Tuples._2<SNode, SNode>>());
            for (final SNode iep : SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint")) {
              for (SNode cc : Sequence.fromIterable(((Iterable<Classifier>) classifiers)).<SNode>select(new ISelector<Classifier, SNode>() {
                public SNode select(Classifier cls) {
                  return (SNode) cls.getNode();
                }
              }).where(new IWhereFilter<SNode>() {
                public boolean accept(SNode cls) {
                  return SNodeOperations.isInstanceOf(cls, "jetbrains.mps.baseLanguage.structure.ClassConcept") && Classifier_Behavior.call_isDescendant_7165541881557222913(cls, SLinkOperations.getTarget(iep, "iface", false));
                }
              })) {
                ListSequence.fromList(result).addElement(MultiTuple.<SNode,SNode>from(iep, cc));
              }
            }
            return result;
          }
        };
        Iterable<Tuples._2<SNode, SNode>> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final Tuples._2<SNode, SNode> item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode ie = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.InterfaceExtension", null);
                SLinkOperations.setTarget(ie, "extensionPoint", (item)._0(), false);
                SLinkOperations.setTarget(ie, "impl", (item)._1(), false);
                return ie;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item)._0(), "name") + " implementation=" + SPropertyOperations.getString((item)._1(), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }
}
