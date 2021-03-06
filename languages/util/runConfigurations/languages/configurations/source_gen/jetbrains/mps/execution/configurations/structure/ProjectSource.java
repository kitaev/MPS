package jetbrains.mps.execution.configurations.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ProjectSource extends RunConfigurationSource {
  public static final String concept = "jetbrains.mps.execution.configurations.structure.ProjectSource";

  public ProjectSource(SNode node) {
    super(node);
  }

  public static ProjectSource newInstance(SModel sm, boolean init) {
    return (ProjectSource) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.configurations.structure.ProjectSource", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ProjectSource newInstance(SModel sm) {
    return ProjectSource.newInstance(sm, false);
  }
}
