package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class RuleAssertNull extends DataFlowConstructor {
  private GeneratedMatchingPattern myPattern = new RuleAssertNull.Pattern_ah97h0_a0a();

  public RuleAssertNull() {
  }

  public boolean isApplicable(SNode node) {
    return myPattern.match(node);
  }

  public void performActions(Program program, SNode node) {
    myPattern.performActions(program);
  }

  public static class Pattern_ah97h0_a0a extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_p;
    /*package*/ SNode patternVar_action_var_5730083271929368110;
    private GeneratedMatchingPattern myOrPattern_ah97h0_a0a0;

    public Pattern_ah97h0_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_RuleAssertNull_ah97h0_a0a;
        nodeToMatch_RuleAssertNull_ah97h0_a0a = nodeToMatch;
        patternVar_action_var_5730083271929368110 = nodeToMatch_RuleAssertNull_ah97h0_a0a;
        if (!("jetbrains.mps.baseLanguage.structure.AssertStatement".equals(nodeToMatch_RuleAssertNull_ah97h0_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_RuleAssertNull_ah97h0_ = "condition";
          if (nodeToMatch_RuleAssertNull_ah97h0_a0a.getChildCount(childRole_RuleAssertNull_ah97h0_) != 1) {
            return false;
          }
          {
            SNode childVar_RuleAssertNull_ah97h0_a0a0 = nodeToMatch_RuleAssertNull_ah97h0_a0a.getChildren(childRole_RuleAssertNull_ah97h0_).get(0);
            {
              SNode nodeToMatch_RuleAssertNull_ah97h0_a0a0;
              nodeToMatch_RuleAssertNull_ah97h0_a0a0 = childVar_RuleAssertNull_ah97h0_a0a0;
              {
                boolean orMatches = false;
                GeneratedMatchingPattern orPattern;
                orPattern = new RuleAssertNull.Pattern_ah97h0_a0a.Pattern_ah97h0_a0a0a2a2a1a1a1a0a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_RuleAssertNull_ah97h0_a0a0)) {
                  orMatches = true;
                  myOrPattern_ah97h0_a0a0 = orPattern;
                }
                orPattern = new RuleAssertNull.Pattern_ah97h0_a0a.Pattern_ah97h0_a0a0a3a2a1a1a1a0a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_RuleAssertNull_ah97h0_a0a0)) {
                  orMatches = true;
                  myOrPattern_ah97h0_a0a0 = orPattern;
                }
                if (!(orMatches)) {
                  return false;
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
        patternVar_p = (SNode) pattern.getFieldValue("patternVar_p");
        patternVar_action_var_5730083271929368110 = (SNode) pattern.getFieldValue("patternVar_action_var_5730083271929368110");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_p".equals(fieldName)) {
        return patternVar_p;
      }
      if ("patternVar_action_var_5730083271929368110".equals(fieldName)) {
        return patternVar_action_var_5730083271929368110;
      }
      return null;
    }

    public void performActions(Object o) {
      {
        Object object = getFieldValue("patternVar_action_var_5730083271929368110");
        if (((Program) o).contains(object)) {
          boolean before = false;
          int position;
          if (before) {
            position = ((Program) (o)).getStart(object);
          } else {
            position = ((Program) (o)).getEnd(object);
          }
          Instruction instruction = new notNullInstruction((SNode) getFieldValue("patternVar_p"));
          instruction.setSource(getFieldValue("patternVar_action_var_5730083271929368110"));
          ((Program) (o)).insert(instruction, position, true, before);
        }
      }
    }

    public class Pattern_ah97h0_a0a0a2a2a1a1a1a0a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      public Pattern_ah97h0_a0a0a2a2a1a1a1a0a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_RuleAssertNull_ah97h0_a0a0a0;
          nodeToMatch_RuleAssertNull_ah97h0_a0a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_RuleAssertNull_ah97h0_a0a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_RuleAssertNull_ah97h0__0 = "leftExpression";
            if (nodeToMatch_RuleAssertNull_ah97h0_a0a0a0.getChildCount(childRole_RuleAssertNull_ah97h0__0) != 1) {
              return false;
            }
            {
              SNode childVar_RuleAssertNull_ah97h0_a0a0a0a = nodeToMatch_RuleAssertNull_ah97h0_a0a0a0.getChildren(childRole_RuleAssertNull_ah97h0__0).get(0);
              {
                SNode nodeToMatch_RuleAssertNull_ah97h0_a0a0a0a;
                nodeToMatch_RuleAssertNull_ah97h0_a0a0a0a = childVar_RuleAssertNull_ah97h0_a0a0a0a;
                patternVar_p = nodeToMatch_RuleAssertNull_ah97h0_a0a0a0a;
              }
            }
          }
          {
            String childRole_RuleAssertNull_ah97h0__1 = "rightExpression";
            if (nodeToMatch_RuleAssertNull_ah97h0_a0a0a0.getChildCount(childRole_RuleAssertNull_ah97h0__1) != 1) {
              return false;
            }
            {
              SNode childVar_RuleAssertNull_ah97h0_a0a0a0a_0 = nodeToMatch_RuleAssertNull_ah97h0_a0a0a0.getChildren(childRole_RuleAssertNull_ah97h0__1).get(0);
              {
                SNode nodeToMatch_RuleAssertNull_ah97h0_a0a0a0a_0;
                nodeToMatch_RuleAssertNull_ah97h0_a0a0a0a_0 = childVar_RuleAssertNull_ah97h0_a0a0a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_RuleAssertNull_ah97h0_a0a0a0a_0.getConceptFqName()))) {
                  return false;
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
      }

      public Object getFieldValue(String fieldName) {
        return null;
      }

      public void performActions(Object o) {
      }
    }

    public class Pattern_ah97h0_a0a0a3a2a1a1a1a0a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      public Pattern_ah97h0_a0a0a3a2a1a1a1a0a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_RuleAssertNull_ah97h0_a1a0a0;
          nodeToMatch_RuleAssertNull_ah97h0_a1a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_RuleAssertNull_ah97h0_a1a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_RuleAssertNull_ah97h0__2 = "leftExpression";
            if (nodeToMatch_RuleAssertNull_ah97h0_a1a0a0.getChildCount(childRole_RuleAssertNull_ah97h0__2) != 1) {
              return false;
            }
            {
              SNode childVar_RuleAssertNull_ah97h0_a0b0a0a = nodeToMatch_RuleAssertNull_ah97h0_a1a0a0.getChildren(childRole_RuleAssertNull_ah97h0__2).get(0);
              {
                SNode nodeToMatch_RuleAssertNull_ah97h0_a0b0a0a;
                nodeToMatch_RuleAssertNull_ah97h0_a0b0a0a = childVar_RuleAssertNull_ah97h0_a0b0a0a;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_RuleAssertNull_ah97h0_a0b0a0a.getConceptFqName()))) {
                  return false;
                }
              }
            }
          }
          {
            String childRole_RuleAssertNull_ah97h0__3 = "rightExpression";
            if (nodeToMatch_RuleAssertNull_ah97h0_a1a0a0.getChildCount(childRole_RuleAssertNull_ah97h0__3) != 1) {
              return false;
            }
            {
              SNode childVar_RuleAssertNull_ah97h0_a0b0a0a_0 = nodeToMatch_RuleAssertNull_ah97h0_a1a0a0.getChildren(childRole_RuleAssertNull_ah97h0__3).get(0);
              {
                SNode nodeToMatch_RuleAssertNull_ah97h0_a0b0a0a_0;
                nodeToMatch_RuleAssertNull_ah97h0_a0b0a0a_0 = childVar_RuleAssertNull_ah97h0_a0b0a0a_0;
                patternVar_p = nodeToMatch_RuleAssertNull_ah97h0_a0b0a0a_0;
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
      }

      public Object getFieldValue(String fieldName) {
        return null;
      }

      public void performActions(Object o) {
      }
    }
  }
}
