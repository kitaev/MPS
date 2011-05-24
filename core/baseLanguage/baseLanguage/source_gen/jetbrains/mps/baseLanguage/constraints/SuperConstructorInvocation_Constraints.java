package jetbrains.mps.baseLanguage.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class SuperConstructorInvocation_Constraints extends ConstraintsDataHolder {
  public SuperConstructorInvocation_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation";
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("baseMethodDeclaration", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        //  just insure that dynamic reference resolve won't scan all models 
        SNode thisConcept = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false);
        SNode superClass = SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(thisConcept, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
        if (superClass == null) {
          superClass = SNodeOperations.cast(SLinkOperations.getTarget(new SuperConstructorInvocation_Constraints.QuotationClass_6sxar7_a0a0a0a3a2a0b0a1a1().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
        }
        return SLinkOperations.getTargets(superClass, "constructor", true);
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)", "1213104847241");
      }
    });
    return result;
  }

  public static class QuotationClass_6sxar7_a0a0a0a3a2a0b0a1a1 {
    public QuotationClass_6sxar7_a0a0a0a3a2a0b0a1a1() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
