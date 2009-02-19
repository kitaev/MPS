package jetbrains.mps.build.custommps.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.library.BuiltInLibrariesIO;
import java.io.File;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.build.packaging.behavior.IVariableHolder_Behavior;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.build.packaging.behavior.Configuration_Behavior;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1234878205127(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", false)).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1234878220298(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", false)).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1234891502382(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), null, true, true), "jetbrains.mps.build.packaging.structure.MPSLayout");
  }

  public static boolean baseMappingRule_Condition_1234891560671(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getAncestor(_context.getNode(), null, true, true), "jetbrains.mps.build.distrib.structure.DistribConfiguration");
  }

  public static Object propertyMacro_GetPropertyValue_1233670619638(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BuiltInLibrariesIO.class.getName();
  }

  public static Object propertyMacro_GetPropertyValue_1233671293016(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("add.libraries", null);
  }

  public static Object propertyMacro_GetPropertyValue_1233683018283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BuiltInLibrariesIO.getModifiedConfigurationFile().replace(File.separator, "/");
  }

  public static Object propertyMacro_GetPropertyValue_1233738680554(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IStringExpression_Behavior.call_getValue_1213877173054(SLinkOperations.getTarget(_context.getNode(), "libraryName", true));
  }

  public static Object propertyMacro_GetPropertyValue_1233738709211(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String path = "";
    for(SNode p : ListSequence.fromList(MPSBuild_Behavior.call_getPathToLibrary_1233680013340(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false, false), _context.getNode()))) {
      path += IStringExpression_Behavior.call_getValue_1213877173054(p);
      path += "/";
    }
    return path;
  }

  public static Object propertyMacro_GetPropertyValue_1233749656884(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "artifactName");
  }

  public static Object propertyMacro_GetPropertyValue_1233750926575(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String artifactNormalizedPath = SPropertyOperations.getString(_context.getNode(), "artifactName").replace("\\", "/");
    int index = artifactNormalizedPath.lastIndexOf("/");
    return artifactNormalizedPath.substring(index + 1);
  }

  public static Object propertyMacro_GetPropertyValue_1233931574105(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "antName");
  }

  public static Object propertyMacro_GetPropertyValue_1233931591542(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_1233931081841(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode output = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
    if (output == null) {
      return IVariableHolder_Behavior.call_findVariable_1234876428215(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.IVariableHolder", true, false), SPropertyOperations.getString(_context.getNode(), "name"), SPropertyOperations.getString(_context.getNode(), "antName"));
    }
    return output;
  }

  public static Object referenceMacro_GetReferent_1234780240997(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true)).isNotEmpty()) {
      return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "configuration", true)).first(), "configuration", false);
    } else
    {
      return ListSequence.fromList(SLinkOperations.getTargets(_context.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false)), "configuration", true)).first();
    }
  }

  public static Object referenceMacro_GetReferent_1234780362598(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPsBuildToFolder");
  }

  public static Object referenceMacro_GetReferent_1234891647534(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode output = _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
    if (output == null) {
      return IVariableHolder_Behavior.call_findVariable_1234876428215(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.IVariableHolder", true, false), SPropertyOperations.getString(_context.getNode(), "name"), SPropertyOperations.getString(_context.getNode(), "antName"));
    }
    return output;
  }

  public static Object referenceMacro_GetReferent_1234971270263(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270387(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPSBuildToTargetDeclaration");
  }

  public static Object referenceMacro_GetReferent_1234971270563(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270602(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270630(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270656(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234971270687(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static boolean ifMacro_Condition_1233681193440(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1234971270318(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false)).isNotEmpty();
  }

  public static SNode sourceNodeQuery_1233749686668(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "create", true);
  }

  public static SNode sourceNodeQuery_1234971270743(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1233670839960(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false);
  }

  public static Iterable sourceNodesQuery_1233670963750(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.MPSBuild", false);
  }

  public static Iterable sourceNodesQuery_1233749730940(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> components = ListSequence.<SNode>fromArray();
    String[] path = SPropertyOperations.getString(_context.getNode(), "artifactName").replace("\\", "/").split("/");
    for(String p : path) {
      SNode c = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.PathComponent", null);
      SPropertyOperations.set(c, "path", p);
      ListSequence.fromList(components).addElement(c);
    }
    ListSequence.fromList(components).removeLastElement();
    return components;
  }

  public static Iterable sourceNodesQuery_1234877027528(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    Iterable<SNode> undeclaredVariables = ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", false)).distinct();
    return Sequence.fromIterable(undeclaredVariables).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return (IVariableHolder_Behavior.call_findVariable_1234876428215(_context.getCopiedOutputNodeForInputNode(_context.getNode()), SPropertyOperations.getString(it, "name"), SPropertyOperations.getString(it, "antName")) == null);
      }

    });
  }

  public static Iterable sourceNodesQuery_1234877165687(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    Iterable<SNode> undeclaredVariables = ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", false)).distinct();
    return Sequence.fromIterable(undeclaredVariables).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return (IVariableHolder_Behavior.call_findVariable_1234876428215(_context.getCopiedOutputNodeForInputNode(_context.getNode()), SPropertyOperations.getString(it, "name"), SPropertyOperations.getString(it, "antName")) == null);
      }

    });
  }

  public static Iterable sourceNodesQuery_1234971270736(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "entry", true);
  }

  public static Iterable sourceNodesQuery_1234971270750(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "configuration", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1234876993397(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1234877152440(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(Configuration_Behavior.call_getLayout_1213877261819(SLinkOperations.getTarget(_context.getNode(), "buildScriptConfiguration", false)));
  }

}
