package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DecimalMinusExpression extends DecimalBinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.DecimalMinusExpression";

  public DecimalMinusExpression(SNode node) {
    super(node);
  }

  public static DecimalMinusExpression newInstance(SModel sm, boolean init) {
    return (DecimalMinusExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.DecimalMinusExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DecimalMinusExpression newInstance(SModel sm) {
    return DecimalMinusExpression.newInstance(sm, false);
  }
}
