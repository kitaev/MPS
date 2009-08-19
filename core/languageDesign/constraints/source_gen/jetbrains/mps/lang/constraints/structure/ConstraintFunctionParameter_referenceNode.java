package jetbrains.mps.lang.constraints.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunctionParameter_referenceNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode";

  public ConstraintFunctionParameter_referenceNode(SNode node) {
    super(node);
  }

  public static ConstraintFunctionParameter_referenceNode newInstance(SModel sm, boolean init) {
    return (ConstraintFunctionParameter_referenceNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstraintFunctionParameter_referenceNode newInstance(SModel sm) {
    return ConstraintFunctionParameter_referenceNode.newInstance(sm, false);
  }
}
