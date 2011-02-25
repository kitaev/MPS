package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.AnnotationUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_AnnotationTarget_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_AnnotationTarget_NonTypesystemRule() {
  }

  public void applyRule(final SNode annotationInstance, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode annotationDeclaration = SLinkOperations.getTarget(annotationInstance, "annotation", false);
    SNode targetAi = null;
    for (SNode ai : SLinkOperations.getTargets(annotationDeclaration, "annotation", true)) {
      if (SLinkOperations.getTarget(ai, "annotation", false) == SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang.annotation(JDK/java.lang.annotation@java_stub)", "~Target")) {
        targetAi = ai;
        break;
      }
    }
    if (targetAi == null) {
      return;
    }
    boolean goodTarget = AnnotationUtil.accept(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(targetAi, "value", true)).first(), "value", true), SNodeOperations.as(SNodeOperations.getParent(annotationInstance), "jetbrains.mps.baseLanguage.structure.HasAnnotation"));
    if (!(goodTarget)) {
      BaseQuickFixProvider intentionProvider = null;
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(annotationInstance, "wrong target of annotation", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8695552310380242272", intentionProvider, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AnnotationInstance";
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
}
