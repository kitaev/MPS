package jetbrains.mps.bootstrap.helgins.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.EmptySearchScope;
import java.util.List;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.behavior.LinkDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SimpleRule_ProcedureCall_actualArgumentsLink_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public SimpleRule_ProcedureCall_actualArgumentsLink_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.helgins.structure.SimpleRule_ProcedureCall", "actualArgumentsLink", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.helgins.structure.SimpleRule_ProcedureCall", "actualArgumentsLink");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    Object searchScopeOrListOfNodes = this.createSearchScopeOrListOfNodes(operationContext, _context);
    if (searchScopeOrListOfNodes == null) {
      return new EmptySearchScope();
    }
    if (searchScopeOrListOfNodes instanceof ISearchScope) {
      return (ISearchScope)searchScopeOrListOfNodes;
    }
    if (searchScopeOrListOfNodes instanceof List) {
      return new SimpleSearchScope((List)searchScopeOrListOfNodes);
    }
    if (searchScopeOrListOfNodes instanceof Iterable) {
      return new SimpleSearchScope(CollectionUtil.iterableAsList((Iterable)searchScopeOrListOfNodes));
    }
    throw new RuntimeException("unexpected type in search-scope provider " + searchScopeOrListOfNodes.getClass());
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode conceptDeclaration = SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getReferenceNode(), "conceptReference", true), "concept", false);
    if ((conceptDeclaration != null)) {
      List<SNode> aggregationLinkDeclarations = AbstractConceptDeclaration_Behavior.call_getAggregationLinkDeclarations_1213877394521(conceptDeclaration);
      List<SNode> result = new ArrayList<SNode>();
      for(SNode ld : aggregationLinkDeclarations) {
        if (!(LinkDeclaration_Behavior.call_isSingular_1213877254557(ld))) {
          ListSequence.fromList(result).addElement(ld);
        }
      }
      return result;
    }
    return new ArrayList<SNode>();
  }

}
