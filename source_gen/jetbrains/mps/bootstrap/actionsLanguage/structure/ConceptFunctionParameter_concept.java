package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_concept extends ConceptFunctionParameter {

  public  ConceptFunctionParameter_concept(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_concept newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_concept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_concept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_concept newInstance(SModel sm) {
    return ConceptFunctionParameter_concept.newInstance(sm, false);
  }

}
