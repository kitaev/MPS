package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NowExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.NowExpression";

  public NowExpression(SNode node) {
    super(node);
  }

  public static NowExpression newInstance(SModel sm, boolean init) {
    return (NowExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.NowExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NowExpression newInstance(SModel sm) {
    return NowExpression.newInstance(sm, false);
  }
}
