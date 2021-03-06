package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.buildlanguage.structure.TargetDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BuildLanguageTargetReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.BuildLanguageTargetReference";
  public static final String TARGET_DECLARATION = "targetDeclaration";

  public BuildLanguageTargetReference(SNode node) {
    super(node);
  }

  public TargetDeclaration getTargetDeclaration() {
    return (TargetDeclaration) this.getReferent(TargetDeclaration.class, BuildLanguageTargetReference.TARGET_DECLARATION);
  }

  public void setTargetDeclaration(TargetDeclaration node) {
    super.setReferent(BuildLanguageTargetReference.TARGET_DECLARATION, node);
  }

  public static BuildLanguageTargetReference newInstance(SModel sm, boolean init) {
    return (BuildLanguageTargetReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.BuildLanguageTargetReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BuildLanguageTargetReference newInstance(SModel sm) {
    return BuildLanguageTargetReference.newInstance(sm, false);
  }
}
