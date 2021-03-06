package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateFunctionParameter_outputNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_outputNode";

  public TemplateFunctionParameter_outputNode(SNode node) {
    super(node);
  }

  public static TemplateFunctionParameter_outputNode newInstance(SModel sm, boolean init) {
    return (TemplateFunctionParameter_outputNode) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_outputNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateFunctionParameter_outputNode newInstance(SModel sm) {
    return TemplateFunctionParameter_outputNode.newInstance(sm, false);
  }
}
