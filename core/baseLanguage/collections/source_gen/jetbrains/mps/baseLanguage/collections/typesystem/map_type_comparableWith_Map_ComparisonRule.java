package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;

public class map_type_comparableWith_Map_ComparisonRule extends ComparisonRule_Runtime {
  private static SNodePointer SNODE_POINTER_yoc8ci_a0a0a0a0b0c0a0a0a0a0a0d = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Map");

  /*package*/ GeneratedMatchingPattern myMatchingPattern2;

  public map_type_comparableWith_Map_ComparisonRule() {
  }

  public boolean areComparable(SNode node1, SNode node2, IsApplicable2Status status) {
    return true;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableFirst(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableConceptFQName1());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSecond(SNode node) {
    {
      GeneratedMatchingPattern pattern = new map_type_comparableWith_Map_ComparisonRule.Pattern_yoc8ci_a0a0a0a3();
      this.myMatchingPattern2 = pattern;
      boolean b = pattern.match(node);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public String getApplicableConceptFQName1() {
    return "jetbrains.mps.baseLanguage.collections.structure.MapType";
  }

  public String getApplicableConceptFQName2() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_yoc8ci_a0a0a0a3 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_KEY;
    /*package*/ SNode patternVar_VALUE;

    public Pattern_yoc8ci_a0a0a0a3() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_1241438253001;
        nodeToMatch_1241438253001 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_1241438253001.getConceptFqName()))) {
          return false;
        }
        {
          SNodePointer pointer = SNODE_POINTER_yoc8ci_a0a0a0a0b0c0a0a0a0a0a0d;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_1241438253001.getReferent("classifier")))) {
            return false;
          }
        }
        {
          String childRole_1241438253001 = "parameter";
          if (nodeToMatch_1241438253001.getChildCount(childRole_1241438253001) != 2) {
            return false;
          }
          {
            SNode childVar_1241438321869 = nodeToMatch_1241438253001.getChildren(childRole_1241438253001).get(0);
            this.patternVar_KEY = childVar_1241438321869;
          }
          {
            SNode childVar_1241438324012 = nodeToMatch_1241438253001.getChildren(childRole_1241438253001).get(1);
            this.patternVar_VALUE = childVar_1241438324012;
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
        patternVar_KEY = (SNode) pattern.getFieldValue("patternVar_KEY");
        patternVar_VALUE = (SNode) pattern.getFieldValue("patternVar_VALUE");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_KEY".equals(fieldName)) {
        return patternVar_KEY;
      }
      if ("patternVar_VALUE".equals(fieldName)) {
        return patternVar_VALUE;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
