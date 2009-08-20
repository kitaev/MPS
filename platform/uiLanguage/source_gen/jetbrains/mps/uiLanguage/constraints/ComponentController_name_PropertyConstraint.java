package jetbrains.mps.uiLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ComponentController_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {
  public ComponentController_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.uiLanguage.structure.ComponentController", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.uiLanguage.structure.ComponentController", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "component", false), "name") + "_Controller";
  }
}
