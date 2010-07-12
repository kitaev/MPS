package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import java.util.List;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;

public class JUnitConfigFromMethods extends BaseConfigCreator<List> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromMethods() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(List node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final List<SNode> parameter) {
    JUnitConfigFromMethods.this.setSourceElement(new MPSPsiElement(parameter));

    List<String> methodNames = ListSequence.fromList(new ArrayList<String>());
    List<String> nodeNames = ListSequence.fromList(new ArrayList<String>());
    for (SNode method : parameter) {
      ListSequence.fromList(methodNames).addElement(ITestMethod_Behavior.call_getTestName_1216136419751(method));
      if (ListSequence.fromList(nodeNames).contains(INamedConcept_Behavior.call_getFqName_1213877404258(ITestMethod_Behavior.call_getTestCase_1216134500045(method)))) {
        continue;
      }
      ListSequence.fromList(nodeNames).addElement(INamedConcept_Behavior.call_getFqName_1213877404258(ITestMethod_Behavior.call_getTestCase_1216134500045(method)));
    }

    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromMethods.this.getContext().getProject(), findFactory(configType, "DefaultJUnit"), "NewConfig") {
        @Override
        public String suggestedName() {
          return "Several Test Methods";
        }
      };
      _config.setName(ITestMethod_Behavior.call_getTestName_1216136419751(Sequence.fromIterable(parameter).first()) + ",...");
      _config.getStateObject().type = JUnitRunTypes.METHOD;
      _config.getStateObject().methods = new ClonableList<String>(methodNames);
      _config.getStateObject().nodes = new ClonableList<String>(nodeNames);
      JUnitConfigFromMethods.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromMethods clone() {
    return ((JUnitConfigFromMethods) super.clone());
  }

  protected boolean isApplicable(final Object element) {
    if (!(element instanceof List)) {
      return false;
    }
    for (Object obj : (List) element) {
      if (!(obj instanceof SNode && SNodeOperations.isInstanceOf(((SNode) obj), "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"))) {
        return false;
      }
    }
    return true;
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
