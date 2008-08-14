package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_InsertNewNextSiblingOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewNextSiblingOperation";
  public static String CONCEPT = "concept";

  public Node_InsertNewNextSiblingOperation(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(Node_InsertNewNextSiblingOperation.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(Node_InsertNewNextSiblingOperation.CONCEPT, node);
  }


  public static Node_InsertNewNextSiblingOperation newInstance(SModel sm, boolean init) {
    return (Node_InsertNewNextSiblingOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewNextSiblingOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_InsertNewNextSiblingOperation newInstance(SModel sm) {
    return Node_InsertNewNextSiblingOperation.newInstance(sm, false);
  }

}
