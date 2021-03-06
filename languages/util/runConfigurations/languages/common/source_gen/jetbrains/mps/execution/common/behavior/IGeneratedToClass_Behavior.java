package jetbrains.mps.execution.common.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NodeNameUtil;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IGeneratedToClass_Behavior {
  private static Class[] PARAMETERS_946964771156905483 = {SNode.class};
  private static Class[] PARAMETERS_946964771156905488 = {SNode.class};
  private static Class[] PARAMETERS_946964771156905503 = {SNode.class};
  private static Class[] PARAMETERS_4366236229294148974 = {SNode.class};
  private static Pattern REGEXP_tq53pp_b0a0a3 = Pattern.compile("(\\w)\\W+(\\w)", 0);
  private static Pattern REGEXP_tq53pp_b0a1a3 = Pattern.compile("(.)\\W+$", 0);

  public static void init(SNode thisNode) {
  }

  public static String virtual_getGeneratedClassName_946964771156905488(SNode thisNode) {
    String name = IGeneratedToClass_Behavior.call_getBaseName_4366236229294148974(thisNode);
    return IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905516(thisNode, name);
  }

  public static String virtual_getFullName_946964771156905503(SNode thisNode) {
    return IGeneratedToClass_Behavior.call_getNamespace_2256484787298834694(thisNode) + "." + IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905488(thisNode);
  }

  public static String call_getValidClassName_2572811016744662265(SNode thisNode, @NonNls String name) {
    name = RegexpOperations.replace(name, REGEXP_tq53pp_b0a0a3, new _Replacer_tq53pp_a0a0a0d(null, null));
    name = RegexpOperations.replace(name, REGEXP_tq53pp_b0a1a3, new _Replacer_tq53pp_a0a0b0d(null, null));
    return IGeneratedToClass_Behavior.makeUpperCase_946964771156905431(name, 0);
  }

  public static String call_getGeneratedClassName_946964771156905516(SNode thisNode, String name) {
    if (StringUtils.isEmpty(name)) {
      return null;
    }
    return IGeneratedToClass_Behavior.call_getValidClassName_2572811016744662265(thisNode, name) + "_" + IGeneratedToClass_Behavior.call_getSuffix_946964771156905483(thisNode);
  }

  public static String virtual_getBaseName_4366236229294148974(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "name");
  }

  public static String call_getNamespace_2256484787298834694(SNode thisNode) {
    return NodeNameUtil.getNamespace(INamedConcept_Behavior.call_getFqName_1213877404258(thisNode));
  }

  public static String call_getSuffix_946964771156905483(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), "virtual_getSuffix_946964771156905483", PARAMETERS_946964771156905483);
  }

  public static String call_getGeneratedClassName_946964771156905488(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), "virtual_getGeneratedClassName_946964771156905488", PARAMETERS_946964771156905488);
  }

  public static String call_getFullName_946964771156905503(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), "virtual_getFullName_946964771156905503", PARAMETERS_946964771156905503);
  }

  public static String call_getBaseName_4366236229294148974(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), "virtual_getBaseName_4366236229294148974", PARAMETERS_4366236229294148974);
  }

  public static String callSuper_getSuffix_946964771156905483(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), callerConceptFqName, "virtual_getSuffix_946964771156905483", PARAMETERS_946964771156905483);
  }

  public static String callSuper_getGeneratedClassName_946964771156905488(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), callerConceptFqName, "virtual_getGeneratedClassName_946964771156905488", PARAMETERS_946964771156905488);
  }

  public static String callSuper_getFullName_946964771156905503(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), callerConceptFqName, "virtual_getFullName_946964771156905503", PARAMETERS_946964771156905503);
  }

  public static String callSuper_getBaseName_4366236229294148974(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.common.structure.IGeneratedToClass"), callerConceptFqName, "virtual_getBaseName_4366236229294148974", PARAMETERS_4366236229294148974);
  }

  public static String replaceProhibitedSymbol_946964771156905390(String name, String symbol) {
    String result = name;
    while (result.contains(symbol)) {
      int index = result.indexOf(symbol);
      result = result.replace(symbol, "");
      result = IGeneratedToClass_Behavior.makeUpperCase_946964771156905431(result, index);
    }
    return result;
  }

  public static String makeUpperCase_946964771156905431(@NonNls String string, int index) {
    assert index >= 0 && index < string.length();
    return string.substring(0, index) + string.substring(index, index + 1).toUpperCase() + ((index + 1 < string.length() ?
      string.substring(index + 1) :
      ""
    ));
  }
}
