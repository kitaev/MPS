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
public class Patternv3_Test extends BaseTransformationTest {
  public Patternv3_Test() {
  }

  @Test
  public void testMethod() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/plugin/plugin.mpr", "r:ef0e231b-e6bd-436f-9003-b53de4081716(jetbrains.mps.lang.pattern.test)");
    this.runTest("jetbrains.mps.lang.pattern.test.Patternv3_Test$TestBody", "testv3", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public TestBody() {
    }

    public void testv3() {
      assertTrue(match());

    }

    public boolean match() {
      SNode nodeToMatch = new Patternv3_Test.TestBody.QuotationClass_oo3baa_a0a0a1a().createNode();
      GeneratedMatchingPattern pattern = new Patternv3_Test.TestBody.Pattern_oo3baa_a0a1a1a();
      boolean matchNeeded = true;
      boolean matches = pattern.match(nodeToMatch);
      if (matchNeeded != matches) {
        return false;
      }
      if (!(matchNeeded)) {
        return true;
      }
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), new Patternv3_Test.TestBody.QuotationClass_oo3baa_a1a0g0b0().createNode()), ListSequence.fromListAndArray(new ArrayList<SNode>(), (SNode) pattern.getFieldValue("PatternVar_printed"))));
      return true;
    }

    public static class QuotationClass_oo3baa_a0a0a1a {
      public QuotationClass_oo3baa_a0a0a1a() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        SNode quotedNode_3 = null;
        SNode quotedNode_4 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_6 = quotedNode_2;
            quotedNode1_6.addReference(SReference.create("classifier", quotedNode1_6, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System")));
            quotedNode1_6.addReference(SReference.create("variableDeclaration", quotedNode1_6, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System.out")));
            quotedNode_1.addChild("operand", quotedNode1_6);
          }
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_7 = quotedNode_3;
            quotedNode1_7.addReference(SReference.create("baseMethodDeclaration", quotedNode1_7, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(java.io@java_stub)"), SNodeId.fromString("~PrintStream.println(java.lang.String):void")));
            {
              quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_8 = quotedNode_4;
              quotedNode1_8.setProperty("value", "d");
              quotedNode_3.addChild("actualArgument", quotedNode1_8);
            }
            quotedNode_1.addChild("operation", quotedNode1_7);
          }
          result = quotedNode1_5;
        }
        return result;
      }
    }

    public static class Pattern_oo3baa_a0a1a1a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_printed;
      /*package*/ SNode PatternVar_field;
      /*package*/ SNode PatternVar_className;
      /*package*/ SNode PatternVar_method;

      public Pattern_oo3baa_a0a1a1a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_1fi_a0_0;
          nodeToMatch_1fi_a0_0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.DotExpression".equals(nodeToMatch_1fi_a0_0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_1fi__4 = "operation";
            if (nodeToMatch_1fi_a0_0.getChildCount(childRole_1fi__4) != 1) {
              return false;
            }
            {
              SNode childVar_1fi_a0a_0 = nodeToMatch_1fi_a0_0.getChildren(childRole_1fi__4).get(0);
              {
                SNode nodeToMatch_1fi_a0a;
                nodeToMatch_1fi_a0a = childVar_1fi_a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation".equals(nodeToMatch_1fi_a0a.getConceptFqName()))) {
                  return false;
                }
                this.PatternVar_method = nodeToMatch_1fi_a0a.getReferent("baseMethodDeclaration");
                {
                  String childRole_1fi__5 = "actualArgument";
                  if (nodeToMatch_1fi_a0a.getChildCount(childRole_1fi__5) != 1) {
                    return false;
                  }
                  {
                    SNode childVar_1fi_a0a0 = nodeToMatch_1fi_a0a.getChildren(childRole_1fi__5).get(0);
                    this.PatternVar_printed = childVar_1fi_a0a0;
                  }
                }
              }
            }
          }
          {
            String childRole_1fi__6 = "operand";
            if (nodeToMatch_1fi_a0_0.getChildCount(childRole_1fi__6) != 1) {
              return false;
            }
            {
              SNode childVar_1fi_a0a_1 = nodeToMatch_1fi_a0_0.getChildren(childRole_1fi__6).get(0);
              {
                SNode nodeToMatch_1fi_a0a_0;
                nodeToMatch_1fi_a0a_0 = childVar_1fi_a0a_1;
                if (!("jetbrains.mps.baseLanguage.structure.StaticFieldReference".equals(nodeToMatch_1fi_a0a_0.getConceptFqName()))) {
                  return false;
                }
                this.PatternVar_field = nodeToMatch_1fi_a0a_0.getReferent("variableDeclaration");
                this.PatternVar_className = nodeToMatch_1fi_a0a_0.getReferent("classifier");
              }
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
          this.PatternVar_printed = (SNode) pattern.getFieldValue("PatternVar_printed");
          this.PatternVar_field = (SNode) pattern.getFieldValue("PatternVar_field");
          this.PatternVar_className = (SNode) pattern.getFieldValue("PatternVar_className");
          this.PatternVar_method = (SNode) pattern.getFieldValue("PatternVar_method");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_printed".equals(fieldName)) {
          return this.PatternVar_printed;
        }
        if ("PatternVar_field".equals(fieldName)) {
          return this.PatternVar_field;
        }
        if ("PatternVar_className".equals(fieldName)) {
          return this.PatternVar_className;
        }
        if ("PatternVar_method".equals(fieldName)) {
          return this.PatternVar_method;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }

    public static class QuotationClass_oo3baa_a1a0g0b0 {
      public QuotationClass_oo3baa_a1a0g0b0() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_2 = quotedNode_1;
          quotedNode1_2.setProperty("value", "d");
          result = quotedNode1_2;
        }
        return result;
      }
    }
  }
}
