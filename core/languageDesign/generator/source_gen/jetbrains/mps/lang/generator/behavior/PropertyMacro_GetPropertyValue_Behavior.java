package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class PropertyMacro_GetPropertyValue_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode propertyMacro = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.generator.structure.PropertyMacro", false, false);
    SNode attributedNode = SNodeOperations.getParent(propertyMacro);
    String propertyName = AttributesRolesUtil.getPropertyNameFromPropertyAttributeRole(propertyMacro.getRole_());
    PropertyDeclaration property_ = SModelSearchUtil.findPropertyDeclaration(((AbstractConceptDeclaration) SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(attributedNode))), propertyName);
    if (property_ != null) {
      SNode property = SNodeOperations.cast(property_.getNode(), "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
      SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
      if (dataType != null) {
        return DataTypeDeclaration_Behavior.call_toBaseLanguageType_1213877229718(dataType);
      }
    }
    return new PropertyMacro_GetPropertyValue_Behavior.QuotationClass_9283_l523emnexlpc().createNode();
  }

  public static class QuotationClass_9283_l523emnexlpc {
    public QuotationClass_9283_l523emnexlpc() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9283_1qi99b8h6vp7n = null;
      {
        quotedNode_9283_1qi99b8h6vp7n = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9283_1qi99b8h6vp7n = quotedNode_9283_1qi99b8h6vp7n;
        result = quotedNode1_9283_1qi99b8h6vp7n;
      }
      return result;
    }
  }
}
