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
    /*package*/ SNode PatternVar_p;
    /*package*/ SNode PatternVar_action_var_5730083271929368110;
    private GeneratedMatchingPattern myOrPattern_ah97h0_a0a0;

    public Pattern_ah97h0_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_ah97h0_a0a;
        nodeToMatch_ah97h0_a0a = nodeToMatch;
        PatternVar_action_var_5730083271929368110 = nodeToMatch_ah97h0_a0a;
        if (!("jetbrains.mps.baseLanguage.structure.AssertStatement".equals(nodeToMatch_ah97h0_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_ah97h0_ = "condition";
          if (nodeToMatch_ah97h0_a0a.getChildCount(childRole_ah97h0_) != 1) {
            return false;
          }
          {
            SNode childVar_ah97h0_a0a0 = nodeToMatch_ah97h0_a0a.getChildren(childRole_ah97h0_).get(0);
            {
              SNode nodeToMatch_ah97h0_a0a0;
              nodeToMatch_ah97h0_a0a0 = childVar_ah97h0_a0a0;
              {
                boolean orMatches = false;
                GeneratedMatchingPattern orPattern;
                orPattern = new RuleAssertNull.Pattern_ah97h0_a0a.Pattern_ah97h0_a0a0a2a2a1a1a1a0a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_ah97h0_a0a0)) {
                  orMatches = true;
                  myOrPattern_ah97h0_a0a0 = orPattern;
                }
                orPattern = new RuleAssertNull.Pattern_ah97h0_a0a.Pattern_ah97h0_a0a0a3a2a1a1a1a0a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_ah97h0_a0a0)) {
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
        this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        this.PatternVar_action_var_5730083271929368110 = (SNode) pattern.getFieldValue("PatternVar_action_var_5730083271929368110");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_p".equals(fieldName)) {
        return myOrPattern_ah97h0_a0a0.getFieldValue(fieldName);
      }
      if ("PatternVar_action_var_5730083271929368110".equals(fieldName)) {
        return this.PatternVar_action_var_5730083271929368110;
      }
      return null;
    }

    public void performActions(Object o) {
      {
        Object object = getFieldValue("PatternVar_action_var_5730083271929368110");
        if (((Program) o).contains(object)) {
          boolean before = false;
          int position;
          if (before) {
            position = ((Program) (o)).getStart(object);
          } else {
            position = ((Program) (o)).getEnd(object);
          }
          Instruction instruction = new notNullInstruction((SNode) getFieldValue("PatternVar_p"));
          instruction.setSource(getFieldValue("PatternVar_action_var_5730083271929368110"));
          ((Program) (o)).insert(instruction, position, true, before);
        }
      }
    }

    public static class Pattern_ah97h0_a0a0a2a2a1a1a1a0a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;

      public Pattern_ah97h0_a0a0a2a2a1a1a1a0a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_ah97h0_a0a0a0;
          nodeToMatch_ah97h0_a0a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_ah97h0_a0a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_ah97h0__0 = "leftExpression";
            if (nodeToMatch_ah97h0_a0a0a0.getChildCount(childRole_ah97h0__0) != 1) {
              return false;
            }
            {
              SNode childVar_ah97h0_a0a0a0a = nodeToMatch_ah97h0_a0a0a0.getChildren(childRole_ah97h0__0).get(0);
              {
                SNode nodeToMatch_ah97h0_a0a0a0a;
                nodeToMatch_ah97h0_a0a0a0a = childVar_ah97h0_a0a0a0a;
                PatternVar_p = nodeToMatch_ah97h0_a0a0a0a;
              }
            }
          }
          {
            String childRole_ah97h0__1 = "rightExpression";
            if (nodeToMatch_ah97h0_a0a0a0.getChildCount(childRole_ah97h0__1) != 1) {
              return false;
            }
            {
              SNode childVar_ah97h0_a0a0a0a_0 = nodeToMatch_ah97h0_a0a0a0.getChildren(childRole_ah97h0__1).get(0);
              {
                SNode nodeToMatch_ah97h0_a0a0a0a_0;
                nodeToMatch_ah97h0_a0a0a0a_0 = childVar_ah97h0_a0a0a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_ah97h0_a0a0a0a_0.getConceptFqName()))) {
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
        if (pattern != null && pattern.getClass() == this.getClass()) {
          this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_p".equals(fieldName)) {
          return this.PatternVar_p;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }

    public static class Pattern_ah97h0_a0a0a3a2a1a1a1a0a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;

      public Pattern_ah97h0_a0a0a3a2a1a1a1a0a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_ah97h0_a1a0a0;
          nodeToMatch_ah97h0_a1a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_ah97h0_a1a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_ah97h0__2 = "leftExpression";
            if (nodeToMatch_ah97h0_a1a0a0.getChildCount(childRole_ah97h0__2) != 1) {
              return false;
            }
            {
              SNode childVar_ah97h0_a0b0a0a = nodeToMatch_ah97h0_a1a0a0.getChildren(childRole_ah97h0__2).get(0);
              {
                SNode nodeToMatch_ah97h0_a0b0a0a;
                nodeToMatch_ah97h0_a0b0a0a = childVar_ah97h0_a0b0a0a;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_ah97h0_a0b0a0a.getConceptFqName()))) {
                  return false;
                }
              }
            }
          }
          {
            String childRole_ah97h0__3 = "rightExpression";
            if (nodeToMatch_ah97h0_a1a0a0.getChildCount(childRole_ah97h0__3) != 1) {
              return false;
            }
            {
              SNode childVar_ah97h0_a0b0a0a_0 = nodeToMatch_ah97h0_a1a0a0.getChildren(childRole_ah97h0__3).get(0);
              {
                SNode nodeToMatch_ah97h0_a0b0a0a_0;
                nodeToMatch_ah97h0_a0b0a0a_0 = childVar_ah97h0_a0b0a0a_0;
                PatternVar_p = nodeToMatch_ah97h0_a0b0a0a_0;
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
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_p".equals(fieldName)) {
          return this.PatternVar_p;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }
  }
}
