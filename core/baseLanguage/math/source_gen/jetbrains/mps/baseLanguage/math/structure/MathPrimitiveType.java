package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MathPrimitiveType extends Type {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.MathPrimitiveType";

  public MathPrimitiveType(SNode node) {
    super(node);
  }

  public static MathPrimitiveType newInstance(SModel sm, boolean init) {
    return (MathPrimitiveType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.MathPrimitiveType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MathPrimitiveType newInstance(SModel sm) {
    return MathPrimitiveType.newInstance(sm, false);
  }
}
