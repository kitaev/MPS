package jetbrains.mps.baseLanguage.dates.internal.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Month_alias_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public Month_alias_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.baseLanguage.dates.internal.structure.Month", "alias", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.baseLanguage.dates.internal.structure.Month", "alias");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return SPropertyOperations.getString(node, "name");
  }

}
