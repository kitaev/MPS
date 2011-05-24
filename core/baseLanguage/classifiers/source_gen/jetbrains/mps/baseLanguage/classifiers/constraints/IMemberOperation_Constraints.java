package jetbrains.mps.baseLanguage.classifiers.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.classifiers.behavior.BaseClassifierType_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNodePointer;

public class IMemberOperation_Constraints extends ConstraintsDataHolder {
  public IMemberOperation_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation";
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("member", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        SNode operand = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
        List<SNode> applicableMembers = new ArrayList<SNode>();
        {
          IMatchingPattern pattern_dyvyal_c0a0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType");
          SNode coercedNode_dyvyal_c0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(operand), pattern_dyvyal_c0a0);
          if (coercedNode_dyvyal_c0a0 != null) {
            for (SNode member : BaseClassifierType_Behavior.call_getMembers_1213877402148(coercedNode_dyvyal_c0a0, _context.getEnclosingNode())) {
              if (SNodeOperations.isInstanceOf(member, NameUtil.nodeFQName(_context.getLinkTarget())) && IMember_Behavior.call_canBeReferent_8179323502814657526(member, _context.getLinkTarget())) {
                ListSequence.fromList(applicableMembers).addElement(member);
              }
            }
          } else {
          }
        }
        return applicableMembers;
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:00000000-0000-4000-0000-011c8959036e(jetbrains.mps.baseLanguage.classifiers.constraints)", "1213104844336");
      }
    });
    return result;
  }
}
