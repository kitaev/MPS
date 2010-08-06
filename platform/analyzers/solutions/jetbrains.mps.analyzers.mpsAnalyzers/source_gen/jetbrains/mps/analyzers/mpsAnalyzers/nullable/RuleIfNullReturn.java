package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class RuleIfNullReturn extends DataFlowConstructor {
  private GeneratedMatchingPattern myPattern = new RuleIfNullReturn.Pattern_4nenl4_a0a();

  public RuleIfNullReturn() {
  }

  public boolean isApplicable(SNode node) {
    return myPattern.match(node);
  }

  public void performActions(Program program, SNode node) {
    myPattern.performActions(program);
  }

  public static class Pattern_4nenl4_a0a extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_p;
    /*package*/ SNode PatternVar_body;

    public Pattern_4nenl4_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_4nenl4_a0a;
        nodeToMatch_4nenl4_a0a = nodeToMatch;
        PatternVar_body = nodeToMatch_4nenl4_a0a;
        if (!("jetbrains.mps.baseLanguage.structure.IfStatement".equals(nodeToMatch_4nenl4_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_4nenl4_ = "ifTrue";
          if (nodeToMatch_4nenl4_a0a.getChildCount(childRole_4nenl4_) != 1) {
            return false;
          }
          {
            SNode childVar_4nenl4_a0a0 = nodeToMatch_4nenl4_a0a.getChildren(childRole_4nenl4_).get(0);
            {
              SNode nodeToMatch_4nenl4_a0a0;
              nodeToMatch_4nenl4_a0a0 = childVar_4nenl4_a0a0;
              if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_4nenl4_a0a0.getConceptFqName()))) {
                return false;
              }
              {
                String childRole_4nenl4__0 = "statement";
                if (nodeToMatch_4nenl4_a0a0.getChildCount(childRole_4nenl4__0) != 1) {
                  return false;
                }
                {
                  SNode childVar_4nenl4_a0a0a = nodeToMatch_4nenl4_a0a0.getChildren(childRole_4nenl4__0).get(0);
                  {
                    SNode nodeToMatch_4nenl4_a0a0a;
                    nodeToMatch_4nenl4_a0a0a = childVar_4nenl4_a0a0a;
                    if (!("jetbrains.mps.baseLanguage.structure.ReturnStatement".equals(nodeToMatch_4nenl4_a0a0a.getConceptFqName()))) {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        {
          String childRole_4nenl4__1 = "condition";
          if (nodeToMatch_4nenl4_a0a.getChildCount(childRole_4nenl4__1) != 1) {
            return false;
          }
          {
            SNode childVar_4nenl4_a0a0_0 = nodeToMatch_4nenl4_a0a.getChildren(childRole_4nenl4__1).get(0);
            {
              SNode nodeToMatch_4nenl4_a0a0_0;
              nodeToMatch_4nenl4_a0a0_0 = childVar_4nenl4_a0a0_0;
              if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_4nenl4_a0a0_0.getConceptFqName()))) {
                return false;
              }
              {
                String childRole_4nenl4__2 = "leftExpression";
                if (nodeToMatch_4nenl4_a0a0_0.getChildCount(childRole_4nenl4__2) != 1) {
                  return false;
                }
                {
                  SNode childVar_4nenl4_a0a0a_0 = nodeToMatch_4nenl4_a0a0_0.getChildren(childRole_4nenl4__2).get(0);
                  this.PatternVar_p = childVar_4nenl4_a0a0a_0;
                }
              }
              {
                String childRole_4nenl4__3 = "rightExpression";
                if (nodeToMatch_4nenl4_a0a0_0.getChildCount(childRole_4nenl4__3) != 1) {
                  return false;
                }
                {
                  SNode childVar_4nenl4_a0a0a_1 = nodeToMatch_4nenl4_a0a0_0.getChildren(childRole_4nenl4__3).get(0);
                  {
                    SNode nodeToMatch_4nenl4_a0a0a_0;
                    nodeToMatch_4nenl4_a0a0a_0 = childVar_4nenl4_a0a0a_1;
                    if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_4nenl4_a0a0a_0.getConceptFqName()))) {
                      return false;
                    }
                  }
                }
              }
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
        this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        this.PatternVar_body = (SNode) pattern.getFieldValue("PatternVar_body");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_p".equals(fieldName)) {
        return this.PatternVar_p;
      }
      if ("PatternVar_body".equals(fieldName)) {
        return this.PatternVar_body;
      }
      return null;
    }

    public void performActions(Object o) {

      {
        int position = 0;
        position = ((Program) (o)).getEnd(getFieldValue("PatternVar_body"));
        ((Program) (o)).insert(new notNullInstruction((SNode) getFieldValue("PatternVar_p")), position, true);
      }
    }
  }
}
