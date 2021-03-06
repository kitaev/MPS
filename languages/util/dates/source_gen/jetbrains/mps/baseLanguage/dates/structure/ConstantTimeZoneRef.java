package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeZone;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstantTimeZoneRef extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.ConstantTimeZoneRef";
  public static final String ZONE = "zone";

  public ConstantTimeZoneRef(SNode node) {
    super(node);
  }

  public DateTimeZone getZone() {
    return (DateTimeZone) this.getReferent(DateTimeZone.class, ConstantTimeZoneRef.ZONE);
  }

  public void setZone(DateTimeZone node) {
    super.setReferent(ConstantTimeZoneRef.ZONE, node);
  }

  public static ConstantTimeZoneRef newInstance(SModel sm, boolean init) {
    return (ConstantTimeZoneRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ConstantTimeZoneRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstantTimeZoneRef newInstance(SModel sm) {
    return ConstantTimeZoneRef.newInstance(sm, false);
  }
}
