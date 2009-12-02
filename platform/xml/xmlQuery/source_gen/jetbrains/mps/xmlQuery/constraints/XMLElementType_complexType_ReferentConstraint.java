package jetbrains.mps.xmlQuery.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.SubnodesSearchScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;

public class XMLElementType_complexType_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints, INodeReferentSetEventHandler {
  public XMLElementType_complexType_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.xmlQuery.structure.XMLElementType", "complexType", this);
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.xmlQuery.structure.XMLElementType", "complexType", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.xmlQuery.structure.XMLElementType", "complexType");
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.xmlQuery.structure.XMLElementType", "complexType");
  }

  public void processReferentSetEvent(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, IScope scope) {
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new SubnodesSearchScope(SLinkOperations.getTarget(_context.getReferenceNode(), "schema", false));
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    return SchemaUtil.complexTypePresentation(_context.getParameterNode());
  }
}
