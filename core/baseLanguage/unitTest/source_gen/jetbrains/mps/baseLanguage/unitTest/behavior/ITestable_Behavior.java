package jetbrains.mps.baseLanguage.unitTest.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunner;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ITestable_Behavior {
  public static Class[] PARAMETERS_1215620460293 = {SNode.class};
  public static Class[] PARAMETERS_1216045139515 = {SNode.class};
  public static Class[] PARAMETERS_1216140572223 = {SNode.class};
  public static Class[] PARAMETERS_1216389141390 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<String> virtual_getClassPathPart_1216045139515(SNode thisNode) {
    return new ArrayList<String>();
  }

  public static List<String> virtual_getVirtualMachineParameters_1216140572223(SNode thisNode) {
    return new ArrayList<String>();
  }

  public static Class virtual_getTestRunner_1216389141390(SNode thisNode) {
    return TestRunner.class;
  }

  public static List<String> call_getParametersPart_1215620460293(SNode thisNode) {
    return (List<String>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getParametersPart_1215620460293", PARAMETERS_1215620460293);
  }

  public static List<String> call_getClassPathPart_1216045139515(SNode thisNode) {
    return (List<String>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getClassPathPart_1216045139515", PARAMETERS_1216045139515);
  }

  public static List<String> call_getVirtualMachineParameters_1216140572223(SNode thisNode) {
    return (List<String>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getVirtualMachineParameters_1216140572223", PARAMETERS_1216140572223);
  }

  public static Class call_getTestRunner_1216389141390(SNode thisNode) {
    return (Class)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getTestRunner_1216389141390", PARAMETERS_1216389141390);
  }

  public static List<String> callSuper_getParametersPart_1215620460293(SNode thisNode, String callerConceptFqName) {
    return (List<String>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getParametersPart_1215620460293", PARAMETERS_1215620460293);
  }

  public static List<String> callSuper_getClassPathPart_1216045139515(SNode thisNode, String callerConceptFqName) {
    return (List<String>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getClassPathPart_1216045139515", PARAMETERS_1216045139515);
  }

  public static List<String> callSuper_getVirtualMachineParameters_1216140572223(SNode thisNode, String callerConceptFqName) {
    return (List<String>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getVirtualMachineParameters_1216140572223", PARAMETERS_1216140572223);
  }

  public static Class callSuper_getTestRunner_1216389141390(SNode thisNode, String callerConceptFqName) {
    return (Class)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getTestRunner_1216389141390", PARAMETERS_1216389141390);
  }

}
