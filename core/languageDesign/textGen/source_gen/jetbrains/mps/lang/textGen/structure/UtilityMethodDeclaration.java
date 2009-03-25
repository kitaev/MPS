package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UtilityMethodDeclaration extends jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration";

  public UtilityMethodDeclaration(SNode node) {
    super(node);
  }

  public static UtilityMethodDeclaration newInstance(SModel sm, boolean init) {
    return (UtilityMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UtilityMethodDeclaration newInstance(SModel sm) {
    return UtilityMethodDeclaration.newInstance(sm, false);
  }

}
