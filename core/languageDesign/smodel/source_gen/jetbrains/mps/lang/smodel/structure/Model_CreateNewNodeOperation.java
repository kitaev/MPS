package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Model_CreateNewNodeOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation";
  public static final String CONCEPT = "concept";
  public static final String PROTOTYPE_NODE = "prototypeNode";

  public Model_CreateNewNodeOperation(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.class, Model_CreateNewNodeOperation.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(Model_CreateNewNodeOperation.CONCEPT, node);
  }

  public Expression getPrototypeNode() {
    return (Expression)this.getChild(Expression.class, Model_CreateNewNodeOperation.PROTOTYPE_NODE);
  }

  public void setPrototypeNode(Expression node) {
    super.setChild(Model_CreateNewNodeOperation.PROTOTYPE_NODE, node);
  }

  public static Model_CreateNewNodeOperation newInstance(SModel sm, boolean init) {
    return (Model_CreateNewNodeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_CreateNewNodeOperation newInstance(SModel sm) {
    return Model_CreateNewNodeOperation.newInstance(sm, false);
  }
}
