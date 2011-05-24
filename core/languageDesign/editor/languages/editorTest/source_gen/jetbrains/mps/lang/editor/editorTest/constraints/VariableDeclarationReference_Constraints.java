package jetbrains.mps.lang.editor.editorTest.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNodePointer;

public class VariableDeclarationReference_Constraints extends ConstraintsDataHolder {
  public VariableDeclarationReference_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationReference";
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("var", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        List<SNode> result = new ArrayList<SNode>();
        for (SNode block : SNodeOperations.getAncestors(_context.getEnclosingNode(), "jetbrains.mps.lang.editor.editorTest.structure.TestBlockList", true)) {
          for (SNode child : ListSequence.fromList(SNodeOperations.getChildren(block))) {
            if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock")) {
              ListSequence.fromList(result).addElement(SNodeOperations.cast(child, "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock"));
            }
          }
        }
        return result;
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:94b1feee-20bf-48e9-9677-814a5fdcaf90(jetbrains.mps.lang.editor.editorTest.constraints)", "2340678293597344726");
      }
    });
    return result;
  }
}
