package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class NodeKindSpecificCase_treeNodeKind_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  NodeKindSpecificCase_treeNodeKind_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.NodeKindSpecificCase", "treeNodeKind", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.ypath.structure.NodeKindSpecificCase", "treeNodeKind");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return new SimpleSearchScope(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(enclosingNode, "nodeExpression", true), "treepathAspect", false), "nodeKinds", true));
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
