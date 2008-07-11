package jetbrains.mps.bootstrap.editorLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;

public class CellModel_Property_propertyDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public CellModel_Property_propertyDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property", "relationDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property", "relationDeclaration");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode editorComponent = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.bootstrap.editorLanguage.structure.BaseEditorComponent", true, false);
    SNode editedConcept = SLinkOperations.getTarget(editorComponent, "conceptDeclaration", false);
    return new SimpleSearchScope(AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1213877394546(editedConcept));
  }

}
