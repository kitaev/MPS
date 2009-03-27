package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UnrestrictedClosureLiteral extends jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral {
  public static final String concept = "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral";

  public UnrestrictedClosureLiteral(SNode node) {
    super(node);
  }

  public static UnrestrictedClosureLiteral newInstance(SModel sm, boolean init) {
    return (UnrestrictedClosureLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UnrestrictedClosureLiteral newInstance(SModel sm) {
    return UnrestrictedClosureLiteral.newInstance(sm, false);
  }

}
