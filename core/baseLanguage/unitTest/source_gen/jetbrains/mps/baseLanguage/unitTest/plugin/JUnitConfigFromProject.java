package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.project.MPSProject;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import com.intellij.openapi.project.Project;

public class JUnitConfigFromProject extends BaseConfigCreator<MPSProject> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromProject() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(MPSProject node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final MPSProject parameter) {
    if (!(TestRunUtil.containsTest(parameter))) {
      return;
    }

    JUnitConfigFromProject.this.setSourceElement(new MPSPsiElement(parameter));

    final String name = parameter.getComponent(Project.class).getName();
    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromProject.this.getContext().getProject(), configType.getConfigurationFactories()[0], "NewConfig") {
        @Override
        public String suggestedName() {
          return "All Tests in Project";
        }
      };
      _config.setName(name);
      _config.getStateObject().type = JUnitRunTypes.PROJECT;
      JUnitConfigFromProject.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromProject clone() {
    return ((JUnitConfigFromProject) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof MPSProject;
  }
}
