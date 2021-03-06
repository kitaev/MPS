package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ypath.behavior.TreePath_Behavior;
import jetbrains.mps.ypath.behavior.ITreePathExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;

public class IterateOperation_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_8h4ewy_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905a8(jetbrains.mps.ypath.constraints)", "1213104845582");

  public IterateOperation_Constraints() {
    super("jetbrains.mps.ypath.structure.IterateOperation");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("usedFeature", new BaseReferenceConstraintsDescriptor("usedFeature", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            SNode tpoe;
            if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.ypath.structure.TreePathOperationExpression")) {
              tpoe = _context.getEnclosingNode();
            } else {
              tpoe = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
            }
            return Sequence.fromIterable(TreePath_Behavior.call_getFeature_1213877481312(ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe), SLinkOperations.getTarget(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(tpoe), "jetbrains.mps.ypath.structure.TreePathType"), "nodeType", true))).toListSequence();
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_8h4ewy_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
