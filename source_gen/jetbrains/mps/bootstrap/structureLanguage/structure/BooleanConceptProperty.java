package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BooleanConceptProperty extends ConceptProperty {

  public  BooleanConceptProperty(SNode node) {
    super(node);
  }

  public static BooleanConceptProperty newInstance(SModel sm, boolean init) {
    return (BooleanConceptProperty)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static BooleanConceptProperty newInstance(SModel sm) {
    return BooleanConceptProperty.newInstance(sm, false);
  }

  public BooleanConceptPropertyDeclaration getBooleanConceptPropertyDeclaration() {
    return (BooleanConceptPropertyDeclaration)this.getConceptPropertyDeclaration();
  }
  public void setBooleanConceptPropertyDeclaration(BooleanConceptPropertyDeclaration node) {
    this.setConceptPropertyDeclaration(node);
  }
}
