package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 708799270:
        return new SNodeType_BehaviorDescriptor();
      case -21375261:
        return new SPropertyAccess_BehaviorDescriptor();
      case 1617751624:
        return new SLinkAccess_BehaviorDescriptor();
      case -1568011642:
        return new SLinkListAccess_BehaviorDescriptor();
      case -2045080325:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.SNodeOperation 
        return null;
      case 1659369510:
        return new Property_SetOperation_BehaviorDescriptor();
      case 2138960647:
        return new EnumMemberReference_BehaviorDescriptor();
      case -1284314203:
        return new Link_SetNewChildOperation_BehaviorDescriptor();
      case -669504312:
        return new LinkList_AddNewChildOperation_BehaviorDescriptor();
      case -2072282085:
        return new Node_GetParentOperation_BehaviorDescriptor();
      case -1030782723:
        return new Node_IsInstanceOfOperation_BehaviorDescriptor();
      case -890616405:
        return new Node_InsertNewNextSiblingOperation_BehaviorDescriptor();
      case -652573587:
        return new Node_ReplaceWithNewOperation_BehaviorDescriptor();
      case -655788690:
        return new LinkList_AddChildOperation_BehaviorDescriptor();
      case 1064039964:
        return new LinkList_InsertChildFirstOperation_BehaviorDescriptor();
      case 566871218:
        return new Link_DeleteChildOperation_BehaviorDescriptor();
      case 195801962:
        return new Node_ReplaceWithAnotherOperation_BehaviorDescriptor();
      case -189352440:
        return new Node_DeleteOperation_BehaviorDescriptor();
      case 1357308925:
        return new SNodeTypeCastExpression_BehaviorDescriptor();
      case 643287952:
        return new Link_SetTargetOperation_BehaviorDescriptor();
      case 374660331:
        return new Node_InsertNewPrevSiblingOperation_BehaviorDescriptor();
      case 816323749:
        return new Node_InsertNextSiblingOperation_BehaviorDescriptor();
      case 2081600485:
        return new Node_InsertPrevSiblingOperation_BehaviorDescriptor();
      case -1968500615:
        return new SModelType_BehaviorDescriptor();
      case -1035139008:
        return new Node_GetModelOperation_BehaviorDescriptor();
      case -1087850432:
        return new Model_CreateNewNodeOperation_BehaviorDescriptor();
      case 734097306:
        return new Node_GetPrevSiblingOperation_BehaviorDescriptor();
      case -531179430:
        return new Node_GetNextSiblingOperation_BehaviorDescriptor();
      case 447821165:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.AbstractOperationParameter 
        return null;
      case -488554841:
        return new OperationParm_Inclusion_BehaviorDescriptor();
      case 1870753911:
        return new OperationParm_Root_BehaviorDescriptor();
      case -294852941:
        return new OperationParm_Concept_BehaviorDescriptor();
      case -1696202114:
        return new Node_CopyOperation_BehaviorDescriptor();
      case 2090665619:
        return new Node_IsRoleOperation_BehaviorDescriptor();
      case 1364605668:
        return new SNodeListType_BehaviorDescriptor();
      case 422410344:
        return new SemanticDowncastExpression_BehaviorDescriptor();
      case -1938386736:
        return new LinkList_GetCountOperation_BehaviorDescriptor();
      case -1311228862:
        return new SNodeListCreator_BehaviorDescriptor();
      case 1258112385:
        return new Node_GetNextSiblingsOperation_BehaviorDescriptor();
      case 1826985537:
        return new Node_GetPrevSiblingsOperation_BehaviorDescriptor();
      case -1671559849:
        return new Node_GetAllSiblingsOperation_BehaviorDescriptor();
      case -806434409:
        return new SConceptPropertyAccess_BehaviorDescriptor();
      case -2143284088:
        return new Property_HasValue_Enum_BehaviorDescriptor();
      case -2010715271:
        return new Property_HasValue_Simple_BehaviorDescriptor();
      case -1953990159:
        return new OperationParm_ConceptList_BehaviorDescriptor();
      case -1074572116:
        return new ConceptReference_BehaviorDescriptor();
      case -1669164802:
        return new Model_CreateNewRootNodeOperation_BehaviorDescriptor();
      case -1043058086:
        return new Node_GetAdapterOperation_BehaviorDescriptor();
      case -624033421:
        return new Node_GetDescendantsOperation_BehaviorDescriptor();
      case 184391925:
        return new Node_GetContainingRootOperation_BehaviorDescriptor();
      case -1398203659:
        return new Model_RootsOperation_BehaviorDescriptor();
      case 388587541:
        return new Model_NodesOperation_BehaviorDescriptor();
      case 972759442:
        return new Node_GetAncestorOperation_BehaviorDescriptor();
      case 787693286:
        return new Node_GetChildrenOperation_BehaviorDescriptor();
      case -1631787870:
        return new Node_IsNullOperation_BehaviorDescriptor();
      case -991770805:
        return new Node_IsNotNullOperation_BehaviorDescriptor();
      case -423572663:
        return new LinkList_AddAllOperation_BehaviorDescriptor();
      case -1744877727:
        return new Node_GetConceptOperation_BehaviorDescriptor();
      case -755659195:
        return new Concept_IsExactlyOperation_BehaviorDescriptor();
      case 1934430904:
        return new SConceptType_BehaviorDescriptor();
      case 1991788652:
        return new ConceptRefExpression_BehaviorDescriptor();
      case 635577161:
        return new Node_GetAncestorsOperation_BehaviorDescriptor();
      case 919558908:
        return new SConceptLinkAccess_BehaviorDescriptor();
      case -794417648:
        return new Model_RootsIncludingImportedOperation_BehaviorDescriptor();
      case -341774294:
        return new RefConcept_Reference_BehaviorDescriptor();
      case -1702548664:
        return new Node_GetIndexInParentOperation_BehaviorDescriptor();
      case 1295784455:
        return new Concept_GetDirectSuperConcepts_BehaviorDescriptor();
      case -1006068109:
        return new Node_ConceptMethodCall_BehaviorDescriptor();
      case -1846642407:
        return new Concept_IsSuperConceptOfOperation_BehaviorDescriptor();
      case -617077218:
        return new Concept_IsSubConceptOfOperation_BehaviorDescriptor();
      case 1917590523:
        return new Concept_GetAllSuperConcepts_BehaviorDescriptor();
      case -1297609089:
        return new Concept_GetHierarchy_BehaviorDescriptor();
      case -633402176:
        return new SNodeCreator_BehaviorDescriptor();
      case 1009358677:
        return new Concept_NewInstance_BehaviorDescriptor();
      case 2047076096:
        return new Concept_GetAllSubConcepts_BehaviorDescriptor();
      case -2146574907:
        return new Concept_FindInstances_BehaviorDescriptor();
      case -1705720592:
        return new Model_NodesIncludingImportedOperation_BehaviorDescriptor();
      case -1615207894:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.IAttributeAccessQualifier 
        return null;
      case -1010712843:
        return new NodeAttributeAccessQualifier_BehaviorDescriptor();
      case -2089055928:
        return new PropertyAttributeAccessQualifier_BehaviorDescriptor();
      case -669600687:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.IPropertyAccessQualifier 
        return null;
      case 823490107:
        return new PoundExpression_BehaviorDescriptor();
      case -650115531:
        return new PropertyRefQualifier_BehaviorDescriptor();
      case 1973703564:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.ILinkAccessQualifier 
        return null;
      case -1244112659:
        return new LinkAttributeAccessQualifier_BehaviorDescriptor();
      case -1614584486:
        return new LinkRefQualifier_BehaviorDescriptor();
      case 159685504:
        return new _LinkAccessT_BehaviorDescriptor();
      case -1736302117:
        return new AllAttributesQualifier_BehaviorDescriptor();
      case 926635024:
        return new AttributeAccessOperation_BehaviorDescriptor();
      case -137372055:
        return new Node_IsAttributeOperation_BehaviorDescriptor();
      case 798725008:
        return new StaticConceptMethodCall_BehaviorDescriptor();
      case 2127872547:
        return new Model_AddRootOperation_BehaviorDescriptor();
      case 305629953:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.IRefConceptArg 
        return null;
      case 1966736489:
        return new Model_GetLongNameOperation_BehaviorDescriptor();
      case 1100603561:
        return new LinkList_RemoveAllChildrenOperation_BehaviorDescriptor();
      case 714749090:
        return new Property_RemoveOperation_BehaviorDescriptor();
      case 209634016:
        return new NodeRefExpression_BehaviorDescriptor();
      case 2023346909:
        return new SearchScopeType_BehaviorDescriptor();
      case -453492024:
        return new Node_GetReferentSearchScopeOperation_BehaviorDescriptor();
      case -1345123924:
        return new SearchScope_ContainsOperation_BehaviorDescriptor();
      case -276515864:
        return new LinkRefExpression_BehaviorDescriptor();
      case -272222870:
        return new EqualsStructurallyExpression_BehaviorDescriptor();
      case 1135921440:
        return new Node_DetachOperation_BehaviorDescriptor();
      case 933847071:
        return new SEnumMemberType_BehaviorDescriptor();
      case -459084783:
        return new EnumMember_ValueOperation_BehaviorDescriptor();
      case 386768545:
        return new EnumMember_NameOperation_BehaviorDescriptor();
      case 184419980:
        return new SEnumOperationInvocation_BehaviorDescriptor();
      case -1589046052:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.SEnumOperation 
        return null;
      case 1737045409:
        return new SEnum_MemberForNameOperation_BehaviorDescriptor();
      case -1550174959:
        return new SEnum_MemberForValueOperation_BehaviorDescriptor();
      case -500571047:
        return new SEnum_MemberOperation_BehaviorDescriptor();
      case -2087995038:
        return new SEnum_MembersOperation_BehaviorDescriptor();
      case 2041564066:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.SEnumMemberOperation 
        return null;
      case -538966257:
        return new OperationParm_StopConceptList_BehaviorDescriptor();
      case 309777744:
        return new ConceptProperty_SetOperation_BehaviorDescriptor();
      case -1887571266:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.ILinkAccess 
        return null;
      case -1256324059:
        return new SLinkImplicitSelect_BehaviorDescriptor();
      case 1270924541:
        return new Node_GetReferencesOperation_BehaviorDescriptor();
      case -1370011493:
        return new SReferenceType_BehaviorDescriptor();
      case -560537699:
        return new Reference_GetTargetOperation_BehaviorDescriptor();
      case 45544256:
        return new Reference_GetLinkDeclarationOperation_BehaviorDescriptor();
      case -698089700:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.IReferenceOperation 
        return null;
      case -2024585192:
        return new Reference_GetRoleOperation_BehaviorDescriptor();
      case 440919261:
        return new Node_GetContainingLinkOperation_BehaviorDescriptor();
      case -66986015:
        return new Node_GetContainingRoleOperation_BehaviorDescriptor();
      case 161970526:
        return new Node_GetReferenceOperation_BehaviorDescriptor();
      case 1772508757:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.ILinkAccessQualifierContainer 
        return null;
      case 1570406875:
        return new OperationParm_LinkQualifier_BehaviorDescriptor();
      case -282449663:
        return new Reference_GetResolveInfo_BehaviorDescriptor();
      case 336240577:
        return new CheckedModuleReference_BehaviorDescriptor();
      case 1620626116:
        return new OperationParm_SameMetaLevel_BehaviorDescriptor();
      case 362794326:
        return new ConceptFqNameRefExpression_BehaviorDescriptor();
      case 684508125:
        return new IfInstanceOfStatement_BehaviorDescriptor();
      case 1195061838:
        return new IfInstanceOfVariable_BehaviorDescriptor();
      case 210361014:
        return new IfInstanceOfVarReference_BehaviorDescriptor();
      case -1782731619:
        return new LinkNameRefExpression_BehaviorDescriptor();
      case 1725586594:
        return new PropertyNameRefExpression_BehaviorDescriptor();
      case 273361687:
        return new AttributeAccess_BehaviorDescriptor();
      case 1327217175:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.AttributeQualifier 
        return null;
      case -483136711:
        return new NodeAttributeQualifier_BehaviorDescriptor();
      case 1759731505:
        return new LinkAttributeQualifier_BehaviorDescriptor();
      case -257936474:
        return new AllAttributeQualifier_BehaviorDescriptor();
      case -1151553588:
        return new PropertyAttributeQualifier_BehaviorDescriptor();
      case -2056553200:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.ILinkQualifier 
        return null;
      case 1112741269:
        // interface or abstract concept behavior jetbrains.mps.lang.smodel.structure.IPropertyQualifier 
        return null;
      case 245075847:
        return new LinkQualifier_BehaviorDescriptor();
      case -1212738420:
        return new PropertyQualifier_BehaviorDescriptor();
      case -872246068:
        return new ConceptPropertyNameRefExpression_BehaviorDescriptor();
      case -419495005:
        return new Model_GetModule_BehaviorDescriptor();
      case -1992681106:
        return new ModuleReferenceExpression_BehaviorDescriptor();
      case -437036222:
        return new LanguageReferenceExpression_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
