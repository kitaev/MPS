package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class DateFormat_isPublic_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public DateFormat_isPublic_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.baseLanguage.dates.structure.DateFormat", "isPublic", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.baseLanguage.dates.structure.DateFormat", "isPublic");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return Boolean.toString(SPropertyOperations.hasValue(node, "dateFormatVisibility", "public", "public"));
  }

}
