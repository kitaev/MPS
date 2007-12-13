package jetbrains.mps.bootstrap.structureLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;

public class ConceptDeclaration_extends_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  ConceptDeclaration_extends_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration", "extends", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration", "extends");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return referenceNode != null;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    return new ConceptDeclarationExtendedConceptSearchScope(referenceNode, scope);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "don't allow cycling";
  }

}
