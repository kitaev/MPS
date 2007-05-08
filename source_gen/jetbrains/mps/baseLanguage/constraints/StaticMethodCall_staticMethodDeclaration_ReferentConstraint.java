package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.constraints.ReferenceUtil;

public class StaticMethodCall_staticMethodDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  StaticMethodCall_staticMethodDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.StaticMethodCall", "baseMethodDeclaration", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.StaticMethodCall", "baseMethodDeclaration");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return (SLinkOperations.getTarget(referenceNode, "classConcept", false) != null);
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return ReferenceUtil.getMethodScope(SLinkOperations.getTarget(referenceNode, "classConcept", false), enclosingNode);
  }
  public String getNodeReferentSearchScopeDescription() {
    return "static methods from hierarchy of specified class";
  }
}
