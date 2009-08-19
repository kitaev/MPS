package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.PrimitiveType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PeriodType extends PrimitiveType {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.PeriodType";

  public PeriodType(SNode node) {
    super(node);
  }

  public static PeriodType newInstance(SModel sm, boolean init) {
    return (PeriodType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PeriodType newInstance(SModel sm) {
    return PeriodType.newInstance(sm, false);
  }
}
