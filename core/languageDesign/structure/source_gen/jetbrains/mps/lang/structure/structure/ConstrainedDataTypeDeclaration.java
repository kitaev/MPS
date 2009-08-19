package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstrainedDataTypeDeclaration extends DataTypeDeclaration {
  public static final String concept = "jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration";
  public static final String CONSTRAINT = "constraint";

  public ConstrainedDataTypeDeclaration(SNode node) {
    super(node);
  }

  public String getConstraint() {
    return this.getProperty(ConstrainedDataTypeDeclaration.CONSTRAINT);
  }

  public void setConstraint(String value) {
    this.setProperty(ConstrainedDataTypeDeclaration.CONSTRAINT, value);
  }

  public static ConstrainedDataTypeDeclaration newInstance(SModel sm, boolean init) {
    return (ConstrainedDataTypeDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstrainedDataTypeDeclaration newInstance(SModel sm) {
    return ConstrainedDataTypeDeclaration.newInstance(sm, false);
  }
}
