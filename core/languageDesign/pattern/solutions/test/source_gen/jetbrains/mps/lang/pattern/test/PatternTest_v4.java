package jetbrains.mps.lang.pattern.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import java.util.List;
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
public class PatternTest_v4 extends BaseTransformationTest {
  public PatternTest_v4() {
  }

  @Test
  public void testMethod() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:ef0e231b-e6bd-436f-9003-b53de4081716(jetbrains.mps.lang.pattern.test)");
    this.runTest("jetbrains.mps.lang.pattern.test.PatternTest_v4$TestBody", "testv4", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public TestBody() {
    }

    public void testv4() {
      assertTrue(match());

    }

    public boolean match() {
      SNode nodeToMatch = new PatternTest_v4.TestBody.QuotationClass_8lasd_a0a0a1a_0().createNode();
      GeneratedMatchingPattern pattern = new PatternTest_v4.TestBody.Pattern_8lasd_a0a1a1a_0();
      boolean matchNeeded = true;
      boolean matches = pattern.match(nodeToMatch);
      if (matchNeeded != matches) {
        return false;
      }
      if (!(matchNeeded)) {
        return true;
      }
      {
        List<SNode> list = (List<SNode>) pattern.getFieldValue("PatternVar_list");
        int i = 0;
        Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), list.get(i)), ListSequence.fromListAndArray(new ArrayList<SNode>(), new PatternTest_v4.TestBody.QuotationClass_8lasd_a1b0a0c0g0b0().createNode())));
        i++;
        Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), list.get(i)), ListSequence.fromListAndArray(new ArrayList<SNode>(), new PatternTest_v4.TestBody.QuotationClass_8lasd_a1b0a0d0g0b0().createNode())));
        i++;
      }
      return true;
    }

    public static class QuotationClass_8lasd_a0a0a1a_0 {
      public QuotationClass_8lasd_a0a0a1a_0() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        SNode quotedNode_3 = null;
        SNode quotedNode_4 = null;
        SNode quotedNode_5 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_7 = quotedNode_2;
            quotedNode1_7.addReference(SReference.create("classifier", quotedNode1_7, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System")));
            quotedNode1_7.addReference(SReference.create("variableDeclaration", quotedNode1_7, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~System.out")));
            quotedNode_1.addChild("operand", quotedNode1_7);
          }
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_8 = quotedNode_3;
            quotedNode1_8.addReference(SReference.create("baseMethodDeclaration", quotedNode1_8, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object.wait(long,int):void")));
            {
              quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_9 = quotedNode_4;
              quotedNode1_9.setProperty("value", "10");
              quotedNode_3.addChild("actualArgument", quotedNode1_9);
            }
            {
              quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_10 = quotedNode_5;
              quotedNode1_10.setProperty("value", "10");
              quotedNode_3.addChild("actualArgument", quotedNode1_10);
            }
            quotedNode_1.addChild("operation", quotedNode1_8);
          }
          result = quotedNode1_6;
        }
        return result;
      }
    }

    public static class Pattern_8lasd_a0a1a1a_0 extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ List<SNode> PatternVar_list;
      /*package*/ SNode PatternVar_ignore;
      /*package*/ SNode PatternVar_field;
      /*package*/ SNode PatternVar_className;
      /*package*/ SNode PatternVar_method;

      public Pattern_8lasd_a0a1a1a_0() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_1fj_a0;
          nodeToMatch_1fj_a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.DotExpression".equals(nodeToMatch_1fj_a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_1fj_ = "operation";
            if (nodeToMatch_1fj_a0.getChildCount(childRole_1fj_) != 1) {
              return false;
            }
            {
              SNode childVar_1fj_a0a = nodeToMatch_1fj_a0.getChildren(childRole_1fj_).get(0);
              {
                SNode nodeToMatch_1fj_a0a;
                nodeToMatch_1fj_a0a = childVar_1fj_a0a;
                if (!("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation".equals(nodeToMatch_1fj_a0a.getConceptFqName()))) {
                  return false;
                }
                this.PatternVar_method = nodeToMatch_1fj_a0a.getReferent("baseMethodDeclaration");
                {
                  String childRole_1fj__0 = "actualArgument";
                  this.PatternVar_list = ListSequence.fromList(new ArrayList<SNode>());
                  this.PatternVar_ignore = null;
                  for (SNode childVar : nodeToMatch_1fj_a0a.getChildren(childRole_1fj__0)) {
                    this.PatternVar_ignore = childVar;
                    ListSequence.fromList(this.PatternVar_list).addElement(childVar);
                  }
                }
              }
            }
          }
          {
            String childRole_1fj__1 = "operand";
            if (nodeToMatch_1fj_a0.getChildCount(childRole_1fj__1) != 1) {
              return false;
            }
            {
              SNode childVar_1fj_a0a_0 = nodeToMatch_1fj_a0.getChildren(childRole_1fj__1).get(0);
              {
                SNode nodeToMatch_1fj_a0a_0;
                nodeToMatch_1fj_a0a_0 = childVar_1fj_a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.StaticFieldReference".equals(nodeToMatch_1fj_a0a_0.getConceptFqName()))) {
                  return false;
                }
                this.PatternVar_field = nodeToMatch_1fj_a0a_0.getReferent("variableDeclaration");
                this.PatternVar_className = nodeToMatch_1fj_a0a_0.getReferent("classifier");
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
          this.PatternVar_list = (List<SNode>) pattern.getFieldValue("PatternVar_list");
          this.PatternVar_ignore = (SNode) pattern.getFieldValue("PatternVar_ignore");
          this.PatternVar_field = (SNode) pattern.getFieldValue("PatternVar_field");
          this.PatternVar_className = (SNode) pattern.getFieldValue("PatternVar_className");
          this.PatternVar_method = (SNode) pattern.getFieldValue("PatternVar_method");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_list".equals(fieldName)) {
          return this.PatternVar_list;
        }
        if ("PatternVar_ignore".equals(fieldName)) {
          return this.PatternVar_ignore;
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

    public static class QuotationClass_8lasd_a1b0a0c0g0b0 {
      public QuotationClass_8lasd_a1b0a0c0g0b0() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_2 = quotedNode_1;
          quotedNode1_2.setProperty("value", "10");
          result = quotedNode1_2;
        }
        return result;
      }
    }

    public static class QuotationClass_8lasd_a1b0a0d0g0b0 {
      public QuotationClass_8lasd_a1b0a0d0g0b0() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_2 = quotedNode_1;
          quotedNode1_2.setProperty("value", "10");
          result = quotedNode1_2;
        }
        return result;
      }
    }
  }
}
