package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new TreeNodeKindProperty_default_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new IFeature_default_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ListFeature_writable_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SequenceFeature_writable_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new GenericFeature_writable_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new GenericParamFeature_writable_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new MatchPropertyOperation_property_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new TreePathAspect_defaultFeature_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new IterateOperation_usedFeature_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new IFeature_opposite_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new TreePathAdapterExpression_treepathAspect_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new TreeNodeKindReference_treeNodeKind_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new TreeNodeKindOccurrence_nodeKind_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new NodeKindSpecificCase_treeNodeKind_ReferentConstraint());
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
