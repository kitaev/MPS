package jetbrains.mps.samples.formulaLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Operation extends Expression {
  public static final String concept = "jetbrains.mps.samples.formulaLanguage.structure.Operation";
  public static final String LEFT_OPERAND = "leftOperand";
  public static final String RIGHT_OPERAND = "rightOperand";

  public Operation(SNode node) {
    super(node);
  }

  public Expression getLeftOperand() {
    return (Expression) this.getChild(Expression.class, Operation.LEFT_OPERAND);
  }

  public void setLeftOperand(Expression node) {
    super.setChild(Operation.LEFT_OPERAND, node);
  }

  public Expression getRightOperand() {
    return (Expression) this.getChild(Expression.class, Operation.RIGHT_OPERAND);
  }

  public void setRightOperand(Expression node) {
    super.setChild(Operation.RIGHT_OPERAND, node);
  }

  public static Operation newInstance(SModel sm, boolean init) {
    return (Operation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.formulaLanguage.structure.Operation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Operation newInstance(SModel sm) {
    return Operation.newInstance(sm, false);
  }
}
