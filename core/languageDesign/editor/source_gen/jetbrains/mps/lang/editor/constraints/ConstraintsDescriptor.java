package jetbrains.mps.lang.editor.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {
  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new ConceptEditorDeclaration_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new RGBColor_value_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_Component_editorComponent_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new QueryMethodIdEditorProviderExpression_queryIdProperty_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellMenuComponentFeature_Link_linkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_RefCell_linkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_Property_propertyDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellMenuComponentFeature_Property_propertyDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_WithRole_relationDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_RefNodeList_linkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_RefNode_linkDeclaration_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new CellModel_TransactionalProperty_property_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new NavigatableReferenceStyleClassItem_link_ReferentConstraint());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }
}
