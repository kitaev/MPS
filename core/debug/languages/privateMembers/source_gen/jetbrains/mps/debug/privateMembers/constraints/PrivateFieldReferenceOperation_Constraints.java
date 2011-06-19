package jetbrains.mps.debug.privateMembers.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleMembersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class PrivateFieldReferenceOperation_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_cgwyr9_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:c8ec5cc5-f63f-40c3-ab3e-3fbb9a638ceb(jetbrains.mps.debug.privateMembers.constraints)", "6825241477451043708");

  public PrivateFieldReferenceOperation_Constraints() {
    super("jetbrains.mps.debug.privateMembers.structure.PrivateFieldReferenceOperation");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("fieldDeclaration", new BaseReferenceConstraintsDescriptor("fieldDeclaration", this) {
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
            // fields declared in hierarhy of class specified by left expression. only applicable to expressions of classifier-type 
            SNode instance = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
            SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
            return new ClassifierVisibleMembersScope(classifierType, ((_context.getReferenceNode() == null) ?
              _context.getEnclosingNode() :
              _context.getReferenceNode()
            ), IClassifiersSearchScope.INSTANCE_FIELD) {
              @Override
              protected boolean isVisible(SNode member) {
                return !(super.isVisible(member));
              }
            };
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_cgwyr9_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
