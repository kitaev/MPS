package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.behavior.PatternVarsUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class TemplateArgumentPatternVarRefExpression_Behavior {
  private static Class[] PARAMETERS_2902001550281949296 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getVariableName_2902001550281937661(SNode thisNode) {
    return PatternVarsUtil.getFieldName(SLinkOperations.getTarget(thisNode, "patternVarDecl", false));
  }

  public static String call_getVariableName_2902001550281949296(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternVarRefExpression"), "virtual_getVariableName_2902001550281937661", PARAMETERS_2902001550281949296);
  }

  public static String callSuper_getVariableName_2902001550281949296(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternVarRefExpression"), callerConceptFqName, "virtual_getVariableName_2902001550281937661", PARAMETERS_2902001550281949296);
  }
}
