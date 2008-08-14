package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemovePart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart";
  public static String CONCEPT_TO_REMOVE = "conceptToRemove";

  public RemovePart(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConceptToRemove() {
    return (ConceptDeclaration)this.getReferent(RemovePart.CONCEPT_TO_REMOVE);
  }

  public void setConceptToRemove(ConceptDeclaration node) {
    super.setReferent(RemovePart.CONCEPT_TO_REMOVE, node);
  }


  public static RemovePart newInstance(SModel sm, boolean init) {
    return (RemovePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemovePart newInstance(SModel sm) {
    return RemovePart.newInstance(sm, false);
  }

}
