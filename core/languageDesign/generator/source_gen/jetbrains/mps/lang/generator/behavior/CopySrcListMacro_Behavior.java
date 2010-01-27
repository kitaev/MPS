package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class CopySrcListMacro_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    SNode queryType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodesQuery", true));
    {
      GeneratedMatchingPattern pattern_5026_0 = new CopySrcListMacro_Behavior.Pattern_5026_0();
      SNode coercedNode_5026_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(queryType, pattern_5026_0);
      if (coercedNode_5026_0 != null) {
        return ((SNode) pattern_5026_0.getFieldValue("PatternVar_concept"));
      } else {
      }
    }
    return null;
  }

  public static class Pattern_5026_0 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_concept;

    public Pattern_5026_0() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_5026_0;
        nodeToMatch_5026_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.collections.structure.SequenceType".equals(nodeToMatch_5026_0.getConceptFqName()))) {
          return false;
        }
        {
          String childRole5026_0 = "elementType";
          if (nodeToMatch_5026_0.getChildCount(childRole5026_0) != 1) {
            return false;
          }
          {
            SNode childVar_5026_0 = nodeToMatch_5026_0.getChildren(childRole5026_0).get(0);
            {
              SNode nodeToMatch_5026_1;
              nodeToMatch_5026_1 = childVar_5026_0;
              if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_5026_1.getConceptFqName()))) {
                return false;
              }
              this.PatternVar_concept = nodeToMatch_5026_1.getReferent("concept");
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
        this.PatternVar_concept = (SNode) pattern.getFieldValue("PatternVar_concept");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_concept".equals(fieldName)) {
        return this.PatternVar_concept;
      }
      return null;
    }
  }
}
