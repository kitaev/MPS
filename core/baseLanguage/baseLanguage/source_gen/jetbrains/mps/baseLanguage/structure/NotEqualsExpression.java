package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BinaryCompareOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NotEqualsExpression extends BinaryCompareOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.NotEqualsExpression";

  public NotEqualsExpression(SNode node) {
    super(node);
  }

  public static NotEqualsExpression newInstance(SModel sm, boolean init) {
    return (NotEqualsExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NotEqualsExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NotEqualsExpression newInstance(SModel sm) {
    return NotEqualsExpression.newInstance(sm, false);
  }

}
