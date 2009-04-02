package jetbrains.mps.lang.smodel.generator.baseLanguage.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.SModelLanguageUtil;
import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.structure.OperationParm_Concept;
import jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.lang.structure.behavior.EnumerationDataTypeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;

public class QueriesUtil {

  public static boolean nodeOp_noParm_conceptList(SNode op) {
    Object parm = SModelLanguageUtil.findNodeOperationParameter(((SNodeOperation)SNodeOperations.getAdapter(op)), OperationParm_Concept.class);
    if (parm != null) {
      return true;
    }
    parm = SModelLanguageUtil.findNodeOperationParameter(((SNodeOperation)SNodeOperations.getAdapter(op)), OperationParm_ConceptList.class);
    return parm == null;
  }

  public static boolean nodeOp_hasParm_conceptList(SNode op) {
    Object parm = SModelLanguageUtil.findNodeOperationParameter(((SNodeOperation)SNodeOperations.getAdapter(op)), OperationParm_Concept.class);
    if (parm != null) {
      return false;
    }
    parm = SModelLanguageUtil.findNodeOperationParameter(((SNodeOperation)SNodeOperations.getAdapter(op)), OperationParm_ConceptList.class);
    return parm != null;
  }

  public static boolean isProperty_hasValueEnum_notNullDefaultValue(SNode op, ITemplateGenerator generator) {
    SNode dataTypeDeclaration = jetbrains.mps.lang.smodel.behavior.SModelLanguageUtil.getDatatypeFromLeft_SPropertyAccess(op);
    SNode defMember = EnumerationDataTypeDeclaration_Behavior.call_getDefaultMember_1213877397785(SNodeOperations.cast(dataTypeDeclaration, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration"));
    return SPropertyOperations.getString(defMember, "internalValue") != null;
  }

  public static boolean isProperty_hasValueEnum_nullDefaultValue(SNode op, ITemplateGenerator generator) {
    SNode datatype = jetbrains.mps.lang.smodel.behavior.SModelLanguageUtil.getDatatypeFromLeft_SPropertyAccess(op);
    SNode defMemberNode = EnumerationDataTypeDeclaration_Behavior.call_getDefaultMember_1213877397785(SNodeOperations.cast(datatype, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration"));
    return SPropertyOperations.getString(defMemberNode, "internalValue") == null;
  }

  public static String getConceptFqName(SNode concept) {
    return NameUtil.nodeFQName(concept);
  }

}
