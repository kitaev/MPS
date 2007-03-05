package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class OperationParm_Concept extends AbstractOperationParameter {
  public static String CONCEPT = "concept";

  public  OperationParm_Concept(SNode node) {
    super(node);
  }

  public static OperationParm_Concept newInstance(SModel sm, boolean init) {
    return (OperationParm_Concept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static OperationParm_Concept newInstance(SModel sm) {
    return OperationParm_Concept.newInstance(sm, false);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(OperationParm_Concept.CONCEPT);
  }
  public void setConcept(ConceptDeclaration node) {
    super.setReferent(OperationParm_Concept.CONCEPT, node);
  }
}
