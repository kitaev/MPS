package jetbrains.mps.testbench.suite.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.testbench.suite.behavior.IModuleRef_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ModuleSuite_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public ModuleSuite_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.testbench.suite.structure.ModuleSuite", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.testbench.suite.structure.ModuleSuite", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return IModuleRef_Behavior.call_presentation_1280144168199745474(SLinkOperations.getTarget(node, "moduleRef", true));
  }
}
