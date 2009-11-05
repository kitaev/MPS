package jetbrains.mps.baseLanguage.builders.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Builder extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.builders.structure.Builder";
  public static final String CPR_Leaf = "leaf";

  public Builder(SNode node) {
    super(node);
  }

  public static Builder newInstance(SModel sm, boolean init) {
    return (Builder)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.Builder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Builder newInstance(SModel sm) {
    return Builder.newInstance(sm, false);
  }
}
