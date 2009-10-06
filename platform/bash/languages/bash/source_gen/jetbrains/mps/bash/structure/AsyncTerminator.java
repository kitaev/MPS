package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AsyncTerminator extends CommandTerminator {
  public static final String concept = "jetbrains.mps.bash.structure.AsyncTerminator";

  public AsyncTerminator(SNode node) {
    super(node);
  }

  public static AsyncTerminator newInstance(SModel sm, boolean init) {
    return (AsyncTerminator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.AsyncTerminator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AsyncTerminator newInstance(SModel sm) {
    return AsyncTerminator.newInstance(sm, false);
  }
}
