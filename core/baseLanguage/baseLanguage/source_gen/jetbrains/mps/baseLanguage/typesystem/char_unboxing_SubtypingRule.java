package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;

public class char_unboxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  private static SNodePointer SNODE_POINTER_4wj0va_a0a0a0a0b0c0a0a0a0a0a0c = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Character");

  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public char_unboxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode charType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return new char_unboxing_SubtypingRule.QuotationClass_4wj0va_a0a0a().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      GeneratedMatchingPattern pattern = new char_unboxing_SubtypingRule.Pattern_4wj0va_a0a0a0a2();
      this.myMatchingPattern = pattern;
      boolean b = pattern.match(argument);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_4wj0va_a0a0a {
    public QuotationClass_4wj0va_a0a0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CharType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CharType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class Pattern_4wj0va_a0a0a0a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    public Pattern_4wj0va_a0a0a0a2() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_char_unboxing_gnae0c_a0a;
        nodeToMatch_char_unboxing_gnae0c_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_char_unboxing_gnae0c_a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_4wj0va_a0a0a0a0b0c0a0a0a0a0a0c;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_char_unboxing_gnae0c_a0a.getReferent("classifier")))) {
            return false;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
    }

    public Object getFieldValue(String fieldName) {
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
