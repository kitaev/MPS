package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = new ArrayList<IModelConstraints>();

  public ConstraintsDescriptor() {
    this.myConstraints.add(new TreeNodeKindProperty_default_PropertyConstraint());
    this.myConstraints.add(new IFeature_default_PropertyConstraint());
    this.myConstraints.add(new MatchPropertyOperation_property_ReferentConstraint());
    this.myConstraints.add(new TreePathAspect_defaultFeature_ReferentConstraint());
    this.myConstraints.add(new IterateOperation_usedFeature_ReferentConstraint());
    this.myConstraints.add(new IFeature_opposite_ReferentConstraint());
    this.myConstraints.add(new TreePathAdapterExpression_treepathAspect_ReferentConstraint());
    this.myConstraints.add(new TreeNodeKindReference_treeNodeKind_ReferentConstraint());
    this.myConstraints.add(new TreeNodeKindOccurrence_nodeKind_ReferentConstraint());
    this.myConstraints.add(new NodeKindSpecificCase_treeNodeKind_ReferentConstraint());
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
