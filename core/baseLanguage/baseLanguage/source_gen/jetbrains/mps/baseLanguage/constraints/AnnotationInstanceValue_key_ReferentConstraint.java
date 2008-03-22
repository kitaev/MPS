package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class AnnotationInstanceValue_key_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  AnnotationInstanceValue_key_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue", "key", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue", "key");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SNode parent = _context.getEnclosingNode();
    if (SLinkOperations.getTarget(parent, "annotation", false) != null) {
      ListOperations.addAllElements(result, SLinkOperations.getTargets(SLinkOperations.getTarget(parent, "annotation", false), "method", true));
    }
    return new SimpleSearchScope(result);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
