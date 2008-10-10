package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class TreePathType_extends_SequenceType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public TreePathType_extends_SequenceType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode treepath) {
    return new QuotationClass_3().createNode(SLinkOperations.getTarget(treepath, "nodeType", true));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
