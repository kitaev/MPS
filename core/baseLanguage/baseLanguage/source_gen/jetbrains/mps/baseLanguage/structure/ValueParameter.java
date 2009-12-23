package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ValueParameter extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ValueParameter";

  public ValueParameter(SNode node) {
    super(node);
  }

  public static ValueParameter newInstance(SModel sm, boolean init) {
    return (ValueParameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ValueParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ValueParameter newInstance(SModel sm) {
    return ValueParameter.newInstance(sm, false);
  }
}
