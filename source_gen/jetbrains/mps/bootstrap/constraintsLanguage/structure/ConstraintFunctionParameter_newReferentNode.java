package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunctionParameter_newReferentNode extends ConceptFunctionParameter {

  public  ConstraintFunctionParameter_newReferentNode(SNode node) {
    super(node);
  }

  public static ConstraintFunctionParameter_newReferentNode newInstance(SModel sm, boolean init) {
    return (ConstraintFunctionParameter_newReferentNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunctionParameter_newReferentNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConstraintFunctionParameter_newReferentNode newInstance(SModel sm) {
    return ConstraintFunctionParameter_newReferentNode.newInstance(sm, false);
  }
}
