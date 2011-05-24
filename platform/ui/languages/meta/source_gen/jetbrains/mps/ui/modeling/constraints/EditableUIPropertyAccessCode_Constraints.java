package jetbrains.mps.ui.modeling.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;

public class EditableUIPropertyAccessCode_Constraints extends ConstraintsDataHolder {
  public EditableUIPropertyAccessCode_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.ui.modeling.structure.EditableUIPropertyAccessCode";
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("property", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.as(_context.getEnclosingNode(), "jetbrains.mps.ui.modeling.structure.UIObjectTemplate"), "uiObject", false), "property", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode p) {
            return SNodeOperations.isInstanceOf(p, "jetbrains.mps.ui.modeling.structure.EditableUIProperty");
          }
        });
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:3cad8b0f-ef3c-442c-8c6f-1ab422f65805(jetbrains.mps.ui.modeling.constraints)", "8938819815716373408");
      }
    });
    return result;
  }
}
