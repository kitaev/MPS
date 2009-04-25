package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.behavior.FunctionType_Behavior;
import jetbrains.mps.baseLanguage.closures.behavior.RuntimeUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_FunctionType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_FunctionType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ft) {
    List<SNode> supertypes = ListSequence.fromList(new ArrayList<SNode>());
    String rtSig = FunctionType_Behavior.call_getRuntimeClassName_1230472987259(ft) + "." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(ft);
    SNode ice = RuntimeUtils.getRuntimeClassifiersMap().get(rtSig);
    if (SNodeOperations.isInstanceOf(ice, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode ct = new _Quotations.QuotationClass_4().createNode(ice);
      if ((FunctionType_Behavior.call_getResultType_1230475757059(ft) != null)) {
        SLinkOperations.addChild(ct, "parameter", SNodeOperations.copyNode(FunctionType_Behavior.call_getResultType_1230475757059(ft)));
      }
      for(SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
        SLinkOperations.addChild(ct, "parameter", SNodeOperations.copyNode(pt));
      }
      supertypes = ListSequence.fromList(new ArrayList<SNode>());
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

}
