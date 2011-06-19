package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.baseLanguage.dates.structure.ConvertToDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.ConvertToDurationOperation", "jetbrains.mps.baseLanguage.dates.structure.DateFormat", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FixedLocaleFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatDateTimeExpression", "jetbrains.mps.baseLanguage.dates.structure.FormatExpression", "jetbrains.mps.baseLanguage.dates.structure.FormatPeriodExpression", "jetbrains.mps.baseLanguage.dates.structure.PeriodFormat", "jetbrains.mps.baseLanguage.dates.structure.PeriodPropertyFormatToken", "jetbrains.mps.baseLanguage.dates.structure.PeriodReferenceFormatToken", "jetbrains.mps.baseLanguage.dates.structure.ReferenceFormatToken", "jetbrains.mps.baseLanguage.dates.structure.TimeZoneIDExpression", "jetbrains.mps.baseLanguage.dates.structure.TimeZoneIdOperation", "jetbrains.mps.baseLanguage.dates.structure.TimeZoneNameOperation", "jetbrains.mps.baseLanguage.dates.structure.TokenConditionalPair", "jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 16:
        return new TokenConditionalPair_Constraints();
      case 7:
        return new FormatExpression_Constraints();
      case 2:
        return new DateFormat_Constraints();
      case 4:
        return new DateTimePropertyFormatToken_Constraints();
      case 5:
        return new FixedLocaleFormatToken_Constraints();
      case 12:
        return new ReferenceFormatToken_Constraints();
      case 3:
        return new DateTimeOperation_Constraints();
      case 0:
        return new ConvertToDateTimeOperation_Constraints();
      case 17:
        return new WithPropertyCompareExpression_Constraints();
      case 13:
        return new TimeZoneIDExpression_Constraints();
      case 6:
        return new FormatDateTimeExpression_Constraints();
      case 1:
        return new ConvertToDurationOperation_Constraints();
      case 8:
        return new FormatPeriodExpression_Constraints();
      case 9:
        return new PeriodFormat_Constraints();
      case 11:
        return new PeriodReferenceFormatToken_Constraints();
      case 10:
        return new PeriodPropertyFormatToken_Constraints();
      case 14:
        return new TimeZoneIdOperation_Constraints();
      case 15:
        return new TimeZoneNameOperation_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
