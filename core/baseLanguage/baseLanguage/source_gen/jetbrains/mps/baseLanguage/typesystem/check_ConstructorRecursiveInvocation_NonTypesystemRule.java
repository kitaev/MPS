package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.StatementList_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.ConstructorDeclaration_Behavior;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConstructorRecursiveInvocation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ConstructorRecursiveInvocation_NonTypesystemRule() {
  }

  public void applyRule(final SNode classConcept, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> constructors = new ArrayList<SNode>();
    for (SNode constructor : SLinkOperations.getTargets(classConcept, "constructor", true)) {
      if (SNodeOperations.isInstanceOf(StatementList_Behavior.call_getFirstStatement_5420652334935371934(SLinkOperations.getTarget(constructor, "body", true)), "jetbrains.mps.baseLanguage.structure.ConstructorInvocationStatement")) {
        constructors.add(constructor);
      }
    }
    List<SNode> nodesWithErrors = new ArrayList<SNode>();

    while (ListSequence.fromList(constructors).isNotEmpty()) {
      SNode current = ListSequence.fromList(constructors).getElement(0);
      List<SNode> passed = new ArrayList<SNode>();
      ListSequence.fromList(passed).addElement(current);
      boolean end = false;
      while (!(end)) {
        SNode calledConstructor = ConstructorDeclaration_Behavior.call_getThisConstructorInvocation_6018737561676809124(current);
        if (calledConstructor != null) {
          if (ListSequence.fromList(passed).contains(calledConstructor)) {
            ListSequence.fromList(nodesWithErrors).addElement(current);
            do {
              current = ConstructorDeclaration_Behavior.call_getThisConstructorInvocation_6018737561676809124(current);
              ListSequence.fromList(nodesWithErrors).addElement(current);
            } while (current != calledConstructor);
            end = true;
          }
          ListSequence.fromList(passed).addElement(calledConstructor);
          current = calledConstructor;
        } else {
          end = true;
        }
      }
      ListSequence.fromList(constructors).removeSequence(ListSequence.fromList(passed));
      ListSequence.fromList(passed).clear();
    }
    for (SNode constructor : nodesWithErrors) {
      {
        BaseQuickFixProvider intentionProvider = null;
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(constructor, "Recursive constructor invocation", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "698255809162976968", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
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
