package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CeilingDateTimeOperation extends RoundDateTimeOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.CeilingDateTimeOperation";

  public CeilingDateTimeOperation(SNode node) {
    super(node);
  }

  public static CeilingDateTimeOperation newInstance(SModel sm, boolean init) {
    return (CeilingDateTimeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.CeilingDateTimeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CeilingDateTimeOperation newInstance(SModel sm) {
    return CeilingDateTimeOperation.newInstance(sm, false);
  }
}
