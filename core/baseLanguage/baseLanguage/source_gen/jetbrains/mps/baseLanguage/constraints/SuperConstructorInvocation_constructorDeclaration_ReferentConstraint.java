package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class SuperConstructorInvocation_constructorDeclaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public SuperConstructorInvocation_constructorDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", "baseMethodDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", "baseMethodDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    //  just insure that dynamic reference resolve won't scan all models 
    SNode thisConcept = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false);
    SNode superClass = SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(thisConcept, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    if (superClass == null) {
      superClass = SNodeOperations.cast(SLinkOperations.getTarget(new SuperConstructorInvocation_constructorDeclaration_ReferentConstraint.QuotationClass_4345_0().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    }
    return SLinkOperations.getTargets(superClass, "constructor", true);
  }

  public static class QuotationClass_4345_0 {
    public QuotationClass_4345_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9782_0 = null;
      {
        quotedNode_9782_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9782_0 = quotedNode_9782_0;
        quotedNode1_9782_0.addReference(SReference.create("classifier", quotedNode1_9782_0, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_9782_0;
      }
      return result;
    }
  }
}
