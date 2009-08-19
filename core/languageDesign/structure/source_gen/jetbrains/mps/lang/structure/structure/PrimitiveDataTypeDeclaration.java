package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PrimitiveDataTypeDeclaration extends DataTypeDeclaration {
  public static final String concept = "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration";

  public PrimitiveDataTypeDeclaration(SNode node) {
    super(node);
  }

  public static PrimitiveDataTypeDeclaration newInstance(SModel sm, boolean init) {
    return (PrimitiveDataTypeDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PrimitiveDataTypeDeclaration newInstance(SModel sm) {
    return PrimitiveDataTypeDeclaration.newInstance(sm, false);
  }
}
