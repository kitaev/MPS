package jetbrains.mps.lang.editor.constraints;

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
import jetbrains.mps.lang.editor.behavior.AbstractComponent_Behavior;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.SNodePointer;

public class CellMenuComponentFeature_Link_Constraints extends ConstraintsDataHolder {
  public CellMenuComponentFeature_Link_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.CellMenuComponentFeature_Link";
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("relationDeclaration", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        // links declared in edited concept' hierarchy and not overridden 
        SNode editorComponent = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.editor.structure.CellMenuComponent", true, false);
        SNode editedConcept = AbstractComponent_Behavior.call_getConceptDeclaration_7055725856388417603(editorComponent);
        return AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(editedConcept);
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:00000000-0000-4000-0000-011c89590298(jetbrains.mps.lang.editor.constraints)", "1213104846220");
      }
    });
    return result;
  }
}
