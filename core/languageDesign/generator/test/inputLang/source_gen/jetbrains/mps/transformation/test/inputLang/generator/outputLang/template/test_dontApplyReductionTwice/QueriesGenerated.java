package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_dontApplyReductionTwice;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateModule;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1209604575152(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "useInTest", "dontApplyReductionTwice", "none");
  }

  public static TemplateModel getDescriptor(TemplateModule module) {
    return new TemplateModelImpl(module);
  }
}
