package jetbrains.mps.lang.typesystem.constraints;

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
import jetbrains.mps.lang.typesystem.behavior.ApplicableNodeCondition_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;

public class ChildTypeRestriction_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_2b6n3q_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)", "1213104847822");

  public ChildTypeRestriction_Constraints() {
    super("jetbrains.mps.lang.typesystem.structure.ChildTypeRestriction");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("childLinkDeclaration", new BaseReferenceConstraintsDescriptor("childLinkDeclaration", this) {
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
            SNode inferenceRule = SNodeOperations.cast(SNodeOperations.getParent(_context.getReferenceNode()), "jetbrains.mps.lang.typesystem.structure.InferenceRule");
            SNode abstractConceptDeclaration = ApplicableNodeCondition_Behavior.call_getApplicableConcept_1213877307633(SLinkOperations.getTarget(inferenceRule, "applicableNode", true));
            ConceptAndSuperConceptsScope conceptScope = new ConceptAndSuperConceptsScope(abstractConceptDeclaration);
            return conceptScope;
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_2b6n3q_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}
