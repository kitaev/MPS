package jetbrains.mps.baseLanguage.dates.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.SubtypingManager;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class DateTypeUtil {
  private static SNode dateTimeType = new DateTypeUtil.QuotationClass_hzl4bp_a0a().createNode();
  private static SNode dateTimeZoneType = new DateTypeUtil.QuotationClass_hzl4bp_a0b().createNode();
  private static SNode dateTimeWithTZType = new DateTypeUtil.QuotationClass_hzl4bp_a0c().createNode();
  private static SNode periodType = new DateTypeUtil.QuotationClass_hzl4bp_a0d().createNode();
  private static SNode durationType = new DateTypeUtil.QuotationClass_hzl4bp_a0e().createNode();
  private static SNode intType = new DateTypeUtil.QuotationClass_hzl4bp_a0f().createNode();
  private static SNode javaDateType = new DateTypeUtil.QuotationClass_hzl4bp_a0g().createNode();
  private static SNode javaCalendarType = new DateTypeUtil.QuotationClass_hzl4bp_a0h().createNode();
  private static SNode jodaAbstractInstant = new DateTypeUtil.QuotationClass_hzl4bp_a0i().createNode();
  private static Logger LOG = Logger.getLogger(DateTypeUtil.class);

  public static boolean isInstanceOfPeriod(SNode node) {
    return isInstanceOf(node, periodType);
  }

  public static boolean isInstanceOfPeriodCompare(SNode compareOperation) {
    return bothOperandsAreNotNull(compareOperation) && isInstanceOfPeriod(SLinkOperations.getTarget(compareOperation, "leftExpression", true));
  }

  public static boolean isInstanceOfDurationCompare(SNode compareOperation) {
    return bothOperandsAreNotNull(compareOperation) && isInstanceOfDuration(SLinkOperations.getTarget(compareOperation, "leftExpression", true));
  }

  public static boolean isInstanceOfDuration(SNode node) {
    return isInstanceOf(node, durationType);
  }

  public static boolean isInstanceOfDatetime(SNode node) {
    return isInstanceOf(node, dateTimeType);
  }

  public static boolean isInstanceOfTimezone(SNode node) {
    return isInstanceOf(node, dateTimeZoneType);
  }

  public static boolean isInstanceOfDatetimeWithTZ(SNode node) {
    return isInstanceOf(node, dateTimeWithTZType);
  }

  public static boolean isInstanceOfInt(SNode node) {
    return isInstanceOf(node, intType);
  }

  public static boolean isInstanceOfJavaDatePresentation(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.NullLiteral")) {
      return false;
    }
    TypeChecker tc = TypeChecker.getInstance();
    SubtypingManager sm = tc.getSubtypingManager();
    SNode actualType = tc.getTypeOf(node);
    return sm.isSubtype(actualType, javaDateType) || sm.isSubtype(actualType, javaCalendarType) || sm.isSubtype(actualType, jodaAbstractInstant);
  }

  public static boolean bothOperandsAreNotNull(SNode operation) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(operation, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.NullLiteral") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(operation, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.NullLiteral"));
  }

  public static boolean isInstanceOf(SNode node, SNode type) {
    if (node == null || type == null) {
      LOG.error("Null parameter to isInstanceOf()");
      return false;
    }
    try {
      return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(node), type, false);
    } catch (Throwable thr) {
      LOG.error("Error executing isStrongSubtype(): ", thr);
    }
    return false;
  }

  public static List<SNode> findDateTimeProperties(IScope scope, SModel model) {
    return SModelOperations.getNodesIncludingImported(model, scope, "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty");
  }

  public static SNode getContainingPeriod(SNode expr) {
    SNode current = expr;
    while ((current != null) && TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(current), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.dates.structure.PeriodType"), false) == null) {
      current = (SNodeOperations.isInstanceOf(SNodeOperations.getParent(current), "jetbrains.mps.baseLanguage.structure.Expression") ?
        SNodeOperations.cast(SNodeOperations.getParent(current), "jetbrains.mps.baseLanguage.structure.Expression") :
        null
      );
    }
    return current;
  }

  public static SNode getCompareExpression(SNode expr) {
    SNode current = expr;
    while ((current != null)) {
      if (SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.BinaryCompareOperation") || SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.EqualsExpression") || SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")) {
        if (isInstanceOfDatetimeWithTZ(SLinkOperations.getTarget(SNodeOperations.cast(current, "jetbrains.mps.baseLanguage.structure.BinaryOperation"), "leftExpression", true))) {
          return SNodeOperations.cast(current, "jetbrains.mps.baseLanguage.structure.BinaryOperation");
        }
        return null;
      } else {
        current = (SNodeOperations.isInstanceOf(SNodeOperations.getParent(current), "jetbrains.mps.baseLanguage.structure.Expression") ?
          SNodeOperations.cast(SNodeOperations.getParent(current), "jetbrains.mps.baseLanguage.structure.Expression") :
          null
        );
      }
    }
    return null;
  }

  public static class QuotationClass_hzl4bp_a0a {
    public QuotationClass_hzl4bp_a0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0b {
    public QuotationClass_hzl4bp_a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeZoneType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0c {
    public QuotationClass_hzl4bp_a0c() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0d {
    public QuotationClass_hzl4bp_a0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0e {
    public QuotationClass_hzl4bp_a0e() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DurationType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0f {
    public QuotationClass_hzl4bp_a0f() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0g {
    public QuotationClass_hzl4bp_a0g() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Date")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0h {
    public QuotationClass_hzl4bp_a0h() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Calendar")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_hzl4bp_a0i {
    public QuotationClass_hzl4bp_a0i() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#org.joda.time.base(org.joda.time.base@java_stub)"), SNodeId.fromString("~AbstractInstant")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
