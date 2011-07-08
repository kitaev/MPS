package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import java.util.List;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.junit.RuntimeConfigurationProducer;
import com.intellij.openapi.extensions.ExtensionPoint;
import com.intellij.openapi.extensions.Extensions;

public class LegacyRunConfigurationsProvider_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private List<ConfigurationType> myConfigurationKinds = ListSequence.fromList(new ArrayList<ConfigurationType>());
  private List<RuntimeConfigurationProducer> myConfigurationCreators = ListSequence.fromList(new ArrayList<RuntimeConfigurationProducer>());

  public LegacyRunConfigurationsProvider_CustomApplicationPlugin() {
  }

  public void doInit() {
    // register kinds 
    ExtensionPoint<ConfigurationType> kindsExtensionPoint = Extensions.getArea(null).getExtensionPoint(ConfigurationType.CONFIGURATION_TYPE_EP);
    {
      JavaApplication_ConfigurationType configurationKind = new JavaApplication_ConfigurationType();
      ListSequence.fromList(LegacyRunConfigurationsProvider_CustomApplicationPlugin.this.myConfigurationKinds).addElement(configurationKind);
      kindsExtensionPoint.registerExtension(configurationKind);
    }
    // register foreign factories 
    // register creators 
  }

  public void doDispose() {
    ExtensionPoint<RuntimeConfigurationProducer> creatorsExtensionPoint = Extensions.getArea(null).getExtensionPoint(RuntimeConfigurationProducer.RUNTIME_CONFIGURATION_PRODUCER);
    for (RuntimeConfigurationProducer configurationCreator : ListSequence.fromList(LegacyRunConfigurationsProvider_CustomApplicationPlugin.this.myConfigurationCreators).reversedList()) {
      creatorsExtensionPoint.unregisterExtension(configurationCreator);
    }
    ListSequence.fromList(LegacyRunConfigurationsProvider_CustomApplicationPlugin.this.myConfigurationCreators).clear();
    ExtensionPoint<ConfigurationType> kindsExtensionPoint = Extensions.getArea(null).getExtensionPoint(ConfigurationType.CONFIGURATION_TYPE_EP);
    for (ConfigurationType configurationKind : ListSequence.fromList(LegacyRunConfigurationsProvider_CustomApplicationPlugin.this.myConfigurationKinds).reversedList()) {
      kindsExtensionPoint.unregisterExtension(configurationKind);
    }
    ListSequence.fromList(LegacyRunConfigurationsProvider_CustomApplicationPlugin.this.myConfigurationKinds).clear();
  }
}
