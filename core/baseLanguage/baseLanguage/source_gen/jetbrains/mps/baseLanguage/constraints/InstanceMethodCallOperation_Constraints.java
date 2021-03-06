package jetbrains.mps.baseLanguage.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.baseLanguage.search.InstanceMethodCall_InstanceMethodScope;

public class InstanceMethodCallOperation_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_w9prmd_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "1343296446925670997");

  public InstanceMethodCallOperation_Constraints() {
    super("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("baseMethodDeclaration", new BaseReferenceConstraintsDescriptor("baseMethodDeclaration", this) {
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
            if (!(SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"))) {
              return Sequence.fromIterable(Collections.<SNode>emptyList());
            }
            SNode instance = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
            SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
            return new InstanceMethodCall_InstanceMethodScope(classifierType, ((_context.getReferenceNode() == null) ?
              _context.getEnclosingNode() :
              _context.getReferenceNode()
            ));
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_w9prmd_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
