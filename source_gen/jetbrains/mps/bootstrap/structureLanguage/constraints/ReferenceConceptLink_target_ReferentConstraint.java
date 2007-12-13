package jetbrains.mps.bootstrap.structureLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ISearchScope;

public class ReferenceConceptLink_target_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  ReferenceConceptLink_target_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink", "target", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink", "target");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(referenceNode, "conceptLinkDeclaration", false), "targetType", false) != null;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    return new ReferenceConceptLinkTargetSearchScope(referenceNode, scope);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "only nodes assignable to target type specified in concept link declaration";
  }

}
