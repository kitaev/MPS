package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_generationScripts;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.util.QueriesUtil;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateModule;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_1202245164352(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return QueriesUtil.isTest1(_context.getInputModel());
  }

  public static boolean baseMappingRule_Condition_1195172400866(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "option", "option_1", "option_default");
  }

  public static boolean baseMappingRule_Condition_1202780919451(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    if (!(SPropertyOperations.hasValue(SNodeOperations.as(SNodeOperations.getAncestor(_context.getNode(), null, false, true), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot"), "useInTest", "test1", "none"))) {
      return false;
    }
    return !(SPropertyOperations.hasValue(_context.getNode(), "option", "drop_it", "option_default"));
  }

  public static boolean baseMappingRule_Condition_1202780894871(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    if (!(SPropertyOperations.hasValue(SNodeOperations.cast(SNodeOperations.getAncestor(_context.getNode(), null, false, true), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot"), "useInTest", "test1", "none"))) {
      return false;
    }
    return SPropertyOperations.hasValue(_context.getNode(), "option", "drop_it", "option_default");
  }

  public static boolean baseMappingRule_Condition_1202243113773(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "useInTest", "test1", "none");
  }

  public static Object propertyMacro_GetPropertyValue_1195598330258(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "OutputRoot by MappingRule from input name: " + SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Iterable sourceNodesQuery_1195170582047(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "inputChild", true);
  }

  public static void mappingScript_CodeBlock_1195509228078(final IOperationContext operationContext, final MappingScriptContext _context) {
    // test1 only 
    if (!(QueriesUtil.isTest1(_context.getModel()))) {
      return;
    }
    _context.putStepObject("run post-processing", new Object());
    System.out.println("!!!test pre-mapping. model=" + _context.getModel().getLongName());
    SNode inputRoot = SModelOperations.createNewRootNode(_context.getModel(), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot", null);
    SPropertyOperations.set(inputRoot, "name", "Input Root created by pre-process script");
    SPropertyOperations.set(inputRoot, "useInTest", "test1");
  }

  public static void mappingScript_CodeBlock_1195510384869(final IOperationContext operationContext, final MappingScriptContext _context) {
    // test1 only 
    Object object = _context.getStepObject("run post-processing");
    if (object == null) {
      return;
    }
    System.out.println("!!!test post-mapping. model=" + _context.getModel().getLongName());
    SNode outputRoot = SModelOperations.createNewRootNode(_context.getModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", null);
    SPropertyOperations.set(outputRoot, "name", "created by post-processing script");
  }

  public static TemplateModel getDescriptor(TemplateModule module) {
    return new TemplateModelImpl(module);
  }
}
