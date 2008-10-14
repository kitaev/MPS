package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtype_LongType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public subtype_LongType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode typeNode) {
    return ListSequence.<SNode>fromArray(SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.FloatType", null));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.LongType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
