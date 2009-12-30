package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DecimalDivExpression extends DecimalBinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.DecimalDivExpression";

  public DecimalDivExpression(SNode node) {
    super(node);
  }

  public static DecimalDivExpression newInstance(SModel sm, boolean init) {
    return (DecimalDivExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.DecimalDivExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DecimalDivExpression newInstance(SModel sm) {
    return DecimalDivExpression.newInstance(sm, false);
  }
}
