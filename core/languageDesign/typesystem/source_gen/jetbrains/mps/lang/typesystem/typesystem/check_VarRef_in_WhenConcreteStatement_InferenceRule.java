package jetbrains.mps.lang.typesystem.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VarRef_in_WhenConcreteStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public check_VarRef_in_WhenConcreteStatement_InferenceRule() {
  }

  public void applyRule(final SNode variableReference, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode ancestor = SNodeOperations.getAncestor(variableReference, "jetbrains.mps.lang.typesystem.structure.WhenConcreteStatement", false, false);
    if (ancestor != null) {
      SNode argument = SLinkOperations.getTarget(ancestor, "argument", true);
      SNode parent = variableReference;
      while (parent != null && parent != ancestor) {
        if (parent == argument) {
          return;
        } else {
          parent = SNodeOperations.getParent(parent);
        }
      }
      SNode variableDeclaration = SLinkOperations.getTarget(variableReference, "variableDeclaration", false);
      if (SNodeOperations.isInstanceOf(variableDeclaration, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(variableDeclaration, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
        return;
      }
      if (variableDeclaration != null && !(ListSequence.fromList(SNodeOperations.getAncestors(variableDeclaration, "jetbrains.mps.lang.typesystem.structure.WhenConcreteStatement", false)).contains(ancestor))) {
        if (!(SPropertyOperations.getBoolean(variableDeclaration, "isFinal"))) {
          BaseQuickFixProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(variableReference, "variable is used inside WHEN CONCRETE block. should be declared final", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "1185875417873", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.VariableReference";
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
