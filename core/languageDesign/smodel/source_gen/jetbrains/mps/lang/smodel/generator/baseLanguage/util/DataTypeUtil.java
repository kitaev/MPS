package jetbrains.mps.lang.smodel.generator.baseLanguage.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.behavior.EnumerationDataTypeDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DataTypeUtil {
  public DataTypeUtil() {
  }

  public static SNode getDefaultMember(SNode enumDatatype) {
    SNode defMember = EnumerationDataTypeDeclaration_Behavior.call_getDefaultMember_1213877397785(enumDatatype);
    if (defMember != null) {
      return defMember;
    }
    return ListSequence.fromList(SLinkOperations.getTargets(enumDatatype, "member", true)).first();
  }
}
