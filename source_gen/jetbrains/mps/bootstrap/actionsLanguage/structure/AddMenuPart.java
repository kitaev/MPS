package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddMenuPart extends ConceptPart {

  public  AddMenuPart(SNode node) {
    super(node);
  }

  public static AddMenuPart newInstance(SModel sm, boolean init) {
    return (AddMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AddMenuPart newInstance(SModel sm) {
    return AddMenuPart.newInstance(sm, false);
  }

}
