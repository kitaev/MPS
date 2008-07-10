package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_AssertStatement_InferenceRule implements InferenceRule_Runtime {

  public typeOf_AssertStatement_InferenceRule() {
  }

  public void applyRule(final SNode assertStatement) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(assertStatement, "condition", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.bootstrap.helgins.helgins", "1178271601478", true), new QuotationClass_1().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.helgins.helgins", "1178271610359", false, 0);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.AssertStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
