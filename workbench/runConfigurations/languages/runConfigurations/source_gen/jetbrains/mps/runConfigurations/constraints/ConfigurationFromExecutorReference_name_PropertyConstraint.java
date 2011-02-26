package jetbrains.mps.runConfigurations.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.runConfigurations.behavior.ConfigurationFromExecutorReference_Behavior;

public class ConfigurationFromExecutorReference_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public ConfigurationFromExecutorReference_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.runConfigurations.structure.ConfigurationFromExecutorReference", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.runConfigurations.structure.ConfigurationFromExecutorReference", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return SPropertyOperations.getString(ConfigurationFromExecutorReference_Behavior.call_getExecutor_7806358006983757897(node), "configurationName");
  }
}
