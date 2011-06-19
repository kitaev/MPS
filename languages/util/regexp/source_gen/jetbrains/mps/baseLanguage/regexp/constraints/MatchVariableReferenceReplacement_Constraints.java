package jetbrains.mps.baseLanguage.regexp.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.regexp.behavior.Regexp_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class MatchVariableReferenceReplacement_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_v9mr27_a0a3a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590515(jetbrains.mps.baseLanguage.regexp.constraints)", "3796137614137558194");

  public MatchVariableReferenceReplacement_Constraints() {
    super("jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("match", new BaseReferenceConstraintsDescriptor("match", this) {
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
            return (_context.getSmartReference() ?
              "\\" + SPropertyOperations.getString(_context.getParameterNode(), "name") :
              SPropertyOperations.getString(_context.getParameterNode(), "name")
            );
          }

          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            List<SNode> matches = new ArrayList<SNode>();
            SNode top = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation", true, false);
            if ((top != null)) {
              Regexp_Behavior.call_getString_1222432436326(SLinkOperations.getTarget(top, "search", true), matches);
            }
            return matches;
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_v9mr27_a0a3a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
