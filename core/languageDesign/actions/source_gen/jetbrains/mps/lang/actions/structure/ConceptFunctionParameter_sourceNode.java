package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_sourceNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_sourceNode";

  public ConceptFunctionParameter_sourceNode(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_sourceNode newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_sourceNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_sourceNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_sourceNode newInstance(SModel sm) {
    return ConceptFunctionParameter_sourceNode.newInstance(sm, false);
  }
}
