package jetbrains.mps.samples.generator_demo.demoLang3.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateFragmentContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1228530334488(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name").equals("button");
  }

  public static boolean baseMappingRule_Condition_1228530974519(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name").equals("label");
  }

  public static Object propertyMacro_GetPropertyValue_1228530847854(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }), "value");
  }

  public static Object propertyMacro_GetPropertyValue_1228530922047(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }), "value");
  }

  public static Object propertyMacro_GetPropertyValue_1228531189338(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), null);
  }

  public static Object propertyMacro_GetPropertyValue_1228531236411(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), null);
  }

  public static Object propertyMacro_GetPropertyValue_1228532289178(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value").equals("true");
  }

  public static Object referenceMacro_GetReferent_1228532742086(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static boolean ifMacro_Condition_1228530695049(final IOperationContext operationContext, final IfMacroContext _context) {
    return (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }) != null);
  }

  public static boolean ifMacro_Condition_1228530922069(final IOperationContext operationContext, final IfMacroContext _context) {
    return (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("text");
      }
    }) != null);
  }

  public static SNode sourceNodeQuery_1228532217556(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("enabled");
      }
    });
  }

  public static SNode sourceNodeQuery_1228532713788(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "attribute", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("background");
      }
    });
  }

  public static SNode templateFragment_ContextNodeQuery_1228531534788(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    SNode demoApp = SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode method = ListSequence.fromList(SLinkOperations.getTargets(demoApp, "staticMethod", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("addContent");
      }
    });
    return SLinkOperations.getTarget(method, "body", true);
  }

  public static SNode templateFragment_ContextNodeQuery_1228531789982(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    SNode demoApp = SNodeOperations.cast(_context.getMainContextNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode method = ListSequence.fromList(SLinkOperations.getTargets(demoApp, "staticMethod", true)).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals("addContent");
      }
    });
    return SLinkOperations.getTarget(method, "body", true);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1228530322221(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByMappingLabel("main_class");
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1228530974513(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getOutputNodeByMappingLabel("main_class");
  }

}
