package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.TemplateQueryContextWithMacro;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateModule;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1206461877475(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(SNodeOperations.cast(SNodeOperations.getAncestor(_context.getNode(), null, false, true), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot"), "useInTest", "reduceInheritors", "none");
  }

  public static boolean baseMappingRule_Condition_1206461190505(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(SNodeOperations.cast(SNodeOperations.getAncestor(_context.getNode(), null, false, true), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot"), "useInTest", "reduceInheritors", "none");
  }

  public static boolean baseMappingRule_Condition_1206461124351(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(SNodeOperations.cast(SNodeOperations.getAncestor(_context.getNode(), null, false, true), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot"), "useInTest", "reduceInheritors", "none");
  }

  public static boolean baseMappingRule_Condition_1206460092545(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "useInTest", "reduceInheritors", "none");
  }

  public static Iterable sourceNodesQuery_1206460249786(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "inputChild", true);
  }

  public static boolean mappingConfiguration_Condition_2507865635201605483(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return (((Integer) _context.getGenerationParameter("r:408996b0-ebf2-476e-82c9-2fe87b3109af.GlobalParameters.list")) == null ?
      true :
      ((Integer) _context.getGenerationParameter("r:408996b0-ebf2-476e-82c9-2fe87b3109af.GlobalParameters.list")) < 2
    );
  }

  public static SNode insertMacro_Query_7612440128092282150(final IOperationContext operationContext, final TemplateQueryContextWithMacro _context) {
    SNode inode = SConceptOperations.createNewNode("jetbrains.mps.transformation.test.outputLang.structure.OutputNode", null);
    SPropertyOperations.set(inode, "text", "Inserted node for input=" + SPropertyOperations.getString(_context.getNode(), "name"));
    return inode;
  }

  public static TemplateModel getDescriptor(TemplateModule module) {
    return new TemplateModelImpl(module);
  }
}
