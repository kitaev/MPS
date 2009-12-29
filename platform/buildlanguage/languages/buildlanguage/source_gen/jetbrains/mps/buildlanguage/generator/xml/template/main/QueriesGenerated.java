package jetbrains.mps.buildlanguage.generator.xml.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.buildlanguage.behavior.PropertyValueExpression_Behavior;
import jetbrains.mps.buildlanguage.behavior.Project_Behavior;
import jetbrains.mps.build.property.behavior.PropertyNode_Behavior;
import jetbrains.mps.buildlanguage.behavior.ITargetReference_Behavior;
import jetbrains.mps.generator.template.IfMacroContext;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.buildlanguage.behavior.TargetDeclaration_Behavior;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.Comparator;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1224769157301(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.buildlanguage.structure.Project", false, true) != null);
  }

  public static boolean baseMappingRule_Condition_1224769231960(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.buildlanguage.structure.Project", false, true) != null);
  }

  public static Object propertyMacro_GetPropertyValue_1197041696784(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197041984406(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197043097344(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197043134402(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "default", true), "targetDeclaration", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197047737338(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PropertyValueExpression_Behavior.call_toString_1213877472569(SLinkOperations.getTarget(_context.getNode(), "propertyValue", true));
  }

  public static Object propertyMacro_GetPropertyValue_1197725505264(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PropertyValueExpression_Behavior.call_toString_1213877472569(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1199647316381(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return Project_Behavior.call_getDocumentName_1213877351812(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1200145395655(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PropertyValueExpression_Behavior.call_toString_1213877472569(SLinkOperations.getTarget(_context.getNode(), "basedir", true));
  }

  public static Object propertyMacro_GetPropertyValue_1201017147787(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "${ant.file}/../" + PropertyNode_Behavior.call_getFileName_1213877341757(SLinkOperations.getTarget(_context.getNode(), "propertyNode", false));
  }

  public static Object propertyMacro_GetPropertyValue_1201709830416(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "${ant.file}/../" + Project_Behavior.call_getFileName_1213877351819(SLinkOperations.getTarget(_context.getNode(), "project", false));
  }

  public static Object propertyMacro_GetPropertyValue_1219150196232(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1219153881551(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "Property " + SPropertyOperations.getString(_context.getNode(), "name") + " unspecified.";
  }

  public static Object propertyMacro_GetPropertyValue_1229186338304(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "if");
  }

  public static Object propertyMacro_GetPropertyValue_1229186668950(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "unless");
  }

  public static Object propertyMacro_GetPropertyValue_1230222683911(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "${ant.file}/../" + ITargetReference_Behavior.call_getProjectFileName_1230222765831(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1240399737243(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return PropertyValueExpression_Behavior.call_toString_1213877472569(SLinkOperations.getTarget(_context.getNode(), "propertyFile", true));
  }

  public static boolean ifMacro_Condition_1200145404081(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "basedir", true) != null);
  }

  public static boolean ifMacro_Condition_1219774096052(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration"), "checkOnStart");
  }

  public static boolean ifMacro_Condition_1229186350652(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(_context.getNode(), "if"));
  }

  public static boolean ifMacro_Condition_1229186682042(final IOperationContext operationContext, final IfMacroContext _context) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(_context.getNode(), "unless"));
  }

  public static boolean ifMacro_Condition_1240316820310(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "default", true) != null);
  }

  public static SNode sourceNodeQuery_1197045463934(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "depends", true)).count() == 0) {
      return null;
    }
    SNode attribute = SConceptOperations.createNewNode("jetbrains.mps.xml.deprecated.structure.Attribute", null);
    SPropertyOperations.set(attribute, "name", "depends");
    SPropertyOperations.set(attribute, "value", TargetDeclaration_Behavior.call_getDependanceString_1213877231974(_context.getNode()));
    return attribute;
  }

  public static SNode sourceNodeQuery_1219774104894(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_1197043378055(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "target", true);
  }

  public static Iterable sourceNodesQuery_1197043380401(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "property", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration"));
      }
    });
  }

  public static Iterable sourceNodesQuery_1197045140155(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "propertyList", true);
  }

  public static Iterable sourceNodesQuery_1197045203873(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "taskCall", true);
  }

  public static Iterable sourceNodesQuery_1199029853220(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "paths", true);
  }

  public static Iterable sourceNodesQuery_1219152731276(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> references = SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.buildlanguage.structure.PropertyReference", false, new String[]{});
    Iterable<SNode> externalReferences = ListSequence.fromList(references).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        SNode propertyDeclaration = SLinkOperations.getTarget(it, "propertyDeclaration", false);
        return SNodeOperations.isInstanceOf(propertyDeclaration, "jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration") && !(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "propertyList", true)).contains(propertyDeclaration)) && !(SPropertyOperations.getBoolean(SNodeOperations.cast(propertyDeclaration, "jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration"), "checkOnStart"));
      }
    });
    Iterable<SNode> decls = Sequence.fromIterable(externalReferences).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "propertyDeclaration", false);
      }
    });
    return Sequence.fromIterable(decls).distinct();
  }

  public static Iterable sourceNodesQuery_1219774083522(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "property", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration");
      }
    });
  }

  public static Iterable sourceNodesQuery_1220365505588(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "importProperties", true);
  }

  public static Iterable sourceNodesQuery_1221832362895(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "importProject", true);
  }

  public static Iterable sourceNodesQuery_1230222691427(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    final Set<String> existing = SetSequence.fromSet(new HashSet<String>());
    for (SNode importProject : ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.buildlanguage.structure.ImportProject", false, new String[]{}))) {
      SetSequence.fromSet(existing).addElement(SPropertyOperations.getString(SLinkOperations.getTarget(importProject, "project", false), "name"));
    }
    Iterable<SNode> projects = ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.buildlanguage.structure.ITargetReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        boolean b = !(SetSequence.fromSet(existing).contains(ITargetReference_Behavior.call_getProjectFileName_1230222765831(it)));
        SetSequence.fromSet(existing).addElement(ITargetReference_Behavior.call_getProjectFileName_1230222765831(it));
        return b;
      }
    });
    return Sequence.fromIterable(projects).sort(new Comparator<SNode>() {
      public int compare(SNode a, SNode b) {
        return ITargetReference_Behavior.call_getProjectFileName_1230222765831(a).compareToIgnoreCase(ITargetReference_Behavior.call_getProjectFileName_1230222765831(b));
      }
    }, true);
  }
}
