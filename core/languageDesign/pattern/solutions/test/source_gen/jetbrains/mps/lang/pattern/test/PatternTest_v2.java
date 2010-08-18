package jetbrains.mps.lang.pattern.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.lang.pattern.IMatchingPattern;

@MPSLaunch
public class PatternTest_v2 extends BaseTransformationTest {
  public PatternTest_v2() {
  }

  @Test
  public void testMethod() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:ef0e231b-e6bd-436f-9003-b53de4081716(jetbrains.mps.lang.pattern.test)");
    this.runTest("jetbrains.mps.lang.pattern.test.PatternTest_v2$TestBody", "testv2", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public TestBody() {
    }

    public void testv2() {
      assertTrue(match());

    }

    public boolean match() {
      SNode nodeToMatch = new PatternTest_v2.TestBody.QuotationClass_8lasc_a0a0a1a().createNode();
      GeneratedMatchingPattern pattern = new PatternTest_v2.TestBody.Pattern_8lasc_a0a1a1a();
      boolean matchNeeded = true;
      boolean matches = pattern.match(nodeToMatch);
      if (matchNeeded != matches) {
        return false;
      }
      if (!(matchNeeded)) {
        return true;
      }
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), new PatternTest_v2.TestBody.QuotationClass_8lasc_a1a0g0b0().createNode()), ListSequence.fromListAndArray(new ArrayList<SNode>(), (SNode) pattern.getFieldValue("PatternVar_ifbody"))));
      return true;
    }

    public static class QuotationClass_8lasc_a0a0a1a {
      public QuotationClass_8lasc_a0a0a1a() {
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
        SNode quotedNode_11 = null;
        SNode quotedNode_12 = null;
        SNode quotedNode_13 = null;
        SNode quotedNode_14 = null;
        SNode quotedNode_15 = null;
        SNode quotedNode_16 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_17 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_18 = quotedNode_2;
            {
              quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_19 = quotedNode_5;
              quotedNode1_19.setProperty("name", "s");
              {
                quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_20 = quotedNode_8;
                quotedNode_5.addChild("type", quotedNode1_20);
              }
              quotedNode_2.addChild("localVariableDeclaration", quotedNode1_19);
            }
            quotedNode_1.addChild("statement", quotedNode1_18);
          }
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IfStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_21 = quotedNode_3;
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_22 = quotedNode_6;
              {
                quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_23 = quotedNode_9;
                quotedNode_6.addChild("statement", quotedNode1_23);
              }
              {
                quotedNode_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_24 = quotedNode_10;
                {
                  quotedNode_13 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
                  SNode quotedNode1_25 = quotedNode_13;
                  {
                    quotedNode_14 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
                    SNode quotedNode1_26 = quotedNode_14;
                    quotedNode1_26.addReference(SReference.create("classifier", quotedNode1_26, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System")));
                    quotedNode1_26.addReference(SReference.create("variableDeclaration", quotedNode1_26, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System.out")));
                    quotedNode_13.addChild("operand", quotedNode1_26);
                  }
                  {
                    quotedNode_15 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
                    SNode quotedNode1_27 = quotedNode_15;
                    quotedNode1_27.addReference(SReference.create("baseMethodDeclaration", quotedNode1_27, SModelReference.fromString("f:java_stub#java.io(java.io@java_stub)"), SNodeId.fromString("~PrintStream.println(java.lang.String):void")));
                    {
                      quotedNode_16 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
                      SNode quotedNode1_28 = quotedNode_16;
                      quotedNode1_28.setProperty("value", " ");
                      quotedNode_15.addChild("actualArgument", quotedNode1_28);
                    }
                    quotedNode_13.addChild("operation", quotedNode1_27);
                  }
                  quotedNode_10.addChild("expression", quotedNode1_25);
                }
                quotedNode_6.addChild("statement", quotedNode1_24);
              }
              quotedNode_3.addChild("ifTrue", quotedNode1_22);
            }
            {
              quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NotEqualsExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_29 = quotedNode_7;
              {
                quotedNode_11 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_30 = quotedNode_11;
                quotedNode_7.addChild("rightExpression", quotedNode1_30);
              }
              {
                quotedNode_12 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_31 = quotedNode_12;
                quotedNode_7.addChild("leftExpression", quotedNode1_31);
              }
              quotedNode_3.addChild("condition", quotedNode1_29);
            }
            quotedNode_1.addChild("statement", quotedNode1_21);
          }
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_32 = quotedNode_4;
            quotedNode_1.addChild("statement", quotedNode1_32);
          }
          result = quotedNode1_17;
        }
        quotedNode_12.setReferent("variableDeclaration", quotedNode_5);
        return result;
      }
    }

    public static class Pattern_8lasc_a0a1a1a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;
      /*package*/ SNode PatternVar_ifbody;

      public Pattern_8lasc_a0a1a1a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_1fi_a0;
          nodeToMatch_1fi_a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_1fi_a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_1fi_ = "statement";
            if (nodeToMatch_1fi_a0.getChildCount(childRole_1fi_) != 3) {
              return false;
            }
            {
              SNode childVar_1fi_a0a = nodeToMatch_1fi_a0.getChildren(childRole_1fi_).get(0);
            }
            {
              SNode childVar_1fi_b0a = nodeToMatch_1fi_a0.getChildren(childRole_1fi_).get(1);
              {
                SNode nodeToMatch_1fi_b0a;
                nodeToMatch_1fi_b0a = childVar_1fi_b0a;
                if (!("jetbrains.mps.baseLanguage.structure.IfStatement".equals(nodeToMatch_1fi_b0a.getConceptFqName()))) {
                  return false;
                }
                {
                  String childRole_1fi__0 = "ifTrue";
                  if (nodeToMatch_1fi_b0a.getChildCount(childRole_1fi__0) != 1) {
                    return false;
                  }
                  {
                    SNode childVar_1fi_a1a0 = nodeToMatch_1fi_b0a.getChildren(childRole_1fi__0).get(0);
                    this.PatternVar_ifbody = childVar_1fi_a1a0;
                  }
                }
                {
                  String childRole_1fi__1 = "condition";
                  if (nodeToMatch_1fi_b0a.getChildCount(childRole_1fi__1) != 1) {
                    return false;
                  }
                  {
                    SNode childVar_1fi_a1a0_0 = nodeToMatch_1fi_b0a.getChildren(childRole_1fi__1).get(0);
                    {
                      SNode nodeToMatch_1fi_a1a0;
                      nodeToMatch_1fi_a1a0 = childVar_1fi_a1a0_0;
                      if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_1fi_a1a0.getConceptFqName()))) {
                        return false;
                      }
                      {
                        String childRole_1fi__2 = "leftExpression";
                        if (nodeToMatch_1fi_a1a0.getChildCount(childRole_1fi__2) != 1) {
                          return false;
                        }
                        {
                          SNode childVar_1fi_a0b0a = nodeToMatch_1fi_a1a0.getChildren(childRole_1fi__2).get(0);
                          this.PatternVar_p = childVar_1fi_a0b0a;
                        }
                      }
                      {
                        String childRole_1fi__3 = "rightExpression";
                        if (nodeToMatch_1fi_a1a0.getChildCount(childRole_1fi__3) != 1) {
                          return false;
                        }
                        {
                          SNode childVar_1fi_a0b0a_0 = nodeToMatch_1fi_a1a0.getChildren(childRole_1fi__3).get(0);
                          {
                            SNode nodeToMatch_1fi_a0b0a;
                            nodeToMatch_1fi_a0b0a = childVar_1fi_a0b0a_0;
                            if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_1fi_a0b0a.getConceptFqName()))) {
                              return false;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            {
              SNode childVar_1fi_c0a = nodeToMatch_1fi_a0.getChildren(childRole_1fi_).get(2);
            }
          }
        }
        return true;
      }

      public boolean hasAntiquotations() {
        return false;
      }

      public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
        if (pattern != null && pattern.getClass() == this.getClass()) {
          this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
          this.PatternVar_ifbody = (SNode) pattern.getFieldValue("PatternVar_ifbody");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_p".equals(fieldName)) {
          return this.PatternVar_p;
        }
        if ("PatternVar_ifbody".equals(fieldName)) {
          return this.PatternVar_ifbody;
        }
        return null;
      }

      public void performActions(Object o) {

      }
    }

    public static class QuotationClass_8lasc_a1a0g0b0 {
      public QuotationClass_8lasc_a1a0g0b0() {
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
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_9 = quotedNode_2;
            quotedNode_1.addChild("statement", quotedNode1_9);
          }
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_10 = quotedNode_3;
            {
              quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_11 = quotedNode_4;
              {
                quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_12 = quotedNode_5;
                quotedNode1_12.addReference(SReference.create("classifier", quotedNode1_12, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System")));
                quotedNode1_12.addReference(SReference.create("variableDeclaration", quotedNode1_12, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System.out")));
                quotedNode_4.addChild("operand", quotedNode1_12);
              }
              {
                quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_13 = quotedNode_6;
                quotedNode1_13.addReference(SReference.create("baseMethodDeclaration", quotedNode1_13, SModelReference.fromString("f:java_stub#java.io(java.io@java_stub)"), SNodeId.fromString("~PrintStream.println(java.lang.String):void")));
                {
                  quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
                  SNode quotedNode1_14 = quotedNode_7;
                  quotedNode1_14.setProperty("value", " ");
                  quotedNode_6.addChild("actualArgument", quotedNode1_14);
                }
                quotedNode_4.addChild("operation", quotedNode1_13);
              }
              quotedNode_3.addChild("expression", quotedNode1_11);
            }
            quotedNode_1.addChild("statement", quotedNode1_10);
          }
          result = quotedNode1_8;
        }
        return result;
      }
    }
  }
}
