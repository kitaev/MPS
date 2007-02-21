package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS  */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.ISearchScope;

public class LocalStaticMethodCall_staticMethodDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  LocalStaticMethodCall_staticMethodDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall", "baseMethodDeclaration", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall", "baseMethodDeclaration");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return (SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null);
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return ReferenceUtil.getMethodScope(SNodeOperations.getAncestor(enclosingNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
  }
  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }
}
