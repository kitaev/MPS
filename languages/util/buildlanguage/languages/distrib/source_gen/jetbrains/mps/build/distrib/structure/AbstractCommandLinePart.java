package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractCommandLinePart extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.distrib.structure.AbstractCommandLinePart";

  public AbstractCommandLinePart(SNode node) {
    super(node);
  }

  public static AbstractCommandLinePart newInstance(SModel sm, boolean init) {
    return (AbstractCommandLinePart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.AbstractCommandLinePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractCommandLinePart newInstance(SModel sm) {
    return AbstractCommandLinePart.newInstance(sm, false);
  }
}
