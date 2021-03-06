package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OlderThan extends BinaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.OlderThan";

  public OlderThan(SNode node) {
    super(node);
  }

  public static OlderThan newInstance(SModel sm, boolean init) {
    return (OlderThan) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.OlderThan", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OlderThan newInstance(SModel sm) {
    return OlderThan.newInstance(sm, false);
  }
}
