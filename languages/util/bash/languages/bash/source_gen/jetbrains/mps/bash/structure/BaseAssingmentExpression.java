package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseAssingmentExpression extends ArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.BaseAssingmentExpression";
  public static final String CPR_Sign = "sign";
  public static final String L_VALUE = "lValue";
  public static final String R_VALUE = "rValue";

  public BaseAssingmentExpression(SNode node) {
    super(node);
  }

  public LValue getLValue() {
    return (LValue) this.getChild(LValue.class, BaseAssingmentExpression.L_VALUE);
  }

  public void setLValue(LValue node) {
    super.setChild(BaseAssingmentExpression.L_VALUE, node);
  }

  public ArithmeticExpression getRValue() {
    return (ArithmeticExpression) this.getChild(ArithmeticExpression.class, BaseAssingmentExpression.R_VALUE);
  }

  public void setRValue(ArithmeticExpression node) {
    super.setChild(BaseAssingmentExpression.R_VALUE, node);
  }

  public static BaseAssingmentExpression newInstance(SModel sm, boolean init) {
    return (BaseAssingmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BaseAssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseAssingmentExpression newInstance(SModel sm) {
    return BaseAssingmentExpression.newInstance(sm, false);
  }
}
