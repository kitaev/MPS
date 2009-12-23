package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ParameterDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UnboundClosureParameterDeclaration extends ParameterDeclaration {
  public static final String concept = "jetbrains.mps.baseLanguage.closures.structure.UnboundClosureParameterDeclaration";

  public UnboundClosureParameterDeclaration(SNode node) {
    super(node);
  }

  public static UnboundClosureParameterDeclaration newInstance(SModel sm, boolean init) {
    return (UnboundClosureParameterDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.UnboundClosureParameterDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UnboundClosureParameterDeclaration newInstance(SModel sm) {
    return UnboundClosureParameterDeclaration.newInstance(sm, false);
  }
}
