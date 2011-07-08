package jetbrains.mps.execution.configurations.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleSource extends RunConfigurationSource {
  public static final String concept = "jetbrains.mps.execution.configurations.structure.ModuleSource";

  public ModuleSource(SNode node) {
    super(node);
  }

  public static ModuleSource newInstance(SModel sm, boolean init) {
    return (ModuleSource) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.configurations.structure.ModuleSource", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleSource newInstance(SModel sm) {
    return ModuleSource.newInstance(sm, false);
  }
}
