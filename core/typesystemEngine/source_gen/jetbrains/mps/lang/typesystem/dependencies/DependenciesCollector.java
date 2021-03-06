package jetbrains.mps.lang.typesystem.dependencies;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.util.Pair;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.List;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.GlobalScope;

public class DependenciesCollector {
  public DependenciesCollector() {
  }

  public void collectDependencies(SNode inferenceRule, Map<SNode, Pair<SNode, SNode>> dependencies, Set<SNode> leaves) {
    Set<SNode> roots = SetSequence.fromSet(new HashSet<SNode>());
    for (SNode applicableNodeReference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference", false, new String[]{})) {
      if (SLinkOperations.getTarget(applicableNodeReference, "applicableNode", false) == SLinkOperations.getTarget(inferenceRule, "applicableNode", true)) {
        SetSequence.fromSet(roots).addElement(applicableNodeReference);
      }
    }
    int prevSize = SetSequence.fromSet(MapSequence.fromMap(dependencies).keySet()).count();
    int leavesSize = SetSequence.fromSet(leaves).count();
    for (SNode root : roots) {
      MapSequence.fromMap(dependencies).put(root, null);
    }
    while (SetSequence.fromSet(MapSequence.fromMap(dependencies).keySet()).count() > prevSize || SetSequence.fromSet(leaves).count() > leavesSize) {
      prevSize = SetSequence.fromSet(MapSequence.fromMap(dependencies).keySet()).count();
      leavesSize = SetSequence.fromSet(leaves).count();
      for (SNode node : SetSequence.fromSetWithValues(new HashSet<SNode>(), MapSequence.fromMap(dependencies).keySet())) {
        SNode parent = SNodeOperations.getParent(node);
        {
          SNode matchedNode_bcwvc2_b0c0f0a = parent;
          {
            boolean matches_bcwvc2_a1a2a5a0 = false;
            {
              SNode matchingNode_bcwvc2_a1a2a5a0 = parent;
              if (matchingNode_bcwvc2_a1a2a5a0 != null) {
                matches_bcwvc2_a1a2a5a0 = SModelUtil_new.isAssignableConcept(matchingNode_bcwvc2_a1a2a5a0.getConceptFqName(), "jetbrains.mps.lang.typesystem.structure.TypeOfExpression");
              }
            }
            if (matches_bcwvc2_a1a2a5a0) {
              if (!(SetSequence.fromSet(roots).contains(node))) {
                SetSequence.fromSet(leaves).addElement(node);
              }
            } else {
              boolean matches_bcwvc2_b1a2a5a0 = false;
              {
                SNode matchingNode_bcwvc2_b1a2a5a0 = parent;
                if (matchingNode_bcwvc2_b1a2a5a0 != null) {
                  matches_bcwvc2_b1a2a5a0 = SModelUtil_new.isAssignableConcept(matchingNode_bcwvc2_b1a2a5a0.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
                }
              }
              if (matches_bcwvc2_b1a2a5a0) {
                if (SLinkOperations.getTarget(matchedNode_bcwvc2_b0c0f0a, "rValue", true) == node) {
                  MapSequence.fromMap(dependencies).put(SLinkOperations.getTarget(matchedNode_bcwvc2_b0c0f0a, "lValue", true), new Pair<SNode, SNode>(node, new DependenciesCollector.QuotationClass_bcwvc2_a1a1a0a0a0a0c0a2a1a1a2a5a0().createNode()));
                }
              } else {
                boolean matches_bcwvc2_c1a2a5a0 = false;
                {
                  SNode matchingNode_bcwvc2_c1a2a5a0 = parent;
                  if (matchingNode_bcwvc2_c1a2a5a0 != null) {
                    matches_bcwvc2_c1a2a5a0 = SModelUtil_new.isAssignableConcept(matchingNode_bcwvc2_c1a2a5a0.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
                  }
                }
                if (matches_bcwvc2_c1a2a5a0) {
                  if (SLinkOperations.getTarget(matchedNode_bcwvc2_b0c0f0a, "initializer", true) == node) {
                    MapSequence.fromMap(dependencies).put(matchedNode_bcwvc2_b0c0f0a, new Pair<SNode, SNode>(node, new DependenciesCollector.QuotationClass_bcwvc2_a1a1a0a0a0a0c0a2a0c0b0b0c0f0a().createNode()));
                  }
                } else {
                  SNode matchedNode_bcwvc2_a1a2a5a0 = node;
                  {
                    boolean matches_bcwvc2_a0b0c0f0a = false;
                    {
                      SNode matchingNode_bcwvc2_a0b0c0f0a = node;
                      if (matchingNode_bcwvc2_a0b0c0f0a != null) {
                        matches_bcwvc2_a0b0c0f0a = SModelUtil_new.isAssignableConcept(matchingNode_bcwvc2_a0b0c0f0a.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
                      }
                    }
                    if (matches_bcwvc2_a0b0c0f0a) {
                      for (SNode variableReference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.baseLanguage.structure.VariableReference", false, new String[]{})) {
                        if (SLinkOperations.getTarget(variableReference, "variableDeclaration", false) == node) {
                          MapSequence.fromMap(dependencies).put(variableReference, new Pair<SNode, SNode>(node, new DependenciesCollector.QuotationClass_bcwvc2_a1a1a0a0a0a0a0c0b0a2a0c0a2a1a1a2a5a0().createNode()));
                        }
                      }
                    } else {
                      boolean matches_bcwvc2_b0b0c0f0a = false;
                      {
                        SNode matchingNode_bcwvc2_b0b0c0f0a = node;
                        if (matchingNode_bcwvc2_b0b0c0f0a != null) {
                          matches_bcwvc2_b0b0c0f0a = SModelUtil_new.isAssignableConcept(matchingNode_bcwvc2_b0b0c0f0a.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.VariableReference");
                        }
                      }
                      if (matches_bcwvc2_b0b0c0f0a) {
                        {
                          SNode variableDeclaration = SLinkOperations.getTarget(matchedNode_bcwvc2_a1a2a5a0, "variableDeclaration", false);
                          for (SNode reference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.baseLanguage.structure.VariableReference", false, new String[]{})) {
                            if (SLinkOperations.getTarget(matchedNode_bcwvc2_a1a2a5a0, "variableDeclaration", false) == variableDeclaration) {
                              SNode nodeStatement = SNodeOperations.getAncestor(matchedNode_bcwvc2_a1a2a5a0, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
                              SNode usageStatement = SNodeOperations.getAncestor(reference, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
                              while (SNodeOperations.getParent(nodeStatement) != SNodeOperations.getParent(usageStatement)) {
                                usageStatement = SNodeOperations.getAncestor(usageStatement, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
                              }
                              List<SNode> list = CollectionUtil.filter(SNodeOperations.getParent(nodeStatement).getChildren(), new Condition() {
                                public boolean met(Object p0) {
                                  return SNodeOperations.isInstanceOf(((SNode) p0), "jetbrains.mps.baseLanguage.structure.Statement");
                                }
                              });
                              if (ListSequence.fromList(list).indexOf(nodeStatement) <= ListSequence.fromList(list).indexOf(usageStatement)) {
                                MapSequence.fromMap(dependencies).put(reference, new Pair<SNode, SNode>(node, new DependenciesCollector.QuotationClass_bcwvc2_a1a1a0a0e0a0b0a0c0a2a1a0c0a2a0c0b0b0c0f0a().createNode()));
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static class QuotationClass_bcwvc2_a1a1a0a0a0a0c0a2a1a1a2a5a0 {
    public QuotationClass_bcwvc2_a1a1a0a0a0a0c0a2a1a1a2a5a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      SNode quotedNode_9 = null;
      SNode quotedNode_10 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_11 = quotedNode_1;
        quotedNode1_11.setProperty("name", "getNode");
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_12);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_13 = quotedNode_3;
          quotedNode_1.addChild("returnType", quotedNode1_13);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_14 = quotedNode_4;
          quotedNode1_14.setProperty("name", "targetNode");
          {
            quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_15 = quotedNode_6;
            quotedNode_4.addChild("type", quotedNode1_15);
          }
          quotedNode_1.addChild("parameter", quotedNode1_14);
        }
        {
          quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_16 = quotedNode_5;
          {
            quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_17 = quotedNode_7;
            {
              quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_18 = quotedNode_8;
              {
                quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_19 = quotedNode_9;
                quotedNode_8.addChild("lValue", quotedNode1_19);
              }
              {
                quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_20 = quotedNode_10;
                quotedNode_8.addChild("rValue", quotedNode1_20);
              }
              quotedNode_7.addChild("expression", quotedNode1_18);
            }
            quotedNode_5.addChild("statement", quotedNode1_17);
          }
          quotedNode_1.addChild("body", quotedNode1_16);
        }
        result = quotedNode1_11;
      }
      quotedNode_9.setReferent("variableDeclaration", quotedNode_4);
      quotedNode_10.setReferent("variableDeclaration", quotedNode_4);
      return result;
    }
  }

  public static class QuotationClass_bcwvc2_a1a1a0a0a0a0c0a2a0c0b0b0c0f0a {
    public QuotationClass_bcwvc2_a1a1a0a0a0a0c0a2a0c0b0b0c0f0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      SNode quotedNode_9 = null;
      SNode quotedNode_10 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_11 = quotedNode_1;
        quotedNode1_11.setProperty("name", "getNode");
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_12);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_13 = quotedNode_3;
          quotedNode_1.addChild("returnType", quotedNode1_13);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_14 = quotedNode_4;
          quotedNode1_14.setProperty("name", "targetNode");
          {
            quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_15 = quotedNode_6;
            quotedNode_4.addChild("type", quotedNode1_15);
          }
          quotedNode_1.addChild("parameter", quotedNode1_14);
        }
        {
          quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_16 = quotedNode_5;
          {
            quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_17 = quotedNode_7;
            {
              quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_18 = quotedNode_8;
              {
                quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_19 = quotedNode_9;
                quotedNode_8.addChild("lValue", quotedNode1_19);
              }
              {
                quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_20 = quotedNode_10;
                quotedNode_8.addChild("rValue", quotedNode1_20);
              }
              quotedNode_7.addChild("expression", quotedNode1_18);
            }
            quotedNode_5.addChild("statement", quotedNode1_17);
          }
          quotedNode_1.addChild("body", quotedNode1_16);
        }
        result = quotedNode1_11;
      }
      quotedNode_9.setReferent("variableDeclaration", quotedNode_4);
      quotedNode_10.setReferent("variableDeclaration", quotedNode_4);
      return result;
    }
  }

  public static class QuotationClass_bcwvc2_a1a1a0a0a0a0a0c0b0a2a0c0a2a1a1a2a5a0 {
    public QuotationClass_bcwvc2_a1a1a0a0a0a0a0c0b0a2a0c0a2a1a1a2a5a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      SNode quotedNode_9 = null;
      SNode quotedNode_10 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_11 = quotedNode_1;
        quotedNode1_11.setProperty("name", "getNode");
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_12);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_13 = quotedNode_3;
          quotedNode_1.addChild("returnType", quotedNode1_13);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_14 = quotedNode_4;
          quotedNode1_14.setProperty("name", "targetNode");
          {
            quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_15 = quotedNode_6;
            quotedNode_4.addChild("type", quotedNode1_15);
          }
          quotedNode_1.addChild("parameter", quotedNode1_14);
        }
        {
          quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_16 = quotedNode_5;
          {
            quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_17 = quotedNode_7;
            {
              quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_18 = quotedNode_8;
              {
                quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_19 = quotedNode_9;
                quotedNode_8.addChild("lValue", quotedNode1_19);
              }
              {
                quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_20 = quotedNode_10;
                quotedNode_8.addChild("rValue", quotedNode1_20);
              }
              quotedNode_7.addChild("expression", quotedNode1_18);
            }
            quotedNode_5.addChild("statement", quotedNode1_17);
          }
          quotedNode_1.addChild("body", quotedNode1_16);
        }
        result = quotedNode1_11;
      }
      quotedNode_9.setReferent("variableDeclaration", quotedNode_4);
      quotedNode_10.setReferent("variableDeclaration", quotedNode_4);
      return result;
    }
  }

  public static class QuotationClass_bcwvc2_a1a1a0a0e0a0b0a0c0a2a1a0c0a2a0c0b0b0c0f0a {
    public QuotationClass_bcwvc2_a1a1a0a0e0a0b0a0c0a2a1a0c0a2a0c0b0b0c0f0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      SNode quotedNode_9 = null;
      SNode quotedNode_10 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_11 = quotedNode_1;
        quotedNode1_11.setProperty("name", "getNode");
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_12);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_13 = quotedNode_3;
          quotedNode_1.addChild("returnType", quotedNode1_13);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_14 = quotedNode_4;
          quotedNode1_14.setProperty("name", "targetNode");
          {
            quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_15 = quotedNode_6;
            quotedNode_4.addChild("type", quotedNode1_15);
          }
          quotedNode_1.addChild("parameter", quotedNode1_14);
        }
        {
          quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_16 = quotedNode_5;
          {
            quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_17 = quotedNode_7;
            {
              quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_18 = quotedNode_8;
              {
                quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_19 = quotedNode_9;
                quotedNode_8.addChild("lValue", quotedNode1_19);
              }
              {
                quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_20 = quotedNode_10;
                quotedNode_8.addChild("rValue", quotedNode1_20);
              }
              quotedNode_7.addChild("expression", quotedNode1_18);
            }
            quotedNode_5.addChild("statement", quotedNode1_17);
          }
          quotedNode_1.addChild("body", quotedNode1_16);
        }
        result = quotedNode1_11;
      }
      quotedNode_9.setReferent("variableDeclaration", quotedNode_4);
      quotedNode_10.setReferent("variableDeclaration", quotedNode_4);
      return result;
    }
  }
}
