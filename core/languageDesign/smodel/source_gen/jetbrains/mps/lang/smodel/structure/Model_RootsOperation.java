package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Model_RootsOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Model_RootsOperation";
  public static final String CONCEPT = "concept";

  public Model_RootsOperation(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, Model_RootsOperation.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(Model_RootsOperation.CONCEPT, node);
  }


  public static Model_RootsOperation newInstance(SModel sm, boolean init) {
    return (Model_RootsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Model_RootsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_RootsOperation newInstance(SModel sm) {
    return Model_RootsOperation.newInstance(sm, false);
  }

}
