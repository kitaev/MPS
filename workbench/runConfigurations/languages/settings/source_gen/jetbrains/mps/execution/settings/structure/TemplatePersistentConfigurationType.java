package jetbrains.mps.execution.settings.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplatePersistentConfigurationType extends PersistentConfigurationType {
  public static final String concept = "jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType";

  public TemplatePersistentConfigurationType(SNode node) {
    super(node);
  }

  public PersistentConfigurationTemplate getTemplate() {
    return this.ensureAdapter(PersistentConfigurationTemplate.class, "persistentConfiguration", this.getPersistentConfiguration());
  }

  public void setTemplate(PersistentConfigurationTemplate node) {
    this.setPersistentConfiguration(node);
  }

  public static TemplatePersistentConfigurationType newInstance(SModel sm, boolean init) {
    return (TemplatePersistentConfigurationType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplatePersistentConfigurationType newInstance(SModel sm) {
    return TemplatePersistentConfigurationType.newInstance(sm, false);
  }
}
