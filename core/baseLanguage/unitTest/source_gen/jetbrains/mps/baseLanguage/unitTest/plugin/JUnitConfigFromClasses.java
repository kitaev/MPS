package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import java.util.List;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class JUnitConfigFromClasses extends BaseConfigCreator<List> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromClasses() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(List node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final List<SNode> parameter) {

    JUnitConfigFromClasses.this.setSourceElement(new MPSPsiElement<List>(parameter));

    boolean isCompileInMPS = SNodeOperations.getModel(Sequence.fromIterable(parameter).first()).getModelDescriptor().getModule().isCompileInMPS();
    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromClasses.this.getContext().getProject(), configType.getConfigurationFactories()[0], "NewConfig") {
        @Override
        public String suggestedName() {
          return "Several Test Classes";
        }
      };
      _config.setName(SPropertyOperations.getString(SNodeOperations.cast(Sequence.fromIterable(parameter).first(), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"), "name"));
      _config.getStateObject().type = JUnitRunTypes.NODE;
      _config.getStateObject().node = INamedConcept_Behavior.call_getFqName_1213877404258(Sequence.fromIterable(parameter).first());
      _config.getStateObject().compileInMPS = isCompileInMPS;
      JUnitConfigFromClasses.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromClasses clone() {
    return ((JUnitConfigFromClasses)super.clone());
  }

  protected boolean isApplicable(final Object element) {
    if (!(element instanceof List)) {
      return false;
    }
    for (Object obj : (List)element) {
      if (!(obj instanceof SNode && SNodeOperations.isInstanceOf(((SNode)obj), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))) {
        return false;
      }
    }
    return true;
  }
}
