package jetbrains.mps.lang.behavior.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = new ArrayList<IModelConstraints>();

  public ConstraintsDescriptor() {
    this.myConstraints.add(new ConceptBehavior_name_PropertyConstraint());
    this.myConstraints.add(new ConceptBehavior_defaultConcreteConcept_ReferentConstraint());
    this.myConstraints.add(new ConceptMethodDeclaration_overriddenMethod_ReferentConstraint());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }

}
