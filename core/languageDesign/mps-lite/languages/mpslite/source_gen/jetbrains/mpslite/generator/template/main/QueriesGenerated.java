package jetbrains.mpslite.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mpslite.generator.template.main._Quotations;
import jetbrains.mpslite.generator.template.util.MPSLiteGenerationUtil;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1237992610930(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getCount(_context.getNode(), "line") > 1;
  }

  public static boolean baseMappingRule_Condition_1237992625213(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getCount(_context.getNode(), "line") == 1 && SLinkOperations.getCount(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "line", true)).first(), "linePart") > 1;
  }

  public static boolean baseMappingRule_Condition_1237992654822(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getCount(_context.getNode(), "line") == 1 && SLinkOperations.getCount(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "line", true)).first(), "linePart") == 1;
  }

  public static boolean baseMappingRule_Condition_1237993115201(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getCount(_context.getNode(), "line") == 0 && SPropertyOperations.getBoolean(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mpslite.structure.IMPSLiteConcept", false, false), "abstract");
  }

  public static boolean baseMappingRule_Condition_1237999282434(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SPropertyOperations.getBoolean(_context.getNode(), "multiple"));
  }

  public static boolean baseMappingRule_Condition_1237999295417(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "multiple") && SPropertyOperations.getBoolean(_context.getNode(), "vertical");
  }

  public static boolean baseMappingRule_Condition_1237999311173(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "multiple") && !(SPropertyOperations.getBoolean(_context.getNode(), "vertical"));
  }

  public static boolean baseMappingRule_Condition_1238012600857(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getCount(_context.getNode(), "line") == 0 && !(SPropertyOperations.getBoolean(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mpslite.structure.IMPSLiteConcept", false, false), "abstract"));
  }

  public static boolean baseMappingRule_Condition_1238012693197(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(SPropertyOperations.getBoolean(_context.getNode(), "abstract")) || SLinkOperations.getCount(SLinkOperations.getTarget(_context.getNode(), "lineList", true), "line") != 0;
  }

  public static Object propertyMacro_GetPropertyValue_1237409796281(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "root");
  }

  public static Object propertyMacro_GetPropertyValue_1237455585692(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1237456145874(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1237456972325(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1237456982116(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(_context.getNode(), "multiple")) {
      return "0..n";
    } else
    {
      return "0..1";
    }
  }

  public static Object propertyMacro_GetPropertyValue_1237457740137(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1237457755059(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getBoolean(_context.getNode(), "optional")) {
      return "0..1";
    } else
    {
      return "1";
    }
  }

  public static Object propertyMacro_GetPropertyValue_1237986790260(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_1237993197917(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "abstract " + SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mpslite.structure.IMPSLiteConcept", false, false), "name");
  }

  public static Object referenceMacro_GetReferent_1237456181074(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    if (SPropertyOperations.hasValue(_context.getNode(), "propertyType", "string", "string")) {
      return SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "dataType", false);
    } else if (SPropertyOperations.hasValue(_context.getNode(), "propertyType", "numeric", "string")) {
      return SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "dataType", false);
    } else
    {
      return null;
    }
  }

  public static Object referenceMacro_GetReferent_1237456965999(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return MPSLiteGenerationUtil.findStructureLanguageConcept(SLinkOperations.getTarget(_context.getNode(), "conceptReference", true), _context);
  }

  public static Object referenceMacro_GetReferent_1237457689341(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return MPSLiteGenerationUtil.findStructureLanguageConcept(SLinkOperations.getTarget(_context.getNode(), "conceptReference", true), _context);
  }

  public static Object referenceMacro_GetReferent_1237986908174(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "childLinkByLinePart");
  }

  public static Object referenceMacro_GetReferent_1237988309949(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "referentLinkByLinePart");
  }

  public static Object referenceMacro_GetReferent_1237988358175(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "propertyByLinePart");
  }

  public static Object referenceMacro_GetReferent_1237992145688(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "generateConcept");
  }

  public static Object referenceMacro_GetReferent_1237999372930(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "childLinkByLinePart");
  }

  public static Object referenceMacro_GetReferent_1237999388980(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "childLinkByLinePart");
  }

  public static boolean ifMacro_Condition_1237986962931(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1237987544045(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1237987621086(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static SNode sourceNodeQuery_1237991263721(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "lineList", true);
  }

  public static SNode sourceNodeQuery_1237992567520(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "line", true)).first(), "linePart", true)).first();
  }

  public static Iterable sourceNodesQuery_1237409957537(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mpslite.structure.ConcretePropertyPart", false);
  }

  public static Iterable sourceNodesQuery_1237409991707(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mpslite.structure.ConcreteChildPart", false);
  }

  public static Iterable sourceNodesQuery_1237410005549(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mpslite.structure.ConcreteReferencePart", false);
  }

  public static Iterable sourceNodesQuery_1237991110967(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "linePart", true);
  }

  public static Iterable sourceNodesQuery_1237991110976(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "line", true);
  }

  public static Iterable sourceNodesQuery_1237992468723(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "line", true)).first(), "linePart", true);
  }

}
