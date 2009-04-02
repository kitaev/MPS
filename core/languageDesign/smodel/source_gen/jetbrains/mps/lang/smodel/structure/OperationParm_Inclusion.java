package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.AbstractOperationParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OperationParm_Inclusion extends AbstractOperationParameter {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion";

  public OperationParm_Inclusion(SNode node) {
    super(node);
  }

  public static OperationParm_Inclusion newInstance(SModel sm, boolean init) {
    return (OperationParm_Inclusion)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OperationParm_Inclusion newInstance(SModel sm) {
    return OperationParm_Inclusion.newInstance(sm, false);
  }

}
