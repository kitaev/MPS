package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetSelectedTabOperation extends TabbedToolOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.GetSelectedTabOperation";

  public GetSelectedTabOperation(SNode node) {
    super(node);
  }

  public static GetSelectedTabOperation newInstance(SModel sm, boolean init) {
    return (GetSelectedTabOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GetSelectedTabOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetSelectedTabOperation newInstance(SModel sm) {
    return GetSelectedTabOperation.newInstance(sm, false);
  }
}
