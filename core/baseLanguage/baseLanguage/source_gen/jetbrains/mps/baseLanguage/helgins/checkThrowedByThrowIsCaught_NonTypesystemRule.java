package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class checkThrowedByThrowIsCaught_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public checkThrowedByThrowIsCaught_NonTypesystemRule() {
  }

  public void applyRule(final SNode throwStatement, final TypeCheckingContext typeCheckingContext) {
    SNode throwable = SLinkOperations.getTarget(throwStatement, "throwable", true);
    if ((throwable == null)) {
      return;
    }
    {
      final SNode ThrowableType = typeCheckingContext.typeOf(throwable, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1210182461919", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(ThrowableType, new Runnable() {

        public void run() {
          Set<SNode> throwables = new HashSet<SNode>();
          throwables.add(TypeChecker.getInstance().getEquationManager().getRepresentator(ThrowableType));
          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(ThrowableType), "jetbrains.mps.baseLanguage.structure.Type")) {
            RulesFunctions_BaseLanguage.check(typeCheckingContext, throwables, throwStatement);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1210182438695");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ThrowStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
