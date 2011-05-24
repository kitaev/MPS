package jetbrains.mps.lang.actions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class SubstituteNodeBuilderVariableReference_Constraints extends ConstraintsDataHolder {
  public SubstituteNodeBuilderVariableReference_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.actions.structure.SubstituteNodeBuilderVariableReference";
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("variableDeclaration", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        SNode builder = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.actions.structure.NodeSubstituteActionsBuilder", false, false);
        List<SNode> vars = new ArrayList<SNode>();
        if (builder != null) {
          ListSequence.fromList(vars).addSequence(ListSequence.fromList(SLinkOperations.getTargets(builder, "variable", true)));
        }
        return vars;
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:00000000-0000-4000-0000-011c895902a4(jetbrains.mps.lang.actions.constraints)", "1213104855839");
      }
    });
    return result;
  }
}
