package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.runtime.TemplateModel;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_3893401255414132234(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getNode()), "jetbrains.mps.transformation.test.inputLang.structure.InputRoot"), "useInTest", "reduceOneToMany", "none");
  }

  public static boolean baseMappingRule_Condition_3893401255414129777(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "useInTest", "reduceOneToMany", "none");
  }

  public static Iterable sourceNodesQuery_3893401255414086894(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getChildren(_context.getNode());
  }

  public static Iterable sourceNodesQuery_3893401255414161783(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromListAndArray(new ArrayList<SNode>(), _context.getNode(), _context.getNode());
  }

  public static TemplateModel getDescriptor() {
    return new TemplateModelImpl();
  }
}
