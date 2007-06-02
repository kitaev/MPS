package jetbrains.mps.baseLanguage.unitTest.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class TestMethod_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public  TestMethod_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", "name", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", "name");
  }
  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return "test_" + SPropertyOperations.getString(node, "methodName");
  }
}
