package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.baseLanguage.behavior.StatementList_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class check_CaughtWasThrown_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_CaughtWasThrown_NonTypesystemRule() {
  }

  public void applyRule(final SNode catchClause, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode caughtType = SLinkOperations.getTarget(SLinkOperations.getTarget(catchClause, "throwable", true), "type", true);
    if (SNodeOperations.isInstanceOf(caughtType, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode caughtClassifier = SLinkOperations.getTarget(SNodeOperations.cast(caughtType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false);
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(caughtType, new check_CaughtWasThrown_NonTypesystemRule.QuotationClass_r5g8rc_a1a0a0a1a1a0().createNode(typeCheckingContext)) || TypeChecker.getInstance().getSubtypingManager().isSubtype(caughtType, new check_CaughtWasThrown_NonTypesystemRule.QuotationClass_r5g8rc_a1a0a0a1a1a0_0().createNode(typeCheckingContext)) || caughtClassifier == SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Exception") || caughtClassifier == SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Throwable")) {
        // ignore 
      } else {
        Set<SNode> thrown = SetSequence.fromSet(new HashSet<SNode>());
        do {
          SNode matchedNode_13ophr_b0a1a1a = SNodeOperations.getParent(catchClause);
          {
            boolean matches_13ophr_a1a0b0b0 = false;
            {
              SNode matchingNode_13ophr_a1a0b0b0 = SNodeOperations.getParent(catchClause);
              if (matchingNode_13ophr_a1a0b0b0 != null) {
                matches_13ophr_a1a0b0b0 = SModelUtil_new.isAssignableConcept(matchingNode_13ophr_a1a0b0b0.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.TryCatchStatement");
              }
            }
            if (matches_13ophr_a1a0b0b0) {
              thrown = StatementList_Behavior.call_uncaughtThrowables_3331512479731115649(SLinkOperations.getTarget(matchedNode_13ophr_b0a1a1a, "body", true), false);
              break;
            }
          }
          {
            boolean matches_13ophr_b1a0b0b0 = false;
            {
              SNode matchingNode_13ophr_b1a0b0b0 = SNodeOperations.getParent(catchClause);
              if (matchingNode_13ophr_b1a0b0b0 != null) {
                matches_13ophr_b1a0b0b0 = SModelUtil_new.isAssignableConcept(matchingNode_13ophr_b1a0b0b0.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.TryStatement");
              }
            }
            if (matches_13ophr_b1a0b0b0) {
              thrown = StatementList_Behavior.call_uncaughtThrowables_3331512479731115649(SLinkOperations.getTarget(matchedNode_13ophr_b0a1a1a, "body", true), false);
              break;
            }
          }
        } while (false);

        if (!(SetSequence.fromSet(thrown).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode t) {
            return TypeChecker.getInstance().getSubtypingManager().isSubtype(new check_CaughtWasThrown_NonTypesystemRule.QuotationClass_r5g8rc_a0a0a0a0a0a3a0b0b0a().createNode(t, typeCheckingContext), caughtType) || TypeChecker.getInstance().getSubtypingManager().isSubtype(caughtType, new check_CaughtWasThrown_NonTypesystemRule.QuotationClass_r5g8rc_a1a0a0a0a0a3a0b0b0a().createNode(t, typeCheckingContext));
          }
        }))) {
          {
            BaseQuickFixProvider intentionProvider = null;
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(SLinkOperations.getTarget(catchClause, "throwable", true), "Caught exception " + caughtType + " is never thrown in the corresponding try block", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8512491756795014519", intentionProvider, errorTarget);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.CatchClause";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_r5g8rc_a1a0a0a1a1a0 {
    public QuotationClass_r5g8rc_a1a0a0a1a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~RuntimeException")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~RuntimeException")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r5g8rc_a1a0a0a1a1a0_0 {
    public QuotationClass_r5g8rc_a1a0a0a1a1a0_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Error")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Error")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r5g8rc_a0a0a0a0a0a3a0b0b0a {
    public QuotationClass_r5g8rc_a0a0a0a0a0a3a0b0b0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r5g8rc_a1a0a0a0a0a3a0b0b0a {
    public QuotationClass_r5g8rc_a1a0a0a0a0a3a0b0b0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
