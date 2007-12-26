package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtyping_arrayType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  subtyping_arrayType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode arrayType) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode componentTypeSupertype : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(SLinkOperations.getTarget(arrayType, "componentType", true))) {
      if(SNodeOperations.isInstanceOf(componentTypeSupertype, "jetbrains.mps.baseLanguage.structure.Type")) {
        ListOperations.addElement(result, new QuotationClass_59().createNode(componentTypeSupertype));
      }
    }
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
