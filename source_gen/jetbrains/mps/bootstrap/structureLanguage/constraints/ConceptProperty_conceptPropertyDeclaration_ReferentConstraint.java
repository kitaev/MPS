package jetbrains.mps.bootstrap.structureLanguage.constraints;

/*Generated by MPS  */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.SModelSearchUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class ConceptProperty_conceptPropertyDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  ConceptProperty_conceptPropertyDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.structureLanguage.structure.ConceptProperty", "conceptPropertyDeclaration", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.structureLanguage.structure.ConceptProperty", "conceptPropertyDeclaration");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    SNode enclosingConcept = SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration", true, false);
    return SModelSearchUtil_new.createConceptHierarchyScope(((ConceptDeclaration)SNodeOperations.getAdapter(enclosingConcept)));
  }
  public String getNodeReferentSearchScopeDescription() {
    return "concept properties declared in hierarchy of enclosing concept";
  }
}
