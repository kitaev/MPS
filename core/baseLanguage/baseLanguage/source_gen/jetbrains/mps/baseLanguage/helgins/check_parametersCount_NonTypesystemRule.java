package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_parametersCount_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_parametersCount_NonTypesystemRule() {
  }

  public void applyRule(final SNode iMethodCall) {
    SNode baseMethodDeclaration = SLinkOperations.getTarget(iMethodCall, "baseMethodDeclaration", false);
    boolean b = true;
    List<SNode> parameterDeclarations = SLinkOperations.getTargets(baseMethodDeclaration, "parameter", true);
    List<SNode> actualArguments = SLinkOperations.getTargets(iMethodCall, "actualArgument", true);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ListSequence.fromList(parameterDeclarations).last(), "type", true), "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
      b = ListSequence.fromList(parameterDeclarations).count() - 1 <= ListSequence.fromList(actualArguments).count();
    } else
    {
      b = ListSequence.fromList(parameterDeclarations).count() == ListSequence.fromList(actualArguments).count();
    }
    if (!(b)) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(iMethodCall, "wrong number of parameters", "jetbrains.mps.baseLanguage.helgins@3_0", "1221216070847", intentionProvider);
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(baseMethodDeclaration, "typeVariableDeclaration", true)).count() > 0) {
      for(SNode actual : actualArguments) {
        TypeChecker.getInstance().getRuntimeSupport().addDependencyForCurrent(actual);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.IMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
