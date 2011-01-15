package jetbrains.mps.bash.actions;

/*Generated by MPS */

import java.util.regex.Pattern;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bash.behavior.VariableNameDeclaration_Behavior;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class QueriesGenerated {
  private static Pattern REGEXP_x583g4_a0a0a0a2a0a0a0a2a0a1a3 = Pattern.compile("[^\"`']+", 0);
  private static Pattern REGEXP_x583g4_a0a0a0a0c0a0a0a0c0a0b0d = Pattern.compile("[^\"`']*", 0);
  private static Pattern REGEXP_x583g4_a0a0a0a2a0a0a0a2a0a1a4 = Pattern.compile("\\d+", 0);
  private static Pattern REGEXP_x583g4_a0a0a0a0c0a0a0a0c0a0b0e = Pattern.compile("\\d*", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a2a0a2a4 = Pattern.compile("\\d+[#]\\d+", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a2a0a3a4 = Pattern.compile("0x[A-F\\d]+", 0);
  private static Pattern REGEXP_x583g4_a0a2a2a0a0a0a2a0a1a5 = Pattern.compile("\\w+[=]", 0);
  private static Pattern REGEXP_x583g4_a0a2a2a0a0a0a2a0a1a6 = Pattern.compile("\\w*", 0);

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ArithmeticExpression_3263637656462449660(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.bash.structure.IArithmeticHolder", false, false) != null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ArithmeticExpression_3263637656462449680(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.bash.structure.IArithmeticHolder", false, false) != null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Command_8474643070101819908(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.bash.structure.CommandList", false, false), "head", true) != null);
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_IGeneralizedWordUnit_3263637656457821343(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.SimpleWord");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.SimpleWord", null);
            SPropertyOperations.set(newNode, "word", pattern);
            return newNode;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            if (strictly) {
              return REGEXP_x583g4_a0a0a0a2a0a0a0a2a0a1a3.matcher(pattern).matches();
            } else {
              return REGEXP_x583g4_a0a0a0a0c0a0a0a0c0a0b0d.matcher(pattern).matches();
            }
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ArithmeticExpression_3263637656458342517(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.DecimalConstant");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode newNode = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.DecimalConstant", null);
            try {
              SPropertyOperations.set(newNode, "value", "" + Integer.parseInt(pattern));
            } catch (NumberFormatException e) {
              SPropertyOperations.set(newNode, "value", "" + (0));
            }
            return newNode;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            if (strictly) {
              return REGEXP_x583g4_a0a0a0a2a0a0a0a2a0a1a4.matcher(pattern).matches();
            } else {
              return REGEXP_x583g4_a0a0a0a0c0a0a0a0c0a0b0e.matcher(pattern).matches();
            }
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.BasedIntegerLiteral");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode basedIntConst = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.BasedIntegerLiteral", null);
            try {
              int index = pattern.indexOf("#");
              SPropertyOperations.set(basedIntConst, "base", "" + (Integer.parseInt(pattern.substring(0, index))));
              SPropertyOperations.set(basedIntConst, "value", "" + (Integer.parseInt(pattern.substring(index + 1))));
            } catch (NumberFormatException e) {
              SPropertyOperations.set(basedIntConst, "base", "" + (10));
              SPropertyOperations.set(basedIntConst, "value", "" + (0));
            }
            return basedIntConst;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            return REGEXP_x583g4_a0a0a2a0a0a0a2a0a2a4.matcher(pattern).matches();
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.HexIntegerLiteral");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode hexadecimalIntConst = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.HexIntegerLiteral", null);
            try {
              SPropertyOperations.set(hexadecimalIntConst, "value", pattern.substring(2));
            } catch (NumberFormatException e) {
              SPropertyOperations.set(hexadecimalIntConst, "value", "0");
            }
            return hexadecimalIntConst;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            return REGEXP_x583g4_a0a0a2a0a0a0a2a0a3a4.matcher(pattern).matches();
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Command_9034131902186646660(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.VariableAssingment");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode assingment = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.VariableAssingment", null);
            SNode lvalue = null;
            String newVarName = pattern;
            if (newVarName.endsWith("=")) {
              newVarName = newVarName.substring(0, pattern.length() - 1);
            }
            SNode name = VariableNameDeclaration_Behavior.testName_9034131902194480300(_context.getCurrentTargetNode(), newVarName);
            if ((name != null)) {
              lvalue = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.VariableReference", null);
              SLinkOperations.setTarget(SNodeOperations.cast(lvalue, "jetbrains.mps.bash.structure.VariableReference"), "variable", name, false);
            }
            if ((lvalue == null)) {
              lvalue = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.VariableNameDeclaration", null);
              SPropertyOperations.set(SNodeOperations.cast(lvalue, "jetbrains.mps.bash.structure.VariableNameDeclaration"), "name", newVarName);
            }
            SLinkOperations.setTarget(assingment, "lvalue", lvalue, true);
            return assingment;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            SNode name = VariableNameDeclaration_Behavior.testName_9034131902194480300(_context.getCurrentTargetNode(), pattern);
            if ((name != null)) {
              return true;
            }
            return REGEXP_x583g4_a0a2a2a0a0a0a2a0a1a5.matcher(pattern).matches();
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.VariableAssingment");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.bash.structure.ShellScript", true, false), "usedVars", true);
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode variableAssignment = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.VariableAssingment", null);
                SNode lvalue = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.VariableReference", null);
                SLinkOperations.setTarget(lvalue, "variable", (item), false);
                SLinkOperations.setTarget(variableAssignment, "lvalue", lvalue, true);
                return variableAssignment;
              }

              public String getDescriptionText(String pattern) {
                return "variable assignment";
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_LValue_9034131902188086416(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.VariableNameDeclaration");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode name = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.VariableNameDeclaration", null);
            SPropertyOperations.set(name, "name", pattern);
            return name;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            SNode name = VariableNameDeclaration_Behavior.testName_9034131902194480300(_context.getCurrentTargetNode(), pattern);
            if ((name != null)) {
              return false;
            }
            return REGEXP_x583g4_a0a2a2a0a0a0a2a0a1a6.matcher(pattern).matches();
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_IGeneralizedWordUnit_3147078024758607987(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.ArithmeticExpansion");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode newNode = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.ArithmeticExpansion", null);
          SNodeOperations.insertNextSiblingChild(_context.getSourceNode(), newNode);
          return newNode;
        }

        public String getMatchingText(String pattern) {
          return "$((";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ArithmeticExpression_3263637656461568685(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.BinaryArithmeticExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            {
              SNode source = SNodeOperations.cast(_context.getSourceNode(), "jetbrains.mps.bash.structure.ArithmeticExpression");
              while (SNodeOperations.isInstanceOf(SNodeOperations.getParent(source), "jetbrains.mps.bash.structure.BinaryArithmeticExpression")) {
                SNode parent = SNodeOperations.cast(SNodeOperations.getParent(source), "jetbrains.mps.bash.structure.BinaryArithmeticExpression");
                if (SConceptPropertyOperations.getInteger(result, "priority") < SConceptPropertyOperations.getInteger(parent, "priority")) {
                  source = parent;
                } else {
                  break;
                }
              }
              SNodeOperations.replaceWithAnother(source, result);
              SLinkOperations.setTarget(result, "rightExpression", source, true);
              return result;
            }
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ArithmeticExpression_3263637656461345409(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.BinaryArithmeticExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            {
              SNode source = SNodeOperations.cast(_context.getSourceNode(), "jetbrains.mps.bash.structure.ArithmeticExpression");
              while (SNodeOperations.isInstanceOf(SNodeOperations.getParent(source), "jetbrains.mps.bash.structure.BinaryArithmeticExpression")) {
                SNode parent = SNodeOperations.cast(SNodeOperations.getParent(source), "jetbrains.mps.bash.structure.BinaryArithmeticExpression");
                if (SConceptPropertyOperations.getInteger(result, "priority") < SConceptPropertyOperations.getInteger(parent, "priority")) {
                  source = parent;
                } else {
                  break;
                }
              }
              SNodeOperations.replaceWithAnother(source, result);
              SLinkOperations.setTarget(result, "leftExpression", source, true);
              return result;
            }
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_CommandTerminator_2635812496400429947(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.CommentedText");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode commonCommand = SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.bash.structure.CommandList", false, false);
          SNodeFactoryOperations.setNewChild(commonCommand, "comment", "jetbrains.mps.bash.structure.CommentedText");
          return SLinkOperations.getTarget(commonCommand, "comment", true);
        }

        public String getMatchingText(String pattern) {
          return "#";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "simple text comment";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_FollowingCommandList_8474643070110067667(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.CommentedFollowingCommandList");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode comment = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.CommentedFollowingCommandList", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), comment);
          SLinkOperations.setTarget(comment, "command", _context.getSourceNode(), true);
          return comment;
        }

        public String getMatchingText(String pattern) {
          if (pattern.startsWith("#")) {
            return pattern;
          }
          return "";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Command_8457058248752905941(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.CommentedCommandList");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode comment = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.CommentedCommandList", null);
          SNode sourceCommandList = SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.bash.structure.CommandList", false, false);
          SNodeOperations.replaceWithAnother(sourceCommandList, comment);
          SLinkOperations.setTarget(comment, "commandList", sourceCommandList, true);
          return comment;
        }

        public String getMatchingText(String pattern) {
          return "#";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_FollowingCommandList_8474643070113186812(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.FollowingCommandList");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SNodeFactoryOperations.setNewChild(SLinkOperations.getTarget(SLinkOperations.getTarget(result, "baseCommand", true), "base", true), "command", "jetbrains.mps.bash.structure.AbstractCommand");
            SLinkOperations.setTarget(SLinkOperations.getTarget(result, "baseCommand", true), "following", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_FollowingCommandList_8474643070112660721(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.FollowingCommandList");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SLinkOperations.setTarget(SLinkOperations.getTarget(result, "baseCommand", true), "following", SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getSourceNode(), "baseCommand", true), "following", true), true);
            SLinkOperations.setTarget(SLinkOperations.getTarget(result, "baseCommand", true), "base", SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getSourceNode(), "baseCommand", true), "base", true), true);
            SLinkOperations.setTarget(SLinkOperations.getTarget(_context.getSourceNode(), "baseCommand", true), "following", result, true);
            SNodeFactoryOperations.setNewChild(SLinkOperations.getTarget(_context.getSourceNode(), "baseCommand", true), "base", "jetbrains.mps.bash.structure.HeadPipeline");
            SNodeFactoryOperations.setNewChild(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getSourceNode(), "baseCommand", true), "base", true), "command", "jetbrains.mps.bash.structure.AbstractCommand");
            return _context.getSourceNode();
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_FollowingPipeline_3905757829908118148(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.FollowingPipeline");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SLinkOperations.setTarget(SLinkOperations.getTarget(result, "basePipeline", true), "following", SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getSourceNode(), "basePipeline", true), "following", true), true);
            SLinkOperations.setTarget(SLinkOperations.getTarget(result, "basePipeline", true), "command", SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getSourceNode(), "basePipeline", true), "command", true), true);
            SNodeFactoryOperations.setNewChild(SLinkOperations.getTarget(_context.getSourceNode(), "basePipeline", true), "command", "jetbrains.mps.bash.structure.AbstractCommand");
            SLinkOperations.setTarget(SLinkOperations.getTarget(_context.getSourceNode(), "basePipeline", true), "following", result, true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_FollowingPipeline_3905757829908027951(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.FollowingPipeline");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(SLinkOperations.getTarget(result, "basePipeline", true), "following", _context.getSourceNode(), true);
            SNodeFactoryOperations.setNewChild(SLinkOperations.getTarget(result, "basePipeline", true), "command", "jetbrains.mps.bash.structure.AbstractCommand");
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ConditionalExpression_3835416431562813067(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.CombiningConditionalExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            {
              SNode source = SNodeOperations.cast(_context.getSourceNode(), "jetbrains.mps.bash.structure.ConditionalExpression");
              SNodeOperations.replaceWithAnother(source, result);
              SLinkOperations.setTarget(result, "right", source, true);
              return result;
            }
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ConditionalExpression_3835416431562616055(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.CombiningConditionalExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            {
              SNode source = SNodeOperations.cast(_context.getSourceNode(), "jetbrains.mps.bash.structure.ConditionalExpression");
              SNodeOperations.replaceWithAnother(source, result);
              SLinkOperations.setTarget(result, "left", source, true);
              return result;
            }
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_AbstractCommand_975347375211919463(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      final SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.bash.structure.RedirectedCommand");
      Calculable calculable = new Calculable() {
        public Object calculate() {
          return ListSequence.fromListAndArray(new ArrayList<String>(), ">", "&>", "<");
        }
      };
      Iterable<String> parameterObjects = (Iterable<String>) calculable.calculate();
      assert parameterObjects != null;
      for (final String item : parameterObjects) {
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode redirectedCommand = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.RedirectedCommand", null);
            SNode redirection;
            if ((item).equals(">")) {
              redirection = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.OutputRedirection", null);
            } else if ((item).equals("&>")) {
              redirection = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.OutputErrorRedirection", null);
            } else {
              redirection = SNodeFactoryOperations.createNewNode("jetbrains.mps.bash.structure.InputRedirection", null);
            }
            ListSequence.fromList(SLinkOperations.getTargets(redirectedCommand, "redirection", true)).addElement(redirection);
            SNode command = _context.getSourceNode();
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), redirectedCommand);
            SLinkOperations.setTarget(redirectedCommand, "command", command, true);
            return redirectedCommand;
          }

          public SNode getOutputConcept() {
            return concept;
          }

          public String getDescriptionText(String text) {
            if ((item).equals(">")) {
              return "redirect output";
            } else if ((item).equals("&>")) {
              return "redirect error output";
            }
            return "redirect input";
          }
        });
      }
    }
    return result;
  }
}
