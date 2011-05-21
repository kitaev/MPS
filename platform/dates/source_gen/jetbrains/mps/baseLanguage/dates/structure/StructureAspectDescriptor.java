package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.ConceptRegistry;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    int hash = conceptFqName.hashCode();
    if (hash == -1493783853) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateFormatsTable", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == -2059388488) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateFormat", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.datesInternal.structure.IDateFormat");
    }
    if (hash == -346684026) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.LiteralFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatToken");
    }
    if (hash == 1514136111) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.FormatToken", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -1057940446) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.FormatExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.TypeDerivable");
    }
    if (hash == 609442255) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConditionalFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatToken", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == -775725910) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ReferenceFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatToken");
    }
    if (hash == 1870732282) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TokenConditionalPair", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -806818629) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.NowExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -1474827755) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TokenCondition", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 1070965719) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TokenCondition_datetimeToFormat", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == -1643840216) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == -1445258608) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.UnaryDateTimeOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 173957872) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeCompareOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -454652911) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.RoundDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.UnaryDateTimeOperation");
    }
    if (hash == -1867471533) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.FloorDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.RoundDateTimeOperation");
    }
    if (hash == 722484226) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.CeilingDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.RoundDateTimeOperation");
    }
    if (hash == 2092152510) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithPropertyOperation", "jetbrains.mps.baseLanguage.dates.structure.UnaryDateTimeOperation");
    }
    if (hash == -1830285042) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodType", "jetbrains.mps.baseLanguage.structure.PrimitiveType");
    }
    if (hash == -706978952) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodConstant", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 2039229543) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.FixedLocaleFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatToken");
    }
    if (hash == -1025003649) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatToken");
    }
    if (hash == -460587365) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.InlineFormatExpression", "jetbrains.mps.baseLanguage.dates.structure.UnaryDateTimeOperation");
    }
    if (hash == -1715662207) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeOffsetFormatToken", "jetbrains.mps.baseLanguage.dates.structure.FormatToken");
    }
    if (hash == 198561194) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DurationTypeReference", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -224762043) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1981860241) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.AbsDateTimeMinusOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusOperation");
    }
    if (hash == 724913541) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ScheduleLiteral", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -1653365762) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimePlusPeriodOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -1668178940) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusPeriodOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 830686353) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConvertToDateTimeOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == -865473479) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == 2144627136) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.NotNullOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation");
    }
    if (hash == 1979342413) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.NullOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation");
    }
    if (hash == -405474356) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConvertToJavaCalendarOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation");
    }
    if (hash == 776042204) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConvertToJavaDateOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation");
    }
    if (hash == -1134546513) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConvertToJodaDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation");
    }
    if (hash == -789035787) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimePropetyReferenceOperation", "jetbrains.mps.baseLanguage.dates.structure.DateTimeOperation");
    }
    if (hash == -859674191) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.NeverExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1685010321) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -1517315955) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.MinDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation");
    }
    if (hash == -437297221) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.MaxDateTimeOperation", "jetbrains.mps.baseLanguage.dates.structure.MathDateTimeOperation");
    }
    if (hash == 1182349300) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeZoneType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == 1288296720) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeZoneConstant", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -309230165) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DefaultTimeZoneConstant", "jetbrains.mps.baseLanguage.dates.structure.TimeZoneConstant");
    }
    if (hash == 900106638) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.UTCTimeZoneConstant", "jetbrains.mps.baseLanguage.dates.structure.TimeZoneConstant");
    }
    if (hash == -2072025806) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeZoneCreator", "jetbrains.mps.baseLanguage.structure.AbstractCreator");
    }
    if (hash == 1743824995) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConstantTimeZoneRef", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -828717369) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeZoneFromString", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1933603865) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodInPropertyOperation", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -101867889) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 454030616) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ParseExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 2029722975) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeZoneIDExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -1809432329) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeZoneOffsetExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1120707220) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == 179317289) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.InTimezoneExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.TypeDerivable");
    }
    if (hash == -1963197677) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.TypeDerivable");
    }
    if (hash == -143493091) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.FormatDateTimeExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.TypeDerivable");
    }
    if (hash == 1600377238) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.InlineFormatDateTimeExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 105674401) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.DurationType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == 645516984) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.ConvertToDurationOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == -1987458522) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodInPropertyExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 1815907652) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeConstant", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.TypeDerivable");
    }
    if (hash == 1897144643) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.FormatPeriodExpression", "jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.TypeDerivable");
    }
    if (hash == 1622693067) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodFormat", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.datesInternal.structure.IPeriodFormat");
    }
    if (hash == 144161774) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 489195239) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodLiteralFormatToken", "jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken");
    }
    if (hash == 1036315558) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodFormatsTable", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == -2010541351) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodPropertyFormatToken", "jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken");
    }
    if (hash == -654636597) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodReferenceFormatToken", "jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken");
    }
    if (hash == -1583939087) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.PeriodSeparatorFormatToken", "jetbrains.mps.baseLanguage.dates.structure.PeriodFormatToken");
    }
    if (hash == -900105824) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeZoneIdOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == 1629336880) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.TimeZoneNameOperation", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == 1213578832) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.dates.structure.AllTimeZonesConstant", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    return null;
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private ImmutableSet<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String... parents) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, parents);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static ImmutableSet<String> getAncestors(String conceptFqName, String... parents) {
      List<String> result = new ArrayList();

      result.add(conceptFqName);
      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : parents) {
        result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
      }
      return ImmutableSet.copyOf(result);
    }
  }
}
