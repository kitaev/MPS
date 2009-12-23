package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnonymousClassCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnonymousClassCreator";
  public static final String CLS = "cls";

  public AnonymousClassCreator(SNode node) {
    super(node);
  }

  public AnonymousClass getCls() {
    return (AnonymousClass) this.getChild(AnonymousClass.class, AnonymousClassCreator.CLS);
  }

  public void setCls(AnonymousClass node) {
    super.setChild(AnonymousClassCreator.CLS, node);
  }

  public static AnonymousClassCreator newInstance(SModel sm, boolean init) {
    return (AnonymousClassCreator) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnonymousClassCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnonymousClassCreator newInstance(SModel sm) {
    return AnonymousClassCreator.newInstance(sm, false);
  }
}
