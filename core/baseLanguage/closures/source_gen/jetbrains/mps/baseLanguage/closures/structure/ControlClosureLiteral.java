package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ControlClosureLiteral extends jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral {
  public static final String concept = "jetbrains.mps.baseLanguage.closures.structure.ControlClosureLiteral";

  public ControlClosureLiteral(SNode node) {
    super(node);
  }

  public static ControlClosureLiteral newInstance(SModel sm, boolean init) {
    return (ControlClosureLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ControlClosureLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ControlClosureLiteral newInstance(SModel sm) {
    return ControlClosureLiteral.newInstance(sm, false);
  }

}
