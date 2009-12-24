package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StringMPSParameterType extends MPSParameterType {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.StringMPSParameterType";

  public StringMPSParameterType(SNode node) {
    super(node);
  }

  public static StringMPSParameterType newInstance(SModel sm, boolean init) {
    return (StringMPSParameterType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.StringMPSParameterType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StringMPSParameterType newInstance(SModel sm) {
    return StringMPSParameterType.newInstance(sm, false);
  }
}
