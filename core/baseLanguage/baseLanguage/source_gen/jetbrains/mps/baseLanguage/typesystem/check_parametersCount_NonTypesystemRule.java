package jetbrains.mps.baseLanguage.typesystem;

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

public class check_parametersCount_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_parametersCount_NonTypesystemRule() {
  }

  public void applyRule(final SNode iMethodCall, final TypeCheckingContext typeCheckingContext) {
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
        intentionProvider = new BaseIntentionProvider("r:d0fb6e38-80b1-42a8-8bcb-ce20474674bd(jetbrains.mps.baseLanguage.typesystem@16_0).ChooseAppropriateMethodDeclaration_QuickFix", true);
        intentionProvider.putArgument("methodCall", iMethodCall);
        intentionProvider.putArgument("classifier", SNodeOperations.getAncestor(baseMethodDeclaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false));
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(iMethodCall, "wrong number of parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1219948518456", intentionProvider, errorTarget);
      }
    }
    if (SLinkOperations.getCount(baseMethodDeclaration, "typeVariableDeclaration") > 0) {
      for(SNode actual : actualArguments) {
        typeCheckingContext.addDependencyForCurrent(actual);
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
