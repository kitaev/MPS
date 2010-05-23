package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.build.generictasks.behavior.TaskCall_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.build.generictasks.behavior.ITaskDeclaration_Behavior;

public class Attribute_attributeDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints, INodeReferentSetEventHandler {
  public Attribute_attributeDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.build.generictasks.structure.Attribute", "attributeDeclaration", this);
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.build.generictasks.structure.Attribute", "attributeDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.build.generictasks.structure.Attribute", "attributeDeclaration");
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.build.generictasks.structure.Attribute", "attributeDeclaration");
  }

  public void processReferentSetEvent(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, IScope scope) {
    SLinkOperations.setTarget(referenceNode, "value", SLinkOperations.getTarget(newReferentNode, "default", true), true);
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    final SNode taskCall = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall", true, false);
    return new DefaultSearchScope(TaskCall_Behavior.call_getUndefinedAttributes_353793545802643943(taskCall)) {
      @Override
      public boolean isInScope(SNode node) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.generictasks.structure.AttributeDeclaration"))) {
          return false;
        }
        return ListSequence.fromList(ITaskDeclaration_Behavior.call_getAttributesDeclarations_1190349257898147625(SLinkOperations.getTarget(taskCall, "declaration", false))).contains(SNodeOperations.cast(node, "jetbrains.mps.build.generictasks.structure.AttributeDeclaration"));
      }
    };
  }
}
