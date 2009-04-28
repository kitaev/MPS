package jetbrains.mps.lang.structure.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;

public class ConceptDeclaration_extends_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public ConceptDeclaration_extends_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.structure.structure.ConceptDeclaration", "extends", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.structure.structure.ConceptDeclaration", "extends");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // don't allow cycling
    return new ConceptDeclarationExtendedConceptSearchScope(_context.getReferenceNode(), operationContext.getScope());
  }

}
