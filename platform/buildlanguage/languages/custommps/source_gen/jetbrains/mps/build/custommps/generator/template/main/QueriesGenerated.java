package jetbrains.mps.build.custommps.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.build.custommps.behavior.MPSDistribution_Behavior;
import jetbrains.mps.build.custommps.behavior.LibraryFolder_Behavior;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;
import jetbrains.mps.library.BuiltInLibrariesIO;
import java.io.File;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.behavior.IVariableHolder_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.ArrayList;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1234891502382(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.Layout", true, false) != null);
  }

  public static boolean baseMappingRule_Condition_1234891560671(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.distrib.structure.DistribConfiguration", true, false) != null);
  }

  public static boolean baseMappingRule_Condition_8716889635481504738(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false, new String[]{})).isNotEmpty() && MPSBuild_Behavior.isInMPSBuild_1239995424995();
  }

  public static boolean baseMappingRule_Condition_6128676491055324584(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false, new String[]{})).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1236880986480(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.build.packaging.structure.Layout");
  }

  public static boolean baseMappingRule_Condition_1240396552572(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false, new String[]{})).isNotEmpty();
  }

  public static Object propertyMacro_GetPropertyValue_1233931574105(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "antName");
  }

  public static Object propertyMacro_GetPropertyValue_1233931591542(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1239975476522(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714303951(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714309621(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714056018(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714255706(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714264392(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714274693(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714279856(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714288015(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1239714246915(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1240558468369(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1240558476327(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSDistribution_Behavior.call_getScriptsFolder_8431776905956256048(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_2235195415637077314(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return LibraryFolder_Behavior.call_getLibraryPathRelativeToMPSBuild_1240408519032(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_2235195415637077331(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(_context.getNode(), "libraryName", true));
  }

  public static Object propertyMacro_GetPropertyValue_2235195415637077348(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Module_Behavior.call_getModule_1213877515148(_context.getNode()).getModuleFqName();
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488775(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSBuild_Behavior.call_getScriptsFolder_1241536330057(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488800(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return MPSBuild_Behavior.call_getScriptsFolder_1241536330057(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488819(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("unpack.buildtools.zip", null);
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488881(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return LibraryFolder_Behavior.call_getLibraryPathRelativeToMPSBuild_1240408519032(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488890(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(_context.getNode(), "libraryName", true));
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488910(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BuiltInLibrariesIO.class.getName();
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488926(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BuiltInLibrariesIO.getModifiedConfigurationFile().replace(File.separator, "/");
  }

  public static Object propertyMacro_GetPropertyValue_8716889635481488955(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("add.libraries", null);
  }

  public static Object referenceMacro_GetReferent_1233931081841(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode output = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
    if (output == null) {
      output = IVariableHolder_Behavior.call_findVariable_1234876428215(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.IVariableHolder", true, false), SPropertyOperations.getString(_context.getNode(), "name"), SPropertyOperations.getString(_context.getNode(), "antName"));
    }
    return output;
  }

  public static Object referenceMacro_GetReferent_1234780240997(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true)).isNotEmpty()) {
      return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true)).first(), "configuration", false);
    } else {
      return ListSequence.fromList(SLinkOperations.getTargets(_context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.Layout", false, false)), "configuration", true)).first();
    }
  }

  public static Object referenceMacro_GetReferent_1234780362598(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "entry", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.packaging.structure.Folder");
      }
    }), "jetbrains.mps.build.packaging.structure.Folder");
  }

  public static Object referenceMacro_GetReferent_1234891647534(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode output = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
    if (output == null) {
      return IVariableHolder_Behavior.call_findVariable_1234876428215(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.IVariableHolder", true, false), SPropertyOperations.getString(_context.getNode(), "name"), SPropertyOperations.getString(_context.getNode(), "antName"));
    }
    return output;
  }

  public static Object referenceMacro_GetReferent_6128676491055272269(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPSBuildToUnpackZipAntcall");
  }

  public static boolean ifMacro_Condition_1237901321779(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSBuild_Behavior.isInMPSBuild_1239995424995());
  }

  public static boolean ifMacro_Condition_1238071255691(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(MPSBuild_Behavior.isInMPSBuild_1239995424995());
  }

  public static boolean ifMacro_Condition_2235195415637077183(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false, new String[]{})).isNotEmpty();
  }

  public static boolean ifMacro_Condition_2235195415637077214(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "licencePath", true) != null);
  }

  public static boolean ifMacro_Condition_8716889635481488827(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "pathToBuildToolsZip", true) != null);
  }

  public static boolean ifMacro_Condition_8716889635481488963(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false, new String[]{})).isNotEmpty();
  }

  public static SNode sourceNodeQuery_1237901351779(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "licencePath", true);
  }

  public static SNode sourceNodeQuery_2235195415637077207(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "licencePath", true);
  }

  public static SNode sourceNodeQuery_2235195415637077398(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_2235195415637091992(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "pathToBuildToolsZip", true), "macro", true);
  }

  public static SNode sourceNodeQuery_144296692409079125(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "pathToBuildToolsZip", true), "compositePathComponent", true);
  }

  public static SNode sourceNodeQuery_2235195415637082611(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "licencePath", true);
  }

  public static SNode sourceNodeQuery_8716889635481488789(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "pathToBuildToolsZip", true);
  }

  public static SNode sourceNodeQuery_2235195415637079262(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "entry", true)).first();
  }

  public static Iterable sourceNodesQuery_6128676491055373718(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromListAndArray(new ArrayList<SNode>(), new QueriesGenerated.QuotationClass_x583g4_a1a0a05().createNode(), new QueriesGenerated.QuotationClass_x583g4_a2a0a05().createNode());
  }

  public static Iterable sourceNodesQuery_2235195415637077365(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.packaging.structure.Module", false, new String[]{});
  }

  public static Iterable sourceNodesQuery_2235195415637077380(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false, new String[]{});
  }

  public static Iterable sourceNodesQuery_2235195415637077391(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "entry", true);
  }

  public static Iterable sourceNodesQuery_2235195415637077405(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "configuration", true);
  }

  public static Iterable sourceNodesQuery_8716889635481488810(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false, new String[]{});
  }

  public static Iterable sourceNodesQuery_8716889635481488899(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false, new String[]{});
  }

  public static Iterable sourceNodesQuery_8716889635481488946(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false, new String[]{});
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_6128676491055324582(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1236880980817(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getParent(_context.getNode()));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1240396533793(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static class QuotationClass_x583g4_a1a0a05 {
    public QuotationClass_x583g4_a1a0a05() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setProperty("antName", "build.number");
        quotedNode1_2.setProperty("name", "build");
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a2a0a05 {
    public QuotationClass_x583g4_a2a0a05() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setProperty("antName", "version");
        quotedNode1_2.setProperty("name", "version");
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
