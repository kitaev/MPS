package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.build.packaging.behavior.AbstractProjectComponent_Behavior;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class DefaultCustomMpsLanguageConfigurationFromMPSBuild extends BaseConfigCreator<SNode> implements Cloneable {
  private RunConfiguration myConfig;

  public DefaultCustomMpsLanguageConfigurationFromMPSBuild() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(CustomMPSConfigurationType_ConfigurationType.CONFIGURATION_TYPE_EP), CustomMPSConfigurationType_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(SNode node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final SNode parameter) {
    final Wrappers._T<SNode> layout = new Wrappers._T<SNode>();
    final Wrappers._boolean isApplicable = new Wrappers._boolean();
    final Wrappers._T<String> configurationId = new Wrappers._T<String>();
    final Wrappers._T<SNode> configuration = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        layout.value = SNodeOperations.getAncestor(parameter, "jetbrains.mps.build.packaging.structure.MPSLayout", false, true);
        isApplicable.value = (layout.value != null);
        configuration.value = ListSequence.fromList(SLinkOperations.getTargets(layout.value, "configuration", true)).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return AbstractProjectComponent_Behavior.call_included_1213877333807(parameter, it);
          }
        });
        configurationId.value = configuration.value.getId();
      }
    });
    if (!(isApplicable.value)) {
      return;
    }

    DefaultCustomMpsLanguageConfigurationFromMPSBuild.this.setSourceElement(new MPSPsiElement(parameter));
    {
      CustomMPSConfigurationType_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(CustomMPSConfigurationType_ConfigurationType.CONFIGURATION_TYPE_EP), CustomMPSConfigurationType_ConfigurationType.class);
      DefaultCustomMpsApplication_Configuration _config = new DefaultCustomMpsApplication_Configuration(DefaultCustomMpsLanguageConfigurationFromMPSBuild.this.getContext().getProject(), findFactory(configType, "DefaultCustomMpsApplication"), "NewConfig");
      _config.setName(SPropertyOperations.getString(layout.value, "name") + ".mpsbuild." + SPropertyOperations.getString(configuration.value, "name"));
      _config.getStateObject().nodeId = layout.value.getId();
      _config.getStateObject().modelId = layout.value.getModel().getModelDescriptor().getSModelReference().toString();
      _config.getStateObject().configurationId = configurationId.value;
      DefaultCustomMpsLanguageConfigurationFromMPSBuild.this.myConfig = _config;
    }
  }

  @Override
  public DefaultCustomMpsLanguageConfigurationFromMPSBuild clone() {
    return ((DefaultCustomMpsLanguageConfigurationFromMPSBuild) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof SNode && SNodeOperations.isInstanceOf(((SNode) element), "jetbrains.mps.build.custommps.structure.MPSBuild");
  }

  @Nullable
  public ConfigurationFactory findFactory(ConfigurationType configurationType, String configurationName) {
    for (ConfigurationFactory factory : Sequence.fromIterable(Sequence.fromArray(configurationType.getConfigurationFactories()))) {
      if (factory.getClass().getName().contains(configurationName)) {
        return factory;
      }
    }
    return null;
  }
}
