package jetbrains.mps.baseLanguage.ext.collections.lang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.lang.generator.baseLanguage.template.util.QueriesUtil;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1167777954975(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SNodeOperations.isInstanceOf(creator, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit");
  }

  public static boolean baseMappingRule_Condition_1171063798184(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "creator", true), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceCreatorWithSupplier");
  }

  public static boolean baseMappingRule_Condition_1171064114550(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode enclosingClosure = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
    return SNodeOperations.isInstanceOf(enclosingClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ValueSupplierBlock");
  }

  public static boolean baseMappingRule_Condition_1171064421647(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode enclosingClosure = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
    return !(SNodeOperations.isInstanceOf(enclosingClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ValueSupplierBlock"));
  }

  public static boolean baseMappingRule_Condition_1172276803574(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(node, "parameter") > 0;
  }

  public static boolean baseMappingRule_Condition_1197933661521(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "creator", true), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapCreator");
  }

  public static boolean baseMappingRule_Condition_1197935213886(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapElement");
  }

  public static Object propertyMacro_GetPropertyValue_1170958681801(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zValueSupplier");
  }

  public static Object propertyMacro_GetPropertyValue_1170976422667(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170959003472(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zMapper");
  }

  public static Object propertyMacro_GetPropertyValue_1170976734726(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170976644359(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zForEach");
  }

  public static Object propertyMacro_GetPropertyValue_1170977112610(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170977055251(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zPredicate");
  }

  public static Object propertyMacro_GetPropertyValue_1170977320810(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170959486472(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zSelector");
  }

  public static Object propertyMacro_GetPropertyValue_1167778587376(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("_zCursor");
  }

  public static Object propertyMacro_GetPropertyValue_1168288151438(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "variable", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1168509021319(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zComparator");
  }

  public static Object propertyMacro_GetPropertyValue_1168512329638(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode c = node;
    return SPropertyOperations.getString(SLinkOperations.getTarget(c, "defaultInputElement", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170067391915(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode c = node;
    return SPropertyOperations.getString(SLinkOperations.getTarget(c, "defaultInputElement", true), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170067652651(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zComparator");
  }

  public static SNode referenceMacro_GetReferent_1170982686718(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return _QueriesUtil.resolve_ForEachVariableReference(((ForEachVariableReference)SNodeOperations.getAdapter(node)), templateNode, generator);
  }

  public static SNode referenceMacro_GetReferent_1172276865420(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return SLinkOperations.getTarget(node, "classifier", false);
  }

  public static SNode referenceMacro_GetReferent_1184984218976(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode type = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true));
    SNode elementType = SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType"), true), "elementType", true);
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce(elementType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true), "classifier", false);
  }

  public static List sourceNodesQuery_1168281040871(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SLinkOperations.getTargets(creator, "initValue", true);
  }

  public static SNode sourceNodeQuery_1170982975543(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "elementType", true);
  }

  public static SNode sourceNodeQuery_1170985599591(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "elementType", true);
  }

  public static SNode sourceNodeQuery_1170984732283(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170957296016(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1185914105374(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator);
  }

  public static SNode sourceNodeQuery_1185926181285(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator);
  }

  public static SNode sourceNodeQuery_1170985696959(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "value", true);
  }

  public static SNode sourceNodeQuery_1170981813019(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SLinkOperations.getTarget(creator, "supplier", true);
  }

  public static SNode sourceNodeQuery_1185925113418(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    SNode supplier = SLinkOperations.getTarget(creator, "supplier", true);
    return QueriesUtil.create_Closure_returnedType(supplier, generator);
  }

  public static SNode sourceNodeQuery_1170959067752(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1170984709164(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170985187980(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "mapper", true);
  }

  public static SNode sourceNodeQuery_1170976710748(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1170983576308(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170984981400(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "forEachClosure", true);
  }

  public static SNode sourceNodeQuery_1170977120305(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1170984741354(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170985400792(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "whereClosure", true);
  }

  public static SNode sourceNodeQuery_1170959592162(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1170984722931(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170985357311(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "selector", true);
  }

  public static SNode sourceNodeQuery_1168287937464(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "inputSequence", true);
  }

  public static SNode sourceNodeQuery_1168288186650(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }

  public static SNode sourceNodeQuery_1172277265357(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SLinkOperations.getTarget(creator, "elementType", true);
  }

  public static SNode sourceNodeQuery_1170983493873(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170984931561(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1170983343379(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170983373123(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1170984308010(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170985145931(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1170984693960(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170984324347(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170984702547(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170984684780(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170984715204(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1170985228761(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1168512350251(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode firstStatement = SequenceOperations.getFirst(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "body", true), "statement", true));
    return SLinkOperations.getTarget(firstStatement, "expression", true);
  }

  public static SNode sourceNodeQuery_1168511702747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1168511753711(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "comparable", true);
  }

  public static SNode sourceNodeQuery_1171972602270(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "order", true);
  }

  public static SNode sourceNodeQuery_1170979555022(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode firstStatement = SequenceOperations.getFirst(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "body", true), "statement", true));
    return SLinkOperations.getTarget(firstStatement, "expression", true);
  }

  public static SNode sourceNodeQuery_1171152607288(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "operation", true);
  }

  public static SNode sourceNodeQuery_1171392402011(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1171392402022(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1172256338945(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1172256491217(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1172277102949(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }

  public static SNode sourceNodeQuery_1172663560406(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1172663671537(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "elementsToSkip", true);
  }

  public static SNode sourceNodeQuery_1172664516573(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1172664516584(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "elementsToTake", true);
  }

  public static SNode sourceNodeQuery_1172668127591(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1172668158982(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "fromElement", true);
  }

  public static SNode sourceNodeQuery_1172668211097(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "fromElement", true);
  }

  public static SNode sourceNodeQuery_1172668207797(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "toElement", true);
  }

  public static SNode sourceNodeQuery_1173950824211(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1173950824222(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "argument", true);
  }

  public static SNode sourceNodeQuery_1175845773852(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1176501960201(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1176917998267(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1176918010599(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1176922592150(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1176922640725(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1176923871602(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1176923878778(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1178898419393(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1180967393869(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    // 1
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1180967433812(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    // 2
    return SLinkOperations.getTarget(node, "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1184964109836(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1192414012706(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1195127985972(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1197683878141(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "keyType", true);
  }

  public static SNode sourceNodeQuery_1197683894276(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "valueType", true);
  }

  public static SNode sourceNodeQuery_1197688187122(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "creator", true), "keyType", true);
  }

  public static SNode sourceNodeQuery_1197688228544(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "creator", true), "valueType", true);
  }

  public static SNode sourceNodeQuery_1197933786467(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "map", true);
  }

  public static SNode sourceNodeQuery_1197933995488(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "key", true);
  }

  public static SNode sourceNodeQuery_1197935309655(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "lValue", true), "map", true);
  }

  public static SNode sourceNodeQuery_1197935481114(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "lValue", true), "key", true);
  }

  public static SNode sourceNodeQuery_1197935331791(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "rValue", true);
  }

  public static SNode mapSrcMacro_mapper_1170976176384(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170959249892(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_Closure_returnedType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170976265295(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170959169275(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_Closure_returnedType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170976692851(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170976677202(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170977090634(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170977083110(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170959580916(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_Closure_returnedType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170977291681(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170977281282(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170959570489(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_Closure_returnedType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170982071668(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode inputSequence = SLinkOperations.getTarget(node, "inputSequence", true);
    return QueriesUtil.create_sequenceElementType_fromExpression(inputSequence, generator);
  }

  public static SNode mapSrcMacro_mapper_1170982198863(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode inputSequence = SLinkOperations.getTarget(node, "inputSequence", true);
    return QueriesUtil.create_sequenceElementType_fromExpression(inputSequence, generator);
  }

  public static SNode mapSrcMacro_mapper_1170978063590(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170978105865(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170978114264(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170978123585(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170979514044(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170979519146(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170979528248(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

  public static SNode mapSrcMacro_mapper_1170979494535(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }

}
