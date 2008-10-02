package jetbrains.mps.samples.matrixLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BinaryOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatrixSubExpression extends BinaryOperation {
  public static final String concept = "jetbrains.mps.samples.matrixLanguage.structure.MatrixSubExpression";

  public MatrixSubExpression(SNode node) {
    super(node);
  }

  public static MatrixSubExpression newInstance(SModel sm, boolean init) {
    return (MatrixSubExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixSubExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatrixSubExpression newInstance(SModel sm) {
    return MatrixSubExpression.newInstance(sm, false);
  }

}
