package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

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
    /*package*/ SNode patternVar_p;
    /*package*/ SNode patternVar_body;
    private GeneratedMatchingPattern myOrPattern_pezsk4_a0a0;

    public Pattern_pezsk4_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_6868777471677432676;
        nodeToMatch_6868777471677432676 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.WhileStatement".equals(nodeToMatch_6868777471677432676.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_6868777471677432676 = "body";
          if (nodeToMatch_6868777471677432676.getChildCount(childRole_6868777471677432676) != 1) {
            return false;
          }
          {
            SNode childVar_6868777471677432688 = nodeToMatch_6868777471677432676.getChildren(childRole_6868777471677432676).get(0);
            {
              SNode nodeToMatch_6868777471677432688;
              nodeToMatch_6868777471677432688 = childVar_6868777471677432688;
              if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_6868777471677432688.getConceptFqName()))) {
                return false;
              }
            }
            this.patternVar_body = childVar_6868777471677432688;
          }
        }
        {
          String childRole_6868777471677432676 = "condition";
          if (nodeToMatch_6868777471677432676.getChildCount(childRole_6868777471677432676) != 1) {
            return false;
          }
          {
            SNode childVar_6868777471677432677 = nodeToMatch_6868777471677432676.getChildren(childRole_6868777471677432676).get(0);
            {
              SNode nodeToMatch_6868777471677432677;
              nodeToMatch_6868777471677432677 = childVar_6868777471677432677;
              {
                boolean orMatches = false;
                GeneratedMatchingPattern orPattern;
                orPattern = new WhileNotNull.Pattern_pezsk4_a0a.Pattern_pezsk4_a0a0a2a2a1a1a1a1a1a2a0a0a0a();
                if (orPattern.match(nodeToMatch_6868777471677432677)) {
                  orMatches = true;
                  myOrPattern_pezsk4_a0a0 = orPattern;
                }
                orPattern = new WhileNotNull.Pattern_pezsk4_a0a.Pattern_pezsk4_a0a0a3a2a1a1a1a1a1a2a0a0a0a();
                if (orPattern.match(nodeToMatch_6868777471677432677)) {
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
        patternVar_p = (SNode) pattern.getFieldValue("patternVar_p");
        patternVar_body = (SNode) pattern.getFieldValue("patternVar_body");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_p".equals(fieldName)) {
        return patternVar_p;
      }
      if ("patternVar_body".equals(fieldName)) {
        return patternVar_body;
      }
      return null;
    }

    public void performActions(Object o) {
      {
        Object object = getFieldValue("patternVar_body");
        if (((Program) o).contains(object)) {
          boolean before = true;
          int position;
          if (before) {
            position = ((Program) (o)).getStart(object);
          } else {
            position = ((Program) (o)).getEnd(object);
          }
          Instruction instruction = new notNullInstruction((SNode) getFieldValue("patternVar_p"));
          instruction.setSource(getFieldValue("patternVar_body"));
          ((Program) (o)).insert(instruction, position, true, before);
        }
      }
    }

    public class Pattern_pezsk4_a0a0a2a2a1a1a1a1a1a2a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      public Pattern_pezsk4_a0a0a2a2a1a1a1a1a1a2a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_6868777471677432679;
          nodeToMatch_6868777471677432679 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_6868777471677432679.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_6868777471677432679 = "leftExpression";
            if (nodeToMatch_6868777471677432679.getChildCount(childRole_6868777471677432679) != 1) {
              return false;
            }
            {
              SNode childVar_3295946704794761921 = nodeToMatch_6868777471677432679.getChildren(childRole_6868777471677432679).get(0);
              {
                SNode nodeToMatch_3295946704794761921;
                nodeToMatch_3295946704794761921 = childVar_3295946704794761921;
                patternVar_p = nodeToMatch_3295946704794761921;
              }
            }
          }
          {
            String childRole_6868777471677432679 = "rightExpression";
            if (nodeToMatch_6868777471677432679.getChildCount(childRole_6868777471677432679) != 1) {
              return false;
            }
            {
              SNode childVar_6868777471677432680 = nodeToMatch_6868777471677432679.getChildren(childRole_6868777471677432679).get(0);
              {
                SNode nodeToMatch_6868777471677432680;
                nodeToMatch_6868777471677432680 = childVar_6868777471677432680;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_6868777471677432680.getConceptFqName()))) {
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

    public class Pattern_pezsk4_a0a0a3a2a1a1a1a1a1a2a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      public Pattern_pezsk4_a0a0a3a2a1a1a1a1a1a2a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_6868777471677432684;
          nodeToMatch_6868777471677432684 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_6868777471677432684.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_6868777471677432684 = "leftExpression";
            if (nodeToMatch_6868777471677432684.getChildCount(childRole_6868777471677432684) != 1) {
              return false;
            }
            {
              SNode childVar_6868777471677432687 = nodeToMatch_6868777471677432684.getChildren(childRole_6868777471677432684).get(0);
              {
                SNode nodeToMatch_6868777471677432687;
                nodeToMatch_6868777471677432687 = childVar_6868777471677432687;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_6868777471677432687.getConceptFqName()))) {
                  return false;
                }
              }
            }
          }
          {
            String childRole_6868777471677432684 = "rightExpression";
            if (nodeToMatch_6868777471677432684.getChildCount(childRole_6868777471677432684) != 1) {
              return false;
            }
            {
              SNode childVar_3295946704794761922 = nodeToMatch_6868777471677432684.getChildren(childRole_6868777471677432684).get(0);
              {
                SNode nodeToMatch_3295946704794761922;
                nodeToMatch_3295946704794761922 = childVar_3295946704794761922;
                patternVar_p = nodeToMatch_3295946704794761922;
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
