package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.IntegerConstant;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AllConstant extends IntegerConstant {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.AllConstant";

  public AllConstant(SNode node) {
    super(node);
  }

  public static AllConstant newInstance(SModel sm, boolean init) {
    return (AllConstant) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.AllConstant", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AllConstant newInstance(SModel sm) {
    return AllConstant.newInstance(sm, false);
  }
}
