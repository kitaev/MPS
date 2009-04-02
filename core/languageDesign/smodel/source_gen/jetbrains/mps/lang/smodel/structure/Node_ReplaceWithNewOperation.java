package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_ReplaceWithNewOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_ReplaceWithNewOperation";
  public static final String CONCEPT = "concept";

  public Node_ReplaceWithNewOperation(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.class, Node_ReplaceWithNewOperation.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(Node_ReplaceWithNewOperation.CONCEPT, node);
  }


  public static Node_ReplaceWithNewOperation newInstance(SModel sm, boolean init) {
    return (Node_ReplaceWithNewOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_ReplaceWithNewOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_ReplaceWithNewOperation newInstance(SModel sm) {
    return Node_ReplaceWithNewOperation.newInstance(sm, false);
  }

}
