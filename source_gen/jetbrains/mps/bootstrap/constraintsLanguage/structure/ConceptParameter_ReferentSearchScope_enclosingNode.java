package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptParameter_ReferentSearchScope_enclosingNode extends ConceptFunctionParameter {

  public  ConceptParameter_ReferentSearchScope_enclosingNode(SNode node) {
    super(node);
  }

  public static ConceptParameter_ReferentSearchScope_enclosingNode newInstance(SModel sm, boolean init) {
    return (ConceptParameter_ReferentSearchScope_enclosingNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConceptParameter_ReferentSearchScope_enclosingNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptParameter_ReferentSearchScope_enclosingNode newInstance(SModel sm) {
    return ConceptParameter_ReferentSearchScope_enclosingNode.newInstance(sm, false);
  }
}
