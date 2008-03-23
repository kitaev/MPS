package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_WhenConcreteStatement_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public  check_WhenConcreteStatement_NonTypesystemRule() {
  }

  public void applyRule(final SNode whenConcreteStatement) {
    if (!(RulesUtil.withinInferenceItem(whenConcreteStatement))) {
      TypeChecker.getInstance().reportTypeError(whenConcreteStatement, "WHEN CONCRETE should be used only within inference rules", "jetbrains.mps.bootstrap.helgins.helgins", "1195223608203");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.WhenConcreteStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
