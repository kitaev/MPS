package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ConstrainedDataTypeDeclaration extends DataTypeDeclaration {
  public static String CONSTRAINT = "constraint";

  public  ConstrainedDataTypeDeclaration(SNode node) {
    super(node);
  }

  public static ConstrainedDataTypeDeclaration newInstance(SModel sm) {
    return (ConstrainedDataTypeDeclaration)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.ConstrainedDataTypeDeclaration", sm, GlobalScope.getInstance()).getAdaptor();
  }

  public String getConstraint() {
    return this.getProperty(ConstrainedDataTypeDeclaration.CONSTRAINT);
  }
  public void setConstraint(String value) {
    this.setProperty(ConstrainedDataTypeDeclaration.CONSTRAINT, value);
  }
}
