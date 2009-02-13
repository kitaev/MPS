package jetbrains.mps.build.custommps.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.library.BuiltInLibrariesIO;
import java.io.File;
import jetbrains.mps.build.packaging.behavior.IStringExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {

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
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "UndeclaredVariableReferenceToVariable");
  }

  public static Object referenceMacro_GetReferent_1234275109662(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234275109785(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "CustomMPSBuildToTargetDeclaration");
  }

  public static Object referenceMacro_GetReferent_1234285316632(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234285316661(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234285316687(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234285316718(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("\\n")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static Object referenceMacro_GetReferent_1234286459403(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    for(SNode builtInVar : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getOutputNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false), "builtInVariable", true))) {
      if (SPropertyOperations.getString(builtInVar, "name").equals("date")) {
        return builtInVar;
      }
    }
    return null;
  }

  public static boolean ifMacro_Condition_1233681193440(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1234275109716(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.build.custommps.structure.LibraryFolder", false)).isNotEmpty();
  }

  public static SNode sourceNodeQuery_1233749686668(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "create", true);
  }

  public static SNode sourceNodeQuery_1234275109972(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
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

  public static Iterable sourceNodesQuery_1234275109965(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "entry", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1233931498973(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode layout = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.build.packaging.structure.MPSLayout", false, false);
    return _context.getCopiedOutputNodeForInputNode(layout);
  }

}
