package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BinaryOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntervalContainsExpression extends BinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.IntervalContainsExpression";

  public IntervalContainsExpression(SNode node) {
    super(node);
  }

  public static IntervalContainsExpression newInstance(SModel sm, boolean init) {
    return (IntervalContainsExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.IntervalContainsExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IntervalContainsExpression newInstance(SModel sm) {
    return IntervalContainsExpression.newInstance(sm, false);
  }
}
