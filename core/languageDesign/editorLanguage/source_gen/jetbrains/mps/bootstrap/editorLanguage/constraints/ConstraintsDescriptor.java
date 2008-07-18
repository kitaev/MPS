package jetbrains.mps.bootstrap.editorLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = new ArrayList<IModelConstraints>();

  public ConstraintsDescriptor() {
    this.myConstraints.add(new ConceptEditorDeclaration_name_PropertyConstraint());
    this.myConstraints.add(new CellModel_Component_editorComponent_ReferentConstraint());
    this.myConstraints.add(new QueryMethodIdEditorProviderExpression_queryIdProperty_ReferentConstraint());
    this.myConstraints.add(new CellMenuComponentFeature_Link_linkDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellModel_RefCell_linkDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellModel_Property_propertyDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellMenuComponentFeature_Property_propertyDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellModel_WithRole_relationDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellMenuPart_ReplaceNode_CustomNodeConcept_replacementConcept_ReferentConstraint());
    this.myConstraints.add(new CellModel_RefNodeList_linkDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellModel_RefNode_linkDeclaration_ReferentConstraint());
    this.myConstraints.add(new CellModel_TransactionalProperty_property_ReferentConstraint());
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
