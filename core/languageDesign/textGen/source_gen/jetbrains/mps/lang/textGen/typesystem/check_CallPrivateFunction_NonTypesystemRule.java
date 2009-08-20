package jetbrains.mps.lang.textGen.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_CallPrivateFunction_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_CallPrivateFunction_NonTypesystemRule() {
  }

  public void applyRule(final SNode privateFunctionCall, final TypeCheckingContext typeCheckingContext) {
    SNode baseMethodDeclaration = SLinkOperations.getTarget(privateFunctionCall, "function", false);
    boolean b = true;
    List<SNode> parameterDeclarations = SLinkOperations.getTargets(baseMethodDeclaration, "parameter", true);
    List<SNode> actualArguments = SLinkOperations.getTargets(privateFunctionCall, "parameter", true);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ListSequence.fromList(parameterDeclarations).last(), "type", true), "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
      b = ListSequence.fromList(parameterDeclarations).count() - 1 <= ListSequence.fromList(actualArguments).count();
    } else {
      b = ListSequence.fromList(parameterDeclarations).count() == ListSequence.fromList(actualArguments).count();
    }
    if (!(b)) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(privateFunctionCall, "wrong number of parameters", "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "1234529496730", intentionProvider, errorTarget);
      }
    }
    if (SLinkOperations.getCount(baseMethodDeclaration, "typeVariableDeclaration") > 0) {
      for (SNode actual : actualArguments) {
        typeCheckingContext.addDependencyForCurrent(actual);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.textGen.structure.UtilityMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
