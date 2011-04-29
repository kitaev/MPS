package jetbrains.mps.debugger.java.mps;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import com.intellij.openapi.extensions.ExtensionPoint;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.openapi.extensions.Extensions;

public class RunConfigurationsInitializer_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  public RunConfigurationsInitializer_CustomApplicationPlugin() {
  }

  public void doInit() {
    ExtensionPoint<ConfigurationType> extensionPoint = Extensions.getArea(null).getExtensionPoint(ConfigurationType.CONFIGURATION_TYPE_EP);
    extensionPoint.registerExtension(new DebugMPS_Kind());
  }

  public void doDispose() {
    ExtensionPoint<ConfigurationType> extensionPoint = Extensions.getArea(null).getExtensionPoint(ConfigurationType.CONFIGURATION_TYPE_EP);
    extensionPoint.registerExtension(new DebugMPS_Kind());
  }
}
