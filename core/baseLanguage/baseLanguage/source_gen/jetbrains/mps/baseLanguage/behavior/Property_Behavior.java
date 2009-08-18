package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Property_Behavior {
  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "visibility", "jetbrains.mps.baseLanguage.structure.PublicVisibility");
  }

  public static boolean call_isDefaultImplementation_1213877383134(SNode thisNode) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "propertyImplementation", true), "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation");
  }

  public static boolean call_isCustomImplementation_1213877383144(SNode thisNode) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "propertyImplementation", true), "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation");
  }

  public static SNode call_getCustomPropertyImplementation_1213877383154(SNode thisNode) {
    return SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "propertyImplementation", true), "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation");
  }

  public static String call_getPropertyNameWithId_1213877383162(SNode thisNode) {
    return NameUtil.capitalize(SPropertyOperations.getString(thisNode, "propertyName"));
  }

  public static String call_getGetterMethodName_1213877383170(SNode thisNode) {
    return "get" + Property_Behavior.call_getPropertyNameWithId_1213877383162(thisNode);
  }

  public static String call_getSetterMethodName_1213877383179(SNode thisNode) {
    return "set" + Property_Behavior.call_getPropertyNameWithId_1213877383162(thisNode);
  }

  public static SNode call_getSetterVisibility_1213877383188(SNode thisNode) {
    SNode visibility = SLinkOperations.getTarget(thisNode, "visibility", true);
    if (Property_Behavior.call_isDefaultImplementation_1213877383134(thisNode)) {
      SNode setterVisibility = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "propertyImplementation", true), "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation"), "defaultSetAccessor", true), "visibility", true);
      if ((setterVisibility != null)) {
        visibility = setterVisibility;
      }
    }
    return visibility;
  }

  public static boolean call_hasSetter_1213877383224(SNode thisNode) {
    return PropertyImplementation_Behavior.call_hasSetter_1213877430658(SLinkOperations.getTarget(thisNode, "propertyImplementation", true));
  }
}
