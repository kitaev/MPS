package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_ConceptMethodCall_InferenceRule implements InferenceRule_Runtime {

  public typeof_Node_ConceptMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode conceptMethodCall) {
    if (!((SLinkOperations.getTarget(conceptMethodCall, "conceptMethodDeclaration", false) != null))) {
      TypeChecker.getInstance().reportTypeError(conceptMethodCall, "no method declaration", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179410829052");
    }
    int actCount = SLinkOperations.getCount(conceptMethodCall, "actualArgument");
    int expCount = SLinkOperations.getCount(SLinkOperations.getTarget(conceptMethodCall, "conceptMethodDeclaration", false), "parameter");
    if (!(actCount == expCount)) {
      TypeChecker.getInstance().reportTypeError(conceptMethodCall, "Wrong parameters number: expected " + expCount + ", actual " + actCount, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179410886099");
    }
    {
      SNode arg;
      SNode parameter;
      Iterator<SNode> arg_iterator = SLinkOperations.getTargets(conceptMethodCall, "actualArgument", true).iterator();
      Iterator<SNode> parameter_iterator = SLinkOperations.getTargets(SLinkOperations.getTarget(conceptMethodCall, "conceptMethodDeclaration", false), "parameter", true).iterator();
      while (true) {
        if (!(arg_iterator.hasNext())) {
          break;
        }
        if (!(parameter_iterator.hasNext())) {
          break;
        }
        arg = arg_iterator.next();
        parameter = parameter_iterator.next();
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(arg, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179411075565", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179411084134", true), arg, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179411081637", false, 0);
      }
    }
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(conceptMethodCall, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179410528345", true), SLinkOperations.getTarget(SLinkOperations.getTarget(conceptMethodCall, "conceptMethodDeclaration", false), "returnType", true), conceptMethodCall, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179410535708");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
