package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.build.generictasks.behavior.BuiltInTaskDeclaration_Behavior;
import jetbrains.mps.build.generictasks.behavior.AttributeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.build.generictasks.behavior.ITaskDeclaration_Behavior;

public class TaskCall_declaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints, INodeReferentSetEventHandler {
  public TaskCall_declaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration", this);
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration");
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.build.generictasks.structure.TaskCall", "declaration");
  }

  public void processReferentSetEvent(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, IScope scope) {
    for (SNode attrDecl : BuiltInTaskDeclaration_Behavior.call_getAttributesDeaclarations_353793545802644071(newReferentNode)) {
      if (AttributeDeclaration_Behavior.call_isRequired_353793545802643811(attrDecl)) {
        SNode attr = SConceptOperations.createNewNode("jetbrains.mps.build.generictasks.structure.Attribute", null);
        SLinkOperations.setTarget(attr, "attributeDeclaration", attrDecl, false);
        SLinkOperations.addChild(referenceNode, "atributes", attr);
      }
    }
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> declarations = SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.build.generictasks.structure.ITaskDeclaration");
    if (!(SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"))) {
      return new SimpleSearchScope(ListSequence.fromList(declarations).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ITaskDeclaration_Behavior.call_canBeRootTask_1449762848926780427(it);
        }
      }).toListSequence());
    }
    return ITaskDeclaration_Behavior.call_getPossibleNesteds_1449762848926780436(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false), declarations);
  }
}
