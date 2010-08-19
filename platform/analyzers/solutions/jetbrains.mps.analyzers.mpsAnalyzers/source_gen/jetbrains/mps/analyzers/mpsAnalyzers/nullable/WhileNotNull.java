package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class WhileNotNull extends DataFlowConstructor {
  private GeneratedMatchingPattern myPattern = new WhileNotNull.Pattern_pezsk4_a0a();

  public WhileNotNull() {
  }

  public boolean isApplicable(SNode node) {
    return myPattern.match(node);
  }

  public void performActions(Program program, SNode node) {
    myPattern.performActions(program);
  }

  public static class Pattern_pezsk4_a0a extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_p;
    /*package*/ SNode PatternVar_body;
    private GeneratedMatchingPattern myOrPattern_pezsk4_a0a0;

    public Pattern_pezsk4_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_pezsk4_a0a;
        nodeToMatch_pezsk4_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.WhileStatement".equals(nodeToMatch_pezsk4_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_pezsk4_ = "body";
          if (nodeToMatch_pezsk4_a0a.getChildCount(childRole_pezsk4_) != 1) {
            return false;
          }
          {
            SNode childVar_pezsk4_a0a0 = nodeToMatch_pezsk4_a0a.getChildren(childRole_pezsk4_).get(0);
            {
              SNode nodeToMatch_pezsk4_a0a0;
              nodeToMatch_pezsk4_a0a0 = childVar_pezsk4_a0a0;
              if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_pezsk4_a0a0.getConceptFqName()))) {
                return false;
              }
            }
            this.PatternVar_body = childVar_pezsk4_a0a0;
          }
        }
        {
          String childRole_pezsk4__0 = "condition";
          if (nodeToMatch_pezsk4_a0a.getChildCount(childRole_pezsk4__0) != 1) {
            return false;
          }
          {
            SNode childVar_pezsk4_a0a0_0 = nodeToMatch_pezsk4_a0a.getChildren(childRole_pezsk4__0).get(0);
            {
              SNode nodeToMatch_pezsk4_a0a0_0;
              nodeToMatch_pezsk4_a0a0_0 = childVar_pezsk4_a0a0_0;
              {
                boolean orMatches = false;
                GeneratedMatchingPattern orPattern;
                orPattern = new WhileNotNull.Pattern_pezsk4_a0a.Pattern_pezsk4_a0a0a2a2a1a1a1a1a1a2a0a0a0a();
                if (orPattern.match(nodeToMatch_pezsk4_a0a0_0)) {
                  orMatches = true;
                  myOrPattern_pezsk4_a0a0 = orPattern;
                }
                orPattern = new WhileNotNull.Pattern_pezsk4_a0a.Pattern_pezsk4_a0a0a3a2a1a1a1a1a1a2a0a0a0a();
                if (orPattern.match(nodeToMatch_pezsk4_a0a0_0)) {
                  orMatches = true;
                  myOrPattern_pezsk4_a0a0 = orPattern;
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
        this.PatternVar_body = (SNode) pattern.getFieldValue("PatternVar_body");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_p".equals(fieldName)) {
        return myOrPattern_pezsk4_a0a0.getFieldValue(fieldName);
      }
      if ("PatternVar_body".equals(fieldName)) {
        return this.PatternVar_body;
      }
      return null;
    }

    public void performActions(Object o) {
      {
        int position = 0;
        Object object = getFieldValue("PatternVar_body");
        if (((Program) o).contains(object)) {
          position = ((Program) (o)).getStart(getFieldValue("PatternVar_body"));
          ((Program) (o)).insert(new notNullInstruction((SNode) getFieldValue("PatternVar_p")), position, true);
        }
      }
    }

    public static class Pattern_pezsk4_a0a0a2a2a1a1a1a1a1a2a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;

      public Pattern_pezsk4_a0a0a2a2a1a1a1a1a1a2a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_pezsk4_a0a0a0;
          nodeToMatch_pezsk4_a0a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_pezsk4_a0a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_pezsk4__1 = "leftExpression";
            if (nodeToMatch_pezsk4_a0a0a0.getChildCount(childRole_pezsk4__1) != 1) {
              return false;
            }
            {
              SNode childVar_pezsk4_a0a0a0a = nodeToMatch_pezsk4_a0a0a0.getChildren(childRole_pezsk4__1).get(0);
              this.PatternVar_p = childVar_pezsk4_a0a0a0a;
            }
          }
          {
            String childRole_pezsk4__2 = "rightExpression";
            if (nodeToMatch_pezsk4_a0a0a0.getChildCount(childRole_pezsk4__2) != 1) {
              return false;
            }
            {
              SNode childVar_pezsk4_a0a0a0a_0 = nodeToMatch_pezsk4_a0a0a0.getChildren(childRole_pezsk4__2).get(0);
              {
                SNode nodeToMatch_pezsk4_a0a0a0a;
                nodeToMatch_pezsk4_a0a0a0a = childVar_pezsk4_a0a0a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_pezsk4_a0a0a0a.getConceptFqName()))) {
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

    public static class Pattern_pezsk4_a0a0a3a2a1a1a1a1a1a2a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;

      public Pattern_pezsk4_a0a0a3a2a1a1a1a1a1a2a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_pezsk4_a1a0a0;
          nodeToMatch_pezsk4_a1a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_pezsk4_a1a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_pezsk4__3 = "leftExpression";
            if (nodeToMatch_pezsk4_a1a0a0.getChildCount(childRole_pezsk4__3) != 1) {
              return false;
            }
            {
              SNode childVar_pezsk4_a0b0a0a = nodeToMatch_pezsk4_a1a0a0.getChildren(childRole_pezsk4__3).get(0);
              {
                SNode nodeToMatch_pezsk4_a0b0a0a;
                nodeToMatch_pezsk4_a0b0a0a = childVar_pezsk4_a0b0a0a;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_pezsk4_a0b0a0a.getConceptFqName()))) {
                  return false;
                }
              }
            }
          }
          {
            String childRole_pezsk4__4 = "rightExpression";
            if (nodeToMatch_pezsk4_a1a0a0.getChildCount(childRole_pezsk4__4) != 1) {
              return false;
            }
            {
              SNode childVar_pezsk4_a0b0a0a_0 = nodeToMatch_pezsk4_a1a0a0.getChildren(childRole_pezsk4__4).get(0);
              this.PatternVar_p = childVar_pezsk4_a0b0a0a_0;
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
