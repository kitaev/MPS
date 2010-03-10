package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.project.IModule;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;

public class JUnitConfigFromModule extends BaseConfigCreator<IModule> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromModule() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(IModule node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final IModule parameter) {
    if (ListSequence.fromList(TestRunUtil.getModuleTests(parameter.getModuleFqName())).isEmpty()) {
      return;
    }
    final String name = parameter.getModuleFqName();
    JUnitConfigFromModule.this.setSourceElement(new MPSPsiElement(parameter));
    boolean isCompileInMPS = parameter.isCompileInMPS();
    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromModule.this.getContext().getProject(), configType.getConfigurationFactories()[0], "NewConfig") {
        @Override
        public String suggestedName() {
          return "Tests in '" + name + "'";
        }
      };
      _config.setName(name);
      _config.getStateObject().type = JUnitRunTypes.MODULE;
      _config.getStateObject().module = parameter.getModuleFqName();
      _config.getStateObject().compileInMPS = isCompileInMPS;
      JUnitConfigFromModule.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromModule clone() {
    return ((JUnitConfigFromModule) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof IModule;
  }
}
