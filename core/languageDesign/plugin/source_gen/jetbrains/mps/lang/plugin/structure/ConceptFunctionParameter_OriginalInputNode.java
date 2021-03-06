package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_OriginalInputNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_OriginalInputNode";

  public ConceptFunctionParameter_OriginalInputNode(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_OriginalInputNode newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_OriginalInputNode) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_OriginalInputNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_OriginalInputNode newInstance(SModel sm) {
    return ConceptFunctionParameter_OriginalInputNode.newInstance(sm, false);
  }
}
