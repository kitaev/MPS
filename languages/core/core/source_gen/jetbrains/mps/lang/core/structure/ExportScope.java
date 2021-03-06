package jetbrains.mps.lang.core.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExportScope extends NodeAttribute {
  public static final String concept = "jetbrains.mps.lang.core.structure.ExportScope";

  public ExportScope(SNode node) {
    super(node);
  }

  public static ExportScope newInstance(SModel sm, boolean init) {
    return (ExportScope) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScope", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExportScope newInstance(SModel sm) {
    return ExportScope.newInstance(sm, false);
  }
}
