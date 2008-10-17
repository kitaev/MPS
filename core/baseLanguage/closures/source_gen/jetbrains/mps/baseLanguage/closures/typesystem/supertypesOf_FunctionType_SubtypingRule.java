package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.Collections;
import jetbrains.mps.baseLanguage.closures.behavior.FunctionType_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_FunctionType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_FunctionType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ft) {
    List<SNode> supertypes = Collections.emptyList();
    String rtSig = "_FunctionTypes." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(ft);
    List<SNode> interfaces = RulesUtil_Closures.getInterfaces();
    for(SNode ice : interfaces) {
      if (rtSig.equals(SPropertyOperations.getString(ice, "name"))) {
        SNode ct = new _Quotations.QuotationClass_1().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", SNodeOperations.copyNode(SLinkOperations.getTarget(ft, "resultType", true)));
        }
        for(SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", SNodeOperations.copyNode(pt));
        }
        supertypes = Collections.singletonList(ct);
        break;
      }
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
