package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimeZonePropertyFormatConfiguration extends DateTimePropertyConfiguration {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeZonePropertyFormatConfiguration";

  public DateTimeZonePropertyFormatConfiguration(SNode node) {
    super(node);
  }

  public static DateTimeZonePropertyFormatConfiguration newInstance(SModel sm, boolean init) {
    return (DateTimeZonePropertyFormatConfiguration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeZonePropertyFormatConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimeZonePropertyFormatConfiguration newInstance(SModel sm) {
    return DateTimeZonePropertyFormatConfiguration.newInstance(sm, false);
  }
}
