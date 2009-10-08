package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_AnonymousClassHasConstructorDeclaration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_AnonymousClassHasConstructorDeclaration_NonTypesystemRule() {
  }

  public void applyRule(final SNode anonymousClass, final TypeCheckingContext typeCheckingContext) {
    SNode constructorDeclaration = SLinkOperations.getTarget(anonymousClass, "baseMethodDeclaration", false);
    if ((constructorDeclaration == null)) {
      {
        BaseIntentionProvider intentionProvider = null;
        intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.typesystem.ChooseAppropriateMethodDeclaration_QuickFix", true);
        intentionProvider.putArgument("classifier", SLinkOperations.getTarget(anonymousClass, "classifier", false));
        intentionProvider.putArgument("methodCall", anonymousClass);
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(anonymousClass, "no method declaration", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746295084", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
