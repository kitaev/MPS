package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StringEnum extends Enum {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.StringEnum";

  public StringEnum(SNode node) {
    super(node);
  }

  public static StringEnum newInstance(SModel sm, boolean init) {
    return (StringEnum) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.StringEnum", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StringEnum newInstance(SModel sm) {
    return StringEnum.newInstance(sm, false);
  }
}
