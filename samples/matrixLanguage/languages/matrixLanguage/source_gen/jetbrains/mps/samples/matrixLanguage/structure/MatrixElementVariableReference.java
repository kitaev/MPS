package jetbrains.mps.samples.matrixLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatrixElementVariableReference extends VariableReference {
  public static final String concept = "jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference";

  public MatrixElementVariableReference(SNode node) {
    super(node);
  }

  public MatrixElementVariableDeclaration getMatrixElementDeclaration() {
    return this.ensureAdapter(MatrixElementVariableDeclaration.class, "variableDeclaration", this.getVariableDeclaration());
  }

  public void setMatrixElementDeclaration(MatrixElementVariableDeclaration node) {
    this.setVariableDeclaration(node);
  }

  public static MatrixElementVariableReference newInstance(SModel sm, boolean init) {
    return (MatrixElementVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatrixElementVariableReference newInstance(SModel sm) {
    return MatrixElementVariableReference.newInstance(sm, false);
  }
}
