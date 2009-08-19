package jetbrains.mps.baseLanguage.dates.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.baseLanguage.dates.structure.FormatExpression", new FormatExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusOperation", new DateTimeMinusOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusPeriodOperation", new DateTimeMinusPeriodOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimePlusPeriodOperation", new DateTimePlusPeriodOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimeCompareOperation", new DateTimeCompareOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.PeriodConstant", new PeriodConstant_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithPropertyOperation", new DateTimeWithPropertyOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.UnaryDateTimeOperation", new UnaryDateTimeOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.PeriodInPropertyOperation", new PeriodInPropertyOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.ConditionalFormatToken", new ConditionalFormatToken_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.ConstantTimeZoneRef", new ConstantTimeZoneRef_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateFormat", new DateFormat_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateFormatsTable", new DateFormatsTable_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimeOffsetFormatToken", new DateTimeOffsetFormatToken_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.InlineFormatExpression", new InlineFormatExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.LiteralFormatToken", new LiteralFormatToken_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.ReferenceFormatToken", new ReferenceFormatToken_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.TokenConditionalPair", new TokenConditionalPair_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.TimeZoneFromString", new TimeZoneFromString_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation", new MathDateTimeOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.DateTimePropetyReferenceOperation", new DateTimePropetyReferenceOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.RoundDateTimeOperation", new RoundDateTimeOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression", new WithPropertyCompareExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.dates.structure.ParseExpression", new ParseExpression_DataFlow());
  }
}
