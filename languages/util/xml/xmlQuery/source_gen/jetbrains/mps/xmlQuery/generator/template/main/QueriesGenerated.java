package jetbrains.mps.xmlQuery.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.xmlQuery.behavior.XMLSAXChildRule_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_2341233264268020340(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessArbitraryChildrenOperation");
  }

  public static boolean baseMappingRule_Condition_5496586556363907049(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation");
  }

  public static boolean baseMappingRule_Condition_5496586556363937161(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "type", true), "jetbrains.mps.xmlSchema.structure.BooleanSchemaType");
  }

  public static boolean baseMappingRule_Condition_4647729700483326629(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "type", true), "jetbrains.mps.xmlSchema.structure.IntegerSchemaType");
  }

  public static boolean baseMappingRule_Condition_4647729700483326645(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "type", true), "jetbrains.mps.xmlSchema.structure.StringSchemaType");
  }

  public static Object propertyMacro_GetPropertyValue_6992757512064148577(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "elementDeclaration", false), "elementName");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758768(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758689(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758702(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "type", true), "jetbrains.mps.xmlSchema.structure.BooleanSchemaType"), "defaultValue");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758809(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758822(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "type", true), "jetbrains.mps.xmlSchema.structure.IntegerSchemaType"), "defaultValue");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758865(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8118141292490758878(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation"), "attributeDeclaration", false), "type", true), "jetbrains.mps.xmlSchema.structure.StringSchemaType"), "defaultValue");
  }

  public static Object propertyMacro_GetPropertyValue_2286463592495275953(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "attribute", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7707758858786044659(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "handler";
  }

  public static Object propertyMacro_GetPropertyValue_7707758858786044544(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "field" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_2824634917103291953(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "field" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_2824634917103291928(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8640335038347080199(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "Handler";
  }

  public static Object propertyMacro_GetPropertyValue_8640335038347081824(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name") + "ElementHandler";
  }

  public static Object propertyMacro_GetPropertyValue_3444414697307485840(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3444414697307503096(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return XMLSAXChildRule_Behavior.call_getTagName_3444414697307503271(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_3444414697307503149(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return XMLSAXChildRule_Behavior.call_getTagName_3444414697307503271(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_3444414697307455302(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_7707758858786044757(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return "field" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "declaration", false), "name");
  }

  public static Object referenceMacro_GetReferent_7459083455229529890(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return "myLocator";
  }

  public static Object referenceMacro_GetReferent_2824634917103293140(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_2824634917103292037(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return "field" + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static boolean ifMacro_Condition_8666712036583043668(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "result", true) != null);
  }

  public static boolean ifMacro_Condition_3444414697307502949(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "creator", true) != null) && (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "creator", true), "body", true) != null) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "creator", true), "body", true), "statement", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3444414697307455192(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attrs", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getBoolean(it, "isRequired");
      }
    }).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3912764103614106144(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "handler", true) != null) && (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true) != null) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true), "statement", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3444414697307485789(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attrs", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3444414697307503023(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "children", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3912764103614106200(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "handler", true) != null) && (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true) != null) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true), "statement", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_7707758858786107715(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "handler", true) != null) && (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true) != null) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true), "statement", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3444414697307503046(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "children", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3444414697307550122(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "text", true) != null);
  }

  public static boolean ifMacro_Condition_3444414697307550126(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "validator", true) != null);
  }

  public static boolean ifMacro_Condition_3444414697307550480(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "validator", true) != null) && (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "validator", true), "body", true) != null) && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "validator", true), "body", true), "statement", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_4120841425052733760(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "globalText", true) != null);
  }

  public static boolean ifMacro_Condition_4120841425052678231(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "globalText", true) != null);
  }

  public static SNode sourceNodeQuery_8118141292490758600(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_8118141292490758608(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.xmlQuery.structure.AccessArbitraryChildrenOperation"), "childNameExpression", true);
  }

  public static SNode sourceNodeQuery_8118141292490758563(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "attributeNameExpression", true);
  }

  public static SNode sourceNodeQuery_8118141292490758759(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_8118141292490758680(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_8118141292490758800(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_8118141292490758856(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_8666712036583043684(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "result", true);
  }

  public static SNode sourceNodeQuery_3444414697307455082(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static SNode sourceNodeQuery_7707758858786044529(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_2824634917103291939(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_2824634917103291918(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_2084096332909504089(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307503123(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307485869(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307485888(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_7707758858786044718(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rule", false);
  }

  public static SNode sourceNodeQuery_3444414697307503002(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307503011(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307536146(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "rule", false), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307536169(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "rule", false), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307550282(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307550291(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307550325(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ((SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "text", true), "handler", true) != null) ?
      SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "text", true), "handler", true), "body", true) :
      null
    );
  }

  public static SNode sourceNodeQuery_3444414697307550514(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307550523(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_3444414697307455446(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static SNode sourceNodeQuery_778801526243105257(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static SNode sourceNodeQuery_2084053974016279249(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static SNode sourceNodeQuery_4120841425052733625(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static SNode sourceNodeQuery_4120841425052733634(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "root", false), "type", true);
  }

  public static Iterable sourceNodesQuery_7707758858786044604(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "nodes", true);
  }

  public static Iterable sourceNodesQuery_7707758858786044518(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameters", true);
  }

  public static Iterable sourceNodesQuery_2824634917103291946(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "fields", true);
  }

  public static Iterable sourceNodesQuery_2824634917103292030(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameters", true);
  }

  public static Iterable sourceNodesQuery_2824634917103291908(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameters", true);
  }

  public static Iterable sourceNodesQuery_8640335038347081813(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "nodes", true);
  }

  public static Iterable sourceNodesQuery_3912764103614123814(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "creator", true), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_3912764103614106171(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_3444414697307485826(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "attrs", true);
  }

  public static Iterable sourceNodesQuery_3444414697307503081(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "children", true);
  }

  public static Iterable sourceNodesQuery_7707758858786107823(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "handler", true), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_3444414697307503183(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "children", true);
  }

  public static Iterable sourceNodesQuery_3912764103614106130(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "validator", true), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_3444414697307455270(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attrs", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getBoolean(it, "isRequired");
      }
    });
  }

  public static Iterable sourceNodesQuery_2268737274629068773(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return Sequence.fromArray(new SNode[]{SLinkOperations.getTarget(_context.getNode(), "root", false)});

  }

  public static Iterable sourceNodesQuery_6526178664198303785(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "globalText", true), "handler", true), "body", true), "statement", true);
  }
}
