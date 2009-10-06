package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InequalityNumber extends BinaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.InequalityNumber";

  public InequalityNumber(SNode node) {
    super(node);
  }

  public static InequalityNumber newInstance(SModel sm, boolean init) {
    return (InequalityNumber)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.InequalityNumber", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InequalityNumber newInstance(SModel sm) {
    return InequalityNumber.newInstance(sm, false);
  }
}
