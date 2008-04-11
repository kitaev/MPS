package jetbrains.mps.bootstrap.editorLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_CellModel_RefCell_InferenceRule implements InferenceRule_Runtime {

  public  check_CellModel_RefCell_InferenceRule() {
  }

  public void applyRule(final SNode refCell) {
    if (!(SPropertyOperations.hasValue(SLinkOperations.getTarget(refCell, "relationDeclaration", false), "metaClass", null, null))) {
      TypeChecker.getInstance().reportTypeError(refCell, "reference link expected", "jetbrains.mps.bootstrap.editorLanguage.helgins", "1180280232711");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
