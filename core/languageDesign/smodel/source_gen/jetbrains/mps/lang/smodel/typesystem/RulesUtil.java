package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.CheckingMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import java.util.Map;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import java.util.Iterator;

public class RulesUtil {

  @CheckingMethod()
  public static void checkAppliedCorrectly_generic(final TypeCheckingContext typeCheckingContext, final SNode op) {
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(op), "jetbrains.mps.lang.smodel.structure.SNodeOperation")) {
      // don't check - it is red anyway
      return;
    }
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    SNode LeftType = TypeChecker.getInstance().getTypeOf(leftExpression);
    boolean isGood = false;
    if (SConceptPropertyOperations.getBoolean(op, "applicableToModel")) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_44().createNode(typeCheckingContext), false)) {
        isGood = true;
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToConcept")) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_45().createNode(typeCheckingContext), false)) {
        isGood = true;
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToNode")) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_46().createNode(typeCheckingContext), false)) {
        isGood = true;
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToEnum")) {
      if (TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, new _Patterns.Pattern_0(), false, typeCheckingContext) != null) {
        isGood = true;
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToEnumMember")) {
      if (TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, new _Patterns.Pattern_1(), false, typeCheckingContext) != null) {
        isGood = true;
      }
    }
    // ===========
    if (SConceptPropertyOperations.getBoolean(op, "applicableToLink")) {
      SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
      if (linkAccessT != null) {
        isGood = SPropertyOperations.getBoolean(linkAccessT, "singularCradinality");
        if (isGood) {
          // some of ops applicable to 'link' require left-expr to be a concept
          if (SConceptPropertyOperations.getBoolean(op, "applicableToConcept") && !(SConceptPropertyOperations.getBoolean(op, "applicableToNode"))) {
            isGood = TypeChecker.getInstance().getSubtypingManager().isSubtype(LeftType, new _Quotations.QuotationClass_47().createNode(typeCheckingContext));
          }
        }
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToLinkList")) {
      SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
      if (linkAccessT != null) {
        isGood = !(SPropertyOperations.getBoolean(linkAccessT, "singularCradinality"));
      }
    }
    // ===========
    SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1213877508946(op);
    if (SConceptPropertyOperations.getBoolean(op, "applicableToSimpleProperty")) {
      if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.lang.smodel.structure.SPropertyAccess")) {
        SNode propertyDecl = SLinkOperations.getTarget(SNodeOperations.cast(leftOperation, "jetbrains.mps.lang.smodel.structure.SPropertyAccess"), "property", false);
        if (DataTypeDeclaration_Behavior.call_isSimple_1220268671473(SLinkOperations.getTarget(propertyDecl, "dataType", false))) {
          isGood = true;
        }
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToEnumProperty")) {
      if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.lang.smodel.structure.SPropertyAccess")) {
        SNode propertyDecl = SLinkOperations.getTarget(SNodeOperations.cast(leftOperation, "jetbrains.mps.lang.smodel.structure.SPropertyAccess"), "property", false);
        if (DataTypeDeclaration_Behavior.call_isEnum_1220268692373(SLinkOperations.getTarget(propertyDecl, "dataType", false))) {
          isGood = true;
        }
      }
    }
    if (SConceptPropertyOperations.getBoolean(op, "applicableToConceptProperty")) {
      if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess")) {
        isGood = true;
      }
    }
    if (!(isGood)) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(op, "operation is not applicable to " + LeftType, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186067417054", intentionProvider, errorTarget);
    }
  }

  @CheckingMethod()
  public static void checkAppliedTo_LinkAccess_aggregation(final TypeCheckingContext typeCheckingContext, final SNode op) {
    // expect access to an aggregation link with singular cardinality
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    SNode LeftType = TypeChecker.getInstance().getTypeOf(leftExpression);
    boolean isGood = false;
    SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(LeftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
    if (linkAccessT != null) {
      if (SPropertyOperations.getBoolean(linkAccessT, "aggregation")) {
        isGood = true;
      }
    }
    // ----
    if (!(isGood)) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(op, "operation is only applicable to aggregation-link-access", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1205272067893", intentionProvider, errorTarget);
    }
  }

  @CheckingMethod()
  public static void checkAppliedNotTo_LinkAccess_reference(final TypeCheckingContext typeCheckingContext, SNode op) {
    // expect access to an aggregation link with singular cardinality
    // left expression could also be something else (like just 'node') but not access to a reference link
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
    boolean isGood = true;
    SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce_(leftType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure._LinkAccessT"), false, typeCheckingContext);
    if (linkAccessT != null) {
      if (!(SPropertyOperations.getBoolean(linkAccessT, "aggregation"))) {
        isGood = false;
      }
    }
    // ----
    if (!(isGood)) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(op, "operation is not applicable to reference-link-access", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1230333667606", intentionProvider, errorTarget);
    }
  }

  @CheckingMethod()
  public static boolean checkAssignableConcept(final TypeCheckingContext typeCheckingContext, SNode fromConcept, SNode toConcept, SNode nodeToReportError, String errorTextPrefix) {
    if (SConceptOperations.isSubConceptOf(fromConcept, NameUtil.nodeFQName(toConcept))) {
      return true;
    }
    {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(nodeToReportError, "" + errorTextPrefix + "\nexpected: " + SPropertyOperations.getString(toConcept, "name") + "\nwas: " + SPropertyOperations.getString(fromConcept, "name"), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179506569646", intentionProvider, errorTarget);
    }
    return false;
  }

  @CheckingMethod()
  public static boolean checkOpParameters_generic(final TypeCheckingContext typeCheckingContext, SNode op) {
    boolean noProblem = true;
    List<SNode> applicableParmConcepts = SLinkOperations.getConceptLinkTargets(op, "applicableParameter");
    for(SNode parm : ListSequence.fromList(SLinkOperations.getTargets(op, "parameter", true))) {
      if (!(ListSequence.fromList(applicableParmConcepts).contains(SNodeOperations.getConceptDeclaration(parm)))) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(parm, "not applicable here", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1178302007667", intentionProvider, errorTarget);
        }
        noProblem = false;
      }
    }
    return noProblem;
  }

  @InferenceMethod()
  public static void equate_inputNodeConcept(final TypeCheckingContext typeCheckingContext, SNode op, SNode TypeToEquate) {
    RulesUtil.equate_inputNodeConcept_internal(typeCheckingContext, op, TypeToEquate);
  }

  @InferenceMethod()
  private static void equate_inputNodeConcept_internal(final TypeCheckingContext typeCheckingContext, final SNode op, final SNode TypeToEquate) {
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(leftExpression, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1227545671650", false), (SNode)new _Quotations.QuotationClass_48().createNode(TypeToEquate, TypeToEquate, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1227545687775", false, 0, intentionProvider);
    }
  }

  public static SNode get_inputNodeConcept(final SNode op, final boolean conceptOfConceptIfInputConcept) {
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1213877508894(op);
    SNode leftType = TypeChecker.getInstance().getTypeOf(leftExpression);
    SNode conceptDeclaration = null;
    if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure._LinkAccessT")) {
      conceptDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(leftType, "jetbrains.mps.lang.smodel.structure._LinkAccessT"), "targetConcept", false);
    } else
    if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      conceptDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(leftType, "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false);
    } else
    if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure.SConceptType")) {
      if (conceptOfConceptIfInputConcept) {
        conceptDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(leftType, "jetbrains.mps.lang.smodel.structure.SConceptType"), "conceptDeclaraton", false);
      } else
      {
        conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
      }
    }
    if (SNodeOperations.isInstanceOf(conceptDeclaration, "jetbrains.mps.lang.typesystem.structure.RuntimeTypeVariable")) {
      conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (conceptDeclaration == null) {
      conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    return conceptDeclaration;
  }

  @InferenceMethod()
  public static void equate_inputNodeType(final TypeCheckingContext typeCheckingContext, SNode op, SNode TypeToEquate) {
    final SNode Concept_typevar_1206099042246 = typeCheckingContext.createNewRuntimeTypesVariable();
    equate_inputNodeConcept(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099042246));
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)new _Quotations.QuotationClass_49().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1206099042246), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206099071408", intentionProvider);
    }
  }

  @InferenceMethod()
  public static void equate_conceptFromOpParm(final TypeCheckingContext typeCheckingContext, final SNode op, final SNode TypeToEquate) {
    SNode opParm = SNodeOperations.cast(SNodeOperation_Behavior.call_getParameter_1213877508972(op, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_Concept")), "jetbrains.mps.lang.smodel.structure.OperationParm_Concept");
    SNode opParmList = SNodeOperations.cast(SNodeOperation_Behavior.call_getParameter_1213877508972(op, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList")), "jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList");
    if (opParm == null) {
      if (opParmList == null) {
        {
          SNode _nodeToCheck_1029348928467 = null;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1207352395113", intentionProvider);
        }
      } else
      {
        List<SNode> concepts = ListOperations.<SNode>createList();
        for(SNode conceptReference : SLinkOperations.getTargets(opParmList, "concept", true)) {
          ListSequence.fromList(concepts).addElement(SLinkOperations.getTarget(conceptReference, "concept", false));
        }
        {
          SNode _nodeToCheck_1029348928467 = null;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)leastCommonSuperconcept(concepts), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1222429361005", intentionProvider);
        }
      }
    } else
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference")) {
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference"), "conceptDeclaration", false), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1219348168406", intentionProvider);
      }
    } else
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.PoundExpression")) {
      final SNode Concept_typevar_1226669497837 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(opParm, "conceptArgument", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1226669149487", false), (SNode)new _Quotations.QuotationClass_50().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1226669497837), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1226669167291", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1226669497837), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1226669541468", intentionProvider);
      }
    }
  }

  public static SNode leastCommonSuperconcept(List<SNode> concepts) {
    Map<SNode, Set<SNode>> subTypesToSuperTypes = MapSequence.fromMap(new HashMap<SNode, Set<SNode>>());
    Set<SNode> keyset = SetSequence.fromSet(new HashSet<SNode>());
    Set<SNode> allTypes = SetSequence.fromSet(new HashSet<SNode>());
    Set<SNode> frontier = SetSequence.fromSetWithValues(new HashSet<SNode>(), concepts);
    Set<SNode> newFrontier = SetSequence.fromSet(new HashSet<SNode>());
    while (!(SetSequence.fromSet(frontier).isEmpty())) {
      for(SNode concept : frontier) {
        if (SetSequence.fromSet(keyset).contains(concept)) {
          continue;
        }
        List<SNode> supertypes = AbstractConceptDeclaration_Behavior.call_getImmediateSuperconcepts_1222430305282(concept);
        Set<SNode> set = MapSequence.fromMap(subTypesToSuperTypes).get(concept);
        if (set == null) {
          set = SetSequence.fromSet(new HashSet<SNode>());
          MapSequence.fromMap(subTypesToSuperTypes).put(concept, set);
        }
        SetSequence.fromSet(set).addSequence(ListSequence.fromList(supertypes));
        SetSequence.fromSet(keyset).addElement(concept);
        SetSequence.fromSet(newFrontier).addSequence(ListSequence.fromList(supertypes));
        SetSequence.fromSet(allTypes).addSequence(ListSequence.fromList(supertypes));
        ListSequence.fromList(supertypes).addElement(concept);
      }
      frontier = newFrontier;
      newFrontier = SetSequence.fromSet(new HashSet<SNode>());
    }
    // transitive closure
    for(SNode node2 : allTypes) {
      for(SNode node1 : allTypes) {
        for(SNode node3 : allTypes) {
          Set<SNode> supertypes1 = MapSequence.fromMap(subTypesToSuperTypes).get(node1);
          if (supertypes1 == null) {
            continue;
          }
          Set<SNode> supertypes2 = MapSequence.fromMap(subTypesToSuperTypes).get(node2);
          if (supertypes2 == null) {
            continue;
          }
          if (SetSequence.fromSet(supertypes1).contains(node2) && SetSequence.fromSet(supertypes2).contains(node3)) {
            SetSequence.fromSet(supertypes1).addElement(node3);
          }
        }
      }
    }
    Set<SNode> result = SetSequence.fromSetWithValues(new HashSet<SNode>(), concepts);
    while (SetSequence.fromSet(result).count() >= 2) {
      Iterator<SNode> iterator = SetSequence.fromSet(result).iterator();
      SNode a = iterator.next();
      SNode b = iterator.next();
      SetSequence.fromSet(result).removeElement(a);
      SetSequence.fromSet(result).removeElement(b);
      SetSequence.fromSet(result).addElement(leastCommonSuperconcept(a, b, subTypesToSuperTypes));
    }
    if (SetSequence.fromSet(result).isEmpty()) {
      return SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    return SetSequence.fromSet(result).first();
  }

  private static SNode leastCommonSuperconcept(SNode a, SNode b, Map<SNode, Set<SNode>> subTypesToSuperTypes) {
    if (a == b) {
      return a;
    }
    Set<SNode> superTypesA = MapSequence.fromMap(subTypesToSuperTypes).get(a);
    superTypesA = (superTypesA == null ?
      SetSequence.fromSet(new HashSet<SNode>()) :
      superTypesA
    );
    Set<SNode> superTypesB = MapSequence.fromMap(subTypesToSuperTypes).get(b);
    superTypesB = (superTypesB == null ?
      SetSequence.fromSet(new HashSet<SNode>()) :
      superTypesB
    );
    SetSequence.fromSet(superTypesA).addElement(a);
    SetSequence.fromSet(superTypesB).addElement(b);
    for(SNode superTypeA : SetSequence.fromSetWithValues(new HashSet<SNode>(), superTypesA)) {
      boolean matches = false;
      for(SNode superTypeB : superTypesB) {
        if (superTypeA == superTypeB) {
          matches = true;
          break;
        }
      }
      if (!(matches)) {
        SetSequence.fromSet(superTypesA).removeElement(superTypeA);
      }
    }
    Set<SNode> commonSupertypes = superTypesA;
    for(SNode commonSupertype : SetSequence.fromSetWithValues(new HashSet<SNode>(), commonSupertypes)) {
      if (!(SetSequence.fromSet(commonSupertypes).contains(commonSupertype))) {
        continue;
      }
      Set<SNode> superTypes = MapSequence.fromMap(subTypesToSuperTypes).get(commonSupertype);
      if (superTypes != null) {
        for(SNode superType : superTypes) {
          if (superType != commonSupertype) {
            SetSequence.fromSet(commonSupertypes).removeElement(superType);
          }
        }
      }
    }
    if (SetSequence.fromSet(commonSupertypes).count() != 1) {
      return SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    return SetSequence.fromSet(commonSupertypes).first();
  }

}
