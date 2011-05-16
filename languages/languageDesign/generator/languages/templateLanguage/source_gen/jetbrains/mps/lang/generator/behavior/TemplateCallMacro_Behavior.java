package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class TemplateCallMacro_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    {
      GeneratedMatchingPattern pattern_4ckpni_a0a = new TemplateCallMacro_Behavior.Pattern_4ckpni_a0a0a0a1();
      SNode coercedNode_4ckpni_a0a = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodeQuery", true)), pattern_4ckpni_a0a);
      if (coercedNode_4ckpni_a0a != null) {
        return ((SNode) pattern_4ckpni_a0a.getFieldValue("patternVar_concept"));
      } else {
      }
    }
    return NodeMacro_Behavior.callSuper_getInputNodeTypeInsideOfMacro_1213877290799(thisNode, "jetbrains.mps.lang.generator.structure.TemplateCallMacro");
  }

  public static class Pattern_4ckpni_a0a0a0a1 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_concept;

    public Pattern_4ckpni_a0a0a0a1() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_1510949579266902217;
        nodeToMatch_1510949579266902217 = nodeToMatch;
        if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_1510949579266902217.getConceptFqName()))) {
          return false;
        }
        patternVar_concept = nodeToMatch_1510949579266902217.getReferent("concept");
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_concept = (SNode) pattern.getFieldValue("patternVar_concept");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_concept".equals(fieldName)) {
        return patternVar_concept;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
