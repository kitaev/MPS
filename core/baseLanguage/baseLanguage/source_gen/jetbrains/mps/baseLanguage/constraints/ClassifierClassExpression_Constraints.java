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
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class ClassifierClassExpression_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_w155fn_a0a3a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "6768994795312000103");

  public ClassifierClassExpression_Constraints() {
    super("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("classifier", new BaseReferenceConstraintsDescriptor("classifier", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public boolean hasPresentation() {
            return true;
          }

          @Override
          public String getPresentation(final IOperationContext operationContext, final ReferencePresentationContext _context) {
            String nameInContext = Classifier_Behavior.call_getNestedNameInContext_8540045600162183880(_context.getParameterNode(), _context.getEnclosingNode());
            if (_context.getSmartReference()) {
              return nameInContext + ".class";
            }
            return nameInContext;
          }

          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            return new VisibleClassifiersScope(((_context.getReferenceNode() == null) ?
              _context.getEnclosingNode() :
              _context.getReferenceNode()
            ), IClassifiersSearchScope.CLASSIFFIER, operationContext.getScope());
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_w155fn_a0a3a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
