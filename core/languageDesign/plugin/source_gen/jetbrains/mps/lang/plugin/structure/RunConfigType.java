package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RunConfigType extends BaseClassifierType {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.RunConfigType";
  public static final String RUN_CONFIG = "runConfig";

  public RunConfigType(SNode node) {
    super(node);
  }

  public RunConfigurationDeclaration getRunConfig() {
    return (RunConfigurationDeclaration) this.getReferent(RunConfigurationDeclaration.class, RunConfigType.RUN_CONFIG);
  }

  public void setRunConfig(RunConfigurationDeclaration node) {
    super.setReferent(RunConfigType.RUN_CONFIG, node);
  }

  public static RunConfigType newInstance(SModel sm, boolean init) {
    return (RunConfigType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.RunConfigType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RunConfigType newInstance(SModel sm) {
    return RunConfigType.newInstance(sm, false);
  }
}
