package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StaticMethodDeclaration extends BaseMethodDeclaration {

  public  StaticMethodDeclaration(SNode node) {
    super(node);
  }

  public static StaticMethodDeclaration newInstance(SModel sm, boolean init) {
    return (StaticMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.StaticMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static StaticMethodDeclaration newInstance(SModel sm) {
    return StaticMethodDeclaration.newInstance(sm, false);
  }
}
